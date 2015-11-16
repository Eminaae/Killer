package vjezbeS10D02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MyBufferReader {
	private InputStream is;

	/**
	 * @param is
	 */
	public MyBufferReader(InputStream is) {
		this.is = is;
	}

	public int read() {
		int n = 0;
		try {
			n = is.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public String readLine() {
		String s = "";
		try {
			do {
				s += (char)is.read();
			} while (is.available() > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

	public int read(char[] c) {
		byte[] b = new byte[c.length];
		int tmp = 0;
		try {
			tmp = is.read(b);
			for (int i = 0; i < b.length; i++) {
				c[i] = (char)b[i];
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmp;
	}

	public int read(char[] c, int start, int finish) {
		String s = c.toString();
		try {
			is.read(s.getBytes(), start, finish);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s.length();
	}



	public void close() {
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyBufferReader mbr = new MyBufferReader(System.in);
		// System.out.println((char)mbr.read());
		  // System.out.println(mbr.read(new char[5], 0, 5));
		char[] c = new char[7];
		   System.out.println(Arrays.toString(mbr.read(c)));
		   
		//System.out.println(mbr.readLine());
		mbr.close();
		
	}

}
