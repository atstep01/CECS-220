package assignment_04;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CarDriver extends JFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Car");
		//frame.setBackground(Color.GRAY);
		//frame.setPreferredSize(new Dimension(2500,1500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Car car1 = new Car();
		//Car car2 = new Car(0,50,10);
		frame.getContentPane().add(car1);
		//frame.getContentPane().add(car2);
		frame.pack();
		frame.setVisible(true);
	}
}
