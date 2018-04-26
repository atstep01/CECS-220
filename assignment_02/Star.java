package assignment_02;

public class Star
{
	private int topX, topY, width = 0;
	
	public Star(int x, int y, int w)
	{
		topX = x;
		topY = y;
		width = w;
	}

	public void setTopX(int topX) 
	{
		this.topX = topX;
	}

	public void setTopY(int topY) 
	{
		this.topY = topY;
	}
	
	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	public int getTopY() 
	{
		return topY;
	}

	public int getTopX() 
	{
		return topX;
	}
	
	public int getWidth() 
	{
		return width;
	}
	
}
