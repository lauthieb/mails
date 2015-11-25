package lille1.letter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lille1.content.TextContent;
import lille1.letter.LetterTest;

public class SimpleLetterTest extends LetterTest {

	@Before
	public void createLetter() {
		super.createLetter();
		letter = new RegisteredLetter(new SimpleLetter("Je suis une lettre dans un recommandé", sender, receiver), sender, receiver);
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
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertEquals("simple letter whose content is a text content (Je suis le contenu d'une simple lettre)", letter.toString());
	}

	@Test
	public void testGetContent() {
		fail("Not yet implemented");
	}

}
