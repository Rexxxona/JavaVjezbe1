
class Player extends GameObject{
	private String ime;
	private int health;
	
	public Player(String ime, int x, int y, int width, int height, int health) {
		super(x, y, width, height);
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		String[] parts = ime.trim().split("\\s+");
		StringBuilder formatted = new StringBuilder();
		for (String part : parts) {
			if (part.isEmpty()) continue;
			formatted.append(Character.toUpperCase(part.charAt(0)));
			if (part.length() > 1) {
				formatted.append(part.substring(1).toLowerCase());
			}
		}
		this.ime = formatted.toString();
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
		return "Player[" + (ime == null ? "" : ime) + "] @ (" + x + ", " + y + ") " + width + "x" + height + " HP = " + health;
	}
	
	
}
