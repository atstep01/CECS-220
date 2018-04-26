package assignment_04;

public class Doctor extends Employee
{

	public Doctor()
	{
		super("I'll write you a prescription.");
	}
	
	public Doctor(String s)
	{
		super(s);
	}
	
	public void seePatient()
	{
		super.speak();
	}
}
