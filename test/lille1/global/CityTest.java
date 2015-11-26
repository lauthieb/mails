package lille1.global;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lille1.letter.PromissoryNote;
import lille1.letter.SimpleLetter;

public class CityTest {
	protected City city;
	
	@Before
	public void init() {
		this.city = new City("Lille");
	}
	
	@Test
	public void propertiesAreCorrectlyInitialized() {
		assertEquals("Lille", this.city.getName());
		assertNotNull(this.city.getPostbox());
		assertTrue(this.city.getPostbox().isEmpty());
		assertNotNull(this.city.getInhabitants());
		assertTrue(this.city.getInhabitants().isEmpty());
	}
	
	@Test
	public void createOneHundredInhabitants() {
		this.city.createInhabitants(100);
		assertEquals(100, this.city.getInhabitants().size());
	}
	
	@Test
	public void testSendAndDistributeLetters() {
		assertTrue(this.city.getPostbox().isEmpty());
		
		this.city.getInhabitants().add(new Inhabitant("Laurent", this.city));
		this.city.getInhabitants().add(new Inhabitant("Mathieu", this.city));
		this.city.getInhabitants().add(new Inhabitant("Thibault", this.city));
		
		SimpleLetter sl = new SimpleLetter("hello", this.city.getInhabitants().get(0), this.city.getInhabitants().get(1));
		PromissoryNote pn = new PromissoryNote(400, this.city.getInhabitants().get(0), this.city.getInhabitants().get(2));
		this.city.sendLetter(sl);
		
		assertEquals(1, this.city.getPostbox().size());
		assertEquals(sl, this.city.getPostbox().get(0));
		
		this.city.sendLetter(pn);
		
		assertEquals(2, this.city.getPostbox().size());
		assertEquals(pn, this.city.getPostbox().get(1));
		
		this.city.distributeLetters();
		assertTrue(this.city.getPostbox().isEmpty());
	}
}
