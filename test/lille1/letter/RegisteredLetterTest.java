package lille1.letter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegisteredLetterTest extends LetterTest{

	@Override
	public void createLetter() {
		super.createLetter();
		letter = new RegisteredLetter(new SimpleLetter("Je suis une lettre dans un recommande", sender, receiver), sender, receiver);
	}
	
	@Override
	public void testGetCost() {
		assertEquals(16,letter.getCost());	// Content is : SimpleLetter
	}

	@Override
	public void testDoAction() {
		assertEquals(5000, sender.getBankAccount().getAmount());
		assertEquals(5000, receiver.getBankAccount().getAmount());
		letter.doAction();
		assertEquals(5000, sender.getBankAccount().getAmount());
		assertEquals(4999, receiver.getBankAccount().getAmount());
	}

	@Override
	public void testToString() {
		assertEquals("a registered letter whose content is a simple letter whose content is a text content (Je suis une lettre dans un recommande)",letter.toString());
	}

	@Test
	public void theReceiverSendsAcknowledgmentOfReceipt() {
		assertEquals(0, receiver.getCity().getPostbox().size());
		letter.doAction();
		assertEquals(1, receiver.getCity().getPostbox().size());
	}

}
