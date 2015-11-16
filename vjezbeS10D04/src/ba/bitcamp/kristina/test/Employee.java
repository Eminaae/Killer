package ba.bitcamp.kristina.test;

/**
 * 
 * @author kristina.pupavac
 * Class Employee, the employee has name and salary, class implements an interface Searchable
 */
public class Employee implements Searchable {
	//attributes
	private String name;
	private Integer salary;

	/**
	 * Constructor
	 * @param name - Employee name
	 * @param salary - Employee salary
	 */
	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
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
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee name: " + name + ", salary: " + salary;
	}

	@Override
	public boolean fitsSearch(String s) {
		if (s.equals(name)) {
			return true;
		} else if (s.equals(salary.toString())) {
			return true;
		} else

			return false;
	}

}
