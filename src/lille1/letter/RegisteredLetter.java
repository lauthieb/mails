package lille1.letter;

import lille1.content.LetterContent;

/**
 * 
 * RegisteredLetter is the class which represents a registered letter
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class RegisteredLetter<T extends Letter<?>> extends Letter<LetterContent> {

	/**
	 * Constructor for a registered letter
	 * @param letter the letter which will be contained inside the registered letter
	 * @throws IllegalArgumentException if the letter inside is an urgent or registered letter because it's not coherent
	 */
	public RegisteredLetter(T letter) throws IllegalArgumentException {
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
		if(content.getLetter() instanceof UrgentLetter) {
			throw new IllegalArgumentException("content can't be an urgent letter");
		} else if(content.getLetter() instanceof RegisteredLetter) {
			throw new IllegalArgumentException("content can't be a registered letter");
		}
	}
	
	/**
	 * method which returns the cost of a registered letter
	 * @return the cost of a registered letter
	 */
	public int getCost() {
		return (this.content.getLetter().getCost()+15);
	}
	
	/**
	 * implementation of the doAction method. Here we want the receiver to send an acknowledgment letter to the sender of the initial registered letter
	 */
	public void doAction() {
		//We do the action which come from the LetterContent
		this.content.getLetter().doAction();
		//We create an acknowledgment
		AcknowledgmentLetter acknowledgment = new AcknowledgmentLetter("acknowledgment of receipt which is a " + this.getContent(), this.receiver, this.sender);
		//We send the acknowledgment of receipt to the sender
		this.receiver.getCity().sendLetter(acknowledgment);
	}
	
	/**
	 * A method which returns the description of the registered letter
	 * @return the description of the registered letter
	 */
	@Override
	public String toString() {
		return "a registered letter whose content is " + this.content;
	}

}
