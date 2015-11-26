package lille1.letter;

import lille1.content.Content;
import lille1.global.Inhabitant;

/**
 * 
 * NotUrgentLetter is the class which represents any kind of letter which is not registered and not urgent
 * 
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public abstract class NotUrgentLetter<T extends Content> extends Letter<T> {

	/**
	 * /**
	 * Constructor of the class NotUrgentLetter
	 * 
	 * @param letter the letter
	 * @param sender the sender
	 * @param receiver the receiver
	 */
	public NotUrgentLetter(T letter, Inhabitant sender, Inhabitant receiver) {
		super(letter, sender, receiver);
	}

}
