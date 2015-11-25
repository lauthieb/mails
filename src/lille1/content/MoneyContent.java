package lille1.content;

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
		return "whose content is a money content (" + this.amount + ")";
	}

}
