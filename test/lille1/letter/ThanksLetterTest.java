package lille1.letter;

import static org.junit.Assert.assertEquals;

public class ThanksLetterTest extends SimpleLetterTest {

	@Override
	public void createLetter() {
		letter = new ThanksLetter("Je suis le contenu d'une lettre de remerciement créée dans la classe ThanksLetterTest", sender, receiver);
	}
	
	@Override
	public void testToString() {
		assertEquals("a thanks letter which is a simple letter whose content is a text content (Je suis le contenu d'une lettre de remerciement créée dans la classe ThanksLetterTest)", letter.toString());
	}

}
