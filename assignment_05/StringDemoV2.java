package assignment_05;

import java.util.Scanner;

public class StringDemoV2 
{
	public static void main(String[] args) throws StringTooLongException
	{
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.println("Enter a string less than 20 characters (Enter DONE to exit the program)");
		s = scan.nextLine();
		while(!s.equals("DONE"))
		{
			try
			{
				if(s.length() >= 20)
				{
					throw new StringTooLongException("");
				}
				System.out.println(s.length());
				s = scan.nextLine();
			}
			catch(StringTooLongException e)
			{
				System.out.println("The string was too long try again");
				s = scan.nextLine();
			}
			
		}
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
