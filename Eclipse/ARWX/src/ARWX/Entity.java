package ARWX;

import java.util.ArrayList;

public class Entity extends StaticEntity {

	private int hp, maxHP;
	private Velocity velocity;
	
	public Entity(Coordinates location, int rotation, long mass, int radius, ArrayList<Sprite> sprites, int maxHP) {
		super(location, rotation, mass, radius, sprites);
		this.hp = this.maxHP = maxHP;
	}

	public void Tick()
	{
		velocity.actOn(boundingBox);
		velocity.actOn(location);
	}
	
	public void Repair()
	{
		hp = maxHP;
	}
	
	public void Repair(int amount)
	{
		hp += amount;
		if (hp > maxHP){
			hp = maxHP;
		}
	}
}
