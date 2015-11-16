package vjezbeS12D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	private static BufferedReader reader;
	private static BufferedWriter writer;
	private static String line = "";
	private static Integer a;
	private static Integer b;
	private static Integer primeCounter = 0;

	public static void main(String[] args) {

		try {
			Socket client = new Socket("10.0.82.98", 8000);
			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			line = reader.readLine();
			a = Integer.parseInt(line.split(" ")[0]);
			b = Integer.parseInt(line.split(" ")[1]);

			System.out.println("(" + a + " , " + b + ")");
			for (int i = a; i < b; i++) {
				if (isPrimeEfficient(i)) {
					primeCounter++;
				}
			}

			System.out.println("Prime numbers: " + primeCounter);
			writer.write(primeCounter + "");
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isPrimeEfficient(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
