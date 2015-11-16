
public class Task5 {

	public static void main(String[] args) {
		
		for (int i = 10000; i < 100000; i++) {
			
			int rev = 0;
			int num = i;
			
			while (num > 0) {
				
			int digit = num % 10;
			num = num / 10;
			rev = rev * 10 + digit;
			}
			if (rev == num) {
				System.out.println(rev + " " + num);
			} 
		}

	}

}
