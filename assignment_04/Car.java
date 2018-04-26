package assignment_04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial") 
public class Car extends JPanel
{
	private int x, xOrigin, y, yOrigin, scale, xSpeed;
	private Color carColor;
	private Timer timer;
	private final int WIDTH	= 2500, HEIGHT = 1500, DELAY = 10;
	
	public Car()
	{
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		timer = new Timer(DELAY, new ResetListener());
		this.x = xOrigin = 100;
		this.y = yOrigin = 600;
		this.scale = 50;
		this.xSpeed = 5;
		carColor = Color.red;
		timer.start();
	}
	
	public Car(int x, int y, int s)
	{
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		timer = new Timer(DELAY, new ResetListener());
		this.x = xOrigin = x;
		this.y = yOrigin = y;
		this.scale = s;
		this.xSpeed = 5;
		carColor = Color.red;
		timer.start();
	}
	
	public Car(int x, int y, int s, int xs)
	{
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		timer = new Timer(DELAY, new ResetListener());
		this.x = xOrigin = x;
		this.y = yOrigin = y;
		this.scale = s;
		this.xSpeed = xs;
		carColor = Color.red;
		timer.start();
	}
	
	public Car(int x, int y, int s, int xs, Color c)
	{
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		timer = new Timer(DELAY, new ResetListener());
		this.x = xOrigin = x;
		this.y = yOrigin =y;
		this.scale = s;
		this.xSpeed = xs;
		carColor = c;
		timer.start();
	}

	public void paintComponent(Graphics page)
	{
		int[] carX = {x,(x+(scale/2)),(x+(2*scale)),(x+((11*scale)/2)),(x+(7*scale)),(x+(8*scale)),(x+(8*scale)),x};
		int[] carY = {y,y,(y-(2*scale)),(y-(2*scale)),y,y,(y+(2*scale)),(y+(2*scale))};
		int[] windowOneX = {(x+((7*scale)/10)),(x+((41*scale)/20)),(x+((73*scale)/20)),(x+((73*scale)/20))};
		int[] windowOneY = {y,(y-((9*scale)/5)),(y-((9*scale)/5)),y};
		int[] windowTwoX = {(x+((77*scale)/20)),(x+((109*scale)/20)),(x+((34*scale)/5)),(x+((77*scale)/20))};
		int[] windowTwoY = {(y-((9*scale)/5)),(y-((9*scale)/5)),y,y};
		super.paintComponent(page);
		page.setColor(carColor);
		page.fillPolygon(carX, carY, carX.length);
		page.setColor(Color.CYAN);
		page.fillPolygon(windowOneX, windowOneY, windowOneX.length);
		page.fillPolygon(windowTwoX, windowTwoY, windowTwoX.length);
		page.setColor(Color.black);
		page.fillOval((x+(scale/2)),(y+(scale)),(2*scale),(2*scale));
		page.fillOval((x+((11*scale)/2)),(y+(scale)),(2*scale),(2*scale));
		page.setColor(Color.gray);
		page.fillOval((x+scale),(y+((3*scale)/2)), scale, scale);
		page.fillOval((x+(6*scale)),(y+((3*scale)/2)), scale, scale);
	}
	
	private class ResetListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			x += xSpeed;
			if (x <= 0 || (x+(8*scale)) >= WIDTH )
				x = xOrigin;
				y = yOrigin;
			repaint();
		}
	}
}
