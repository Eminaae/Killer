package ba.bitcamp.week8.day4.vjezbe;

import java.util.Date;

/**
 * Describes employees
 * @author emina.arapcic
 *
 */
public class Employee {

	private int ID;
	private String name;
	private String lastName;
	private String gender;
	private int salary;
	private DateOfBirth dob;
	private static int idCount = 1001;

	/**
	 * An empty constructor
	 */
	public Employee(){
		
	}
	/**
	 * Constructor
	 * @param name
	 * @param lastName
	 * @param gender
	 * @param salary
	 * @param dob
	 */
	public Employee(String name, String lastName, String gender, int salary,
			int date, int month, int year) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
		this.dob = new DateOfBirth(date, month, year);
		this.ID = idCount;
		idCount++;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (ID != other.ID) {
			return false;
		}
		if (dob == null) {
			if (other.dob != null) {
				return false;
			}
		} else if (!dob.equals(other.dob)) {
			return false;
		}
		if (gender == null) {
			if (other.gender != null) {
				return false;
			}
		} else if (!gender.equals(other.gender)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (salary != other.salary) {
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		String s = "";
		s = "ID " + ID + " " + name +" " + lastName + " [" + gender + "], (salary is"
				+ salary + "$), {" + dob +"}";
		return s;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public DateOfBirth getDob() {
		return dob;
	}

	/**
	 * Nested class DateOfBirth
	 * @author emina.arapcic
	 *
	 */
	public class DateOfBirth {
		private int date;
		private int month;
		private int year;

		/**
		 * Constructs DOB
		 * 
		 * @param date
		 * @param month
		 * @param year
		 */
		public DateOfBirth(int date, int month, int year) {
			super();
			this.date = date;
			this.month = month;
			this.year = year;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof DateOfBirth)) {
				return false;
			}
			DateOfBirth other = (DateOfBirth) obj;
			if (!getOuterType().equals(other.getOuterType())) {
				return false;
			}
			if (date != other.date) {
				return false;
			}
			if (month != other.month) {
				return false;
			}
			if (year != other.year) {
				return false;
			}
			return true;
		}



		@Override
		public String toString() {
			String s = "";
			s = "" + date + "-" + month + "-"
					+ year ;
			return s;
		}



		public int getDate() {
			return date;
		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}



		private Employee getOuterType() {
			return Employee.this;
		}

	}

}
