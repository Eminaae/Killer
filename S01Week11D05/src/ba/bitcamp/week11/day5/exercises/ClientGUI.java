package ba.bitcamp.week11.day5.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientGUI {

	public static void main(String[] args) {
	
		try {	
			Socket client = new Socket();
			client.connect(new InetSocketAddress("localhost", 8000));
			
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out.write("");
			out.newLine();
			out.flush();
			
			Scanner input = new Scanner(System.in);
			
			while(true){
			
				out.write(input.nextLine());
				out.newLine();
				out.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
