package lille1.content;

import lille1.letter.Letter;
/**
 * 
 * LetterContent is a class which represents letter contained inside a letter, like the urgent letters 
 *
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class LetterContent implements Content {
	protected Letter<?> letter;
	
	/**
	 * Constructor for the letter content
	 * @param letter a letter
	 */
	public LetterContent(Letter<?> letter) {
		this.letter = letter;
	}
	
	/**
	 * A method which returns the letter contained in the LetterContent
	 * @return a letter
	 */
	public Letter<?> getLetter() {
		return this.letter;
	}
	
	/**
	 * A method that returns a description of the content
	 * @return a description of the content
	 */
	@Override
	public String toString() {
		return "" + this.letter;
	}
	
}
