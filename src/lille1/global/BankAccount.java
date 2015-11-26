package lille1.global;
/**
 * 
 * BankAccount is a class which represents the bank account of a inhabitant
 * 
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class BankAccount {
	protected int amount;
	protected Inhabitant owner;
	
	/**
	 * Constructor for a bank account
	 * @param amount the base amount which is contained in the bank account
	 * @param owner the inhabitant that owns this account
	 */
	public BankAccount(int amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}
	
	/**
	 * A method which adds amount to the bank account
	 * @param amount the amount of money we want to add to that account
	 */
	public void credit(double amount) {
		this.amount += amount;
	}
	
	/**
	 * A method which removes amount to the bank account
	 * @param amount the amount of money we want to remove
	 */
	public void debit(double amount) {
		this.amount -= amount;
	}

	/**
	 * A method which returns the amount remaining in the bank account
	 * @return the ammount of money remaining in the bank account
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * A method which returns the owner of this bank account
	 * @return the inhabitant which owns this bank account
	 */
	public Inhabitant getOwner() {
		return owner;
	}
	
}
