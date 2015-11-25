package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegisteredLetterTest extends LetterTest{

	@Before
	@Override
	public void createLetter() {
		super.createLetter();
		letter = new RegisteredLetter(new SimpleLetter("Je suis une lettre dans un recommandé", sender, receiver));
	}
	
	@Test
	@Override
	public void testGetCost() {
		assertEquals(16,letter.getCost());	// Content is : SimpleLetter
	}

	@Test
	public void testDoAction() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertEquals("registered letter whose content is a letter content (Je suis une lettre dans un recommandé, actual)",letter.toString());
	}

	/*@Test
	public void testRegisteredLetter() {
		assertEquals(0, receiver.numberOfLetterSent);
		letter.doAction();
		assertEquals(1, receiver.numberOfLetterSent);
	}*/

}
