package assignment_02;

import java.awt.Graphics;
import javax.swing.JApplet;
import java.awt.Color;

@SuppressWarnings("serial")
public class StarryNight extends JApplet
{
	public void paint(Graphics page)
	{	
		// initialize variables
		int x, y, w = 0;
		
		//set page size and color
		super.paint(page);
		this.setSize(1500, 1000);
		page.setColor(Color.BLACK);
		page.fillRect(0, 0, 1500, 1000);
		
		//make stars
		Star star1 = new Star(600,100,30);
		Star star2 = new Star(550,200,50);
		Star star3 = new Star(400,200,100);
		Star star4 = new Star(300,300,200);
		Star star5 = new Star(600,450,100);
		Star star6 = new Star(800,200,250);
		
		//star color
		page.setColor(Color.YELLOW);
		
		//creates and an array that holds the stars
		Star[] sArray = {star1,star2,star3,star4,star5,star6};
		
		//draws each star
		for(int i = 0; i<sArray.length; i++)
		{
			x = sArray[i].getTopX();
			y = sArray[i].getTopY();
			w = sArray[i].getWidth();
			int nPts = 10;
			int xPts[] = {x, x+w/6, x+w/2, x+w/5, x+w*3/10, x, x-w*3/10, x-w/5, x-w/2, x-w/6}; 
			int yPts[] = {y, y+w*2/5, y+w*2/5, y+w*3/5, y+w, y+w*4/5, y+w, y+w*3/5, y+w*2/5, y+w*2/5};
			
			page.fillPolygon(xPts, yPts, nPts);
		}
	}
}
