package vjezbeS10D02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable{
	private String name;
	private int salary;

	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee: name: " + name + ", salary: " + salary + " KM.";
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Kristina", 1000);
		Employee e2 = new Employee("Kristina", 2000);
		
		ArrayList<Employee> ee = new ArrayList<Employee>();
		ee.add(e1);
		ee.add(e2);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(new File("employee.txt")));
			oos.writeObject(ee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
