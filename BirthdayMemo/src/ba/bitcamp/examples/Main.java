package ba.bitcamp.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		String[] lines = readArray("database.txt");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
		System.out.println(Arrays.toString(lines));
	}

	/**
	 * Takes one string representing the name of the file Copies all the
	 * information from the file to a single string and returns it.
	 * 
	 * @param String file
	 * @return String
	 */

	private static String readString(String file) {
		String text = "";
		try {
			Scanner s = new Scanner(new File(file));
			while (s.hasNextLine()) {
				text = text + s.next() + " ";
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

		return text;
	}

	/**
	 * Takes a string parameter representing the name of the file, and it will
	 * copy the contents into an array of strings.
	 * 
	 * @param String file
	 * @return String[]
	 */
	public static String[] readArray(String file) {

		int counter = 0;// Counts how many lines are in the file
		try {
			Scanner s1 = new Scanner(new File(file));
			while (s1.hasNextLine()) {
				counter++;
				s1.next();
			}
			String[] lines = new String[counter];// Creates the array and copy
													// the elements in
			Scanner s2 = new Scanner(new File(file));
			for (int i = 0; i < counter; i++) {
				lines[i] = s2.next();
			}
			return lines;

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
		return null;
	}

}