package zadatak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpFileServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6789);
			
			while (true) {
			Socket client = server.accept();

			BufferedWriter clientWriter = new BufferedWriter(
					new OutputStreamWriter(client.getOutputStream()));
			BufferedReader clientReader = new BufferedReader(
					new InputStreamReader(client.getInputStream()));

			BufferedReader fileReader = null;
			String htmlDoc = "";

			try {

				String address = "src/page.html";
				fileReader = new BufferedReader(new FileReader(
						new File(address)));

			} catch (NullPointerException ex) {
			}

			while (fileReader.ready()) {
				htmlDoc += fileReader.readLine();
			}

			clientWriter.write(htmlDoc);
			clientWriter.newLine();
			clientWriter.close();
			client.close();
			//server.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
