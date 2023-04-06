package oops;

public class Box 
{
	double width, depth, height;
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
//	calculating volume of the box
	public double volume() {
		return width*height*depth;
	}
}