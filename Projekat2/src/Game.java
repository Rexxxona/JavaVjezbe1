import java.util.ArrayList;
import java.util.List;

// Clanovi grupe:
// 1. Pavle Vesovic 24/004 
// 2. Relja Djurovic 24/005
public class Game {

    private Player player;
    private List<Enemy> enemies;
    private List<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    // Dodavanje neprijatelja
    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
        eventLog.add("Dodan neprijatelj: " + enemy.getTipNeprijatelja());
    }

    // Provjera sudara
    public boolean checkCollision(Player p, Enemy e) {
        return p.getX() < e.getX() + e.getWidth() &&
               p.getX() + p.getWidth() > e.getX() &&
               p.getY() < e.getY() + e.getHeight() &&
               p.getY() + p.getHeight() > e.getY();
    }

    // Smanjivanje healtha igrača
    public void decreaseHealth(Player p, Enemy e) {
        int oldHealth = p.getHealth();
        int newHealth = oldHealth - e.getDamage();
        if (newHealth < 0) newHealth = 0;
        p.setHealth(newHealth);
        eventLog.add("HIT: " + p.getIme() + " by " + e.getTipNeprijatelja() +
                     " for " + e.getDamage() + " -> HP " + oldHealth + " -> " + newHealth);
    }

    // Pretraga po tipu (case-insensitive)
    public List<Enemy> findByType(String query) {
        List<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (e.getTipNeprijatelja().toLowerCase().contains(query.toLowerCase()))
                result.add(e);
        }
        return result;
    }

    // Svi neprijatelji koji se sudaraju s igračem
    public List<Enemy> collidingWithPlayer() {
        List<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e))
                result.add(e);
        }
        return result;
    }

    // Obrada sudara
    public void resolveCollisions() {
        for (Enemy e : collidingWithPlayer()) {
            decreaseHealth(player, e);
        }
    }

    public void printEventLog() {
        System.out.println("=== EVENT LOG ===");
        for (String log : eventLog) {
            System.out.println(log);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public static void main(String[] args) {
        // Kreiranje igrača
        Player p = new Player("Arandjel", 10, 5, 32, 32, 85);

        // Kreiranje igre
        Proba g = new Proba(p);

        // Dodavanje neprijatelja ručno
        Enemy e1 = new Enemy("Goblin", 12, 5, 16, 16, 20);
        g.addEnemy(e1);

        // Dodavanje neprijatelja iz stringa
        Enemy e2 = Enemy.fromString("Ork;40,10;20x20;30");
        g.addEnemy(e2);

        System.out.println("=== Lista svih neprijatelja ===");
        for (Enemy e : g.getEnemies()) {
            System.out.println(e);
        }

        System.out.println("\n=== Pretraga po tipu (\"gob\") ===");
        List<Enemy> found = g.findByType("gob");
        for (Enemy e : found) {
            System.out.println(e);
        }

        System.out.println("\n=== Igrač prije kolizije ===");
        System.out.println(g.getPlayer());

        // Obrada kolizije
        g.resolveCollisions();

        System.out.println("\n=== Igrač poslije kolizije ===");
        System.out.println(g.getPlayer());

        System.out.println();
        g.printEventLog();
    }
}
