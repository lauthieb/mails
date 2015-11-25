package lille1.letter;

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
		return "an urgent letter whose content is a " + this.content;
	}
	

}