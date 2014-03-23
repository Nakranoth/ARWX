package ARWX;

import java.util.ArrayList;

public abstract class Entity {
	private static double GravConst = .0000000000667;
	
	private Coordinates location;
	public Bounds boundingBox;
	private int rotation;
	public long mass;
	public int radius;
	public int gravityWell; //Radius squared of range of gravity
	private ArrayList<Sprite> sprites;
	
	public Entity(Coordinates location, int rotation, long mass, int radius, ArrayList<Sprite> sprites)
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
