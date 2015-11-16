package predavanjaS11D01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;



public class EchoClient {
	private static final String HOST = "localhost";
	private static final int PORT = EchoServer.ECHO_PORT;
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		System.out.println("Conecting to" + HOST + ":" + PORT);
		Socket client = new Socket(HOST, PORT);
		System.out.println("Connecting established, sending request...");
		OutputStream rqStream = client.getOutputStream();
		OutputStreamWriter rqWriter = new OutputStreamWriter(rqStream);
		InputStream responseStream = client.getInputStream();
		rqWriter.write("Hello server!!!\n");
		rqWriter.flush();

		System.out.println("Requeste sent waiting for response...");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(responseStream));
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	
		System.out.println(br.readLine());
		System.out.println("Finishing req/resp client program");
	
		client.close();
	}

}
