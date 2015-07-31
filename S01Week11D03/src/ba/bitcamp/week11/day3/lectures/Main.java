package ba.bitcamp.week11.day3.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	private static int PORT = 7321;
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7321);
			while(true){
				Socket client = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				
				String line = "";
				String requestType ="";
				String requestRoute = "";
						
				while((line = br.readLine()) != null){
					if(line.contains("GET") || line.contains("POST")){
						
				String[] part = line.split(" ");	
				requestType = part[0];
				requestRoute = part[1];
				break;
					}
				}
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				try{
				String htmlContent = FileHandler.getContent(requestRoute);
				Result.ok(bw, htmlContent);
				}catch (FileNotFoundException e){
					Result.notFound(bw);
				}catch (IOException e){
					Result.serverError(bw);
				}
				//bw.write("HTTP/1.1 200 OK\n"); //we are telling browser which protocol we are using
				//bw.write("content-type: text/html\n");	//we are returning this
				//bw.newLine();
			
				//bw.write("<h1>Ostavi Hasiba na miru</h1>\n");
				//bw.newLine();
				bw.flush();
				client.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
