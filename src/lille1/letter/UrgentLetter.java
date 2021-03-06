package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;

/**
 * 
 * A class which represents the urgent letters
 *
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class UrgentLetter extends Letter<LetterContent> {
	
	/**
	 * Constructor of the class UrgentLetter
	 * @param letter a letter which has to be urgent
	 * @param sender the sender
	 * @param receiver the receiver
	 */
	public UrgentLetter(NotUrgentLetter<?> letter, Inhabitant sender, Inhabitant receiver) {
		super(new LetterContent(letter), sender, receiver);
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