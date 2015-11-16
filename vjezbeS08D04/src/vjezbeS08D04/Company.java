package vjezbeS08D04;

import java.util.ArrayList;

public class Company {
	private ArrayList<Employee> employee;

	/**
	 * @param employee
	 */
	public Company() {
		super();
		this.employee = new ArrayList<>();
	}

	/**
	 * 
	 * @param e
	 */
	public void hireEmployee(Employee e) {
		if (employee.contains(e)) {
			System.out.println("Employee alrady work in comapny!");
		} else {
			employee.add(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company employee: " + employee + "\n";
	}

	/**
	 * 
	 * @param e
	 */
	public void fireEmployee(Employee e) {
		if (employee.contains(e)) {
			employee.remove(e);
		} else {
			System.out.println("Employee is not working in comapny!");
		}
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public boolean isWorkingHer(Employee e) {
		for (int i = 0; i < employee.size(); i++) {
			if (e.equals(employee.get(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	public boolean hasFamelEmployees() {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getGener().equals("female")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sorting by ID
	 */
	public void sortByID() {
		for (int i = 0; i < employee.size() - 1; i++) {
			int minIndex = findSmallestId(employee, i);

			Employee temp = employee.get(i);
			employee.set(i, employee.get(minIndex));
			employee.set(minIndex, temp);
		}
	}

	/**
	 * 
	 * @param employee
	 * @param startIndex
	 * @return
	 */
	public static int findSmallestId(ArrayList<Employee> employee,
			int startIndex) {
		int minIndex = startIndex;
		for (int i = startIndex; i < employee.size(); i++) {
			if (employee.get(i).getId() < employee.get(minIndex).getId()) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * Sorting employee by age
	 */
	public void sortByAge() {
		for (int i = 0; i < employee.size() - 1; i++) {
			int minIndex = findYungestEmployee(employee, i);
			Employee temp = employee.get(i);
			employee.set(i, employee.get(minIndex));
			employee.set(minIndex, temp);
		}
	}

	/**
	 * 
	 * @param employee
	 * @param startIndex
	 * @return
	 */
	public int findYungestEmployee(ArrayList<Employee> employee, int startIndex) {
		int minIndex = startIndex;
		for (int i = startIndex; i < employee.size(); i++) {
			if (employee.get(i).getDate().getYear() < employee.get(minIndex)
					.getDate().getYear()) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * Sorting by salary
	 */
	public void sortBySalary() {
		for (int i = 1; i < employee.size(); i++) {
			Employee temp = employee.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employee.get(j).getSalary() < temp.getSalary()) {
					break;
				}
				employee.set(j + 1, employee.get(j));

			}

			employee.set(j + 1, temp);
		}

	}

	/**
	 * Sort by gender
	 */
	public void sortByGender() {
		for (int i = 1; i < employee.size(); i++) {
			Employee temp = employee.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employee.get(j).getGener().equals(temp.getGener())) {
					break;
				}
				employee.set(j + 1, employee.get(j));
			}
			employee.set(j + 1, temp);
		}
	}
	
	/**
	 * Checking is employee sorted by ID
	 * @return
	 */
	public boolean areEmployeeSortByID () {
		for (int i = 0; i < employee.size(); i++) {
		if (employee.get(i).getId() < employee.get(i+1).getId()) {
			return true;
		}
		
		}
		return false;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Employee getEmployee (int id) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getId() == id) {
				return employee.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Employee list
	 * @return
	 */
	public ArrayList<Employee> getEmployeeList () {
		return employee;
	}
	
	/**
	 * Adding employee in employee list
	 * @param e
	 */
	public void addEmployees (Employee... e) {
		for (int i = 0; i < e.length; i++) {
			employee.add(e[i]);
		}
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addEmployees1 (Employee[] e ) {
		for (int i = 0; i < e.length; i++) {
			employee.add(e[i]);
		}
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addEmployees2 (ArrayList<Employee> e) {
		for (int i = 0; i < e.size(); i++) {
			employee = e;
		}
	}
	
	/**
	 * Index of employee
	 * @param e
	 * @return
	 */
	public Integer indexOf(Employee e) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i) == e) {
				return  i;
			}
		}
       return null;
	}
	
	/**
	 * Remove employee finding by id
	 * @param id
	 */
	public void removeEmployeeID (int id) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getId() == id) {
				employee.remove(employee.get(i));
			} else {
				System.out.println("There is no employee with that ID.");
			}
		}
	}
	
	/**
	 * Remove employee finding by index
	 * @param n
	 */
	public void removeEmployeeIndex (int n) {
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i) == employee.get(n)) {
				employee.remove(employee.get(i));
			}
		}
	}
	
	/**
	 * Sort employees by name
	 */
	public void sortByName () {
		for (int i = 0; i < employee.size() - 1; i++) {
			for (int j = employee.size() - 2; j >= 0; j--) {
				if (employee.get(j).getName().compareTo(employee.get(j + 1).getName()) > 0) {
					Employee temp = employee.get(j);
					employee.set(j, employee.get(j + 1));
					employee.set(j + 1, temp);	
				}
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Employee[] getEmployeeArray () {
		Employee[] e = new Employee[employee.size()];
		for (int i = 0; i < employee.size(); i++) {
			e[i] = employee.get(i);
		}
		return e;
	}
	
	/**
	 * 
	 */
	public ArrayList<String> getNameList() {
		ArrayList<String> names = new ArrayList<>(); 
		for (int i = 0; i < employee.size(); i++) {
			names.add(i, employee.get(i).getName());
		}
		
		return names;
	}
	
}
