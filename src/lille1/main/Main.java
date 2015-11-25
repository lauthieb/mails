package lille1.main;

import java.util.Random;

import lille1.global.City;
import lille1.global.Inhabitant;
import lille1.letter.Letter;
import lille1.letter.PromissoryNote;
import lille1.letter.SimpleLetter;

public class Main {
	protected final static int SIMULATION_TIME = 6;
	protected final static int NB_INHABITANTS = 10;

	public static void main(String[] args) throws Exception {
		City lille = new City("Lille");
		lille.createInhabitants(NB_INHABITANTS);
		
		System.out.println("Mailing letters for " + SIMULATION_TIME + " days");
		
		for(int i=0; i < SIMULATION_TIME ; i++) {
			System.out.println("**************************");
			System.out.println("Day " + (i+1));
			lille.distributeLetters();
			generateLetters(lille);
		}
		
		int day = SIMULATION_TIME + 1;
		
		while(!lille.getPostbox().isEmpty()) {
			System.out.println("**************************");
			System.out.println("Day " + day);
			lille.distributeLetters();
			day++;
		}
		
	}
	
	public static void generateLetters(City city) {
		Random rand = new Random();

		int letterNumber = rand.nextInt(NB_INHABITANTS);

		for (int n=0; n < letterNumber; n++) {
			int idSender = rand.nextInt(NB_INHABITANTS);
			int idReceiver;
			do {
				idReceiver = rand.nextInt(NB_INHABITANTS);
			} while(idReceiver == idSender);
			city.sendLetter(generateLetter(city.getInhabitants().get(idSender), city.getInhabitants().get(idReceiver)));
		}		
	}
	
	public static Letter<?> generateLetter(Inhabitant sender, Inhabitant receiver) {
		Random rand = new Random();
		int typeLetter = rand.nextInt(2);
		
		switch(typeLetter) {
			case 0:
				return new SimpleLetter("bla bla", sender, receiver);
			case 1:
				int amount = rand.nextInt(100)+1;
				return new PromissoryNote(amount, sender, receiver);
		}
		return null;
	}

}
