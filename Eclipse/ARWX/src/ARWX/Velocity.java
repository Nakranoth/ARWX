package ARWX;

public class Velocity extends Coordinates {

	public Velocity(int x, int y) {
		super(x, y);
	}
	
	public void add(Velocity other)
	{
		x += other.x;
		y += other.y;
	}
	
	public void subtract(Velocity other)
	{
		x -= other.x;
		y -= other.y;
	}

	public void actOn(Coordinates other)
	{
		other.x += x;
		other.y += y;
	}
	
	public void actOn(Bounds other)
	{
		other.x1 += x;
		other.x2 += x;
		other.y1 += y;
		other.y2 += y;
	}
}
