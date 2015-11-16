package vjezbeS11D01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSender {

	public static void main(String[] args) {
		try {
			//Zaid primanje poruke
			ServerSocket server = new ServerSocket(9966);
			Socket fromZaid = server.accept();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromZaid.getInputStream()));

			String msg = "Poruka: " + reader.readLine();
			System.out.println(msg);
			reader.close();

			//System.exit(0);
			
			//Zeljko slanje poruke
			Socket socket = new Socket("10.0.82.98", 7777);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write(msg);
			writer.newLine();
			writer.close();
			
			System.out.println("Poslata poruka.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
