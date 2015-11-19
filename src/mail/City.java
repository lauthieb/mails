package mail;

import java.util.List;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> postbox;
	
	public City(String name, List<Inhabitant> inhabitants, List<Letter<?>> postbox) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.postbox = postbox;
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
