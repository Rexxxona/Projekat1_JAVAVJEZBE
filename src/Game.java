//Lidija Vujovic 24/037
//Ana Vukicevic 24/136
//Relja Djurovic 24/005

import java.util.Arrays;

public class Game {
    private Player player;
    private Enemy[] enemies;
    private String[] eventLog;
	
    public Game(Player player) {
        this.player = player;
        this.enemies = new Enemy[0];
        this.eventLog = new String[0];
    }
	
    public boolean checkCollision(Player p, Enemy e) {
        return (p.getX() < e.getX() + e.getWidth() &&  //lijeva ivica igraca je lijevo od desne ivice
                p.getX() + p.getWidth() > e.getX() &&  //desna ivica igrača je desno od lijeve ivice neprijatelja.
                p.getY() < e.getY() + e.getHeight() && //donja/gornja ivica se preklapaju po visini.
                p.getY() + p.getHeight() > e.getY());  //vertikalno se presijecaju.
     }	
    
    public void decreaseHealth(Player p, Enemy e) {
        if (checkCollision(p, e)) {
            int oldHealth = p.getHealth();
            int newHealth = oldHealth - e.getDamage();
            if (newHealth < 0) {
                newHealth = 0;
            }
            p.setHealth(newHealth);

}
