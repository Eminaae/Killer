package ba.bitcamp.kristina.variables;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		double lengthRectangle = 10.98;
		double widthRectangle = 34;
		double areaRectangle = lengthRectangle * widthRectangle;
		
		//formula for the area of a rectangle is: P=a*b
		
		System.out.println("The area of a rectangle is: " +areaRectangle);
		double diameterCircle = 34;
		double piLudolf = 3.14;
		
		//formula for the area of a circle is: P=r^2*pi
		
		double areaCircle = diameterCircle * diameterCircle * piLudolf;
		System.out.println("The area of a circle is:" +areaCircle);
		
		int binary = 0b101;
		
		System.out.println("Binary: " +binary);
		
		double longNumber = 10.0 / 3;
		System.out.println("Long number:" + longNumber);
		
		int num1 = 3, num2 = 4;
		String message = "Ja sma string";
		
		System.out.printf("Ovdje je broj1: %3d i ovdje je broj2: %d\n" + "Double: %1f" + "\nString: %s", num1, num2, longNumber, message);
		//System.out.printf("Ovdje je broj1: " +num1 + " "i ovdje je broj2: " + snum2); 
	
	}

}
