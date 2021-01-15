/*
 * 01.16.2020
 * In-Class Example
 */

public class Student extends Person {

	private int id;
	
	public Student() 
	{
		super();
		id = 0;
	}
	
	public Student(String name, int id)
	{
		super(name);
		setID(id);
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int id)
	{
		if (id >= 0)
		{
			this.id = id;
		}
	}

	public String toString() {
		return "Student ID = " + id;
	}


	public boolean equals(Student student) {
		return student != null && super.equals(student) && this.id == student.getID();
	}
	
	
	
}
