package ba.bitcamp.s04d01;

import java.util.InputMismatchException;

public class Task04 {

	/**
	 * Receives an array as parameter. 
	 * @param args - number
	 * @return sum of inserted elements.
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		int sum = 0;
		for(String arg : args){ 
		int number = Integer.parseInt(arg);
			try {
			System.out.println(number);
			}
			catch(InputMismatchException e){
			System.out.println("Wrong input. Type number.");
			e.printStackTrace();
		}
		sum = sum + number;
			
		}System.out.printf("Sum = %d \n",sum);
		
	}

}
