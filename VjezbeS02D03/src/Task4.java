
public class Task4 {
/**
 * Write a program that will print all four-digit codes that are palindromes, starting from 1001 palindromic numbers are numbers that have 
 * the same value by looking at the number of left or right, for example. 202nd
 */

	public static void main(String[] args) {
		
		for (int i = 100; i < 10000; i++) {
//			int d1 = i %10;
//			int d2 = i / 10 % 10;
//			int d3 = i /100 % 10;
//			int d4 = i / 1000;
//			
//			int reverse = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
//			
//			if (i == reverse) {
//				System.out.println(i + "=>" + reverse);
			
				int reverse = 0;
				int num = i;
				
				while (num != 0) {
					reverse = reverse * 10 + (num % 10);
					num /= 10;
				} if (num == reverse) {
					System.out.println(i + "=>" + reverse);
				
		}

	}
}
}
