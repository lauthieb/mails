package lille1.letter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lille1.content.TextContent;

public class SimpleLetterTest extends LetterTest {

	@Override
	public void createLetter() throws IllegalArgumentException {
		super.createLetter();
		letter = new SimpleLetter("Je suis une simple lettre dans la classe SimpleLetterTest", sender, receiver);
	}

	@Test
	public void containsATextContent() {
		assertEquals(TextContent.class,letter.getContent().getClass());
	}
	
	@Override
	public void testGetCost() {
		assertEquals(1, letter.getCost());
	}

	@Override
	public void testToString() {
		assertEquals("a simple letter whose content is a text content (Je suis une simple lettre dans la classe SimpleLetterTest)", letter.toString());
	}

	@Override
	public void testDoAction() {
		assertEquals(5000, sender.getBankAccount().getAmount());
		assertEquals(5000, receiver.getBankAccount().getAmount());
		this.letter.doAction();
		assertEquals(5000, sender.getBankAccount().getAmount());
		assertEquals(5000, receiver.getBankAccount().getAmount());
	}

}
