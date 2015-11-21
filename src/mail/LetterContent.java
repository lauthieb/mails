package mail;

public class LetterContent extends Content {
	protected Letter<?> letter;
	
	public LetterContent(Letter<?> letter) {
		this.letter = letter;
	}
	
	public Letter<?> getLetter() {
		return this.letter;
	}
	
	@Override
	public String toString() {
		return "letter content (" + this.letter.getContent() + ")";
	}
	
}
