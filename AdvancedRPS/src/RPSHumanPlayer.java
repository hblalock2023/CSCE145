/*
 * 11.05.2019
 * Lab 18
 * Written by Hadley Blalock 
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class RPSHumanPlayer extends RPSBasicPlayer {
	
	// attribute
	private Scanner keyboard;
	
	public RPSHumanPlayer() // default constructor
	{
		super();
		keyboard = new Scanner(System.in);
	}
	
	// overrides the parent class chooseGesture method and uses the setGesture method and 
	// user input to choose the gesture
	@Override
	public void chooseGesture()
	{
		setGesture(keyboard.nextLine());
	}
}
