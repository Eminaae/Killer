package ba.bitcamp.week4.structures1;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		//making car
		/*c1.name = "Citroen";
		c1.year = 2005;
		c1.HorsePower = 100;
		c1.color = Color.BLUE;*/
		
		Car c1 = new Car("Citroen",2005, 100, Color.black);
		Car c2 = new Car("BMW",2005, 100, Color.black);
		
		
		System.out.println(c1.name);
		//System.out.println(c1);
		System.out.println(c2.name);
		//System.out.println(c2);
	}

}
