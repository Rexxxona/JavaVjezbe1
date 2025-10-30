// Pavle Vesovic 24/004
// Relja Djurovic 24/005
import java.util.ArrayList;

class Game {
	
	private Player player;
    private ArrayList<String> eventLog;
    private ArrayList<Enemy> enemies;

    public Game() {
        this.eventLog = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.player = null;
    }

    // provjera sudara
    public boolean checkCollision(Player p, Enemy e) {
        return p.getX() < e.getX() + e.getWidth() &&
               p.getX() + p.getWidth() > e.getX() &&
               p.getY() < e.getY() + e.getHeight() &&
               p.getY() + p.getHeight() > e.getY();
    }
    
    // umanji health
    public void decreaseHealth(Player p, Enemy e) {
        int oldHealth = p.getHealth();
        int damage = e.getDamage();
        if (e instanceof BossEnemy) {
            damage *= 2; // double damage for boss
        }
        int newHealth = oldHealth - damage;
        if (newHealth < 0) newHealth = 0;
        p.setHealth(newHealth);
        eventLog.add("HIT: " + p.getIme() + " by " + e.getType() +
                     " for " + damage + " -> HP " + oldHealth + " -> " + newHealth);
    }

    // dodaj neprijatelja
    public void addEnemy(Enemy e) {
        if (e != null) {
            enemies.add(e);
        }
    }
    
    // dodaj neprijatelja iz stringa
    public boolean addEnemyFromString(String s) {
        Enemy e = Enemy.fromString(s);
        if (e == null) return false;
        addEnemy(e);
        return true;
    }

    // nadji po tipu
    public ArrayList<Enemy> findByType(String type) {
        ArrayList<Enemy> result = new ArrayList<>();
        if (type == null) return result;
        String needle = type.trim().toLowerCase();
        for (Enemy en : enemies) {
            String et = en.getType();
            if (et != null && et.toLowerCase().contains(needle)) {
                result.add(en);
            }
        }
        return result;
    }

    // sudar sa igracem
    public ArrayList<Enemy> collidingWithPlayer(Player p) {
        ArrayList<Enemy> colliding = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(p, e)) {
                colliding.add(e);
            }
        }
        return colliding;
    }

    // razrjesenje kolizija
    public void resolveCollisions(Player p) {
        ArrayList<Enemy> colliding = collidingWithPlayer(p);
        for (Enemy e : colliding) {
            decreaseHealth(p, e);
        }
        if (p.getHealth() <= 0) {
            eventLog.add("PLAYER DIED: " + p.getIme());
        }
    }

    public static void main(String[] args) {
        Player player = new Player("john DOE", 10, 20, 30, 40, 85);

        Game game = new Game();
        game.addEnemy(new MeleeEnemy("goblin FIGHTER", 10, 10, 30, 40, 50, 60));
        game.addEnemy(Enemy.fromString("Ranged Archer,15,50,60,20,20,40"));
        game.resolveCollisions(player);
    }
}
