import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int [] arr = new int [5];
		//unos vrednosti u niz
		Scanner input = new Scanner (System.in);
		for (int i = 0; i < arr.length; i++) {
			arr [i] = input.nextInt();
		}
		
//		Scanner input = new Scanner (System.in);
//		arr[0] = input.nextInt();
		//ispisivanje niza
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr.length);
//		System.out.println(arr[1]);
//		System.out.println(arr[4]);
	}

}
