package vjezbeS08D04;

public class Employee {
	public static int idCounter = 1001;
	private int id;
	private String name;
	private String surname;
	private String gener;
	private int salary;
	private Date date;

	public class Date {
		private int day;
		private int month;
		private int year;

		/**
		 * @param day
		 * @param month
		 * @param year
		 */
		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}

		/**
		 * @return the day
		 */
		public int getDay() {
			return day;
		}

		/**
		 * @param day
		 *            the day to set
		 */
		public void setDay(int day) {
			this.day = day;
		}

		/**
		 * @return the month
		 */
		public int getMonth() {
			return month;
		}

		/**
		 * @param month
		 *            the month to set
		 */
		public void setMonth(int month) {
			this.month = month;
		}

		/**
		 * @return the year
		 */
		public int getYear() {
			return year;
		}

		/**
		 * @param year
		 *            the year to set
		 */
		public void setYear(int year) {
			this.year = year;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return day + "." + month + "." + year + ".";
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
			Date other = (Date) obj;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param surname
	 * @param gener
	 * @param salary
	 * @param date
	 */
	public Employee(String name, String surname, String gener, int salary,
			int day, int month, int year) {
		super();
		this.id = idCounter++;
		this.name = name;
		this.surname = surname;
		this.gener = gener;
		this.salary = salary;
		this.date = new Date(day, month, year);
	}

	/**
	 * @return the idCounter
	 */
	public static int getIdCounter() {
		return idCounter;
	}

	/**
	 * @param idCounter
	 *            the idCounter to set
	 */
	public static void setIdCounter(int idCounter) {
		Employee.idCounter = idCounter;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the gener
	 */
	public String getGener() {
		return gener;
	}

	/**
	 * @param gener
	 *            the gener to set
	 */
	public void setGener(String gener) {
		this.gener = gener;
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

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "";
		if (gener.equals("male")) {
			s += "Name and surname: " + name + " " + surname + " [M] " + gener
					+ " Salary$: " + salary + " ID: " + id + " Birth date: "
					+ date;
		} else {
			s += "Name and surname: " + name + " " + surname + " [F] " + gener
					+ " Salary$: " + salary + " ID: " + id + " Birth date: "
					+ date;
		}
		return s;
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
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (gener == null) {
			if (other.gener != null)
				return false;
		} else if (!gener.equals(other.gener))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
