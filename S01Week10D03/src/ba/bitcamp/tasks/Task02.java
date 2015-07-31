package ba.bitcamp.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task02 {

	public static void main(String[] args) {
		LinkedList<PokerHand> list = new LinkedList<>();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFileChooser open = new JFileChooser();
		int action = open.showOpenDialog(null);
		if (action == JFileChooser.APPROVE_OPTION) {
			// System.out.println("File opened");
			//File f = open.getSelectedFile();
		} else if (action == JFileChooser.CANCEL_OPTION) {
			System.out.println("You canceled");
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(
					"/Users/emina.arapcic/Desktop/test.txt")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}

		try {
			int counter = 0;
			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				String line1 = null;
				while (st.hasMoreTokens()) {
					line1 = st.nextToken();
					PokerHand ph = new PokerHand(line1, line1, line1, line1, line1, line1, line1, line1, line1, line1);
					
				}
				counter++;

				//System.out.println(line1);
			}
			System.out.println("The number of lines in a file: " + counter);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
