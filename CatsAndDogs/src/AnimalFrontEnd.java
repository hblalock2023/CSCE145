/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */
import java.util.*;

public class AnimalFrontEnd {

	public static void main(String[] args) {
		// sets up input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Cat and Dog Collection!");
		
		// initializes the variables used
		AnimalCollection collection = new AnimalCollection();
		String name = "";
		double weight = 0.0;
		String mood = "";
		String type = "";
		int numSpots = 0;
		int energyLevel = 0;
		String packLeaderName = "";
		
		// loops until quit
		boolean quit = false;
		while (!quit)
		{
			System.out.println("Would you like to..." + '\n' + "1) add a cat or dog" + '\n'
					+ "2) remove a cat or dog" + '\n' + "3) quit" + '\n' + "Enter a selection.");
			int selection = keyboard.nextInt();
			keyboard.nextLine();
			
			// switch case based on which action the user wants to do
			switch (selection)
			{
				// adds an animal
				case 1: 
					System.out.println("Would you like to add a..." + '\n' + "1) House Cat" + '\n'
							+ "2) Leopard" + '\n' + "3) Domestic Dog" + '\n' + "4) Wolf");
					int adding = keyboard.nextInt();
					keyboard.nextLine();
					
					// switch case for the animal the user chose
					// for each case: has the user enter the attributes for that animal, stores the values in
					// local variables and then builds an animal with those attributes and adds it to the collection
					switch (adding)
					{
						case 1: 
							System.out.println("Please enter the House Cat's name, weight, mood, and type.");
							name = keyboard.nextLine();
							weight = keyboard.nextDouble();
							keyboard.nextLine();
							mood = keyboard.nextLine();
							type = keyboard.nextLine();
							
							HouseCat houseCat = new HouseCat(name, weight, mood, type);
							
							collection.addAnimal(houseCat);
							break;
							
						case 2: 
							System.out.println("Please enter the Leopards's name, weight, mood, and number of spots.");
							name = keyboard.nextLine();
							weight = keyboard.nextDouble();
							keyboard.nextLine();
							mood = keyboard.nextLine();
							numSpots = keyboard.nextInt();
							keyboard.nextLine();
							
							Leopard leopard = new Leopard(name, weight, mood, numSpots);
							
							collection.addAnimal(leopard);
							break;
							
						case 3: 
							System.out.println("Please enter the Domestic Dog's name, weight, energy level, and type.");
							name = keyboard.nextLine();
							weight = keyboard.nextDouble();
							keyboard.nextLine();
							energyLevel = keyboard.nextInt();
							keyboard.nextLine();
							type = keyboard.nextLine();
							
							DomesticDog domesticDog = new DomesticDog(name, weight, energyLevel, type);
							
							collection.addAnimal(domesticDog);
							break;
							
						case 4: 
							System.out.println("Please enter the Wolf's name, weight, energy level, and Pack Leader's Name.");
							name = keyboard.nextLine();
							weight = keyboard.nextDouble();
							keyboard.nextLine();
							energyLevel = keyboard.nextInt();
							keyboard.nextLine();
							packLeaderName = keyboard.nextLine();
							
							Wolf wolf = new Wolf(name, weight, energyLevel, packLeaderName);
							
							collection.addAnimal(wolf);
							break;
					}
					break;
					
			// removes an animal
			case 2:
				System.out.println("Enter the name of the animal to be removed.");
				name = keyboard.nextLine();
						
				// builds an "animal" with that name
				Animal removingAnimal = new Animal();
				removingAnimal.setName(name);
				// removes the animal with that name
				collection.rmAnimal(removingAnimal);	
				break;
				
			// quits
			case 3:
				System.out.println("Goodbye!");
				quit = true;
				System.exit(0);
			}
			
			// prints out the collection
			System.out.println('\n' + "Current Collection:");
			collection.printAnimals();
			System.out.println();
		}
		
		keyboard.close();
	}
	
}
