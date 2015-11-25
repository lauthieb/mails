package lille1.content;

import static org.junit.Assert.*;

public class TextContentTest extends ContentTest {
	
	TextContent content;
	String text;

	@Override
	public void createContent() {
		this.text = "hello";
		this.content = new TextContent(this.text);
	}

	@Override
	public void contentIsCorrectlyInitialized() {
		assertEquals(this.text, this.content.getText());
	}

	@Override
	public void testToString() {
		assertEquals("a text content (hello)", this.content.toString());
	}

}
