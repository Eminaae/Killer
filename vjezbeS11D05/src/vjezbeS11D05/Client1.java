package vjezbeS11D05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client1 {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("10.0.82.98", 8000);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			
			writer.write("Kristina");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Poslata poruka.");

	}

}
