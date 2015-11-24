package lille1.letter;

import lille1.content.MoneyContent;

public class PromissoryNote extends Letter<MoneyContent> {

	public PromissoryNote(double content) {
		this.content = new MoneyContent(content);
	}

	@Override
	public double getCost() {
		return COST_LETTER + (0.01 * this.content.getAmount());
	}

	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		this.receiver.getBankAccount().credit(this.content.getAmount());
		
		SimpleLetter thanksLetter = new SimpleLetter("thanks for a promissory note letter whose content is a money content (" + this.content.getAmount() + ")");
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	@Override
	public String toString() {
		return "promissory note letter whose content is a " + this.content;
	}

}
