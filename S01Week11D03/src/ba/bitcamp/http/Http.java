package ba.bitcamp.http;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Http {

	public final static int PORT = 5432;

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		OutputStream os = null;
		ServerSocket httpSocket = null;
		Socket httpClient = null;
		try {
			httpSocket = new ServerSocket(PORT);
			while (true) {
				System.out.println("Waiting for client...");

				httpClient = httpSocket.accept();
				os = httpClient.getOutputStream();
				System.out.println("Accepted connection : " + httpClient.getLocalPort());
				// send file
				File myFile = new File("src/ba/bitcamp/http/data.txt");
				byte[] bytes = new byte[1024];
				int length;
				fis = new FileInputStream(myFile);
				bis = new BufferedInputStream(fis);
				while((length = fis.read(bytes, 0, bytes.length)) > 0){
					os.write(bytes, 0, length);
					os.flush();
				}
				System.out.println("Sending " + "src/ba/bitcamp/http/data.txt" + " " + bytes.length);
				
				os.close();
				bis.close();
				
				//httpClient.close();
				//httpSocket.close();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found");
		}
		
		
	}
}