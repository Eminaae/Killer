package predavanjaS12D01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("10.0.82.113", 7321);
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			System.out.println("Unesi pitanje: ");
			Scanner input = new Scanner(System.in);
			
			while (true) {
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					System.out.println("Odgovor je: " + line);
				}
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
