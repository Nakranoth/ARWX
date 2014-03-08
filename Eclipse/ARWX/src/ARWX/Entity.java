package ARWX;

import java.util.ArrayList;

public abstract class Entity {
	private Coordinates location;
	public Bounds boundingBox;
	private int rotation;
	private int mass, radius;
	private ArrayList<Sprite> sprites;
	
	public Entity(Coordinates location, int rotation, int mass, int radius, ArrayList<Sprite> sprites)
	{
		this.location = location;
		this.rotation = rotation;
		this.mass = mass;
		this.radius = radius;
		this.sprites = sprites;
		this.boundingBox = new Bounds(location, radius);
	}
	
	public void draw()
	{
		for (Sprite item:sprites)
		{
			item.draw();
		}
	}
}
