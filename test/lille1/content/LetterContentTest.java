package lille1.content;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lille1.letter.SimpleLetter;

public class LetterContentTest {
	
	protected LetterContent content;
	protected SimpleLetter letter;
	
	@Before
	public void init() {
		this.letter = new SimpleLetter("hello", null, null);
		this.content = new LetterContent(this.letter);
	}

	@Test
	public void contentIsCorrectlyInitialized() {
		assertEquals(this.letter, this.content.getLetter());
	}

	@Test
	public void testToString() {
		assertEquals("a simple letter whose content is a text content (hello)", this.content.toString());
	}

}
