package assignment_03;

import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

@SuppressWarnings("serial")

public class RandomLines extends JPanel
{
	public RandomLines()
	{
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(750,500));
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		Random generator = new Random();
		page.setColor(Color.WHITE);
		
		for(int x = 0; x < 20; x++)
		{
			page.drawLine(0, (50+(20*x)),(generator.nextInt(600) + 100),(50+(20*x)) );
		}
		
	}
}
