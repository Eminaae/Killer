package vjezbeS12D02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sensor {

	public static void main(String[] args) {
		try {
			Socket sensor = new Socket("localhost", 9966);
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(sensor.getOutputStream()));
			System.out.println("Enter data: ");
			Scanner input = new Scanner(System.in);
			
			while (true) {
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
