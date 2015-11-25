package lille1.letter;

import lille1.content.LetterContent;

/**
 * 
 * @author Coillaux Thibault, Thiebault Laurent, Saab Mathieu
 * SpecialLetter is a class which follows the Decorator Design Pattern
 *
 */
public abstract class SpecialLetter<T extends Letter<?>> extends Letter<LetterContent> {

	public SpecialLetter(T letter) {
		super(new LetterContent(letter), letter.getSender(), letter.getReceiver());
		// TODO Auto-generated constructor stub
	}
}
