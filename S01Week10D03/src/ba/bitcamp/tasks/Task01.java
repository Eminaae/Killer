package ba.bitcamp.tasks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task01 {

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
			// System.out.println("File opened");
			File f = open.getSelectedFile();
		} else if (action == JFileChooser.CANCEL_OPTION) {
			System.out.println("You canceled");
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(new File(
					"/Users/emina.arapcic/Desktop/example.csv")));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}
		ArrayList<Employee> al = new ArrayList<>(); 
		try {
			in.readLine();
			while (in.ready()) {
				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				String name = st.nextToken();
				String surname = st.nextToken();
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();
				
				Employee e1 = new Employee(name, surname, gender, position, salary);
				al.add(e1);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
		al.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println(al);
	}
}
