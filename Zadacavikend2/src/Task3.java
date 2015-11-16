import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		System.out.println("Input n: ");
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		input.close();
		long num = 1;
		long factorial = 1;
		long digit = 0;
		
		while (num < n) {
			num ++;
			factorial = factorial * num;
			digit = factorial % 10;
			if (digit == 0) {
				factorial /= 10;
			}
		}
		System.out.println(factorial);
	}
}
