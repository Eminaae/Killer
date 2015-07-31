package ba.bitcamp.week11.day1.lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//ima zadatak da osluskuje nesto na portu i kad primi nesto ima zadatak da kaze ok
//servis je zamisljen da stalno radi, tj da se nesto vrti u petlji koja ide u krug, jer server ne prima req. samo od jednog korisnika
public class EchoServer {

	public static final int ECHO_PORT = 12339;
	
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(ECHO_PORT);
		while(true){
			System.out.println("Waiting for next request....");
			Socket clientSocket = server.accept(); //cekamo da se neko konektuje na nas
			System.out.println("Req accepted, writing for request....");
			InputStream rqStream = clientSocket.getInputStream();
			OutputStream respStream = clientSocket.getOutputStream();
			
			BufferedReader rqReader = new BufferedReader(new InputStreamReader(rqStream));
			String rq = rqReader.readLine();
			
			System.out.println("Req accepted" + rq);
			System.out.println("Writing response");
			OutputStream os = clientSocket.getOutputStream();
			
			OutputStreamWriter writer = new OutputStreamWriter(os);
			writer.write("OK\n"); //saljemo odgovor OK //zapise se u buff.writer
			writer.write(rq);
			writer.flush(); // flushamo writer za ok
			System.out.println("Response flushed, closing connection...");
			writer.close(); 
			clientSocket.close();		
		}
	}
}
