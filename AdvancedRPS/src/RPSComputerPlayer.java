/*
 * 11.05.2019
 * Lab 18
 * Written by Hadley Blalock 
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class RPSComputerPlayer extends RPSBasicPlayer {
	
	// attribute
	private Random rand;
	
	public RPSComputerPlayer() // default constructor
	{
		rand = new Random();
	}
	
	// overrides the parent class chooseGesture method and uses a random int and 
	// switch case statement to choose the gesture
	@Override
	public void chooseGesture()
	{
		int num = rand.nextInt(3);
		
		switch (num)
		{
			case 0:
				setGesture("rock");
				break;
			case 1:
				setGesture("paper");
				break;
			case 2:
				setGesture("scissors");
				break;
		}
		
	}
}
