/*
 * 10/14/2019
 * Lab 12
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class AppleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the Apple Tester!");

		// declares three instances of an object and assigns them values
		System.out.println("Generating three apples...");
		Apple apple01 = new Apple("Granny Smith", 0.128, 0.48);
		Apple apple02 = new Apple("Gala", 0.022, 0.54);
		Apple apple03 = new Apple("Golden Delicious", 0.190, 0.62);
		
		// prints out each apple object's information using the toString() method
		System.out.println("Apple 01: " + apple01.toString());
		System.out.println("Apple 02: " + apple02.toString());
		System.out.println("Apple 03: " + apple03.toString());
		
		// uses the accessor methods
		System.out.println("Let's find some info for each apple.");
		System.out.println("Apple 01 Type: " + apple01.getType());
		System.out.println("Apple 02 Weight: " + apple02.getWeight() + "kgs");
		System.out.println("Apple 03 Price: $" + apple03.getPrice());

		// uses the mutators methods
		System.out.println("Changing Apple 03...");
		apple03.setType("Granny Smith");
		apple03.setWeight(0.128);
		apple03.setPrice(0.48);
		System.out.println("Apple 03: " + apple03.toString());
		
		// checks to see if any of the apples are equal to each other using the equals() method
		System.out.println("Let's see if any of these apples are the same.");
		System.out.println("Does Apple 01 equal Apple 02? " + apple01.equals(apple02));
		System.out.println("Does Apple 01 equal Apple 03? " + apple01.equals(apple03));
		System.out.println("Does Apple 02 equal Apple 03? " + apple02.equals(apple03));
	}

}
