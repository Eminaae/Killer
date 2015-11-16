import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double input = 0;
		double counter = -1;
		double average;
		double sum = 1;

		while (input != -1) {
			System.out.println("Input number: ");
			input = in.nextDouble();

//			if (input != -1) {
				sum = sum + input;
				counter++;
			}
		//}
		average = sum / counter;
		System.out.println("Average is: " + average  + " Sum is: " + sum + " Counter is: " + counter);
		in.close();

	}

}
