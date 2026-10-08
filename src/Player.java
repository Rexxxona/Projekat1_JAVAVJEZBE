//Lidija Vujovic 24/037
//Ana Vukicevic 24/136
//Relja Djurovic 24/005

class Player {
	
	private String ime;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	//konstruktor
	public Player(String ime, int x, int y, int width, int height, int health) {
		this.ime = ime;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setHealth(health);
	}
	//geteri i seteri
	//IME IGRACA NE SMIJE BITI PRAZNO 
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
        if ( ime == null && ime.trim().isEmpty()) {
            throw new IllegalArgumentException("Ime ne smije biti prazno!");
        } 
        //uklanjamo visak razmaka uz trim 
        ime = ime.trim().replaceAll("\\s+", " ");
        String[] rijeci = ime.split(" ");
        String rezultat = "";
        for (int i = 0; i < rijeci.length; i++) {
            String r = rijeci[i];
            rezultat += r.substring(0, 1).toUpperCase() + r.substring(1).toLowerCase();
            if (i < rijeci.length - 1) {
                rezultat += " ";
            }
        }
        this.ime = rezultat;
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<10 && health>100) {
			 throw new IllegalArgumentException("Health mora biti izmedju 0 i 100!");
		}
        this.health = health;
    }
	
	

@Override
public String toString() {
	return "Player [ime=" + ime + ", x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", health="
			+ health + "]";
}
}