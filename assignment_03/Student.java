package assignment_03;

public class Student 
{
	private double tAvg;
	private String name; 
	
	public Student(double x, String y)
	{
		this.tAvg = x;
		this.name = y;
	}
	
	public double getAvg()
	{
		return this.tAvg;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAvg(double x)
	{
		this.tAvg = x;
	}
	
	public void setName(String y)
	{
		this.name = y;
	}
	
	public String toString()
	{
		return name + " " + tAvg;
	}
}
