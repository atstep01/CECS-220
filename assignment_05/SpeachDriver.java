package assignment_05;

public class SpeachDriver 
{
	public static void main(String[] args)
	{
		Senator jim = new Senator();
		Attorney ted = new Attorney();
		Preacher moe = new Preacher();
		
		jim.speak();
		jim.announce("We have to pass this bill!");
		ted.speak();
		ted.announce("You've been sued.");
		moe.speak();
		moe.announce("Welcome to church!");
	}
}
