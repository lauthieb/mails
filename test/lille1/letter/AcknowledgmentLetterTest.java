package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import lille1.letterold.AcknowledgmentLetter;

public class AcknowledgmentLetterTest extends SimpleLetterTest {

	@Override
	public void createLetter() {
		super.createLetter();
		letter = new AcknowledgmentLetter("Je suis un accusé de réception dans la classe AcknowledgmentLetterTest", sender, receiver);
	}
	
	@Test
	public void testToString() {
		assertEquals("an aknowledgment of receipt which is a simple letter whose content is a text content (Je suis un accusé de réception dans la classe AcknowledgmentLetterTest)", letter.toString());
	}

}
