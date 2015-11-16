package vjezbeS10D02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.txt")));
			
			ArrayList<Employee> e1 = (ArrayList<Employee>) ois.readObject();
			System.out.println(e1.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
