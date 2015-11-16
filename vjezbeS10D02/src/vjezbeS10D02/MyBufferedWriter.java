package vjezbeS10D02;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {
	private OutputStream os;

	/**
	 * @param os
	 */
	public MyBufferedWriter(OutputStream os) {
		this.os = os;
	}

	public void write(char c) {
		try {
			os.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(int n) {
		try {
			byte[] bytes = String.valueOf(n).getBytes();
			os.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String s) {
		try {
			os.write(s.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void newLine() {
		try {
			os.write("\r\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void flush() {
		try {
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyBufferedWriter mbw = new MyBufferedWriter(System.out);
		mbw.write('A');
		mbw.newLine();
		mbw.write(3);
		mbw.newLine();
		mbw.flush();
		mbw.write("Kristina");
		mbw.close();

	}

}
