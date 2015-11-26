package lille1.letter;

import lille1.content.MoneyContent;
import lille1.global.Inhabitant;

/**
*
* PromissoryNote is the class which represents a money containing letter
*
* @author Coillaux Thibault
* @author Thiebault Laurent
* @author Saab Mathieu
*/
public class PromissoryNote extends NotRegisteredLetter<MoneyContent> {

	/**
	 * Constructor for a promissory note
	 * @param content the amount of money we want the letter to contain
	 * @param sender the inhabitant who is going to send the letter
	 * @param receiver the inhabitant who is going to receive the letter
	 */
	public PromissoryNote(int content, Inhabitant sender, Inhabitant receiver) {
		super(new MoneyContent(content), sender, receiver);
	}

	/**
	 * A method which returns the cost of a promissory note
	 * @return the cost of a promissory note
	 */
	@Override
	public int getCost() {
		return (int) (COST_LETTER + (0.01 * this.content.getAmount()));
	}

	/**
	 * Implementation of the doAction method. Here we debit the bank account from the sender, we credit the bank account of the receiver and the receiver send a thanks letter
	 */
	@Override
	public void doAction() {
		this.sender.getBankAccount().debit(this.content.getAmount());
		System.out.println("   - " + this.content.getAmount() + " euros are debited from " + this.sender.getName() + " account whose balance is now " + this.sender.getBankAccount().getAmount() + " euros");
		this.receiver.getBankAccount().credit(this.content.getAmount());
		System.out.println("   + " + this.receiver.getName() + " account is credited with " + this.content.getAmount() + " euros; its balance is now " + this.receiver.getBankAccount().getAmount() + " euros");
		
		ThanksLetter thanksLetter = new ThanksLetter("thanks for a promissory note letter whose content is a money content (" + this.content.getAmount() + ")", this.receiver, this.sender);
		this.receiver.getCity().sendLetter(thanksLetter);
	}
	
	/**
	 * A method which returns the description of the promissory note
	 * @return a String which describes the promissory note
	 */
	@Override
	public String toString() {
		return "a promissory note letter whose content is " + this.content;
	}

}
