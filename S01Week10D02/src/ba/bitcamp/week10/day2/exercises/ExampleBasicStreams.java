package ba.bitcamp.week10.day2.exercises;
import java.io.IOException;
import java.util.Scanner;

public class ExampleBasicStreams {

	/*
	 * Stream!
	 * InputStream and OutputStream
	 * System.in and System.out
	 * 
	 * Wrappers
	 */
	
	public static void main(String[] args) {
		try {
			// ABC -> "ABC/r/n"
			while (true) {
				System.out.println("Ava: " + System.in.available());
				System.out.println(System.in.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Wrapper example
		Scanner input = new Scanner(System.in);
		System.out.println(input.nextLine());
	}

}