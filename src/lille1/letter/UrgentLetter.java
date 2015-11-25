package lille1.letter;

import lille1.content.LetterContent;

/**
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 * A class which represents the urgent letters
 *
 */
public class UrgentLetter<T extends Letter<?>> extends Letter<LetterContent> {
	/**
	 * Constructor of the class letter
	 * @param letter a letter which has to be urgent
	 * @throws IllegalArgumentException when an urgent letter contains an urgent letter. It's not coherent
	 */
	public UrgentLetter(T letter) throws IllegalArgumentException {
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
		if(letter instanceof UrgentLetter) {
			throw new IllegalArgumentException("content can't be an urgent letter");
		}
	}

	/**
	 * A method that returns the cost of an urgent letter
	 * @return the cost of an urgent letter
	 */
	@Override
	public int getCost() {
		return this.content.getLetter().getCost()*2;
	}

	/**
	 * This method let the letter to be able to trigger its action
	 */
	@Override
	public void doAction() {
		//We do the action contained in the letter
		this.content.getLetter().doAction();
	}
	
	/**
	 * A method used to describe the letter.
	 * @return a String which describes the letter
	 */
	@Override
	public String toString() {
		return "an urgent letter whose content is " + this.content;
	}
	

}