import java.util.Scanner;

public class Task3 {
//cita unos sa konzole dok ne unesemo 0
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int input = 0;
		
		do {
			System.out.println("Unesi broj: ");
				input= in.nextInt();
		System.out.println("Taj broj: " + input);
		} while (input != 0);
		
//		while (input != 0) {
//			System.out.println("Unesi broj: ");
//			input = in.nextInt();
//			System.out.println("Taj broj: " + input);
//		}
		in.close();
	}

}
