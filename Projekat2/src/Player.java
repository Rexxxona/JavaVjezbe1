class Player {
	
	//Atributi
	private String ime;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	
	// Konstruktor
	public Player(String ime, int x, int y, int width, int height, int health) {
		this.ime = ime;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	 String getIme() {
		return ime;
	}

	 // Setter za ime – uklanja višestruke razmake, svaka riječ veliko slovo
	public void setIme(String ime) {
		if (ime == null || ime.trim().isEmpty())
			throw new IllegalArgumentException("Ime igrača ne smije biti prazno.");
		
		// Uklanjanje višestrukih razmaka i kapitalizacija
		ime = ime.trim().replaceAll("\\s+", " ");
		String[] parts = ime.split(" ");
		StringBuilder formatted = new StringBuilder();
		for (String part : parts) {
			formatted.append(part.substring(0, 1).toUpperCase())
			         .append(part.substring(1).toLowerCase())
			         .append(" ");
		}
		this.ime = formatted.toString().trim();
	}
	
	// Getter i Setteri za ostale atribute
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

	public int getHealth() {
		return health;
	}
	
	//Postavljanje healtha sa ogranicenjima
	public void setHealth(int health) {
		if (health < 0) 
			this.health = 0;
		else if 
			(health > 100) this.health = 100;
		else 
			this.health = health;
	}
	
	@Override
    public String toString() {
        return String.format("Player[%s] @ (%d,%d) %dx%d HP=%d",
                ime, x, y, width, height, health);
    }

	
}