package predavanjeS12D02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Enter file path: ");
		Scanner input = new Scanner(System.in);

		String file = input.nextLine();

		File searchingFile = new File(file);

		if (searchingFile.isDirectory()) {

			System.out.println("Input word to serach: ");
			String word = input.nextLine();
			String line = "";
			try {
				BufferedReader reader = new BufferedReader(new FileReader(
						new File(file)));

				try {
					while ((line = reader.readLine()) != null) {
						String[] words = line.split(" ");
						System.out.println(words);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("No such file!");
		}

	}

}
