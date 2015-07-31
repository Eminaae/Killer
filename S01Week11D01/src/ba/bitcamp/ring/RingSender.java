package ba.bitcamp.ring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSender {

	public static void main(String[] args) {
		
		try{	//receive msd
		ServerSocket client = new ServerSocket(5432);
		Socket fromAjdin = client.accept();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(fromAjdin.getInputStream()));
		String s = reader.readLine();
		System.out.println("msg od Edvina: " + s);
		
		
		
		//server
		Socket socket1 = new Socket();
		socket1.connect(new InetSocketAddress("10.0.82.30", 7896));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
		writer.write(s);
		writer.newLine();
		writer.close();
		System.out.println("Emina ");
		}	catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
