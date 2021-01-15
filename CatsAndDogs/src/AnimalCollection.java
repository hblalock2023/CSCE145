/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class AnimalCollection {
	// attributes
	private Animal[] animal;
	private static int NUM_ANIMALS = 10;
	
	// constructor
	public AnimalCollection()
	{
		this.animal = new Animal[NUM_ANIMALS];
	}
	
	// accessor
	public Animal[] getAnimalCollection()
	{
		return this.animal;
	}
	
	// adds an animal
	public void addAnimal(Animal anAnimal)
	{
		for (int i = 0; i < animal.length; i++)
		{
			if (animal[i] == null) // checks to make sure that index is empty
			{
				animal[i] = anAnimal; // assigns that index the animal
				return;
			}
		}
		
		System.out.println("The Animal Colection is full :(");
	}
	
	public void rmAnimal(Animal anAnimal)
	{
		for (int i = 0; i < animal.length; i++)
		{
			// checks to make sure there is an animal at that index and that its name equals 
			// the name of the animal to be removed
			if(animal[i] != null && animal[i].getName().equals(anAnimal.getName()))
			{
				animal[i] = null; // "deletes" that animal by making the index null
				return;
			}
		}
		
		System.out.println("That animal was not found.");
	}
	
	// print method
	public void printAnimals()
	{
		for (int i = 0; i < animal.length; i++)
		{
			if (animal[i] != null)
			{
				System.out.println(animal[i].toString());
			}
		}
	}
}
