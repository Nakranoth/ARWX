package ARWX;

import java.util.ArrayList;

public abstract class StaticEntity {
	private static double GravConst = .0000000000667;
	
	protected Coordinates location;
	public Bounds boundingBox;
	protected int rotation;
	public long mass;
	public int radius;
	public int gravityWell; //Radius squared of range of gravity
	protected ArrayList<Sprite> sprites;
	
	public StaticEntity(Coordinates location, int rotation, long mass, int radius, ArrayList<Sprite> sprites)
	{
		this.location = location;
		this.rotation = rotation;
		this.mass = mass;
		this.radius = radius;
		this.sprites = sprites;
		this.boundingBox = new Bounds(location, radius);
		this.gravityWell = (int) (GravConst * mass); //round to int for distance where A = 1;
	}
	
	public void draw()
	{
		for (Sprite item:sprites)
		{
			item.draw(location, rotation, radius);
		}
	}
}
