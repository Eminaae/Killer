package ba.bitcamp.week10.day2.exercises;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Test1 {

	private InputStream in;
	private OutputStream out;
	
	public Test1(InputStream in, OutputStream out) {
		this.in = in;
		this.out = out;
	}
	
	
	
	public static void main(String[] args) {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(System.out);
			oos.writeObject("Zaid");
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

//		PrintWriter pw = new PrintWriter(System.out);
//		BufferedWriter bw = new BufferedWriter();
//		BufferedReader br;
//		pw.write("Helloouuu");
//		pw.flush();
		
		
		Test1 t = null;
		try {
			t = new Test1(new FileInputStream(new File("src/test/text.txt")), new FileOutputStream(new File("text.txt")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			t.out.write(97);
			
			System.out.println(t.in.read());
			while (t.in.available() != 0) {
				System.out.println(t.in.read());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}