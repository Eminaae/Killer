package ba.bitcamp.http;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("10.0.82.137", 7777);
			FileOutputStream fs = new FileOutputStream("data2.txt");
			InputStream is = client.getInputStream();
			
			byte[] bytes = new byte[1024];
			int writingLength;
			while((writingLength = is.read(bytes, 0, bytes.length)) != -1){
				fs.write(bytes, 0, writingLength);
				fs.flush();
			}
			client.close();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
