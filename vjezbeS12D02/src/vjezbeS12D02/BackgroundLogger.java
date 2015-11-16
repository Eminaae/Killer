package vjezbeS12D02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BackgroundLogger {
	static Thread t;
	static BufferedReader reader;

	public static void main(String[] args) {
		ServerSocket server;

		try {
			server = new ServerSocket(9966);
			Socket client = server.accept();

			reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			t = new Thread(new MyThread());
			t.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static class MyThread implements Runnable {

		@Override
		public void run() {

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						"logger.txt"));

				String line = "";

				while ((line = reader.readLine()) != null) {
					if (line.equals("1")) {
						writer.write("1 [Temperature] " + reader.readLine()
								+ " K");
						writer.newLine();
						writer.flush();
					} else if (line.equals("2")) {
						writer.write("2 [Pressure]" + reader.readLine()
								+ " hPa");
						writer.newLine();
						writer.flush();
					} else if (line.equals("3")) {
						writer.write("3 [Movment] " + reader.readLine());
						writer.newLine();
						writer.flush();
					} else if (line.equals("4")) {
						writer.write("4 " + reader.readLine());
						writer.newLine();
						writer.flush();
					} else {
						writer.write("[COMM. ERROR]");
						writer.newLine();
						writer.flush();

					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


}
