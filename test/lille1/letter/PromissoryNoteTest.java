package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PromissoryNoteTest extends LetterTest {

	int amount = 123;
	
	public void createLetter() {
		super.createLetter();
		try {
			letter = new PromissoryNote(amount, sender, receiver);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCost() {
		assertEquals(2,letter.getCost());
	}

	@Test
	public void testDoAction() {
		//TODO
	}

	@Test
	public void testToString() {
		assertEquals("a promissory note letter whose content is a money content (" + amount + ")", letter.toString());
	}

}
