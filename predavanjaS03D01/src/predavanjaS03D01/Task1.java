package predavanjaS03D01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	
	public static int getNumber(int number){
		return number;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		while (true) {
			try {
				System.out.println("Unesi broj: ");
				System.out.println(getNumber(4));
				break;
			} catch(InputMismatchException e) {
				System.out.println(" Nije broj.");
				in.nextLine();
				
			}
		}	
		in.close();
	}

}
