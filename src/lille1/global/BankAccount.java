package lille1.global;

public class BankAccount {
	protected double amount;
	protected Inhabitant owner;
	
	public BankAccount(int amount, Inhabitant owner) {
		this.amount = amount;
		this.owner = owner;
	}
	
	public void credit(double amount) {
		this.amount += amount;
	}
	
	public void debit(double amount) {
		this.amount -= amount;
	}

	public double getAmount() {
		return amount;
	}

	public Inhabitant getOwner() {
		return owner;
	}
	
}
