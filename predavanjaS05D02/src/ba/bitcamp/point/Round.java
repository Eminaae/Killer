package ba.bitcamp.point;

public class Round {
   private int radius;
   private Point point;
   
	
	Round(int radius, Point point) {
		this.radius = radius;
		this.point = point;
		
	}
	/**
	 * 
	 * @param raidus
	 * @param radius 
	 */
	public void setRadius(int radius){
		this.radius = radius;
	}
	/**
	 * 
	 * @param raidus
	 * @return
	 */
	public int getRadius(int raidus){
		return radius;
	}
	/**
	 * 
	 */
	public String toString(){
		String output = "Radius: " + radius + "Center: " + point;
		return output;
	}
	/**
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Round other) {
		if (this.radius == other.radius && this.point == other.point) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 
	 * @param other
	 * @return
	 */
	public boolean isCut(Round other) {
		double radiusSum = this.radius + other.radius;
		double pointDistance = this.point.distance(other.point);
		if (radiusSum > pointDistance) {
			return false;
		} else {
			return true;
		}
		
	}

}
