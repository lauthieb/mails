package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThanksLetterTest extends SimpleLetterTest {

	@Before
	@Override
	public void createLetter() {
		letter = new ThanksLetter("Je suis le contenu d'une lettre de remerciement créée dans la classe ThanksLetterTest", sender, receiver);
	}
	
	@Test
	public void testToString() {
		assertEquals("thanks letter which is a simple letter whose content is a text content (Je suis le contenu d'une lettre de remerciement créée dans la classe ThanksLetterTest)", letter.toString());
	}

}
