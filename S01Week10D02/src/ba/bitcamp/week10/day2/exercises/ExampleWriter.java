package ba.bitcamp.week10.day2.exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ExampleWriter {

	/*
	 * Few examples with wrappers.
	 */
	
	/*
	 * InputStream
	 * OutputStream
	 * Reader
	 * Scanner
	 * Writer
	 * PrintWriter
	 * FileInputReader
	 * FileOutputWriter
	 * BufferedReader
	 * BufferedWriter
	 * ObjectOutputStream
	 * ObjectInputStream
	 */
	
	public static void main(String[] args) {
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
//			
//			bw.write("Hello");
//			bw.newLine();
//			bw.write("Hello2");
//			bw.newLine();
//			
//			char[] cbuf = {'B', 'I', 'T', 'C', 'a', 'm', 'p'};
//			
//			bw.write(cbuf, 3, 4);
//			
//			bw.flush();
//			bw.close();
//			System.out.println("All is well.");
//		} catch (IOException e) {
//			System.out.println("IOException");
//			e.printStackTrace();
//		}
		
		
		
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			out.write("Hellouuuu");
			out.close();
			
			System.out.println("Hellouuuu");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}