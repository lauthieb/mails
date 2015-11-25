package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

public class RegisteredLetter extends SpecialLetter {

	public RegisteredLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) throws IllegalArgumentException {
		super(new LetterContent(content), sender, receiver);
		if(content instanceof UrgentLetter) {
			throw new IllegalArgumentException("content can't be an urgent letter");
		} else if(content instanceof RegisteredLetter) {
			throw new IllegalArgumentException("content can't be a registered letter");
		}
	}

	public int getCost() {
		return (this.content.getLetter().getCost()+15);
	}

	public void doAction() {
		//We do the action which come from the LetterContent
		this.content.getLetter().doAction();
		//We create an acknowledgment
		SimpleLetter acknowledgment = new SimpleLetter("acknowledgment of receipt which is a " + this.getContent(), this.receiver, this.sender);
		//We send the acknowledgment of receipt to the sender
		this.receiver.getCity().sendLetter(acknowledgment);
	}
	
	@Override
	public String toString() {
		return "registered letter whose content is a " + this.content;
	}

}
