package assignment_04;

public class Receptionist extends Employee
{
	public Receptionist()
	{
		super("Hi! How may I help you?");
	}
	
	public Receptionist(String s)
	{
		super(s);
	}
	
	public void checkIn()
	{
		super.speak();
	}
}
