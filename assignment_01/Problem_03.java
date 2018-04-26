package assignment_01;

import java.util.Scanner;

public class Problem_03 
{
	public static void main(String[] args)
	{
		//Takes a time in hours, minutes, and seconds and returns the total seconds elapsed.
		int hrs, min, sec = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the hours:" );
		hrs = scan.nextInt();
		System.out.println("Enter the minutes:" );
		min = scan.nextInt();
		System.out.println("Enter the seconds:" );
		sec = scan.nextInt();
		System.out.println("The time " + hrs + ":" + min + ":" + sec + " = " + (sec + (hrs*3600)+ (min*60)) + " seconds");
		
		scan.close();
	}
}
