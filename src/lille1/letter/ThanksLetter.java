package lille1.letter;

import lille1.global.Inhabitant;

public class ThanksLetter extends SimpleLetter {

	public ThanksLetter(String content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	
	public String toString() {
		return "thanks letter which is a " + super.toString();
	}

}
