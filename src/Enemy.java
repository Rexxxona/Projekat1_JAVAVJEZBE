//Lidija Vujovic 24/037
//Ana Vukicevic 24/136
//Relja Djurovic 24/005

class Enemy {
		private String type;  //atributi
		private int x;
		private int y;
		private int width;
		private int height; 
		private int damage;

public Enemy(String type, int x, int y, int width, int height, int damage) {
		this.type = type;
		this.x = x; 			//konstruktor
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
}
public String getType() {
	return type;
}

public void setType(String type) {
	if (type != null && !type.trim().isEmpty()) //naziv neprijatelja ne smije biti prazan
	this.type = type;
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
	if (damage < 10 && damage > 100); //vrijednost napda da bude do 100
	this.damage = damage;
}
@Override 
public String toString() {
	return "Enemy [type="+ type + ", x=" + x + " y=" + y + ", width=" + width + ", height=" + height + ",damage=" + damage + "]";
}
}