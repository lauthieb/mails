package lille1.content;

import static org.junit.Assert.*;

import lille1.letter.SimpleLetter;

public class LetterContentTest extends ContentTest {
	
	protected LetterContent content;
	protected SimpleLetter letter;
	
	@Override
	public void createContent() {
		this.letter = new SimpleLetter("hello", null, null);
		this.content = new LetterContent(this.letter);	
	}

	@Override
	public void contentIsCorrectlyInitialized() {
		assertEquals(this.letter, this.content.getLetter());
	}

	@Override
	public void testToString() {
		assertEquals("a simple letter whose content is a text content (hello)", this.content.toString());
	}

}
