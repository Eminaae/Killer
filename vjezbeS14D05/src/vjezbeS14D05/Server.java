package vjezbeS14D05;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static ServerSocket server;
	private static Socket client;
	private static FileInputStream fileReader;
	private static BufferedReader clientReader;
	private static OutputStream clientWriter;
	private static String line = "";

	public static void main(String[] args) {

		try {
			server = new ServerSocket(8000);
			System.out.println("Server started.");
		} catch (IOException e) {
			System.err.println("Could not start server.");
			System.err.println("Message: " + e.getMessage());
			System.exit(1);
		}

		try {
			client = server.accept();
			System.out.println("Client accepted.");
		} catch (IOException e) {
			System.err.println("Could not accept client.");
			System.err.println("Message: " + e.getMessage());
		}

		try {
			clientWriter = client.getOutputStream();
			System.out.println("Client writer geting stream.");
		} catch (IOException e) {
			System.err.println("Could not get I/O from client.");
			System.err.println("Message: " + e.getMessage());
			return;
		}

		try {
			clientReader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			while ((line = clientReader.readLine()) != null) {
				

			}
		} catch (IOException e1) {
			System.err.println("Can't read from client.");
			System.err.println("Message: " + e1.getMessage());
		}

		try {
			fileReader = new FileInputStream(new File("lena_secret.jpg"));
			System.out.println("Client reader started.");
		} catch (FileNotFoundException e) {
			System.err.println("Could not read from file.");
			System.err.println("Message: " + e.getMessage());
			System.exit(1);
		}

		byte[] buffer = new byte[1024];
		int readBytes;

		try {
			while ((readBytes = fileReader.read(buffer, 0, buffer.length)) > 0) {
				clientWriter.write(buffer, 0, readBytes);
			}
			clientWriter.close();
			client.close();
			System.out.println("File readed.");
		} catch (IOException e) {
			System.err.println("Could not read from file. Client ip: "
					+ client.getInetAddress().getHostAddress());
			System.err.println("Message: " + e.getMessage());
		}

		try {
			server.close();
		} catch (IOException e) {
			System.err.println("Copuld not close server.");
			System.err.println("Message: " + e.getMessage());
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			System.err.println("Could not close I/O of data.dat file.");
			System.err.println("Message: " + e.getMessage());
		}

	}

}
