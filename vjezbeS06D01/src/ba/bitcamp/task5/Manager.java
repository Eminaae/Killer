package ba.bitcamp.task5;

public class Manager {
	private Person p;
	private Salary s;
	

	/**
	 * @param p
	 * @param s
	 */
	public Manager(Person p, Salary s) {
		this.p = p;
		this.s = s;
	}
	
	public void setSalory (int monthSalary, int day, int month, int year) {
		this.s.monthSalary = monthSalary;
		this.s.salaryDay.day = day;
		this.s.salaryDay.month = month;
		this.s.salaryDay.year = year;
		
	}
	
	public static class Person {
		String name;
		String gener;
		/**
		 * @param name
		 * @param gener
		 */
		public Person() {
			this.name = "Menager";
			this.gener = "Female";
		}
		
	}
	
	public static class Salary {
		int monthSalary;
		Date salaryDay;
		
		/**
		 * @param monthSalary
		 * @param salaryDay
		 */
		public Salary() {
			this.monthSalary = 0;
		}

		class Date {
			int day;
			int month;
			int year;
		}
	}


}
