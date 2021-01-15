/*
 * 11.05.2019
 * Lab 18
 * Written by Hadley Blalock 
 * CSCE 145
 * Section 008
 */

// outlines the methods the RPSPlayer objects must implement
public interface RPSPlayer {
	public int getPoints();
	public String getGesture();
	public void setPoints(int aPoints);
	public void setGesture(String aGesture);
	public void chooseGesture();
}
