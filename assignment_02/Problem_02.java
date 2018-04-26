package assignment_02;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Problem_02 
{
	public static void main(String[] args)
	{
		double rad, vol, sArea = 0.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere: ");
		rad = scan.nextDouble();
		vol = 4.0/3 * Math.PI * Math.pow(rad, 3);
		sArea = 4 * Math.PI * Math.pow(rad, 2);
		
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println("The volume of the sphere is: " + fmt.format(vol) + "\nThe surface area of the sphere is: " + fmt.format(sArea));
		
		scan.close();
	}
}
