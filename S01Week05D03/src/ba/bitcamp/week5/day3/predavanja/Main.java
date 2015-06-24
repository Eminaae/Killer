package ba.bitcamp.week5.day3.predavanja;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee ("John", "Male");
		System.out.println(e);
		
		Employee se = new SalaryEmployee("Sue", "Female", 1222);
		System.out.println(se);

	}

}
