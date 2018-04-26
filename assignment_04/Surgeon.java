package assignment_04;

public class Surgeon extends Employee
{

	public Surgeon()
	{
		super("Let's slice him open!");
	}
	
	public Surgeon(String s)
	{
		super(s);
	}

	public void performSurgery()
	{
		super.speak();
	}
}
