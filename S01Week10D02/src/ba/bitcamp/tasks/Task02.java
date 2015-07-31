package ba.bitcamp.tasks;

import java.io.PrintWriter;
import java.util.Arrays;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * char[] array = new char[25]; String s = ""; PrintWriter pw = new
		 * PrintWriter(System.out); for(char i = 25; i <= 90; i++){ int j = 0;
		 * array[j]=(char)i; pw.write(array, i, 10);
		 */
		PrintWriter pw = new PrintWriter(System.out);

		char[] buf = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z' };

		for (int i = 0; i < buf.length; i += 10) {
			try {
				pw.write(buf, i, 10);

			} catch (IndexOutOfBoundsException ex) {
				pw.write(buf, i, buf.length - i);
				pw.flush();
			}

		}

	}

}