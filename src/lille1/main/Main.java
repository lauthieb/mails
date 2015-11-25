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
			try {
				city.sendLetter(generateLetter(city.getInhabitants().get(idSender), city.getInhabitants().get(idReceiver)));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Letter<?> generateLetter(Inhabitant sender, Inhabitant receiver) throws IllegalArgumentException {
		Random rand = new Random();
		SimpleLetter sl;
		PromissoryNote pn;
		RegisteredLetter rl;
		UrgentLetter ul;
		
		boolean simple = rand.nextBoolean();
		boolean registered = rand.nextBoolean();
		boolean urgent = false; // a modifier par nextBoolean quand urgent OK
		
		if (simple) {
			sl = new SimpleLetter("bla bla", sender, receiver);
			if (registered) {
				rl = new RegisteredLetter(sl);
				if (urgent) {
					return null; // TODO
				}
				return rl;
			}
			return sl;
		} else {
			int amount = rand.nextInt(100)+1;
			pn = new PromissoryNote(amount, sender, receiver);
			if (registered) {
				rl = new RegisteredLetter(pn);
				if (urgent) {
					return null;
				}
				return rl;
			}
		}
		return new SimpleLetter("bla bla", sender, receiver); // TODO
	}

}
