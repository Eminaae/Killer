
public class Point {
	private int x, y;

	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int otherX){
		x = otherX;
	}
	
	public void setY(int otherY){
		x = otherY;
	}
	
	/** Write equals and toString always*/
	public boolean equals(Point other){
		if (this.x == other.x && this.y==other.y){
			return true;
		}else{
				return false;
			}	
	}
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public double getDistance(Point other){
		int deltaX = this.x -other.x;
		int deltaY = this.y-other.y;
		deltaX *= deltaX;
		deltaY *= deltaY;
		double distance = Math.sqrt(deltaX + deltaY);
		return distance;
	}
	
}

