import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Scanner;


public class Task01 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(2, 7)));
		System.out.println(merge("Srce", "Java"));
		//System.out.println(getFirst("Bit","Camp", "Java"));
		//System.out.println(getFirst("Int","Boolean", "Char"));
		System.out.println(getTheRest("BitCamp", "Ca"));
		//System.out.println(writeToFile ("EOFThrowString/src/bit.txt", "BitCamp <3"));
		//Sysou
	}
	public static String merge(String s1, String s2){
		String s = s1.substring(0, s1.length() / 2);
		s = s.concat(s2);
		s = s.concat(s1.substring(s1.length() / 2, s1.length()));
		return s;
		
		
	}

	public static String getFirst(String s1, String s2, String s3){
		
		String firstOne = "";
		int a = s1.compareTo(s2);
		int b = s1.compareTo(s3);
		int c = s2.compareTo(s3);
		
	if (a > 0){
		return s2;
	}else if (b < 0){
		return s1;
	}if (c > 0){
		return s3;
	}
	return firstOne;	
	}

	public static String getTheRest(String s1, String s2){
		try {
			return s1.substring(s1.indexOf(s2));			
		} catch (Exception e) {
			return null;
		}
	}

	public static String writeToFile (String filename, String msg){
		TextIO.writeFile(filename);
		TextIO.put(msg);
	
		return msg;
	}


	public static void drawRectangles (int n, int m, Graphics g){

		int x = 50;
		int y = 50;
		g.setColor(Color.BLACK);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				g.drawRect(x, y, 50, 50);
				x += 50;
			}
			x = 50;
			y += 50;
			
		}
	}

	public static int[] getArray(int n, int m){
	if(n < 0 || n >= 10){
		throw new IndexOutOfBoundsException();
	}
	int[] array = new int[10];
	
	for (int i = n; i < array.length; i++) {
		array[i] = m;
	}
	
	return array;
	}
}



