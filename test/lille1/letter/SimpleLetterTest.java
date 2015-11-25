package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lille1.content.TextContent;
import lille1.letter.LetterTest;

public class SimpleLetterTest extends LetterTest {

	@Before
	public void createLetter() throws IllegalArgumentException {
		super.createLetter();
		letter = new SimpleLetter("Je suis une simple lettre dans la classe SimpleLetterTest", sender, receiver);
	}

	@Test
	public void containTextContent() {
		assertEquals(TextContent.class,letter.content.getClass());
	}
	
	@Test
	public void testGetCost() {
		assertEquals(1, letter.getCost());
	}

	@Test
	public void testDoAction() {
		//TODO
	}

	@Test
	public void testToString() {
		assertEquals("a simple letter whose content is a text content (Je suis une simple lettre dans la classe SimpleLetterTest)", letter.toString());
	}

	@Test
	public void testGetContent() {
		//TODO
	}

}
