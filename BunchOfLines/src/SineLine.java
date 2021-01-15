/*
 * 10.30.2019
 * Lab 17
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// implements line
public class SineLine implements Line {
	
	// attributes
	public double amplitude;
	public double frequency;
	
	// constructors
	public SineLine() // default
	{
		this.amplitude = 1.0;
		this.frequency = 1.0;
	}

	public SineLine(double anAmplitude, double aFrequency) // parameterized
	{
		this.setAmplitude(anAmplitude);
		this.setFrequency(aFrequency);
	}

	// accessors
	public double getAmplitude()
	{
		return this.amplitude;
	}
	
	public double getFrequency()
	{
		return this.frequency;
	}
	
	// mutators
	public void setAmplitude(double anAmplitude)
	{
		if (anAmplitude > 0.0)
		{
			this.amplitude = anAmplitude;
		}

	}
	
	public void setFrequency(double aFrequency)
	{
		if (aFrequency > 0.0)
		{
			this.frequency = aFrequency;
		}
	}
	
	// returns the y point
	public double getYPoint(double xPoint)
	{
		return this.amplitude * Math.sin(xPoint * this.frequency);
	}
}
