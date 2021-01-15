/*
 * 10.23.2019
 * In-Class Example
 */

public class UGrad extends Student{
	private int level;
	
	public UGrad()
	{
		super();
		this.level = 1;
	}
	
	public UGrad(String aName, int anID, int aLevel)
	{
		super(aName, anID);
		this.setLevel(aLevel);
	}
	
	public int getLevel()
	{
		return this.level;
	}
	
	public void setLevel(int aLevel)
	{
		if (aLevel >= 1 && aLevel <= 5)
		{
			this.level = aLevel;
		}
		else
		{
			this.level = 1;
		}
	}
	
	public String toString()
	{
		return super.toString() + " Level: " + this.level;
	}
	
	public boolean equals(UGrad aUGrad)
	{
		return super.equals(aUGrad) && this.level == aUGrad.getLevel();
	}
}
