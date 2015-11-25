package lille1.letter;

import lille1.content.LetterContent;
import lille1.global.Inhabitant;
import lille1.letter.Letter;

/**
 * 
 * @author Coillaux Thibault, Thiebault Laurent, Saab Mathieu
 * SpecialLetter is a class which follows the Decorator Design Pattern
 *
 */
public abstract class SpecialLetter extends Letter<LetterContent> {

	public SpecialLetter(LetterContent content, Inhabitant sender,
			Inhabitant receiver) {
		super(content, sender, receiver);
		// TODO Auto-generated constructor stub
	}
}
