package ba.bitcamp.s04d01;

import java.util.InputMismatchException;

public class Division {

	/**
	 * Divides two numbers.<p> Returns division to user console. 
	 * @param args a, b
	 * @throws Arthimetic exception if divided by zero
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) {
		int n = args.length;
		if (args.length < 2){
			System.out.println("You need more args, at least 2");
			System.exit(0);
		}
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		if(b==0){
			throw new ArithmeticException();
		}
		
		while (true){
			try{ 
				System.out.println("Insert two numbers");
				break;
			}catch (NumberFormatException e){ //izvrsava se sve dok ne dodje do exception
				System.out.println("It's not digit");
				
			}
		}System.out.println(a/b);
	}
}	

	

