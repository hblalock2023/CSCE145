/*
 * 11.05.2019
 * Lab 18
 * Written by Hadley Blalock 
 * CSCE 145
 * Section 008
 */

public class RPSBasicPlayer implements RPSPlayer {

	private int points;
	private String gesture;
	
	public RPSBasicPlayer() // default constructor
	{
		points = 0;
		gesture = "N/A";
	}
	
	// accessors
	@Override
	public int getPoints() 
	{
		return points;
	}

	@Override
	public String getGesture() 
	{
		return gesture;
	}

	// mutators
	@Override
	public void setPoints(int aPoints) 
	{
		if (aPoints >= 0)
		{
			points = aPoints;
		}
	}

	@Override
	public void setGesture(String aGesture) 
	{
		// gesture must be equal to rock, paper, or scissors
		if (aGesture != null && aGesture.equalsIgnoreCase("Rock")
				|| aGesture.equalsIgnoreCase("Paper") || aGesture.equalsIgnoreCase("Scissors"))
		{
			gesture = aGesture;
		}
	}

	// other methods
	@Override
	public void chooseGesture() // defaults gesture to rock
	{
		gesture = "Rock";
	}
	
}
