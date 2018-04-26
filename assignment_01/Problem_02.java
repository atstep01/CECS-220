package assignment_01;

import java.awt.Graphics;
import javax.swing.JApplet;

public class Problem_02 extends JApplet
{
private static final long	serialVersionUID	= 1L;
	

	// 1.2 Modifies the Einstein applet to move the circle to the center of the
    //bottom right hand corner of the rectangle.
	public void paint(Graphics page)
	{
		super.paint(page);
		page.drawRect(50, 50, 40, 40); // square
		page.drawRect(60, 80, 225, 30); // rectangle
		page.drawOval(275, 100, 20, 20); // circle
		page.drawLine(35, 60, 100, 120); // line

		page.drawString("Out of clutter, find simplicity.", 110, 70);
		page.drawString("-- Albert Einstein", 130, 100);
	}
}