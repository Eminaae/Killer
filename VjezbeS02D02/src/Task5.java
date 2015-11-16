import java.util.Scanner;

//koliko je parni koliko neparnih brojeva
public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int countEven = 0;
		int countOdd = 0;
		int input;
		
		do{
			input = in.nextInt();
			if (input % 2 == 0 && input != 0) {
				countEven++;
			} else {
				countOdd++;
			}
		} while (input != 0);
		
		System.out.printf("Parnih ima %d, a neparnih ima %d", countEven, countOdd);
			
		in.close();	
	}
}
