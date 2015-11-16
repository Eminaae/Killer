package vjezbeS11D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.0.82.20", 9966);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			Scanner input = new Scanner(System.in);
				
			while (true) {				
			
				System.out.println("Server: " + reader.readLine());
			
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				}
				
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
