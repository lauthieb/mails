package lille1.content;

public class TextContent extends Content{
	protected String text;

	public TextContent(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "whose content is a text content (" + this.text + ")";
		
	}
	
}
