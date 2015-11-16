package predavanjaS10D03;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Task3 {

	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		File f = null;
		int opt = jfc.showOpenDialog(null);
		if (opt== JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}
	}

}
