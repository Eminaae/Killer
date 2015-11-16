import java.util.Scanner;


public class TaskZ3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		
		int counter = 0;
		int pom = number;
		for (int i = 2; i <= number; i++) {
			number % i == 0;
			number = number / 10;
			counter++;
				
			}
			
		}

     // System.out.println();
}

}
}