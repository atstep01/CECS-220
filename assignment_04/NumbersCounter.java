package assignment_04;

import java.util.Scanner;

public class NumbersCounter 
{
	public static void main(String[] args)
	{
		final int NUMINTEGERS = 51;
		final int ROWS = 5;
		Scanner scan = new Scanner(System.in);
		int[] values = new int[NUMINTEGERS];
		int current = 0;
		int rcount = 0;
		System.out.println("Number Counter");
		System.out.println("Enter an integer between 0 and 50 or enter a number outside the value to exit the program.");
		while(current > -1 && current < 51)
		{
			current = scan.nextInt();
			if(current > -1 && current < 51)
			{
				values[current]++;
			}
		}
		
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] > 0)
			{
				System.out.println(i + " : " + values[i] + "\t");
			}
			//rcount++;
			//if(rcount % ROWS == 0)
			//{
			//	System.out.println("");
			//}
		}
		scan.close();
	}
}
