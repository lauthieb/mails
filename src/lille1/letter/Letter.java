package lille1.letter;

import lille1.content.Content;
import lille1.global.Inhabitant;
/**
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 * Letter is the class which represents any kind of letter. All other letters class will be an extension of this class
 *
 */
public abstract class Letter<C extends Content> {
	protected C content;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected final int COST_LETTER = 1;
	
	/**
	 * Constructor for a Letter
	 * @param content the content of the letter
	 * @param sender the inhabitant who is going to send the letter
	 * @param receiver the inhabitant who is going to receive the letter
	 */
	public Letter(C content, Inhabitant sender, Inhabitant receiver){
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
	}
	/**
	 * A method which returns the cost of a letter
	 * @return the cost of a letter
	 */
	public abstract int getCost();
	/**
	 * A method which represents the action we do when the letter is delivered
	 */
	public abstract void doAction();

	/**
	 * A method which returns the content of the letter
	 * @return the content of the current letter
	 */
	public C getContent() {
		return content;
	}
	/**
	 * A method which returns the inhabitant who sent the letter
	 * @return an Inhabitant who sent the letter
	 */
	public Inhabitant getSender() {
		return sender;
	}
	/**
	 * A method which returns the inhabitant who will receive the letter
	 * @return an Inhabitant who will receive the letter
	 */
	public Inhabitant getReceiver() {
		return receiver;
	}
	
	/**
	 * A method which returns a quick description of a letter
	 * @return the quick description of a letter
	 */
	@Override
	public String toString() {
		return ""+this.content;
	}
	
	
}
