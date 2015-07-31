package ba.bitcamp.week11.day1.lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class EchoClient {

	private static final String HOST = "127.0.0.1";
	private static final int PORT = EchoServer.ECHO_PORT;
	public static void main(String[] args) throws IOException{
		System.out.println("Connecting to -> " + HOST + ":" + PORT);
		Socket client = new Socket(HOST,PORT);
		System.out.println("Conncection established, sending req ...");
		OutputStream rqStream = client.getOutputStream();
		InputStream respStream = client.getInputStream();
		
 		OutputStreamWriter rqWriter = new OutputStreamWriter(rqStream);
		rqWriter.write("Hello server");
		rqWriter.flush();
		//rqWriter.close();
		System.out.println("Request sent. Waiting for response....");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(respStream));
		String line = null;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		System.out.println(br.readLine());
		System.out.println("Finishing req");
		client.close();
	}
}
