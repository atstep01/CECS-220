package assignment_04;

public class Mortician extends Employee
{
	public Mortician()
	{
		super("This guy is definetly dead");
	}
	
	public Mortician(String s)
	{
		super(s);
	}
	
	public void autopsy()
	{
		super.speak();
	}
}
