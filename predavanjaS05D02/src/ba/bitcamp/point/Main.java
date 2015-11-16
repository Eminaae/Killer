package ba.bitcamp.point;

public class Main {

	public static void main(String[] args) {
		
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 2);
		
		System.out.println(p2.toString());
		
		System.out.println("X is: " + p1.getX());
		
		p1.setY(1);
		System.out.println("Set point " + p1.toString());
		
		System.out.println("Are the same: " + p1.equals(p1));
		
		System.out.println("Distance is : " + p2.distance(p1));
	
		
		Round r1 = new Round (5, p1);
		Round r2 = new Round (2, p2);
		
		System.out.println(r1.toString());
		
		System.out.println("Da li se sijeku: " + r1.isCut(r2));
		
	
		
		

	}

}
