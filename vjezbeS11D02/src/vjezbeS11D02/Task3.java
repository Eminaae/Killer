package vjezbeS11D02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Task3 {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("10.0.82.98", 7777);
		
			InputStream read = socket.getInputStream();
			File file = new File ("output.txt");
			FileOutputStream writer = new FileOutputStream(file); 
			
			byte[] data = new byte[1024];
			int bytesRead;
		
			while ((bytesRead = read.read(data, 0, data.length)) > 0) {
				writer.write(data, 0, bytesRead);
			}
	
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Primljen file.");
	}

}
