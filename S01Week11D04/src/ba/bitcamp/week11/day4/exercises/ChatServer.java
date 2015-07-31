package ba.bitcamp.week11.day4.exercises;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;

public class ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888);

			while (true) {
				Socket client = server.accept();
				Thread t = new Thread(new ClientThread(client));
				t.start();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	static class ClientThread implements Runnable {
		private Socket client;

		public ClientThread(Socket client) {
			this.client = client;

		}

		@Override
		public void run() {
			try {

				BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				String ip = client.getInetAddress().getHostName();
				while (client.isConnected()) {
					String line = reader.readLine();
					System.out.println( ip + ":" + line);
					
					if(line.split(" ")[0].equals("/web")){
						String website = line.split(" ")[1];
						
						try {
							Desktop.getDesktop().browse(new URI("http://" + website));
						} catch (URISyntaxException e) {
							System.out.println("Server error");
							e.printStackTrace();
						}
					}
				}
			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}
