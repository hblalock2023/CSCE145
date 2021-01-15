/*
 * 10.23.2019
 * In-Class Example
 */

public class Student extends Person{
	private int id;
	
	public Student()
	{
		super(); // calls Person's default constructor
		this.id = 0;
	}
	
	public Student(String aName, int anID)
	{
		super(aName); // calls Person's parameterized constructor
		this.setID(anID);
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setID(int anID) 
	{
		if (id >= 0)
		{
			this.id = anID;
		}
	}
	
	public String toString()
	{
		return super.toString() + " ID: " + this.id;
	}
	
	public boolean equals(Student aStudent)
	{
		return aStudent != null && 
				super.equals(aStudent) && 
				this.id == aStudent.getID();
	}
}
