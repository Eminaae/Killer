package ba.bitcamp.app;

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
		//statican, ceka klienta
	
		try {	
			System.out.println("Application started...");
			ServerSocket server = new ServerSocket(54321);//parametar je port 54321
			System.out.println("Server Socket made!");
			
			//server ceka da se client konektuje...
			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found!");
			
			//saljemo clientu poruku preko streamova
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			System.out.println("IO Operating available now");
			
			writer.write("Heeeeeeeeeey");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			
			//chat pocinje
			Scanner input = new Scanner(System.in);
			System.out.println("Msg Server: ");
			writer.write(input.nextLine());
			//writer.newLine(); ne treba zbog next line
			writer.flush();
			
			System.out.println("END");//test da vidimo ko je zadnji poslao poruku
			boolean end = false;
			while(!end){
				
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				System.out.println("Client: " + reader.readLine());
				
			}
			
			input.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
