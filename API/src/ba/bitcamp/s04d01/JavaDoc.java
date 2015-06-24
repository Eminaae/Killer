package ba.bitcamp.s04d01;

import java.awt.Font;

public class JavaDoc {

	public static void main(String[] args) {
//		System.out.println(getAreaOfSquare(-5.0));
		
	Font font1 = new Font ("Calibri", Font.BOLD, 18);
	printFontDetails(font1);
	}
		

	/**
	 * Counts <b>square area.</b>
	 * @param a - Square side length
	 * @return Area of square
	 * @throws IllegalArgumentException if a <= 0
	 */
	public static double getAreaOfSquare(double a){

		if (a > 0){
			double squareArea = a*a;
			return squareArea;
		} else {
			throw new IllegalArgumentException("Value of a is negative.");
		}
	}
	
	/**
	 * Giving information about <b>font details</b>, such as font name, font size and font style.
	 * @param f - font name
	 * @throws NullPointerException if f == null
	 */
	public static void printFontDetails (Font f){
	if (f == null){
		throw new NullPointerException();
			}if (f.isPlain()){	
				System.out.printf("Plain");
			} 
			if(f.isBold()){
				System.out.println("Bold");
			}
			if(f.isItalic()){
				System.out.println("Italic");
			}
	}
	
	
	
}


