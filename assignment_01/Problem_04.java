package assignment_01;

import java.util.Scanner;

public class Problem_04 
{
	public static void main(String[] args)
	{
		//Takes an int from the user as the length of the square and returns the area
		// and perimeter of the square
		int len = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of the square:");
		len = scan.nextInt();
		System.out.println("The area of the square is: " + (len*len) + "\t the perimeter of the square is: " + (len * 4));
		
		scan.close();
	}
}
