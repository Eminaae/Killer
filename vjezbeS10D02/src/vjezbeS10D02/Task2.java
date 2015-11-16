package vjezbeS10D02;

import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) {
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W',
				'Z', 'Q', 'X', 'Y', 'Z' };

		PrintWriter pw = new PrintWriter(System.out);

		for (int i = 0; i < letters.length; i += 10) {
			if (i == 20) {
				pw.write(letters, i, 7);
			} else {
				pw.write(letters, i, 10);
			}
		}
		pw.close();
	}

}
