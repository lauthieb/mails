package lille1.letter;

import lille1.content.MoneyContent;
import lille1.global.Inhabitant;

public class PromissoryNote extends Letter<MoneyContent> {

	public PromissoryNote(double content, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(content), sender, receiver);
	}

	@Override
	public double getCost() {
		return COST_LETTER + (0.01 * this.content.getAmount());
	}

	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		this.receiver.getBankAccount().credit(this.content.getAmount());
		
		SimpleLetter thanksLetter = new SimpleLetter("thanks for a promissory note letter whose content is a money content (" + this.content.getAmount() + ")", this.receiver, this.sender);
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	@Override
	public String toString() {
		return "promissory note letter whose content is a " + this.content;
	}

}
