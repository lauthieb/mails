package lille1.letter;

import static org.junit.Assert.assertEquals;

public class UrgentLetterTest extends LetterTest {

	@Override
	public void createLetter() {
		super.createLetter();
		try {	
			this.letter = new UrgentLetter(new SimpleLetter("Je suis une simple lettre dans une lettre urgente",sender, receiver), sender, receiver);
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
		assertEquals(5000, sender.getBankAccount().getAmount());
		letter.doAction();
		// There's no specific action in a simple letter
		assertEquals(5000, sender.getBankAccount().getAmount());
	}

	@Override
	public void testToString() {
		assertEquals("an urgent letter whose content is a simple letter whose content is a text content (Je suis une simple lettre dans une lettre urgente)", this.letter.toString());
	}
}
