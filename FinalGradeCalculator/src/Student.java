/*
 * 11.21.2019
 * Lab 22
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

import java.io.*;
import java.util.*;

public class Student {

	// attributes
	private double labSum;
	private double labCount;
	private double labRSum;
	private double labRCount;
	private double hwSum;
	private double hwCount;
	private double exam01;
	private double exam02;
	private double finalExam;
	
	// default constructor
	public Student()
	{
		labSum = 0.0;
		labCount = 0.0;
		labRSum = 0.0;
		labRCount = 0.0;
		hwSum = 0.0;
		hwCount = 0.0;
		exam01 = 0.0;
		exam02 = 0.0;
		finalExam = 0.0;
	}
	
	// returns lab average
	public double getLabAverage()
	{
		return labSum / labCount;
	}
	
	// returns lab report average
	public double getLabReportAverage()
	{
		return labRSum / labRCount;
	}
		
	// returns homework average
	public double getHomeworkAverage()
	{
		return hwSum / hwCount;
	}
	
	// returns exam 1 grade
	public double getExam01()
	{
		return exam01;
	}
	
	// returns exam 2 grade
	public double getExam02()
	{
		return exam02;
	}
	
	// returns final exam grade
	public double getFinal()
	{
		return finalExam;
	}
	
	// adds a grade by taking in it's type and adding that grade to the running sum 
	// for that section and increasing that section count by one
	public void addGrade(String type, double grade)
	{
		if (type != null && grade >= 0.0)
		{
			if(type.equalsIgnoreCase(SectionType.LABS))
			{
				labSum += grade;
				labCount += 1;
			}
			else if (type.equalsIgnoreCase(SectionType.LAB_REPORTS))
			{
				labRSum += grade;
				labRCount += 1;
			}
			else if (type.equalsIgnoreCase(SectionType.HOMEWORK))
			{
				hwSum += grade;
				hwCount += 1;
			}
			else if (type.equalsIgnoreCase(SectionType.EXAM01))
			{
				exam01 = grade;
			}
			else if (type.equalsIgnoreCase(SectionType.EXAM02))
			{
				exam02 = grade;
			}
			else if (type.equalsIgnoreCase(SectionType.FINAL))
			{
				finalExam = grade;
			}
			else
			{
				System.out.println("That is not a valid assignment type");
			}
		}
	}
	
	// calculates numeric grade
	public double getGradeNumeric()
	{
		// sort exams 
		double grade = 0;
		double examGrades[] = new double[3];
		examGrades[0] = exam01; 
		examGrades[1] = exam02; 
		examGrades[2] = finalExam;
		
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < examGrades.length - 1; i++)
			{
				if (examGrades[i] > examGrades[i + 1])
				{
					// swap
					double temp = examGrades[i];
					examGrades[i] = examGrades[i + 1];
					examGrades[i + 1] = temp;
					hasSwapped = true;
				}
			}
		}

		// exams are ranked lowest to highest
		double highestExam = examGrades[2];
		double secondHighestExam = examGrades[1];

		// calculates grade
		grade = (getLabAverage() * 0.10) + (getLabReportAverage() * 0.10) +
				(getHomeworkAverage() * 0.20) + (highestExam * 0.30) +
				(secondHighestExam * 0.30);
		
		return grade;
	}
	
	// rounds grade up
	public double getGradeRounded()
	{
		return Math.ceil(getGradeNumeric());
	}
	
	// assigns a letter grade based on the numeric grade
	public String getGradeLetter()
	{
		double grade = getGradeRounded();
		String letterGrade = "";
		
		if(grade >= 90.0)
		{
			letterGrade = "A";
		}
		else if(grade < 90.0 || grade >= 85.0)
		{
			letterGrade = "B+";
		}
		else if(grade < 85.0 || grade >= 80.0)
		{
			letterGrade = "B";
		}
		else if(grade < 80.0 || grade >= 75.0)
		{
			letterGrade = "C+";
		}
		else if(grade < 75.0 || grade >= 70.0)
		{
			letterGrade = "C";
		}
		else if(grade < 70.0 || grade >= 65.0)
		{
			letterGrade = "D+";
		}
		else if(grade < 65.0 || grade >= 60.0)
		{
			letterGrade = "D";
		}
		else if(grade < 60.0)
		{
			letterGrade = "F";
		}
		else
		{
			System.out.println("Grade cannot be calculated.");
		}
		
		return letterGrade;
	}
	
	// reads the file
	public void readGradeFile(String fileName) throws FileNotFoundException
	{
		try 
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			
			String section = "";
			
			while(fileScanner.hasNextLine())
			{
				String fileContent = fileScanner.nextLine();
				
				// switches section based on header
				switch(fileContent)
				{
					case SectionType.LABS:
						section = SectionType.LABS;
						break;
					case SectionType.LAB_REPORTS:
						section = SectionType.LAB_REPORTS;
						break;
					case SectionType.HOMEWORK:
						section = SectionType.HOMEWORK;
						break;
					case SectionType.EXAM01:
						section = SectionType.EXAM01;
						break;
					case SectionType.EXAM02:
						section = SectionType.EXAM02;
						break;
					case SectionType.FINAL:
						section = SectionType.FINAL;
						break;
					// if there's not a header it means the loop has reached the grades,
					// converts the number to a double and 
					// adds that grade based on the last header
					default:
						addGrade(section, Double.parseDouble(fileContent));
				}
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// converts to string
	public String toString()
	{
		return "Lab Average: " + getLabAverage() + "\n" +
				"Lab Report Average: " + getLabReportAverage() + "\n" +
				"Homework Average: " + getHomeworkAverage() + "\n" +
				"Exam 01: " + getExam01() + "\n" + "Exam 02: " + getExam02() + "\n" +
				"Final Exam: " + getFinal() + "\n" + "Raw Total: " + getGradeNumeric() + "\n" +
				"FINAL GRADE: " + getGradeLetter() + ": " + getGradeRounded();
	}
}
