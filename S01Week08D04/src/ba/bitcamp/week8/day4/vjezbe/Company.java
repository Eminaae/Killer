package ba.bitcamp.week8.day4.vjezbe;

import java.util.ArrayList;

/**
 * Describes one Company with list of employees
 * 
 * @author emina.arapcic
 *
 */
public class Company {

	static ArrayList<Employee> employees = new ArrayList<Employee>();

	/**
	 * Constructor
	 * 
	 * @param employer
	 */
	public Company(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
	}

	/**
	 * Adds/hires employees
	 * 
	 * @param employer
	 */
	public static void hireEmployee(Employee employer) {
		if (!employees.contains(employer)) {
			employees.add(employer);
		}else{
			System.out.println("Employee is already hired");
		}
	}

	/**
	 * Removes/fires employees
	 * 
	 * @param employer
	 */
	public void fireEmployee(Employee employer) {
		if (employees.contains(employer)) {
			employees.remove(employer);
		}
	}

	/**
	 * Checks if employer is working in company
	 * 
	 * @param employer
	 * @return
	 */
	public static boolean isWorkingHere(Employee employer) {
		if (!employees.contains(employer))
			return true;
		return false;
	}

	/**
	 * Checks if employer is female
	 * 
	 * @param employer
	 * @return
	 */
	public static boolean hasFemaleEmployees(Employee employer) {
		if (!employees.equals("F"))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Company " + this.employees;
	}

	/**
	 * Sorts all employees from list by ID using selection sort algorithm
	 */
	public static void sortByID() {
		for (int i = 0; i < employees.size() - 1; i++) {
			int index = i;
			for (int j = i + 1; j < employees.size(); j++)
				if (employees.get(j).getID() < employees.get(index).getID())
					index = j;

			Employee smallerNumber = employees.get(index);

			employees.set(index, employees.get(i));
			employees.set(i, smallerNumber);
		}

	}

	/**
	 * Sorts all employees from list by age using selection sort algorithm
	 */
	public void sortByAge() {
		for (int i = 0; i < employees.size(); i++) {
			int index = 0;
			for (int j = i + 1; j < employees.size(); j++) {
				if (employees.get(j).getDob().getYear() < employees.get(index)
						.getDob().getYear()) {
					index = j;

					Employee oldest = employees.get(index);

					employees.set(index, employees.get(i));
					employees.set(i, oldest);
				}
			}
		}
	}

	/**
	 * Sorts all employees from list by salary using insertion sort algorithm
	 */
	public void sortBySalary() {

		for (int i = 1; i < employees.size(); i++) {
			Employee tmp = employees.get(i);
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employees.get(j).getSalary() < tmp.getSalary()) {
					break;
				}
				employees.set(j + 1, employees.get(j));
			}
			employees.set(j + 1, tmp);

		}

	}

	/**
	 * Sorts all employees from list by gender, first females
	 */
	
	public void sortByGender() {
		for(int i = 1; i < employees.size(); i++){
			Employee temp = employees.get(i);
			int j;
			for(j = i - 1; j >= 0; j--){
				if(employees.get(j).getGender() == temp.getGender()){
					break;
				}
				employees.set(j + 1, employees.get(j));
			}
			employees.set(j + 1, temp);
		}
		
	}

	public boolean areEmployeesSortedByID() {
		for(int i = 0; i < employees.size() -1; i++){
			if(employees.get(i).getID() > employees.get(i +1).getID())
				return false;		
		}
		return true;
		
	}

	public Employee getEmployee(int ID) {
		
		int start = 0;
		int end = employees.size() - 1;
		int middle = (start + end) / 2;
		
		while (employees.get(middle).getID() != ID) {
			if (start >= end) {
				return null;
			}
			
			if (employees.get(middle).getID() > ID) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
			middle = (start + end) / 2;
		}
		
		return employees.get(middle);
		
	}
	
	/**
	 * Returns list of employees
	 * @return
	 */
	public ArrayList<Employee> getEmployeeList(){
		return employees;
		
	}
	
	/**
	 * Adds employee to the list
	 * @param e
	 */
	public void addEmployees(Employee...e){
		for(int i = 0; i < e.length; i++){
			hireEmployee(e[i]);
		}
	}
	
	/**
	 * Adds employee to the list
	 * @param e
	 */
	public void addEmployeesByArray(Employee[] e){
		for(int i = 0; i < e.length; i++){
			hireEmployee(e[i]);
		}
	}
	
	/**
	 * Adds employee to the list
	 * @param e
	 */
	public void addEmployees(ArrayList<Employee> e){
		for(int i = 0; i < e.size(); i++){
			hireEmployee(e.get(i));
		}
	}
	
	/**
	 * Returns index of employee in the list
	 * @param employer
	 * @return
	 */
	public Integer indexOf(Employee employer){
		for(int i = 0; i < employees.size(); i++){
			if (employees.get(i).equals(employer)){
				return i;
			}	
		}
		return null;
			
	}
	
	/**
	 * Removes employee from certain index
	 * @param e
	 * @param index
	 */
	public void removeEmployee(ArrayList<Employee> e,int index){
		for(int i = 0; i < employees.size(); i++){
			fireEmployee(e.get(index));
			}
		}

	/**
	 * Removes employee with certain ID
	 * @param e
	 * @param index
	 */
	public void removeEmployee1(ArrayList<Employee> e,int ID){
		for(int i = 0; i < employees.size(); i++){
			fireEmployee(e.get(i));
			}
		}
	
	public void sortByName(){
		for (int i = 0; i < employees.size() - 1; i++) {
			for (int j = employees.size() - 2; j >= 0; j--) {
			
				
			}
		}
	}
}

	

