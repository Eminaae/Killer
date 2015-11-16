package predavanjaS03D03;

import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi max broj elemanta");
		int maxBrojElemenata = in.nextInt();
		System.out.println("Unesi max " + maxBrojElemenata + " brojeva, 0 za prekid unosa:");
		
		int [] numbers = new int [maxBrojElemenata];
		
		for (int index = 0; index < numbers.length; index++) {
			int br = in.nextInt();
			if (br >= 0) {
				numbers[index] = br;
			} else {
				break;
			}
		}
			int max = -1;
			for (int index = 0; index < numbers.length; index++) {
				int elementiNiza = numbers[index];
				if ( numbers[index] > max) {
					max = elementiNiza;
				}
			}
			System.out.println("Max number is: " + max);
	}

}
