package lille1.content;
/**
 * 
 * TextContent is a class which represents a text composed letter
 * 
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class TextContent implements Content{
	protected String text;

	/**
	 * Constructor for a text content
	 * @param text a String which is contained inside the letter
	 */
	public TextContent(String text) {
		this.text = text;
	}

	/**
	 * A method which returns a description of the text content
	 * @return the descritpion of the text content
	 */
	@Override
	public String toString() {
		return "a text content (" + this.text + ")";
	}

	/**
	 * A method which returns the text inside the textcontent
	 * @return the text inside the TextContent
	 */
	public String getText() {
		return text;
	}
	
}
