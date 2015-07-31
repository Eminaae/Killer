package ba.bitcamp.tasks;

public class Employee {
	
	private String name;
	private String surname;
	private String gender;
	private String position;
	private String salary;
	/**
	 * @param name
	 * @param surname
	 * @param gender
	 * @param position
	 * @param salary
	 */
	public Employee(String name, String surname, String gender,
			String position, String salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  name + " " + surname + " "
				+ gender + " " + position + " " + salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
