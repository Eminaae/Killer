package ba.bitcamp.novo;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee ("John", "Male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue", "Female", 2000);
		System.out.println(se);
		
		HourlyEmployee he = new HourlyEmployee("Joe", "Male", 15);
		System.out.println(he);

	}

}
