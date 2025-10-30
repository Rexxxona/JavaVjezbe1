
class MeleeEnemy extends Enemy{

	public MeleeEnemy(String type, int damage, int x, int y, int width, int height, int health) {
		super(type, damage, x, y, width, height, health);
	}
	
	@Override
	public String toString() {
		return "MeleeEnemy[" + (type == null ? "" : type) + "] @ (" + x + ", " + y + ") " + width + "x" + height + " DMG = " + damage + " HP= " + health;
	}
}
