
class Enemy {
	
	//Atributi
	private String tipNeprijatelja;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	//Konstruktor
	public Enemy(String tipNeprijatelja, int x, int y, int width, int height, int damage) {
		super();
		this.tipNeprijatelja = tipNeprijatelja;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
		
	
	}
	//Getter i Setteri
	public String getTipNeprijatelja() {
		return tipNeprijatelja;
	}

	public void setTipNeprijatelja(String tipNeprijatelja) {
		if (tipNeprijatelja == null || tipNeprijatelja.trim().isEmpty())
            throw new IllegalArgumentException("Ime igrača ne smije biti prazno.");
		this.tipNeprijatelja = tipNeprijatelja.trim();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0) 
			this.damage = 0;
        else if 
        	(damage > 100) this.damage = 100;
        else 
        	this.damage = damage;
	}
	 @Override
	    public String toString() {
	        return String.format("Enemy[%s] @ (%d,%d) %dx%d DMG=%d",
	                tipNeprijatelja, x, y, width, height, damage);
	    }
	 
	 
	// 🔹 Statička metoda – parsira iz stringa, npr: "Goblin;12,5;16x16;20"
	 public static Enemy fromString(String data) {
	        String[] parts = data.split(";");
	        if (parts.length != 4)
	            throw new IllegalArgumentException("Neispravan format stringa za Enemy.");

	        String type = parts[0].trim();

	        // Pozicija (npr. 12,5)
	        String[] pos = parts[1].split(",");
	        int x = Integer.parseInt(pos[0].trim());
	        int y = Integer.parseInt(pos[1].trim());

	        // Dimenzije (npr. 16x16)
	        String[] dim = parts[2].split("x");
	        int width = Integer.parseInt(dim[0].trim());
	        int height = Integer.parseInt(dim[1].trim());

	        int damage = Integer.parseInt(parts[3].trim());
	        return new Enemy(type, x, y, width, height, damage);
	 }
	 			
}
