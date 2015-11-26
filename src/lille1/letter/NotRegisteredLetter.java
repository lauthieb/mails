package lille1.letter;

import lille1.content.Content;
import lille1.global.Inhabitant;

/**
 * 
 * NotRegisteredLetter is the class which represents any kind of letter which is not registered and not urgent
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public abstract class NotRegisteredLetter<T extends Content> extends NotUrgentLetter<T> {

	/**
	 * /**
	 * Constructor of the class NotRegisteredLetter
	 * 
	 * @param letter
	 * @param sender
	 * @param receiver
	 */
	public NotRegisteredLetter(T letter, Inhabitant sender, Inhabitant receiver) {
		super(letter, sender, receiver);
	}

}
