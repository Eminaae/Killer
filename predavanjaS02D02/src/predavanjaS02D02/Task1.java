package predavanjaS02D02;
//Ispis na konzoli svih djelioca jendog broja

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		int num = in.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			if (num % i == 0)
			System.out.println(i);
		}
		in.close();
	}

}
