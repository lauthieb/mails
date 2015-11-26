package lille1.letter;

import static org.junit.Assert.*;
import lille1.global.City;
import lille1.global.Inhabitant;

public class UrgentLetterTest extends SpecialLetterTest {

	@Override
	public void createLetter() {
		try {
			this.letter = new UrgentLetter<SimpleLetter>(new SimpleLetter("Je suis une simple lettre dans une lettre urgente",sender, receiver));
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
		letter.doAction();
	}

	@Override
	public void testToString() {
		assertEquals("an urgent letter whose content is a simple letter whose content is a text content (Je suis une simple lettre dans une lettre urgente)", this.letter.toString());
	}
}
