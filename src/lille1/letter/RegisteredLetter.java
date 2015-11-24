package lille1.letter;

import lille1.content.LetterContent;

public class RegisteredLetter extends Letter<LetterContent> {

	public RegisteredLetter(Letter<?> letter) {
		this.content = new LetterContent(letter);
	}
	
	public double getCost() {
		return (this.content.getLetter().getCost()+15);
	}

	public void doAction() {
		//We do the action which come from the LetterContent
		this.content.getLetter().doAction();
		//We create an acknowledgment
		SimpleLetter acknowledgment = new SimpleLetter("acknowledgment of receipt which is a " + this.getContent());
		//We send the acknowledgment of receipt to the sender
		this.sender.getCity().sendLetter(acknowledgment);
	}
	
	@Override
	public String toString() {
		return "registered letter whose content is a " + this.content;
		
	}

}
