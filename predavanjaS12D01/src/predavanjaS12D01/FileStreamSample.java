package predavanjaS12D01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class FileStreamSample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("text.txt");
			
			FileOutputStream os = new FileOutputStream("text.txt");
			
			PrintWriter pw = new PrintWriter(os);

			byte[] buffer = new byte[10];
			while (is.available() > 0) {
				is.read(buffer);
				for (byte b : buffer) {
					System.out.print(b + " ");
				}
				buffer = new byte[10];
			}
			
			pw.println("Moj string");
			pw.printf("Moj %s formatirani", "string");
			pw.print(true);
			pw.println(2.45);
			pw.close();
			
			} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
