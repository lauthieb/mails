package lille1.content;

public class MoneyContent extends Content {
	protected int amount;

	public MoneyContent(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return "a money content (" + this.amount + ")";
	}

}
