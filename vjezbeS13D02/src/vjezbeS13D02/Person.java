package vjezbeS13D02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Person {
	private Integer id;
	private String name;
	private char g;
	private Integer salary;

	/**
	 * 
	 */
	public Person() {

	}

	/**
	 * @param id
	 * @param name
	 * @param g
	 * @param salary
	 */
	public Person(Integer id, String name, char g, Integer salary) {
		this.id = id;
		this.name = name;
		this.g = g;
		this.salary = salary;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the g
	 */
	public char getG() {
		return g;
	}

	/**
	 * @param g
	 *            the g to set
	 */
	public void setG(char g) {
		this.g = g;
	}

	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", g=" + g + ", salary="
				+ salary + "]";
	}

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

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).salary > 5000) {
				System.out.println(list.get(i));
			}
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).id > 2 && list.get(i).salary < 1000) {
				System.out.println(list.get(i));
			}
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name + " " +  list.get(i).salary);
		}

	}

}
