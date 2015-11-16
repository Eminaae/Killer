import java.util.Scanner;


public class Task4 {
//unesi brojeve dok ne unese prani broj
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = 0;
	
		do {
			System.out.println("Unesi broj: ");
			n = in.nextInt();
			System.out.println(" " + n);
		} while (n % 2 != 0);
		
		in.close();

	}

}
