package lille1.letter;

import static org.junit.Assert.*;

public class UrgentLetterTest extends SpecialLetterTest {

	@Override
	public void createLetter() {
		try {
			this.letter = new UrgentLetter<SimpleLetter>(new SimpleLetter("Je suis une simple lettre dans une lettre urgente",sender,receiver));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void testGetCost() {
		assertEquals(2,letter.getCost());
	}

	@Override
	public void testDoAction() {
		//TODO
	}

	@Override
	public void testToString() {
		assertEquals("an urgent letter whose content is a simple letter whose content is a text content (Je suis une simple lettre dans une lettre urgente)", this.letter.toString());
	}
}
