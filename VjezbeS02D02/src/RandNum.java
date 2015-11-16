import java.util.Scanner;


public class RandNum {

	public static void main(String[] args) {
		System.out.println("Unesi max 5 brojeva:");
		System.out.println("Enter first number: ");
		Scanner input = new Scanner (System.in);
		int number1 = -1; int number2 = -1; int number3 = -1; int number4 = -1; int number5 = -1;
		int uneseno = 0;
		number1 = input.nextInt();
		if (number1 > 0){
			uneseno++;
		System.out.println("Enter second number: ");
		number2 = input.nextInt();
		if (number2 >0) {
			uneseno++;
		System.out.println("Enter third number: ");
		 number3 = input.nextInt();
		if (number3 > 0) {
			uneseno++;
		System.out.println("Enter fourth number: ");
		number4 = input.nextInt();
		if (number4 > 0) {
			uneseno++;
		System.out.println("Enter fiveth number: ");
		number5 = input.nextInt();
		if (number5 >0){
			uneseno++;
		}
	   }
	  }
	 }
    }
		int randindex = (int)(Math.random()*uneseno) + 1;
		int rand = 1;
		switch (randindex){
		case 1: 
			rand = number1;
			break;
		case 2: 
			rand = number2;
			break;
		case 3: 
			rand = number3;
			break;
		case 4: 
			rand = number4;
			break;
		case 5: 
			rand = number5;
			break;
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
			
		System.out.println("Randon number is: " + max);

	}

}
