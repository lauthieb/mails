package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UrgentLetterTest extends SpecialLetterTest {

	@Before
	@Override
	public void createLetter() {
		try {
			this.letter = new UrgentLetter<SimpleLetter>(new SimpleLetter("Je suis une simple lettre dans une lettre urgente",sender,receiver));
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
		assertEquals("an urgent letter whose content is a simple letter whose content is a text content (Je suis une simple lettre dans une lettre urgente)", this.letter.toString());
	}
}
