package vjezbeS10D03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Poker {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFileChooser open = new JFileChooser();

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {
			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader(open.getSelectedFile()));
			} catch (FileNotFoundException e) {
				System.out.println("Cannot find file!");
				e.printStackTrace();
			}

			int counter = 0;
			try {
				while (in.ready()) {
					String line = in.readLine();
					StringTokenizer st = new StringTokenizer(line, ",");
					String royal;
					
					while (st.hasMoreTokens()) {
						for (int i = 0; i < 10; i++) {
							st.nextToken();
						}
					     royal = st.nextToken();
					     
					     if (royal.equals("2")) {
								counter++;
							}
					}
					
					
				}
				System.out.println(counter);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
