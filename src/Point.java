

public class Point {

	private  int x;
	private  int y;
	GUI window = null;
	msgClass msgClas = null;
	Robot robot;


	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y,GUI win) {
		this.x = x;
		this.y = y;
		window=win;
		msgClas=new msgClass(this.window);
	}

	public double distance(Robot r1,Robot r2) {
		int dx = r1.p.x - r2.p.x; 
		int dy = r1.p.y - r2.p.y; 
		double distance = Math.sqrt(dx*dx + dy*dy);
		return distance;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}


	@Override
	public String toString() {
		return ("(" + x + "," + y + ")"); 
	}
}
