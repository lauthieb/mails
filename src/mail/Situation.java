package mail;

import java.util.ArrayList;
import java.util.Random;

public class Situation {
	protected final static int SIMULATION_TIME = 6;

	public static void main(String[] args) {
		//Creation of a list of inhabitants
		ArrayList<Inhabitant> allInhabitants = new ArrayList<Inhabitant>();
		//Create a City
		City theCity = new City("Lille", allInhabitants);
		//Create 100 inhabitants
		for (int i=1; i<=100; i++) {
			allInhabitants.add(new Inhabitant("Inhabitant-"+i, theCity));
		}
		
		//We send and receive letters for SIMULATION_TIME days
		for (int k=1; k<=SIMULATION_TIME; k++) {
			generateLetters(theCity);
		}
		
		//While there is still mail to post, we keep going the simulation
		while(theCity.getPostbox().isEmpty()) {
			
		}
		
	}
	
	public static void generateLetters(City theCity) {
		Random rand = new Random();
		//We generate the number of inabitants who will send a letter
		int senderNumber = rand.nextInt(99)+1;
		//For each selected inhabitant
		for (int n=0; n<senderNumber; n++) {
			//We generate a letter for him, to another random inhabitant
			//We select the sender between the hundred inhabitants
			int sender = rand.nextInt(99)+1;
			//We select the receiver between the hundred inhabitants
			int receiver = rand.nextInt(99)+1;
			generateLetter(theCity.inhabitants.get(sender), theCity.inhabitants.get(receiver));
		}		
	}
	
	public static Letter<?> generateLetter(Inhabitant sender, Inhabitant receiver) {
		Random rand = new Random();
		// 0 : Basic Letter (A letter which is not Registered nor Urgent)
		// 1 : Registered Letter
		// 2 : Urgent Letter
		int letterTypeSelector = rand.nextInt(2);
		switch(letterTypeSelector) {
		//TODO: Create a letter depending on the content on every case then add it to a Registered or Urgent Letter Instance
		case 1:
			//Select content type
			//Generate the content
			//Create the letter
			break;
		case 2:
			//Select content type
			//Generate the content inside a Letter
			//Add the letter created inside a RegisteredLetter Instance
			break;
		case 3:
			//Select content type
			//Generate the content inside a Letter
			//Add the letter created inside a RegisteredLetter Instance
			break;
		}
	}
	
	//Method initially created to create a random inhabitant
	//public static Inhabitant createRandomInhabitant(int number, City city) {
	//	Inhabitant oneInhabitant = new Inhabitant("Inhabitant-"+number, city);
	//	return oneInhabitant;
	//}

}
