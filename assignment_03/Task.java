package assignment_03;

public class Task implements Priority 
{
	private int priority = 0;
	private String name;
	
	public Task(String n, int p)
	{
		this.name = n;
		this.priority = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public int getPriority() 
	{
		return priority;
	}


	public void setPriority(int i) 
	{
		priority = i;
	}

	public String toString()
	{
		return priority + " " + name;
	}
}
