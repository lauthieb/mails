package mail;

public class BankAccount {
	protected int amount;
	protected Inhabitant owner;
	
	public BankAccount(int amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}
	
	public void credit(int amount) {
		this.amount += amount;
	}
	
	public void debit(int amount) {
		this.amount -= amount;
	}

	public int getAmount() {
		return amount;
	}

	public Inhabitant getOwner() {
		return owner;
	}
	
}
