
public class Task6 {
//palindrom
	public static void main(String[] args) {
		
		int num = 121;
		int rev = 0;
		int n = num;
		
		
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			rev = rev * 10 + digit;
			System.out.print(digit + " ");
		}
		if (rev == n) {
			System.out.println("palindrom");
		} else {
			System.out.println("nije palindrom");
			
		}

	}

}
