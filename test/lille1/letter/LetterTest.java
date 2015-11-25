package lille1.letter;

import static org.junit.Assert.*;
import lille1.global.City;
import lille1.global.Inhabitant;

import org.junit.Before;
import org.junit.Test;

public abstract class LetterTest {
	
	protected Letter<?> letter;
	protected City lille, lens;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	
	@Before
	public void createLetter() {
		lille = new City("Lille");
		lille.createInhabitants(10);
		sender = lille.getInhabitants().get(5);
		lens = new City("Lens");
		lens.createInhabitants(5);
		receiver = lens.getInhabitants().get(2);
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
	public abstract void testToString();

	@Test
	public void testGetSender() {
		assertSame(sender,letter.getSender());
	}

	@Test
	public void testGetReceiver() {
		assertSame(receiver,letter.getReceiver());
	}

}
