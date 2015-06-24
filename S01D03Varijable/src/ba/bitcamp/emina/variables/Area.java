package ba.bitcamp.emina.variables;

public class Area {

	public static void main(String[] args) {
		int a=4; //side a
		int b=5; //side b
		int areaRectangle=a*b; // Rectangle area
		System.out.println("Povrsina pravougaonika je:"+ areaRectangle);
		
		int r=4;
		double PI=3.14;
		double areaCircle=r*r*PI; //Povrsina kruga
		double scopeOfSuare=2*r*PI; //Obim kruga
		
		System.out.println("Povrsina kruga je:" +areaCircle);
		System.out.println("Obim kruga je:" + scopeOfSuare);
		
		int binary=0b101;
		double bigNumber=100000000000000.0;
		System.out.println("Binary" + binary);
		double longNumber=10.0/3;
		
	System.out.println("Long number:" +longNumber);
		
		
	}

}
