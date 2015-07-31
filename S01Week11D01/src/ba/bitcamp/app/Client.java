package ba.bitcamp.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("[Client] application started.");
			//Socket socket = new Socket("10.0.82.15", 2222);// za client imamo samo Socket
			
			Socket socket1 = new Socket();
			socket1.connect(new InetSocketAddress("10.0.82.15", 2222));
			System.out.println("[Client] connected to local host.");
			
			//reader cita tok koji mu se daje
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket1.getInputStream())); //prima input sream od socketa
			System.out.println("I/O Operating available now");
			System.out.println("Server " + reader.readLine());
			writer.write("Heeey ti");
			writer.newLine();
			writer.flush();
			
			Scanner input = new Scanner(System.in);
			
			//System.out.println("Server > " + reader.readLine()); //prvo procitamo poruku pa saljemo nvou
			//System.out.println("Msg: ");
			//writer.write(input.nextLine());
			//writer.flush();
			
			boolean end = false;
			while(true){	
				System.out.println("Client: " + reader.readLine());
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
		//	input.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
