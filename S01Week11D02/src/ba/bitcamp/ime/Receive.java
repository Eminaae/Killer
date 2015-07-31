package ba.bitcamp.ime;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Receive {

	public static void main(String[] args) {

		try{	
			//server
			ServerSocket myServer = new ServerSocket(8888);
			Socket from = myServer.accept();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(from.getInputStream()));
			String s = reader.readLine();
			System.out.println("msg " + s);
			
			
			
			//client 1
			Socket socket1 = new Socket();
			socket1.connect(new InetSocketAddress("10.0.82.98", 8888));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
			writer.write(s);
			writer.newLine();
			writer.close();
			
			//client 2
			Socket socket2 = new Socket();
			socket2.connect(new InetSocketAddress(InetAddress.getByName(s), 8888));
			BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(socket2.getOutputStream()));
			writer1.write(s);
			writer1.newLine();
			writer1.close();
			}	catch(IOException e) {
				e.printStackTrace();
			}
			
	
		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("10.0.82.98", 8888));
			File file = new File("names.txt");
			InputStream in = socket.getInputStream();
			FileOutputStream out = new FileOutputStream(file);

			long length = file.length();
			byte[] bytes = new byte[1024];
			int count;
			while ((count = in.read(bytes, 0, 1024)) > 0) {
				out.write(bytes, 0, count);
			}
			out.close();
			in.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
