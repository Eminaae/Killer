package vjezbeS11D04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMulti {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9966);
			while (true) {
				Socket client = server.accept();

				Thread t = new Thread(new MyThread(client));
				t.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class MyThread implements Runnable {
		Socket client;

		public MyThread(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {

			BufferedReader reader;
			try {
				reader = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				Scanner input = new Scanner(System.in);
				
				while (true) {
					System.out.println("Client: " + reader.readLine());
					
					writer.write(input.nextLine());
					writer.newLine();
					writer.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
