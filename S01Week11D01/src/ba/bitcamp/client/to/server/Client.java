package ba.bitcamp.client.to.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {

			Socket socket1 = new Socket();
			socket1.connect(new InetSocketAddress("10.0.82.15", 3333));
			System.out.println("[Client] connected to local host.");

			// reader cita tok koji mu se daje
			InputStream writer = socket1.getInputStream();
			//FileOutputStream reader = new FileInputStream(new File()) // prima input sream od socketa
			System.out.println("I/O Operating available now");
			Scanner input = new Scanner(System.in);
			
			
			
//			boolean end = false;
//			while (true) {
//				System.out.println("Server: " + reader.readLine());
//				System.out.println("Msg: ");
//				writer.write(input.nextLine());
//				writer.newLine();
//				writer.flush();
//
//			}

			// input.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
