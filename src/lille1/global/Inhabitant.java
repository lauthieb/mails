package lille1.global;

public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, City city) {
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(5000, this);
	}
	
	public String getName() {
		return name;
	}
	
	public City getCity() {
		return city;
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	
	
}
