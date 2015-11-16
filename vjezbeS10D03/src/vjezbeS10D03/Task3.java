package vjezbeS10D03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class Task3 {

	public static void main(String[] args) {
		JFileChooser open = new JFileChooser();

		TreeSet<Integer> list = new TreeSet<>();

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {
			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader(open.getSelectedFile()));
			} catch (FileNotFoundException e) {
				System.out.println("Cannot find file!");
				e.printStackTrace();
			}

			try {
				while (in.ready()) {
					String line = in.readLine();
					StringTokenizer st = new StringTokenizer(line, " ");

					while (st.hasMoreTokens()) {
						String s = st.nextToken();

						try {
							int num = Integer.parseInt(s);
							if (num <= 2015) {
								list.add(num);
							}

						} catch (NumberFormatException e) {

						}
					}

				}
				System.out.println(list);
				System.out.println(list.size());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
