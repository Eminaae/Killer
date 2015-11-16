package vjezbes02d01;
//unos dva broja i NZD

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Unos: ");
			
			int num1 = in.nextInt();
			int num2 = in.nextInt();
		
			int lcd = -1; //najmanjizajednickidjelioc

			for ( int i = 2; i <= num1 && i <= num2; i++) {
				if (num1 % i ==0 && num2 % i == 0) {
					lcd = i;
					break;
				}
				
			}
			
			if (lcd != -1){
				System.out.println(lcd);
			} else {
				System.out.println("Nema NZD");
			}
			in.close();

	}

}
