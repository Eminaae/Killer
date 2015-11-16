package predavanjaS10D03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File file = new File(input.nextLine());
		if (file.exists()) {
			try {
				FileOutputStream fos = new FileOutputStream(file);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				PrintWriter pw = new PrintWriter(file);
				pw.write(input.nextLine());
				pw.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("File not exist.");
		}
	} 
}
