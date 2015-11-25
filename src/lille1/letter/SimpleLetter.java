package lille1.letter;

import lille1.content.TextContent;
import lille1.global.Inhabitant;
/**
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 * SimpleLetter is a class which represents a simple letter with some text inside
 *
 */
public class SimpleLetter extends Letter<TextContent> {
	
	/**
	 * Constructor for the simple letter
	 * @param content the text written inside the letter
	 * @param sender the Inhabitant who will send the letter
	 * @param receiver the Inhabitant who will receive the letter
	 */
	public SimpleLetter(String content, Inhabitant sender, Inhabitant receiver){
		super(new TextContent(content), sender, receiver);
	}
	
	/**
	 * A method which returns the content of the letter
	 * @return the content of the letter
	 */
	public TextContent getContent() {
		return this.content;
	}

	/**
	 * A method which return the cost of a simple letter
	 * @return the cost of a simple letter
	 */
	@Override
	public int getCost() {
		return COST_LETTER;
	}

	/**
	 * An empty method which is going to be used by the subclasses to do some action in the case the letter needs an action to be done once it will be received
	 */
	@Override
	public void doAction() {
		
	}
	
	/**
	 * A method which returns a quick description of the simple letter
	 * @return a quick description of the simple letter
	 */
	@Override
	public String toString() {
		return "a simple letter whose content is " + this.content;
	}
}
