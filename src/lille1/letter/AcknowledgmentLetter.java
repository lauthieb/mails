package lille1.letter;

import lille1.global.Inhabitant;

public class AcknowledgmentLetter extends SimpleLetter {

	public AcknowledgmentLetter(String content, Inhabitant sender, Inhabitant receiver) {
		super(content, sender, receiver);
	}
	
	public String toString() {
		return "aknowledgment of receipt which is a " + super.toString();
	}
	
}
