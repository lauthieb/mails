package mail;

import java.util.List;

public class City {
	protected String name;
	protected List<Inhabitant> inhabitants;
	protected List<Letter<Content>> postbox;
	
	public City(String name, List<Inhabitant> inhabitants, List<Letter<Content>> postbox) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.postbox = postbox;
	}

	public void sendLetter(Letter<Content> letter) {
		this.postbox.add(letter);
	}
	
	public void distributeLetters() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}
	
	public List<Letter<Content>> getPostbox() {
		return postbox;
	}
	
}
