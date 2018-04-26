package assignment_02;

public class Flight 
{
	private String name;
	private int fNumber;
	private String origin;
	private String destination;
	
	public Flight(String name, int fNumber, String origin, String destination)
	{
		this.name = name;
		this.fNumber = fNumber;
		this.origin = origin;
		this.destination = destination;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setfNumber(int fNumber) 
	{
		this.fNumber = fNumber;
	}
	
	public void setOrigin(String origin) 
	{
		this.origin = origin;
	}
	
	public void setDestination(String destination) 
	{
		this.destination = destination;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public int getfNumber() 
	{
		return fNumber;
	}

	public String getOrigin() 
	{
		return origin;
	}

	public String getDestination() 
	{
		return destination;
	}

	public String toString()
	{
		String result = "Name: " + this.getName() + "   Flight Number: " + this.getfNumber() + "   Origin: " + this.getOrigin() + "   Destination: " + this.getDestination();
		return result;
	}
	
}
