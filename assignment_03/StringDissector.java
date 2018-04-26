package assignment_03;

import java.util.Scanner;

public class StringDissector 
{
	public static void main(String[] args)
	{
	 int notVowel = 0, numA = 0, numE = 0, numI = 0, numO = 0, numU = 0;
	 String input;
	 char temp;
	 
	 System.out.println("Enter a string: ");
	 Scanner scan = new Scanner(System.in);
	 input = scan.nextLine();
	 
	 for(int x = 0; x < input.length(); x++)
	 {
		temp = input.charAt(x);
		if(temp == 'a')
			numA++;
		else if(temp == 'e')
			numE++;
		else if(temp == 'i')
			numI++;
		else if(temp == 'o')
			numO++;
		else if(temp == 'u')
			numU++;
		else if(temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U')
		{}
		else 
			notVowel++;	
		
	 }
	 
	 System.out.println("The string, " + input + ",has ");
	 System.out.println(numA + " a's");
	 System.out.println(numE + " e's");
	 System.out.println(numI + " i's");
	 System.out.println(numO + " o's");
	 System.out.println(numU + " u's");
	 System.out.println(notVowel + " non-vowel lowercase characters");
	 scan.close();
	}


}
