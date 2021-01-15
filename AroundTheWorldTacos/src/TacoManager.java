/*
 * 10.21.2019
 * In-Class Example 
 */

import java.io.*;
import java.util.*;

public class TacoManager {

	private Taco[] tacos;
	public static final int DEF_SIZE = 100;
	
	public TacoManager(int size)
	{
		init(DEF_SIZE);
	}
	
	public void init(int size)
	{
		if(size <= 0)
		{
			init(DEF_SIZE);
		}
		
		tacos = new Taco[size];
	}
	
	public void addTaco(Taco aTaco)
	{
		if(aTaco == null)
		{
			return;
		}
		
		if(tacos[tacos.length-1] != null)
		{
			return; // the array is full
		}
		
		for(int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco; // adds new taco to empty space
				return; // returns so it doesn't keep adding the same taco
			}
		}
	}
	
	public void rmTaco(Taco aTaco)
	{
		// find the taco
		int rmIndex = -1;
		for (int i = 0; i < tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				break; // aTaco was not found
			}
			else if(tacos[i].equals(aTaco))
			{
				rmIndex = i;
				break;
			}
			
			if(rmIndex == -1)
			{
				return; // item not found
			}
			
			
		}
		
		for (int i = rmIndex; i < tacos.length - 1; i++)
		{
			tacos[i] = tacos[i + 1]; // shift to the left
		}
		
		tacos[tacos.length - 1] = null; // makes sure last index is null
	}
	
	public static final String DELIM = "\t";
	
	public void writeToFile(String aFileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(aFileName));
			// Print the Header
			fileWriter.println("Num Tacos" + DELIM + tacos.length);
			// Print the body
			for (Taco t: tacos)
			{
				if (t == null)
				{
					break;
				}
				fileWriter.println(t.getName() + DELIM +
						t.getLoc() + DELIM +
						t.getPrice());
			}
			
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFile(String aFileName)
	{
		try 
		{
			Scanner fileScanner = new Scanner(new File(aFileName));
			
			// Read the Header
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(DELIM);
			if(splitLines.length != 2)
			{
				return;
			}
			int size = Integer.parseInt(splitLines[1]);
			init(size);
			
			// Read the body
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(DELIM);
				/*if(splitLines.length != 3);
				{
					continue;
				}*/
				String name = splitLines[0];
				String loc = splitLines[1];
				double price = Double.parseDouble(splitLines[2]);
				Taco t = new Taco(name, loc, price);
				this.addTaco(t);
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
