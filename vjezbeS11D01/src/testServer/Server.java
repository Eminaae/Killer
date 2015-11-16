package testServer;



import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;



public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9966);

			System.out.println("Listenig for a client...");
			Socket client = server.accept();
			System.out.println("Client found!");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			writer.flush();

			System.out.println("Client: " + reader.readLine());
			Scanner input = new Scanner(System.in);


			writer.flush();

			boolean end = false;
			while (!end) {
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();

				System.out.println("Client: " + reader.readLine());
			}
//		slika	
//			URL url1 = null;
//			try {
//				url1 = new URL(
//						"http://static5.depositphotos.com/1004199/406/i/950/depositphotos_4067095-Beagle-puppy-with-birthday-party-hat.jpg");
//			} catch (MalformedURLException e) {
//				System.out.println("Bad URL!");
//				e.printStackTrace();
//				System.exit(1);
//			}
//			
//			try {
//				URLConnection con = url1.openConnection();
//				System.out.println(con.getContent());
//				
//				InputStream in = con.getInputStream();
//				File file = new File ("output.jpg");
//				FileOutputStream fileWrite = new FileOutputStream(file);
//				
//				byte[] data = new byte[1024];
//				int bytesRead;
//				
//				while ((bytesRead = in.read(data, 0, data.length)) > 0) {
//			
//					writer.write(data.toString().toCharArray(), 0, bytesRead);
//				}
//				
//				
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
