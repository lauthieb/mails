package lille1.content;

public class TextContent extends Content{
	protected String text;

	public TextContent(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "a text content (" + this.text + ")";
		
	}
	
}
