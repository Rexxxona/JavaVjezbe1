
class BossEnemy extends Enemy{
	
	public BossEnemy(String type, int damage, int x, int y, int width, int height, int health) {
		super(type, damage, x, y, width, height, health);
		
	}
	
	@Override
	public String toString() {
		return "BossEnemy[" + (type == null ? "" : type) + "] @ (" + x + ", " + y + ") " + width + "x" + height + " DMG = " + damage + " HP= " + health;
	}
	
	
}
