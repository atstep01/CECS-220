package assignment_03;

import javax.swing.JFrame;

public class RandomLinesApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Random Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomLines panel = new RandomLines();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}
