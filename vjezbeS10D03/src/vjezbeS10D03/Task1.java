package vjezbeS10D03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task1 {

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
			ArrayList<Employee> ee = new ArrayList<Employee>();
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			Employee e3 = new Employee();
			Employee e4 = new Employee();
			Employee e5 = new Employee();
			Employee e6 = new Employee();
			Employee e7 = new Employee();
			ee.add(e1);
			ee.add(e2);
			ee.add(e3);
			ee.add(e4);
			ee.add(e5);
			ee.add(e6);
			ee.add(e7);
			
			try {
				in.readLine();
				while (in.ready()) {
					String line = in.readLine();
					StringTokenizer st = new StringTokenizer(line, ",");

					String name = st.nextToken();
					String surname = st.nextToken();
					String gender = st.nextToken();
					String position = st.nextToken();
					int salary = Integer.parseInt(st.nextToken());
					
					for (int i = 0; i < ee.size(); i++) {
						ee.get(i).setName(name);
						ee.get(i).setSurname(surname);
						ee.get(i).setGender(gender);
						ee.get(i).setPosition(position);
						ee.get(i).setSalary(salary);
						
					}
					
					System.out.println(ee);

//					System.out.println("Name: " + name + " Surname:" + surname
//							+ " Gender: " + gender + " Positon: " + position
//							+ " Salary: " + salary);
				}
			
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
