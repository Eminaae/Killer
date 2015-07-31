package ba.bitcamp.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	

	/**
	 * @param firstName
	 * @param lastName
	 * @param iD
	 * @param weight
	 */
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	@Override
	public String toString() {
		return "Employee " + firstName + ", lastName " + lastName ;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ada", "Mott");
		Employee e2 = new Employee("Aida", "Mo");
		Employee e3 = new Employee("Dada", "Mo");
		
		
		
		
	}

}
