package lille1.global;

import java.util.ArrayList;
import java.util.List;

import lille1.letter.Letter;
/**
 * 
 * City is a class which represents a city where inhabitants will echange letters
 *
 * @author Coillaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> postbox;
	
	/**
	 * The constructor for a city
	 * @param name the name of the city
	 */
	public City(String name) {
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postbox = new ArrayList<Letter<?>>();
		System.out.println("Creating " + this.name + " city");
	}

	/**
	 * A method which will send a letter by adding it to a list of letters. All the letters in this list will be delivered
	 * @param letter a letter to send
	 */
	public void sendLetter(Letter<?> letter) {
		letter.getSender().getBankAccount().debit(letter.getCost());
		this.postbox.add(letter);
		if(letter.getCost() > 1) {
			System.out.println("-> " + letter.getSender().getName() + " mails " + letter + " to " + letter.getReceiver().getName() +" for a cost of " + letter.getCost() + " euros");
			System.out.println("   - " + letter.getCost() + " euros are debited from " + letter.getSender().getName() + " account whose balance is now " + letter.getSender().getBankAccount().getAmount() + " euros");
		} else {
			System.out.println("-> " + letter.getSender().getName() + " mails " + letter + " to " + letter.getReceiver().getName() +" for a cost of " + letter.getCost() + " euro");
			System.out.println("   - " + letter.getCost() + " euro are debited from " + letter.getSender().getName() + " account whose balance is now " + letter.getSender().getBankAccount().getAmount() + " euros");
		}
	}
	
	
	/**
	 * A method which will distribute letters by emptying the current postbox.
	 * Because when some letters have for action to send another letter, we create a temporary list of the letter to send
	 * Then the newly created letters will not be posted the same day
	 */
	public void distributeLetters() {
		List<Letter<?>> currentPostbox = new ArrayList<Letter<?>>();
		for(Letter<?> letter: postbox) {
			currentPostbox.add(letter);
		}
		
		this.postbox.clear();
		
		for(int i = 0; i < currentPostbox.size(); i++) {
			Letter<?> letter = currentPostbox.get(i);
			System.out.println("<- " + letter.getReceiver().getName() + " receives " + letter + " from " + letter.getSender().getName());
			letter.doAction();
			currentPostbox.remove(letter);
		}
	}
	
	/**
	 * A method which create nb inhabitants
	 * @param nb the number of inhabitants we want to create
	 */
	public void createInhabitants(int nb) {
		System.out.println("Creating " + nb + " inhabitants");
		for(int i=0; i < nb; i++) {
			this.inhabitants.add(new Inhabitant("inhabitant-"+i, this));
		}
	}
	
	/**
	 * A method which returns the name of the city
	 * @return the name of the city
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * A method which returns the list of all the inhabitants
	 * @return the list of all inhabitants in the city
	 */
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	/**
	 * A method which returns the postbox, which is materialized by a list of letters
	 * @return a list of letters
	 */
	public List<Letter<?>> getPostbox() {
		return postbox;
	}
	
}
