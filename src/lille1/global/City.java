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
		this.postbox.add(letter);
		System.out.println("-> "+letter.getSender().getName()+" mails "+letter+" to "+letter.getReceiver().getName()+" a cost of "+letter.getCost()+" euro");
	}
	
	public void distributeLetters() {
		for(Letter<?> letter: postbox) {
			letter.doAction();
			this.postbox.remove(letter);
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
