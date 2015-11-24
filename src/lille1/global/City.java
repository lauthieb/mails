package lille1.global;

import java.util.ArrayList;
import java.util.List;

import lille1.letter.Letter;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> postbox;
	
	public City(String name, List<Inhabitant> inhabitants) {
		//TODO : cr�er une liste de Letter ici au lieu de le passer en param�tre
		this.name = name;
		this.inhabitants = inhabitants;
		this.postbox = new ArrayList<Letter<?>>(); {
		};
	}

	public void sendLetter(Letter<?> letter) {
		letter.getSender().getBankAccount().debit(letter.getCost());
		this.postbox.add(letter);
	}
	
	public void distributeLetters() {
		for(Letter<?> letter: postbox) {
			letter.doAction();
			this.postbox.remove(letter);
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
