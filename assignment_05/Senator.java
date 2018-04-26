package assignment_05;

public class Senator implements Speaker 
{

	@Override
	public void speak() 
	{
		System.out.println("Vote for me this wednesday!");

	}

	@Override
	public void announce(String str) 
	{
		System.out.println(str);

	}

}
