

public class Point {
	
	GUI window = null;
	msgClass msgClas = null;
	private  double x;
	Robot robot;
		private  double y;
		
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public void move(int x, int y) {
	    this.x = x;
	    this.y = y;
	}



	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public Point(double x, double y,GUI win) {
		this.x = x;
		this.y = y;
		window=win;
		msgClas=new msgClass(this.window);
	}

	/* public double distance(Robot r,Robot r1) {
		  int dx = x - 
		  int dy = y - p2.y;
		  double distance = Math.sqrt(dx*dx + dy*dy);
		  return distance;
		 }*/
	
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
