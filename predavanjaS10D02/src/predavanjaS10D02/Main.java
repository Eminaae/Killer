package predavanjaS10D02;

import java.io.*; //da pricamo sa bilo cim


public class Main {

//	public static void printByteArray(byte[] array) {
//		for (byte b : array) {
//			System.out.print((char) b);
//		}
//		System.out.println();
//	}
	
	//private static void partI() {
		
		public static void main (String[] args) {
		InputStream is = null;
		//OutputStream os = null;
		try {
			is = new FileInputStream("nesto.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			Reader r = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(r);
			
			PrintWriter pw = new PrintWriter (System.out);
			
			String line = null;
			
			try {
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
			pw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			pw.close();
			
//			Writer w = new OutputStreamWriter(System.out);
//			BufferedWriter bw = new BufferedWriter(w);
			
//			byte[] buffer = new byte[3];
//			
//			try {
//				int read = 0;
//				do {
//			
//				 read = is.read();
//				System.out.print((char)is.read());
//			
//			} while(is.available() > 0);
//				
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//	
//	//}
//		}
		}
}
/*	public static void main(String[] args) {

		// InputStream is = System.in;
		OutputStream os = null;
		InputStream is = null;
		try {
			is = System.in; //new FileInputStream("nesto.txt"); //citanje iz fajle
			os = new FileOutputStream("nesto.txt", true); //upisivanje u fajl //ture da hocemo da dodjaemo na psotjeci fajle
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return;
		}
		//OutputStream os = System.out;

		Reader r = new InputStreamReader(System.in); // citanje carova
		Writer w = new OutputStreamWriter(System.out); // ispisivanje carova

		BufferedReader br = new BufferedReader(r); // prima r reader
		BufferedWriter bw = new BufferedWriter(w); // moze pisati direkt
													// stingove, ali dialje ima
													// metode koje prime niz
													// carova

		byte[] buffer = new byte[3];

		try {
			int read = 0;
			do {

				read = is.read(buffer);
				// System.out.println("Procitao: " + read);
				// printByteArray(buffer);
				os.write(buffer, 0, read);
			} while (is.available() > 0);

			String s = "Hello world";

			os.write(s.getBytes());
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Gotovo");

		// for (byte b : buffer) {
		// System.out.println((char)b);
		// }
	}
*/

