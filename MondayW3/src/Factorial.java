import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int digit;
	
		int factorial=1;
		for(int i=1; i<=num; i++){
		    factorial*=i;	
		}
			digit = factorial  % 10;
		if (digit == 0) {
			digit/=10;
			
			System.out.println(digit);
			}
		
		}
	

}

