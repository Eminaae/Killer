package ba.bitcamp.examples;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Gets only dates of birth from database.txt file
 * @author USER
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("database.txt"));

		String line = null;
		while ((line = br.readLine()) != null) {
			String[] peopleInfo = line.split(",");

			// String firstName = peopleInfo[0];
			// String lastName = peopleInfo[1];
			String dateOfBirth = peopleInfo[2];
			
			System.out.println(dateOfBirth);
			

		}

	}
}