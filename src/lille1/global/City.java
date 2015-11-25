package lille1.global;

import java.util.ArrayList;
import java.util.List;

import lille1.letter.Letter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> postbox;
	
	public City(String name) {
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.postbox = new ArrayList<Letter<?>>();
		System.out.println("Creating " + this.name + " city");
	}

	public void sendLetter(Letter<?> letter) {
		letter.getSender().getBankAccount().debit(letter.getCost());
		letter.getSender().numberOfLetterSent++;
		this.postbox.add(letter);
		if(letter.getCost() > 1) {
			System.out.println("-> " + letter.getSender().getName() + " mails " + letter + " to " + letter.getReceiver().getName() +" for a cost of " + letter.getCost() + " euros");
			System.out.println("   - " + letter.getCost() + " euros are debited from " + letter.getSender().getName() + " account whose balance is now " + letter.getSender().getBankAccount().getAmount() + " euros");
		} else {
			System.out.println("-> " + letter.getSender().getName() + " mails " + letter + " to " + letter.getReceiver().getName() +" for a cost of " + letter.getCost() + " euro");
			System.out.println("   - " + letter.getCost() + " euro are debited from " + letter.getSender().getName() + " account whose balance is now " + letter.getSender().getBankAccount().getAmount() + " euros");
		}
	}
	
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
	
	public void createInhabitants(int nb) {
		System.out.println("Creating " + nb + " inhabitants");
		for(int i=0; i < nb; i++) {
			this.inhabitants.add(new Inhabitant("inhabitant-"+i, this));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	public List<Letter<?>> getPostbox() {
		return postbox;
	}
	
}
