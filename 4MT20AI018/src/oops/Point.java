package oops;

public class Point 
{
	private int x,y;
//	parameterized Constructor
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
//	POJO Plain Old Java Object
//  Setters
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
//  Getters
	public int getX(int x)
	{
		return this.x;
	}
	public int getY(int y)
	{
		return this.y;
	}
}
