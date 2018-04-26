package assignment_04;

public class Nurse extends Employee
{
	public Nurse()
	{
		super("It's time to refill your IV.");
	}
	
	public Nurse(String s)
	{
		super(s);
	}
	
	public void checkOnPatient()
	{
		super.speak();
	}
}
