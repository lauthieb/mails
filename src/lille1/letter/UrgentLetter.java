package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

public class UrgentLetter extends SpecialLetter {

	public UrgentLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) throws IllegalArgumentException {
		super(new LetterContent(content), sender, receiver);
		if(content instanceof UrgentLetter) {
			throw new IllegalArgumentException("content can't be an urgent letter");
		}
	}

	@Override
	public int getCost() {
		return content.getLetter().getCost()*2;
	}

	@Override
	public void doAction() {
		//We do the action contained in the letter
		this.content.getLetter().doAction();
	}
	
	@Override
	public String toString() {
		return "urgent letter whose content is a " + this.content;
	}
	

}