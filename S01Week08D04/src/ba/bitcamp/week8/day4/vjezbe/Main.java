package ba.bitcamp.week8.day4.vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

import ba.bitcamp.week8.day4.vjezbe.Employee.DateOfBirth;


public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args){
		
		ArrayList<Employee> list = new ArrayList<>();
		//Creating company
		Company c = new Company(list);
		//Creating employees
		Employee e1 = new Employee("Alma", "Atic", "F", 3000, 4, 4, 1982);
		Employee e2 = new Employee("Narena", "Ibrisimovic", "F", 4000, 8, 5, 1981);
		Employee e3 = new Employee("Ajdin", "Brkic", "M", 2000, 5, 1, 1999);
		Employee e4 = new Employee("Tea", "Mott", "F", 1500, 9, 1, 1990);
		Employee e5 = new Employee("Edin", "Tana", "M", 2555, 14, 4, 1980);
		//adding employees to the list
		list.add(e3);
		list.add(e4);
		list.add(e1);
		list.add(e2);
		list.add(e5);
		//calling methods from Company class
		c.hireEmployee(e2);
		//c.fireEmployee(e1);
		c.hasFemaleEmployees(e4);
	
		
		c.sortByAge();
		c.sortBySalary();
		c.sortByGender();
		
		c.sortByID();
		System.out.println(c.areEmployeesSortedByID());
		

		
		System.out.println(c.getEmployee(1010));
		c.addEmployees(e3, e2);
		c.addEmployeesByArray(new Employee [] { e5, e2, e3});
		c.addEmployees(new ArrayList<Employee>(Arrays.asList(e2,e3,e4)));
		
		ArrayList<Employee> lista = c.getEmployeeList();
		for (Employee empl : lista){
			System.out.println(empl);
		}
	
	
		System.out.println(c.indexOf(e2));	
		c.removeEmployee(list,1);
		System.out.println(c.indexOf(e2));	
		c.removeEmployee1(list, 1001);
		System.out.print(c);
		
		
		}
	}

