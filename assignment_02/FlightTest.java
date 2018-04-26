package assignment_02;

public class FlightTest 
{
	public static void main(String[] args)
	{   
		//Instantiate three flights
		Flight fOne = new Flight("one",123210, "Dallas", "Seattle" );
		Flight fTwo = new Flight("two", 234321, "Nashville", "Chicago");
		Flight fThree = new Flight("three", 456543, "New York", "San Francisco");
		
		//Print the original 
		System.out.println(fOne.toString());
		System.out.println(fTwo.toString());
		System.out.println(fThree.toString());
		
		//Getter Test
		System.out.println(fOne.getName());
		System.out.println(fOne.getfNumber());
		System.out.println(fOne.getOrigin());
		System.out.println(fOne.getDestination());
		
		//Setter Test
		fOne.setName("New name");
		fOne.setfNumber(97);
		fOne.setOrigin("St. Louis");
		fOne.setDestination("Chattanooga");
		
		//Print the new 
		System.out.println(fOne.toString());
	}
}
