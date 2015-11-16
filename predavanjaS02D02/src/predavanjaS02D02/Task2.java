package predavanjaS02D02;
//svi brojevi manji od broja, a parni su

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		for ( int i = 1; i < num; i++) {
			if (i % 2 == 0)
			System.out.println(i);
		}
		in.close();
	}

}
