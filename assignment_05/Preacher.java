package assignment_05;

public class Preacher implements Speaker 
{

	@Override
	public void speak() 
	{
		System.out.println("Praise God!");

	}

	@Override
	public void announce(String str)
	{
		System.out.println(str);

	}

}
