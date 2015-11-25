package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

public class UrgentLetter extends Letter<LetterContent> {

	public UrgentLetter(Letter<?> content, Inhabitant sender, Inhabitant receiver) {
		super(new LetterContent(content), sender, receiver);
	}

	@Override
	public int getCost() {
		return COST_LETTER*2;
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