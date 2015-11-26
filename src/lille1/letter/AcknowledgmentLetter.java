package lille1.letter;

import lille1.global.Inhabitant;

/**
 * 
 * AcknowledgmentLetter is a class which represents an acknowledgment sent by the receiver when he receives a registered letter
 *
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class AcknowledgmentLetter extends SimpleLetter {

	/**
	 * Constructor for an acknowlegment letter
	 * @param content the content of a letter
	 * @param sender the inhabitant who is going to send the letter
	 * @param receiver the inhabitant who is going to receive the letter
	 */
	public AcknowledgmentLetter(String content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	
	/**
	 * A method that returns the description of the acknowlegment letter
	 * @return the description of the acknowlegment letter
	 */
	public String toString() {
		return "an aknowledgment of receipt which is " + super.toString();
	}
	
}
