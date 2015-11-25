package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PromissoryNoteTest extends LetterTest {

	int amount = 123;
	
	public void createLetter() {
		super.createLetter();
		try {
			letter = new PromissoryNote(amount, sender, receiver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCost() {
		assertEquals(2,letter.getCost());
	}

	@Test
	public void testDoAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertEquals("promissory note letter whose content is a money content (" + amount + ")", letter.toString());
	}

}
