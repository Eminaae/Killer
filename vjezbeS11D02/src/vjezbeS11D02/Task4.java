package vjezbeS11D02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class Task4 {

	public static String randomIP() {
		String address = "";
		Integer number = (int) (Math.random() * 137) + 16;
		if (number != 20) {
			address = "10.0.82." + number.toString();
		}
		return address;
	}

	public static String ipRandom(HashMap<String, String> mapa) {
		Object[] kljucevi = mapa.keySet().toArray();

		Integer index = (int) (Math.random() * kljucevi.length + 1);

		return kljucevi[index].toString();
	}

	public static void main(String[] args) {
		HashMap<String, String> id = new HashMap<String, String>();
		String key = "";
		String name = "";
		String line = "";

		File file = new File("output.txt");
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(file));

			while (reader.ready()) {
				line = reader.readLine();
				int index = line.indexOf(" ");
				key = line.substring(0, index);
				name = line.substring(index + 1, line.length());
				id.put(key, name);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println(id);

		// System.out.println(randomIP());

		// System.out.println(ipRandom(id));

		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			Socket fromZaid = server.accept();

			BufferedReader reader1 = new BufferedReader(new InputStreamReader(
					fromZaid.getInputStream()));

			String msg = reader1.readLine();
			System.out.println(msg);
			reader1.close();

			Socket socket = new Socket("10.0.82.98", 8888);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			
			System.out.println("Unesi poruku: ");
			Scanner in = new Scanner (System.in);
			writer.write(msg + " " + in.nextLine());
			writer.newLine();
			writer.close();

			//System.out.println("Poslata poruka.");
			while (true) {
				try {
					Socket socket1 = new Socket(ipRandom(id), 8888);

					BufferedWriter writer2 = new BufferedWriter(
							new OutputStreamWriter(socket1.getOutputStream()));
					
					//System.out.println("Unesi poruku: ");
					//Scanner in1 = new Scanner (System.in);
					writer2.write(msg + " " +in.nextLine());
					writer2.newLine();
					writer2.close();
					break;
				} catch (IOException e) {

				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
