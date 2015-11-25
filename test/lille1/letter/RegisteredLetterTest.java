package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegisteredLetterTest extends LetterTest{

	@Before
	@Override
	public void createLetter() {
		super.createLetter();
		try {
			letter = new RegisteredLetter(new SimpleLetter("Je suis une simple lettre dans un recommandé dans la classe RegisteredLetterTest", sender, receiver), sender, receiver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	@Override
	public void testGetCost() {
		assertEquals(16,letter.getCost());	// Content is : SimpleLetter
	}

	@Test
	@Override
	public void testDoAction() {
		fail("Not yet implemented");
	}

	@Test
	@Override
	public void testToString() {
		assertEquals("registered letter whose content is a simple letter who content is (Je suis une simple lettre dans un recommandé dans la classe RegisteredLetterTest)",letter.toString());
	}

	/*@Test
	public void testRegisteredLetter() {
		assertEquals(0, receiver.numberOfLetterSent);
		letter.doAction();
		assertEquals(1, receiver.numberOfLetterSent);
	}*/

}
