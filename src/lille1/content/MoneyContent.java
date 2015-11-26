package lille1.content;
/**
 * 
 * MoneyContent is a content which is composed by an amount of money
 * 
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class MoneyContent implements Content {
	protected int amount;

	/**
	 * The constructor for a money content
	 * @param amount the amount of money contained in the letter
	 */
	public MoneyContent(int amount) {
		this.amount = amount;
	}

	/**
	 * A method which returns the amount which is inside the letter
	 * @return the amount of money inside the letter
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * A method that returns a description of the content
	 * @return a descritption of the content
	 */
	@Override
	public String toString() {
		return "a money content (" + this.amount + ")";
	}

}
