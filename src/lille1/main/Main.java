package lille1.main;

import java.util.Random;

import lille1.global.City;
import lille1.global.Inhabitant;
import lille1.letter.Letter;
import lille1.letter.PromissoryNote;
import lille1.letter.RegisteredLetter;
import lille1.letter.SimpleLetter;
import lille1.letter.UrgentLetter;

public class Main {
	protected final static int SIMULATION_TIME = 6;
	protected final static int NB_INHABITANTS = 100;

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
			try {
				city.sendLetter(generateLetter(city.getInhabitants().get(idSender), city.getInhabitants().get(idReceiver)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Letter<?> generateLetter(Inhabitant sender, Inhabitant receiver) throws IllegalArgumentException {
		Random rand = new Random();
		Letter<?> letter;
		
		boolean simple = rand.nextBoolean();
		boolean registered = rand.nextBoolean();
		boolean urgent = rand.nextBoolean();
		
		// In each case we will need a Simple letter or a promissory note, which are 
		// what we call "rank one letters"
		if (simple) {
			letter = new SimpleLetter("blabla", sender, receiver);
		} else {
			int amount = rand.nextInt(100)+1;
			letter =  new PromissoryNote(amount, sender, receiver);
		}
		
		//If the letter has to be registered, we create a registered letter
		if(registered)
			letter = new RegisteredLetter<Letter<?>>(letter);
		//If the letter has to be urgent, we create an urgent letter
		if(urgent)
			letter = new UrgentLetter<Letter<?>>(letter);
		
		return letter;
	}

}
