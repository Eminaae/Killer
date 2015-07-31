package ba.bitcamp.week10.day4.exercises;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee ("John", "Doe", "coordinator");
		Employee e2 = new Employee ("Josh", "Duwain", "coordinator");
		Employee e3 = new Employee ("Elisabet", "Haislipi", "coordinator");
		
		ArrayList<Employee> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		
		System.out.println(e1);
	
	}

}
