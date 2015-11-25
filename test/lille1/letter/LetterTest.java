package lille1.letter;

import static org.junit.Assert.*;
import lille1.global.City;
import lille1.global.Inhabitant;

import org.junit.Before;
import org.junit.Test;

public abstract class LetterTest {
	
	protected Letter<?> letter;
	protected City city_lille, city_lens;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	@Before
	public void createLetter() {
		city_lille = new City("Lille");
		city_lille.createInhabitants(10);
		sender = city_lille.getInhabitants().get(5);
		city_lens = new City("Lens");
		city_lens.createInhabitants(5);
		receiver = city_lens.getInhabitants().get(2);
	}

	@Test
	public void testCostPositive() {
		assertTrue(letter.getCost() > 0);
	}
	
	@Test
	public abstract void testGetCost();

	@Test
	public abstract void testDoAction();

	@Test
	public void testGetContent() {
		//assertSame();
	}

	@Test
	public void testGetSender() {
		assertSame(sender,letter.getSender());
	}

	@Test
	public void testGetReceiver() {
		assertSame(receiver,letter.getReceiver());
	}

	@Test
	public abstract void testToString();

}
