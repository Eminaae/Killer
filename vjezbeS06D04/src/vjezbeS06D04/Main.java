package vjezbeS06D04;

import java.util.Arrays;

public class Main {
	
//	public static void print(int n){
		
//		if (n==0) { //base case prekida rekurziju
//			return;
//		}
//		System.out.println(n);
//		
//		print (n-1); //metoda koja poziva samu sebe
//		
//		if (1==1) {
//			return;
//		}
//		
//		System.out.println("Adis");
//		print();
	//}
	// StackOverFlow exception
	//Base cas oznacava kada ce se rekurzija prekinuti
	public static void main(String[] args) {
		int[] arr = new int[5];
		fillArray(arr);
		System.out.println(Arrays.toString(arr));
		//print(10);
		//System.out.println(Faktorijel(5));
		

	}
	
	public static void fillArray (int[] array) {
		fillArray(array, 0);
		
	}
	
	public static void fillArray (int[] array, int index) {
		if (index == array.length) {
			return;
		}
		
		array[index] = index + 1;
		
		fillArray(array, index + 1);
		
	}
	
//	public static int Faktorijel (int x) {
//		if (x==1){
//			return 1;
//		}
//		
//		return x* Faktorijel(x-1);
//		
//	}
	
	

}
