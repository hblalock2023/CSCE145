/*
 * 01.21.2020
 * In-Class Example
 */

public class Ugrad extends Student{
	
	private int level; // 0 = fresh; 1 = soph; 2 = jun; 3 = sen; 4 = ssgss
	
	public Ugrad()
	{
		super();
		level = 0;
	}
	
	public Ugrad(String name, int ID, int level)
	{
		super(name, ID);
		setLevel(level);
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		if (level >= 0 && level <= 4)
		{
			this.level = level;
		}
	}
	
	public String toString()
	{
		return "The student is year " + level + ".";
	}
	
	public boolean equals(Ugrad ugrad)
	{
		return ugrad != null && super.equals(ugrad) && level == ugrad.getLevel();
	}
}
