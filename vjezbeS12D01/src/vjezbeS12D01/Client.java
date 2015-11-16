package vjezbeS12D01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket client = new Socket("10.0.82.26", 8000);

			FileInputStream reader = new FileInputStream("output3.json");

			OutputStream writer = client.getOutputStream();

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = reader.read(data, 0, data.length)) > 0) {
				writer.write(data, 0, bytesRead);
			}

			writer.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
