package vjezbeS14D05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private static String line = "GET / lena_secret.jpg + 1024";

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.0.82.20", 8000);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));

			while (true) {

				writer.write(line);
				writer.newLine();
				writer.flush();
				writer.close();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
