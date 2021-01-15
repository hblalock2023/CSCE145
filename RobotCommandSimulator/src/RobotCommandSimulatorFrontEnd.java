/*
 * Homework 03
 * 02.19.2020
 * Hadley Blalock
 */

import java.util.Scanner;

public class RobotCommandSimulatorFrontEnd {
	
	public static void main(String[] args) {
		// sets up input
		Scanner keyboard = new Scanner(System.in);
		RobotCommandSimulator r = new RobotCommandSimulator();
		
		// starts simulator
		System.out.println("Welcome to the Robot Simulator!");
		boolean quit = false;
		while(quit == false)
		{
			// gets files
			System.out.println("Enter file for the Board:");
			String board = keyboard.nextLine();
			System.out.println("Enter file for the Robot Commands:");
			String commands = keyboard.nextLine();
			
			// creates board and moves
			System.out.println("Simulation begin...");
			r.createBoard(board);
			r.move(commands);
			
			// once simulation has ended
			System.out.println("Simulation end.");
			
			// quit or not
			System.out.println("Would like to quit? Enter 'yes' or 'no'.");
			String input = keyboard.nextLine();
			if(input.equalsIgnoreCase("yes"))
			{
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			}
		}
		
		keyboard.close();	
	}

}
