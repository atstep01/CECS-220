package assignment_04;

public class Janitor extends Employee
{

	public Janitor()
	{
		super("I've mopped this whole surgical room.");
	}
	
	public Janitor(String s)
	{
		super(s);
	}
	
	public void clean()
	{
		super.speak();
	}
}
