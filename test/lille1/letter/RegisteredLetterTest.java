package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Test;

import lille1.letterold.RegisteredLetter;
import lille1.letterold.SimpleLetter;

public class RegisteredLetterTest extends LetterTest{

	@Override
	public void createLetter() {
		super.createLetter();
		letter = new RegisteredLetter<SimpleLetter>(new SimpleLetter("Je suis une lettre dans un recommandé", sender, receiver));
	}
	
	@Override
	public void testGetCost() {
		assertEquals(16,letter.getCost());	// Content is : SimpleLetter
	}

	@Override
	public void testDoAction() {
		//TODO
	}

	@Override
	public void testToString() {
		assertEquals("a registered letter whose content is a simple letter whose content is a text content (Je suis une lettre dans un recommandé)",letter.toString());
	}

	@Test
	public void theReceiverSendsAcknowledgmentOfReceipt() {
		assertEquals(0, receiver.getCity().getPostbox().size());
		letter.doAction();
		assertEquals(1, receiver.getCity().getPostbox().size());
	}

}
