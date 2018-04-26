package assignment_05;

import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) throws StringTooLongException
	{
		Scanner scan = new Scanner(System.in);
		String s;
		StringTooLongException exception = new StringTooLongException("Input value is out of range.");
		System.out.println("Enter a string less than 20 characters (Enter DONE to exit the program)");
		s = scan.nextLine();
		while(!s.equals("DONE"))
		{
			if(s.length() >= 20)
			{
				scan.close();
				throw exception;
			}
			System.out.println(s.length());
			s = scan.nextLine();
		}
		System.out.println("Thanks for playing!");
		scan.close();
	}
}
