package ba.bitcamp;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("Citroen", 2005, 100 , Color.BLUE);
		Car c2 = new Car("BMW", 1998, 1 , Color.BLUE);
		/*
		c1.name = "Citroen";
		c1.year = 2005;
		c1.horsePower = 100;
		c1.color = Color.BLUE;
         */
		System.out.println(c1.name);
	    System.out.println(c1);
	    System.out.println(c2.name);
	    
	     }

}
