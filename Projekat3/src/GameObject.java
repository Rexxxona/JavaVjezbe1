
public class GameObject {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		if(x < 0)
			throw new IllegalArgumentException("X coordinate cannot be negative.");
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		if(y < 0)
			throw new IllegalArgumentException("X coordinate cannot be negative.");
		this.y = y;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		if(width < 0)
			throw new IllegalArgumentException("X coordinate cannot be negative.");
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		if(height < 0)
			throw new IllegalArgumentException("X coordinate cannot be negative.");
		this.height = height;
	}
	
	public boolean intersects(GameObject other) {
		return this.x < other.x + other.width &&
			   this.x + this.width > other.x &&
			   this.y < other.y + other.height &&
			   this.y + this.height > other.y;
	}


	@Override
	public String toString() {
		return "GameObject [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
