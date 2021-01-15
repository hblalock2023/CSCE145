/*
 * 11.07.2019
 * Lab 19
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public interface Book {
	// the required methods of a book object
	public String getName();
	public String getAuthor();
	public double getCallNumber();
	public void setName(String aName);
	public void setAuthor(String anAuthor);
	public void setCallNumber(double aCallNumber);
	public String toString();
	public boolean equals(Book aBook);
}
