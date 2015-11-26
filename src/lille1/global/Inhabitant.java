package lille1.global;
/**
 * 
 * Inhabitant is a class which represents one inhabitant of a city with his bank account
 * 
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class Inhabitant {
	protected String name;
	protected City city;
	protected BankAccount bankAccount;
	
	/**
	 * Constructor for the inhabitant
	 * @param name the name of the inhabitant
	 * @param city the city from where the inhabitant comes from
	 */
	public Inhabitant(String name, City city) {
		this.name = name;
		this.city = city;
		this.bankAccount = new BankAccount(5000, this);
	}
	
	/**
	 * A method which returns the name of the inhabitant
	 * @return the name of the inhabitant
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * A method which returns the city of the inhabitant
	 * @return the city of the inhabitant
	 */
	public City getCity() {
		return city;
	}
	
	/**
	 * A method which returns the bank account of the inhabitant
	 * @return the bank account of the inhabitant
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	
	
}
