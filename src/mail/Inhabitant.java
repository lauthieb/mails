package mail;

public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, City city, BankAccount bankAccount) {
		this.name = name;
		this.city = city;
		this.bankAccount = bankAccount;
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
