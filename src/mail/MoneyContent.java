package mail;

public class MoneyContent extends Content {
	protected double amount;

	public MoneyContent(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "money content (" + this.amount + ")";
		
	}

}
