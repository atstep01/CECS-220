package assignment_02;

import java.util.Scanner;
import java.util.Random;

public class Problem_01 
{
	public static void main(String[] args)
	{
		int x = 0;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Enter your first name: ");
		String fName = scan.next();
		System.out.println("Enter your last name: ");
		String lName = scan.next();
		fName = fName.substring(0,1);
		lName = lName.substring(0,4);
		
		x = generator.nextInt(89) + 10;
		
		System.out.println("Your username is " + fName + lName + x);
		
		
		scan.close();
		
	}
}
