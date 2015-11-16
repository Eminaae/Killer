package vjezbeS14D03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Http {
	
	private static ServerSocket server;
	private static String webpage = "";

	public static void main(String[] args) {
		
		loadWebsite();
		startServer();
		while (true) {
			
			findClients();
		}

	}

	public static class ClientThread extends Thread {
		private Socket client;
		private BufferedWriter writer;

		public ClientThread(Socket client) {
			
			this.client = client;

			try {
				writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
			} catch (IOException e) {
				System.err.println("Could not get I/O from client.");
				System.err.println("Message: " + e.getMessage());
				return;
			}

			start();
		}

		@Override
		public void run() {
			try {
				writer.write(webpage);
				writer.newLine();
				writer.close();
				client.close();
			} catch (IOException e) {
				System.err.println("Webpage is not send.");
				System.err.println("Message: " + e.getMessage());
			}
			System.out.println("Website sent!");
		}

	}

	public static void loadWebsite() {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(
					new FileReader(
							new File("index.html")));

		} catch (FileNotFoundException e) {
			System.err.println("Cuould not read file.");
			System.err.println("Message: " + e.getMessage());
			System.exit(1);
		}

		try {
			while (fileReader.ready()) {
				webpage += fileReader.readLine() + "\n";
			}

		} catch (IOException e) {
			System.err.println("Could not read from file.");
			System.err.println("Message: " + e.getMessage());
			System.exit(1);
		}

		try {
			fileReader.close();
		} catch (IOException e) {
			System.err.println("Can not close reader");
			System.err.println("message: " + e.getMessage());
		}
		System.out.println("Website loaded.");
	}

	public static void startServer() {
		try {
			server = new ServerSocket(1234);
		} catch (IOException e) {
			System.err.println("Can't start server.");
			System.out.println("Mesage: " + e.getMessage());
			System.exit(1);
		}
		System.out.println("Server started.");
	}

	public static void findClients() {

		try {
			Socket client = server.accept();

			new ClientThread(client);
			String ip = client.getInetAddress().getHostAddress();
			System.out.println("Client connected: " + ip);
		} catch (IOException e) {
			System.out.println("No clien accepted.");
			System.out.println("Message: " + e.getMessage());
		}

	}

}
