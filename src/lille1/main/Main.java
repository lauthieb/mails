package lille1.main;

import java.util.Random;

import lille1.global.City;
import lille1.global.Inhabitant;
import lille1.letter.Letter;
import lille1.letter.NotRegisteredLetter;
import lille1.letter.PromissoryNote;
import lille1.letter.RegisteredLetter;
import lille1.letter.SimpleLetter;
import lille1.letter.UrgentLetter;

/**
 * 
 * Main is the main class of the project, this is the simulation of a mailing system
 *
 * @author Coilliaux Thibault
 * @author Thiebault Laurent
 * @author Saab Mathieu
 */
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
		
		/* Tests showing the compilation doesn't work when we have
		 * 		an UrgentLetter whose content is an UrgentLetter
		 * 		an RegisteredLetter whose content is an UrgentLetter
		 * 		an RegisteredLetter whose content is an RegisteredLetter
		UrgentLetter test = new UrgentLetter(new UrgentLetter(null, null, null), lille.getInhabitants().get(0), lille.getInhabitants().get(1));
		UrgentLetter test2 = new UrgentLetter(new RegisteredLetter(null, null, null), lille.getInhabitants().get(0), lille.getInhabitants().get(1));
		RegisteredLetter test3 = new RegisteredLetter(new RegisteredLetter(null, null, null), lille.getInhabitants().get(0), lille.getInhabitants().get(1));
		RegisteredLetter test4 = new RegisteredLetter(new UrgentLetter(null, null, null), lille.getInhabitants().get(0), lille.getInhabitants().get(1));
		*/
		
	}
	
	/**
	 * Static function which generate a list of letters for a day
	 * @param city the city in which the letters will be sent
	 */
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
	
	/**
	 * Static function which randomly generate letters to be posted in a city
	 * @param sender the Inhabitant which sent the letter
	 * @param receiver the Inhabitant which will receive the letter
	 * @return a letter
	 */
	public static Letter<?> generateLetter(Inhabitant sender, Inhabitant receiver) throws IllegalArgumentException {
		Random rand = new Random();
		
		UrgentLetter urgentLetter = null;
		RegisteredLetter registeredLetter = null;
		NotRegisteredLetter<?> letter;
		
		boolean simple = rand.nextBoolean();
		boolean registered = rand.nextBoolean();
		boolean urgent = rand.nextBoolean();
		
		// In each case we will need a Simple letter or a promissory note, which are 
		// what we call "rank one letters"
		if (simple) {
			letter = new SimpleLetter("blabla", sender, receiver);
		} else {
			int amount = rand.nextInt(100)+1;
			letter=  new PromissoryNote(amount, sender, receiver);
		}
		
		//If the letter has to be registered, we create a registered letter
		if(registered)  {
			registeredLetter = new RegisteredLetter(letter, sender, receiver);
			if(!urgent)
				return registeredLetter;
		}
		//If the letter has to be urgent, we create an urgent letter
		if(urgent) {
			if(registered)
				urgentLetter = new UrgentLetter(registeredLetter, sender, receiver);
			else
				urgentLetter = new UrgentLetter(letter, sender, receiver);
			return urgentLetter;
		}
		return letter;
	}

}
