package vjezbeS13D02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		BufferedReader reader;
		String line = "";
		try {
			reader = new BufferedReader(new FileReader("proba.csv"));
			reader.readLine();

			while ((line = reader.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, ",");

				list.add(new Person(Integer.parseInt(st.nextElement()
						.toString()), st.nextElement().toString(), st
						.nextElement().toString().charAt(0), Integer
						.parseInt(st.nextElement().toString())));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		ArrayList<Manager> list1 = new ArrayList<>();
		BufferedReader reader1;
		String line1 = "";
		try {
			reader1 = new BufferedReader(new FileReader("menager.csv"));
			reader1.readLine();

			while ((line1 = reader1.readLine()) != null) {
				StringTokenizer st1 = new StringTokenizer(line1, ",");

				list1.add(new Manager(Integer.parseInt(st1.nextElement()
						.toString()), st1.nextElement().toString()));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(list);

		System.out.println(list1);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == list1.get(i).getEmployeeid()) {
				System.out.println("ID: " + list.get(i).getId() + " NAME: "
						+ list.get(i).getName() + " SALARY: "
						+ list.get(i).getSalary() + " MANAGER: "
						+ list1.get(i).getName());
			}

		}

	}

}
