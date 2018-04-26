package assignment_01;

import java.awt.Graphics;
import javax.swing.JApplet;
import java.awt.Color;

@SuppressWarnings("serial")
//Creates several balloons in an applet, use fullscreen to see them 
public class Problem_05 extends JApplet
{
	public void paint(Graphics page)
	{
		super.paint(page);
		
		page.setColor(Color.BLACK);
		page.drawLine(360, 340, 360, 640); // line
		page.drawLine(860, 440, 860, 740); 
		page.drawLine(1360, 300, 1360, 600);
		page.drawLine(1860, 640, 1860, 940);
		page.drawLine(2360, 540, 2360, 840);
		
		page.setColor(Color.red);
		page.drawOval(260, 100, 200, 240);// oval
		page.fillOval(260, 100, 200, 240);
		
		page.setColor(Color.yellow);
		page.drawOval(760, 200, 200, 240);
		page.fillOval(760, 200, 200, 240);

		page.setColor(Color.blue);
		page.drawOval(1260, 60, 200, 240);
		page.fillOval(1260, 60, 200, 240);
		
		page.setColor(Color.green);
		page.drawOval(1760, 400, 200, 240);
		page.fillOval(1760, 400, 200, 240);
		
		page.setColor(Color.orange);
		page.drawOval(2260, 300, 200, 240);
		page.fillOval(2260, 300, 200, 240);
		
		
	}
}
