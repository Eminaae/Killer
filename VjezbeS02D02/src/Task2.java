import java.util.Scanner;

public class Task2 {
//ispisati zbir cifara unesenog broj

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Unos: ");
		int num = in.nextInt();
		int sum = 0;
		int num2 = num;
		int counter = 0;
		int digit = 0;
		
		while (num2 > 0) { //broj iteracija zavisi od duzine broja
			num2 /= 10;
			counter++;	
		}
			for (int i = 0; i <= counter; i++) {
			    digit = digit % 10;
			    sum += digit;
			    num /= 10;    
			}
				System.out.println(sum);
		in.close();
	}

}
