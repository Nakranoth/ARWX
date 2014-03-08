package ARWX;

public class Bounds {
public int x1, x2, y1, y2;

public Bounds(Coordinates center, int radius)
{
	x1 = center.x - radius;
	x2 = center.x + radius;
	y1 = center.y - radius;
	y2 = center.y + radius;
}

public boolean collides(Bounds other)
{
	return(((x1 >= other.x1 && x1 <= other.x2)||(x2 >= other.x1 && x2 <= other.x2))&&((y1 >= other.y1 && y1 <= other.y2)||(y2 >= other.y1 && y2 <= other.y2)));
}

}
