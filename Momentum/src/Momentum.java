/*
 * 08/29/2019
 * Hadley Blalock
 * CSCE 145
 * Section 008
 */
import java.util.Scanner;	

public class Momentum {
	
	//Declares the conversion factors as public global variables
	public static final double poundsToKilograms = 0.45359237;
	public static final double mphToMPS = 0.44704;
	
	public static void main(String[] args) {
				
		//Program prompts user for input for mass and velocity
		System.out.println("Today we will be calculating Momentum and Kinectic Energy! You just have to let me know a few things first...");
		System.out.println("What is the mass of your object (in lbs)?");
		Scanner keyboard = new Scanner(System.in);
		double massInPounds = keyboard.nextDouble();
		System.out.println("What is its velocity (in mph)?");
		double velocityInMPH = keyboard.nextDouble();

		//Converts mass and velocity to SI units
		double massSI = massInPounds * poundsToKilograms;
		double velocitySI = velocityInMPH * mphToMPS;
		
		//Calculates Momentum
		double momentum = (massSI)*(velocitySI);
		
		//Calculates Kinetic Energy
		double kineticEnergy = (momentum * momentum) / (2*(massSI));
	
		//Prints answers in dialogue
		System.out.println("Your object has a mass of "+massInPounds+" lbs and is moving at a velocity of "+velocityInMPH+" mph.");
		System.out.println("Your object's momentum is "+momentum+" kgm/s and its kinetic energy is "+kineticEnergy+" J.");
		System.out.println("Thanks!");
	}

}
