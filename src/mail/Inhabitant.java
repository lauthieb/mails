package mail;

public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	public Inhabitant(String name, City city) {
		
		this.name = name;
		this.city = city;
		//TODO : Créér le compte de l'habitant ici, créer une nouvelle instance ici
		//BankAccount vide de base ? 
		//Ou valeur aléatoire ?
		this.bankAccount = new BankAccount(0, this);
		//this.bankAccount = bankAccount;
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
