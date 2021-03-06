package app2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		
		try {
			System.out.println("Application started.");
			ServerSocket server = new ServerSocket (9966);
			System.out.println("Server socked made.");
			
			System.out.println("Listenig for a client...");
			Socket client = server.accept();
			System.out.println("Client found!");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			System.out.println("I/O Operating available now.");
			
			writer.write("Kako si? Sta ima?");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			Scanner input = new Scanner(System.in);
			System.out.println("Msg: ");
			writer.write(input.nextLine());
			//writer.newLine(); Ne treba zbog nextLine() odozgo
			writer.flush();
			
			System.out.println("END");
			boolean end = false;
			while (!end) {
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				System.out.println("Client: " + reader.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
