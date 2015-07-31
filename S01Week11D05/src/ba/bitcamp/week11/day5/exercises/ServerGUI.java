package ba.bitcamp.week11.day5.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerGUI {
	public static void main(String[] args) {
		try {	
			System.out.println("Application started...");
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found!");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			writer.write("");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			
			Scanner input = new Scanner(System.in);
			writer.write(input.nextLine());
			writer.flush();
			
			boolean end = false;
			while(!end){
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
			input.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
