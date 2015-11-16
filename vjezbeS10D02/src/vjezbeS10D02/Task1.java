package vjezbeS10D02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1 {

	public static void main(String[] args) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("task1.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		for (int i = 1; i < 101; i++) {
			pw.println(i);
			pw.println("String");

		}
		pw.close();
	}

}
