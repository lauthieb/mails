package lille1.letter;

import lille1.global.Inhabitant;

/**
 * 
 * ThanksLetter is a class which represents a thanks letter an inhabitant will send when he receives a promissory note
 *
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class ThanksLetter extends SimpleLetter {

	/**
	 * Constructor of the class
	 * @param content what is written inside the letter
	 * @param sender the Inhabitant who send the thanks letter
	 * @param receiver the Inhabitant who will receive the thanks letter
	 */
	public ThanksLetter(String content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	
	/**
	 * A method which returns a String description of the thanks letter
	 * @return a String description of the thanks letter
	 */
	public String toString() {
		return "a thanks letter which is " + super.toString();
	}

}
