package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UrgentLetterTest extends SpecialLetterTest {

	@Before
	@Override
	public void createLetter() {
		try {
			//letter = new UrgentLetter(new SimpleLetter("Je suis une simple lettre dans une lettre urgente",sender,receiver), sender, receiver);
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
		assertEquals("urgent letter whose content is a simple letter whose content is a text content (Je suis une simple lettre dans une lettre urgente)",letter.toString());
	}
}
