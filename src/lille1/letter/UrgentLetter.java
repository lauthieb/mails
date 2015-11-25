package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

public class UrgentLetter<T extends Letter<?>> extends SpecialLetter<T> {
	
	public UrgentLetter(T letter) throws IllegalArgumentException {
		super(letter);
		if(letter instanceof UrgentLetter) {
			throw new IllegalArgumentException("content can't be an urgent letter");
		}
	}

	@Override
	public int getCost() {
		return this.content.getLetter().getCost()*2;
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