/*
 * 01.16.2020
 * In-Class Example
 */

import java.util.Scanner;
import java.io.*;

public class TeamManager {
	
	//private Person[] team;
	private GenLL<Person> team;
	private static final int DEF_SIZE = 30;
	
	public TeamManager()
	{
		init(DEF_SIZE);
	}
	
	public TeamManager(int size)
	{
		init(size);
	}
	
	private void init(int size)
	{
		/*if (size > 0)
		{
			init(size);
		}
		else
		{
			init(DEF_SIZE);
		}*/
		
		team = new GenLL<Person>();
	}
	
	public void add(Person p)
	{
		/*if (team[team.length-1] != null)
		{
			return;
		}
		
		for (int i = 0; i < team.length; i++)
		{
			if (team[i] == null)
			{
				team[i] = p;
				break;
			}
		}*/
		team.add(p);
	}
	
	public void rm(Person p)
	{
		/*int rmIndex = getIndex(p);
		
		if (rmIndex == -1)
		{
			return;
		}
		
		for (int i = rmIndex; i < team.length-1; i++)
		{
			team[i] = team[i+1];
		}
		
		team[team.length-1] = null;*/
		
		team.resetCurrent();
		while(team.hasMore())
		{
			if (team.getCurrent().equals(p))
			{
				team.removeCurrent();
				break;
			}
			team.goToNext();
		}
	}
	
	/*private int getIndex(Person p)
	{
		int ret = -1;
		
		for(int i = 0; i < team.length; i++)
		{
			if(team[i] != null && p.equals(team[i]))
			{
				return i;
			}
		}
		
		return ret;	
	}*/
	
	public void print()
	{
		for (Person p : team)
		{
			if (p != null)
			{
				System.out.println(p);
			}
			else
			{
				break;
			}
		}
	}
	
	/*
	 * Header
	 * Num People\t<<# people>>\n
	 * Body
	 * <<type>>\t<<name>>\n
	 * <<type>>\t<<name>>\t<<ID>>\n
	 * <<type>>\t<<name>>\t<<ID>>\t<<Level>>\n
	 */
	
	public static final String DELIM = "\t";
	
	public void printToFile(String fileName)
	{
		try 
		{
			PrintWriter fileWriter = new PrintWriter(new File(fileName));
			// Print header
			//fileWriter.println("Num People" + DELIM + team.length);
			// Print body
			for (Person p : team)
			{
				if (p == null)
				{
					break;
				}
				
				if (p.getClass().equals("Person"))
				{
					fileWriter.println(p.getClass() + DELIM + p.getName());
				}
				else if (p.getClass().equals("Student"))
				{
					Student s = (Student)p;
					fileWriter.println(s.getClass() + DELIM + s.getID());
				}
				
				fileWriter.close();				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			String fileLine = fileScanner.nextLine();
			String[] splitLine = fileLine.split(DELIM);
			
			if (splitLine.length != 2)
			{
				return;
			}
			
			int size = Integer.parseInt(splitLine[1]);
			init(size);
			
			while (fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLine = fileLine.split(DELIM);
				if (splitLine[0].equals("Student"))
				{
					String name = splitLine[1];
					int id = Integer.parseInt(splitLine[2]);
					add(new Student(name, id));
				}
			}
			
			fileScanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
