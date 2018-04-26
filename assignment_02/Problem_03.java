package assignment_02;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Problem_03 
{
	public static void main(String[] args)
	{
		double a, b, c, s, area = 0.0;
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("Enter the first side of the triangle: ");
		a = scan.nextDouble();
		System.out.println("Enter the second side of the triangle: ");
		b = scan.nextDouble();
		System.out.println("Enter the third side of the triangle: ");
		c = scan.nextDouble();
		
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("The area of the triangle is: " + fmt.format(area));
		scan.close();
	}
}
