package predavanjaS03D03;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		Scanner input = new Scanner (System.in);
		int number1 = -1; int number2 = -1; int number3 = -1; int number4 = -1; int number5 = -1;
		number1 = input.nextInt();
		if (number1 > 0){
		System.out.println("Enter second number: ");
		number2 = input.nextInt();
		if (number2 >0) {
		System.out.println("Enter third number: ");
		 number3 = input.nextInt();
		if (number3 > 0) {
		System.out.println("Enter fourth number: ");
		number4 = input.nextInt();
		if (number4 > 0) {
		System.out.println("Enter fiveth number: ");
		number5 = input.nextInt();
		if (number5 >0){
		}
	   }
	  }
	 }
    }
		
		int max = number1;
		
		if (number2 > number1 ) {
			 max = number2;
		}
		if (number3 > max){
			max = number3;
		}
		if (number4 > max){
			max = number4;
		}
		if (number5 > max){
			max = number5;
		}
			
		System.out.println("Max is: " + max);
		
	}

}
