package ba.bitcamp.week10.day2.exercises;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExamplePrintWriter {

	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("text.txt"));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		pw.printf("Hello %d more %s", 1, "time");
		pw.close();
		//System.out.println("All is well.");		
	}

}
