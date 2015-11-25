package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

public class RegisteredLetter extends Letter<LetterContent> {

	public RegisteredLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) {
		super(new LetterContent(content), sender, receiver);
	}

	public double getCost() {
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
