package lille1.letter;

import lille1.content.LetterContent;

public class UrgentLetter extends Letter<LetterContent> {

	@Override
	public double getCost() {
		return getCost()*2;
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