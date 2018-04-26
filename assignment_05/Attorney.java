package assignment_05;

public class Attorney implements Speaker 
{

	@Override
	public void speak() 
	{
		System.out.println("My client is innocent!");

	}

	@Override
	public void announce(String str) 
	{
		System.out.println(str);

	}

}
