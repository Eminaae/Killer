package vjezbeS08D04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee ("Kristina", "Pupavac", "female", 100, 22, 6, 1987);
		Employee e2 = new Employee ("Ajla", "El Tabari", "female", 700, 5, 7, 1984);
		Employee e3 = new Employee ("Gordan", "Masic", "male", 500, 10, 6, 1990);
		Employee e4 = new Employee ("Medina", "Banjic", "female", 400, 6, 5, 1993);
		
		Company c = new Company ();
//		c.hireEmployee(e1);
//		c.hireEmployee(e2);
//		c.hireEmployee(e4);
//		c.hireEmployee(e3);
//		
//		System.out.println(c.isWorkingHer(e1));
//		System.out.println(c.toString());
//        
//		//c.fireEmployee(e1);
//	
//		
//		System.out.println(c.isWorkingHer(e1));
//		System.out.println(c.toString());
//        System.out.println(c.hasFamelEmployees());
//        
//        c.sortByID();
//        System.out.println(c.toString());
//        
//        System.out.println(c.areEmployeeSortByID());
//        
//        c.sortByAge();
//        System.out.println(c.toString());
//        
//        c.sortBySalary();
//        System.out.println(c.toString());
//        
//        c.sortByGender();
//        System.out.println(c.toString());
//        
//        System.out.println(c.getEmployee(1001));
//        
//        for (Employee e : c.getEmployeeList()) {
//        	System.out.println(e);
//        }
//        
//        c.addEmployees(e1, e2, e3);
        
		//c.addEmployees1(new Employee[] {e1, e2, e3});
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		c.addEmployees2(list);
		
		for (Employee e : c.getEmployeeList()) {
        	System.out.println(e);
        }
		
		System.out.println(c.indexOf(e1));
		
		//c.removeEmployeeID(1001);
		//c.removeEmployeeIndex(0);
		
		c.sortByName();
		for (Employee e : c.getEmployeeList()) {
        	System.out.println(e);
        }
		
	     System.out.println(Arrays.toString(c.getEmployeeArray()));
        
		System.out.println(c.getNameList());
        
	}

}
