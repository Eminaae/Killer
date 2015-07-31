package ba.bitcamp.week10.day3.lectures;

import java.io.File;
import java.util.Scanner;

public class HomeDir {

	public static void main(String[] args) {
		
		// ****List files from home directory

		Scanner in = new Scanner(System.in);
		// returns the absolute path name of the current directory as a String.
		System.out.println(System.getProperties());

		System.out.println(System.getProperty("user.home"));

		System.out.println("Enter a dir name: ");
		String dirName = in.nextLine().trim();
		File dir = new File(dirName);
		String[] files;

		if (!dir.exists()) {
			if (!dir.isDirectory())
				System.out.println("File is not in directory");
			else
				System.out.println("Directory doesnt exist");
		} else {

			files = dir.list();
			System.out.println("Found files in dir: " + dir);

			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		}
	}
}
