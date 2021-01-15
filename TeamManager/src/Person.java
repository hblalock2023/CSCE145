/*
 * 01.16.2020
 * In-Class Example
 */

// STEP 1: Define the class
public class Person {

	// STEP 2: Instance variables
	private String name;
	
	// STEP 3: Constructors
	public Person() // default
	{
		name = "none";
	}
	
	public Person(String name) // parameterized
	{
		setName(name);
	}
	
	// STEP 4: Accessors
	public String getName()
	{
		return name;
	}
	
	// STEP 5: Mutators
	public void setName(String name)
	{
		if (name != null)
		{
			this.name = name;
		}
	}
	
	// STEP 6: Other Methods
	public String toString()
	{
		return "Name: " + name;
	}
	
	public boolean equals(Person person)
	{
		return person != null && name.equals(person.getName());
	}
}
