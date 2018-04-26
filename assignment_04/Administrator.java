package assignment_04;

public class Administrator extends Employee
{
	public Administrator()
	{
		super("I think we need to assign more doctors to the ER.");
	}
	
	public Administrator(String s)
	{
		super(s);
	}
	
	public void manage()
	{
		super.speak();
	}
}
