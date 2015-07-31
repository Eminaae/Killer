package ba.bitcamp.ime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataToMap {
	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();

		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			InetAddress address = client.getInetAddress();
			String ip = address.getHostAddress();
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			String line = reader.readLine();
			
			System.out.println(map.get(ip) + ": " + line);

			Socket clientZaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientZaid.getOutputStream()));
			writer.write(line);
			writer.flush();
			writer.close();

			while (true) {
				try {
					String ipSend = randomIP(map);
					String nameSend = map.get(ipSend);
					Socket clientRandom = new Socket(ipSend, 8888);

					BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(clientRandom.getOutputStream()));
					writer1.write(line);
					writer1.flush();
					writer1.close();
					System.out.println("Sent to: " + nameSend);
					break;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		/*
		 * try { Socket socket = new Socket(); socket.connect(new
		 * InetSocketAddress("10.0.82.98", 8888)); File file = new
		 * File("names.txt"); InputStream in = socket.getInputStream();
		 * FileOutputStream out = new FileOutputStream(file);
		 * 
		 * long length = file.length(); byte[] bytes = new byte[1024]; int
		 * count; while ((count = in.read(bytes, 0, 1024)) > 0) {
		 * out.write(bytes, 0, count); } out.close(); in.close();
		 * socket.close();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"names.txt"));
			try {
				while (reader.ready()) {
					StringTokenizer token = new StringTokenizer(
							reader.readLine(), " ");
					String key = token.nextToken();
					String value = token.nextToken();
					map.put(key, value);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		//System.out.println(map);
	//	System.out.println(randomIP(map));
	}

	
	public static String randomIP(HashMap<String, String> map) {
		String key = "10.0.82.";

		while (true) {
			int temp = (int) (Math.random() * 255);
			key += String.valueOf(temp);
			if (map.containsKey(key)) {
				return key;
			} else {
				key = "10.0.82.";
			}
		}
	}
}
