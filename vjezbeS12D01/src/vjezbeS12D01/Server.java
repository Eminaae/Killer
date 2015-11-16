package vjezbeS12D01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			System.out.println("Server started");
			Socket client = server.accept();

			InputStream read = client.getInputStream();

			File file = new File("output3.json");
			FileOutputStream writer = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = read.read(data, 0, data.length)) > 0) {
				writer.write(data, 0, bytesRead);
			}

			writer.close();

			ArrayList<Msg> list = new ArrayList<Msg>();
			ObjectMapper mapper = new ObjectMapper();
			list = mapper.readValue(file, ArrayList.class);
			System.out.println(list);
			list.add(new Msg("Kristina", Calendar.getInstance().getTime()
					.toString(), "Poruka"));

			mapper.writeValue(file, list);
			
			Socket client1 = new Socket("10.0.82.26", 8000);

			FileInputStream reader = new FileInputStream(file);

			OutputStream writer1 = client1.getOutputStream();

			byte[] data1 = new byte[1024];
			int bytesRead1;

			while ((bytesRead1 = reader.read(data1, 0, data1.length)) > 0) {
				writer1.write(data1, 0, bytesRead1);
			}

			writer1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
