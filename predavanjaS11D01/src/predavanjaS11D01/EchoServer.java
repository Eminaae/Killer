package predavanjaS11D01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int ECHO_PORT = 12266;
	public static void main (String[] args) throws IOException {
		ServerSocket server = new ServerSocket (ECHO_PORT);
		while (true) {
			System.out.println("Waiting for next request...");
			Socket clientSocket = server.accept();
			System.out.println("Request accepted, waiting for request...");
			InputStream rqStream = clientSocket.getInputStream();
			BufferedReader rqReader = new BufferedReader(new InputStreamReader(rqStream));
			OutputStream os = clientSocket.getOutputStream();
			String rq = rqReader.readLine();
			
			System.out.println("Requeste accepted: " + rq);
			System.out.println("Writing response...");
			
			OutputStreamWriter writer = new OutputStreamWriter(os);
			writer.write("OK");
			writer.flush();
			System.out.println("Responese flushed, closing connection...");
			//writer.close();
			clientSocket.close();
		}
	}
}
