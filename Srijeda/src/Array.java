import java.util.Arrays;
import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
	/**	int[]arr = new int[5];
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		System.out.println(arr.length);

		Scanner input = new Scanner(System.in);
		arr[0] = input.nextInt();
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		*/
	/*TASK01	
	Scanner in = new Scanner(System.in);
	int[]numbers = new int[10];
	
	for(int i = 0; i < numbers.length; i++){
		numbers[i]=(int)(Math.random()*10+1);
		
	}
	for(int value : numbers){ //value vrijednost iz array i povecava se za
		System.out.println(value);
	}
	
	}*/
		
		/*TASK02
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int length = in.nextInt();
		System.out.println("Insert values");
		int []array=new int[length];
		
		//System.out.println(length);
		
		for(int i = 0; i < array.length; i++){
			int arrayElements = array[i];
			
		}for(int value : array){ 
			System.out.println(value);
	}*/
		
		
		//TASK03
		
	/*	Scanner in = new Scanner(System.in);
		System.out.println("How many numbers you want to insert?");
		int numbers = in.nextInt();
		int[]array = new int[numbers];
		int counter = 0;
		for(int i = 0; i < numbers; i++){
			int num = in.nextInt();
			array[i]=num;
			
		}for(int value : array){ 
			System.out.println(value);
		}
		System.out.println("What is the number in array you want to count?");
		int number =in.nextInt();
		
		for(int i = 0; i < numbers; i++){
			if(number == array [i]){
			counter++;	
		}
		
		}System.out.println("Counted " +number);
	}			*/
		
		
		//TASK04
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Insert string: ");
		String str = in.nextLine();
		int arrayLength = str.length();
		char[]array = new char [arrayLength];
		for (int i = 0; i < arrayLength; i++){
			char letter = str.charAt(i);
			array[i] = letter;	
		}
		for (int i = arrayLength - 1; i >= 0; i--){
			System.out.print(array[i]);
		}
	}
}*/

		//TASK05
		

		Scanner in = new Scanner(System.in);
		System.out.print("Insert values for the first array\n");
		int[]arr = new int[11];
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = in.nextInt();
		}//System.out.println(arr[2]);
		
		int[]arr1 = new int[22];
		for(int value : arr1){ 
			System.out.println(value);		
		}
		for(int i = 0; i < arr1.length; i++){
			arr1[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
}


	


/*if (arr.length < arr1.length){
		int temp =arr[4];
		arr[4] = arr1[9];
		arr1[9] = temp;*/
	



		
