package lille1.letter;

import lille1.content.MoneyContent;
import lille1.global.Inhabitant;

public class PromissoryNote extends Letter<MoneyContent> {

	public PromissoryNote(int content, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(content), sender, receiver);
	}

	@Override
	public int getCost() {
		return (int) (COST_LETTER + (0.01 * this.content.getAmount()));
	}

	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		System.out.println("   - " + this.content.getAmount() + " euros are debited from " + this.sender.getName() + " account whose balance is now " + this.sender.getBankAccount().getAmount() + " euros");
		this.receiver.getBankAccount().credit(this.content.getAmount());
		System.out.println("   + " + this.receiver.getName() + " account is credited with " + this.content.getAmount() + " euros; its balance is now " + this.receiver.getBankAccount().getAmount() + " euros");
		
		ThanksLetter thanksLetter = new ThanksLetter("thanks for a promissory note letter whose content is a money content (" + this.content.getAmount() + ")", this.receiver, this.sender);
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	@Override
	public String toString() {
		return "a promissory note letter whose content is a " + this.content;
	}

}
