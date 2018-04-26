package assignment_04;

public class Employee 
{
	private String motto;

	public Employee()
	{
		this.motto = "I love working in the hospital";
	}
	
	public Employee(String s)
	{
		this.motto = s;
	}
	
	public void setMotto(String s)
	{
		this.motto = s;
	}
	
	public String getMotto()
	{
		return this.motto;
	}
	public void speak()
	{
		System.out.println(this.motto);
	}
}
