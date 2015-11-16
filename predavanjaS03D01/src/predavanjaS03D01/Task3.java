package predavanjaS03D01;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner in = new Scanner (System.in);
		

		String  expression = in.nextLine();
		int length = expression.length();
		int operatorPosition = expression.indexOf("+");
		char operator = expression.charAt(operatorPosition);
		String str1 = expression.substring(0, operatorPosition);
		String str2 = expression.substring(operatorPosition, length);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if (operator == '+' ){
				int sum = num1 + num2;
				System.out.println(sum);
			} else if (operator == -1){
				int sum = num1 - num2;
				System.out.println(sum);
			}
		
		in.close();
	}

}