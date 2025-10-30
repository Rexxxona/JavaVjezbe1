
class Enemy extends GameObject{
	
	protected int damage;
	protected String type;
	protected int health;
	
	public Enemy(String type, int damage, int x, int y, int width, int height, int health) {
		super(x, y, width, height);
		this.type = type;
		this.damage = damage;
		this.health = health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		String[] parts = type.trim().split("\\s+");
		StringBuilder formatted = new StringBuilder();
		for (String part : parts) {
			if (part.isEmpty()) continue;
			formatted.append(Character.toLowerCase(part.charAt(0)));
			if (part.length() > 1) {
				formatted.append(part.substring(1).toLowerCase());
			}
		}
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		if (health < 0) {
			this.health = 0;
		} else if (health > 100) {
			this.health = 100;
		} else {
			this.health = health;
		}
	}
	@Override
	public String toString() {
		return "Enemy[" + (type == null ? "" : type) + "] @ (" + x + ", " + y + ") " + width + "x" + height + " DMG = " + damage + " HP= " + health;
	}

	public static Enemy fromString(String string) {
		
		return null;
	}
}
