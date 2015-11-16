package ba.bitcamp.point;

public class Point {
	private int x;
	private int y;
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	/**
	 * 
	 * @return
	 */
	public int getX (){
		return x;
	}
	/**
	 * 
	 * @return
	 */
	public int getY (){
		return y;
	}
	/**
	 * 
	 * @param newX
	 */
	public void setX(int newX){
		x = newX;
	}
	public void setY(int newY){
		y = newY;
	}
	/**
	 * 
	 */
	public String toString(){
		String output = String.format("X is: %d, Y is: %d", x, y);
		return output;
	}
	/**
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Point other){
		if (this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * methode returnes distance between this point and another
	 * using hte distance formula
	 * @param other
	 * @return distance
	 */
	public double distance(Point other){
		/*
		 * int deltaX = this.x - other.x;
		 * int deltaY = this.y -other.y;
		 * 
		 * deltaX *= deltaX;
		 * deltaY *= deltaY;
		 * 
		 * double ditsance = Math.sqrt(deltaX, deltaY);
		 */
		double distance = Math.sqrt(Math.pow((this.x - other.x), (this.y -other.y)));
		return distance;
	}

}
