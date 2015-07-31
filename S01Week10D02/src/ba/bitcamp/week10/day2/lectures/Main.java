package ba.bitcamp.week10.day2.lectures;

import java.io.*;
import java.util.Scanner;

public class Main {

	/**
	 * Prints all content of array
	 * 
	 * @param args
	 */

	private static void printByteArray(byte[] array) {

		for (byte b : array) {
			System.out.println((char) b);
		}
		System.out.println();
	}

	public static void partI() {

		InputStream is = null;
		OutputStream os = null;
		try {
			is = System.in; // new FileInputStream("nesto.txt");
			os = new FileOutputStream("nesto.txt", true);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		// OutputStream os = System.out;

		Reader r = new InputStreamReader(System.in); // System.in upakujemo u
														// InputStreamReader niz
														// byte
		Writer w = new OutputStreamWriter(System.out); // koristi niz char/ova

		BufferedReader br = new BufferedReader(r); // prima object
		BufferedWriter bw = new BufferedWriter(w);

		byte[] buffer = new byte[3];

		try {
			int read = 0;
			do {
				read = is.read(buffer);
				System.out.println("Procitao:" + read);
				os.write(buffer, 0, read);
			} while (is.available() > 0);

			os.write("Hello world".getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Gotovo");
	}

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("nesto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		PrintWriter pw = new PrintWriter(System.out);

		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				pw.println(line);

			}
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pw.close(); //kad zatvorimo stream ispisu se podaci

	}

}
