import java.util.InputMismatchException;
import java.util.Scanner;


public class TaskTryAndCatch {

	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
		String input = "25-303";
		int length = input.length();
		
		int indexOfOperator = input.indexOf("+");
		
		String substring1 = input.substring(0, indexOfOperator);
		String substring2 = input.substring(indexOfOperator+1, length);
		char operator = input.charAt(indexOfOperator);
		
		System.out.println(substring1+operator+substring2);
		
		int firstNumber = Integer.parseInt(substring1);
		int secondNumber = Integer.parseInt(substring2);
		int sum = firstNumber + secondNumber;
		System.out.println(sum);
		
		if (indexOfOperator == -1){
			String substringMinus = input.substring(indexOfOperator,length);
			int sum1 = firstNumber-secondNumber;
			System.out.println(sum1);
			
			
		}
	}
	
}
		
		
		
		
		

