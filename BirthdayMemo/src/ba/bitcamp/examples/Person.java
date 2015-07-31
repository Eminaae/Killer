package ba.bitcamp.examples;


import java.text.ParseException;
import java.util.Date;


public class Person{

	private String firstName;
	private String lastName;
	private int month; // month (between 1 and 12)
	private int day; // day (between 1 and DAYS[month]
	private int year; // year
	private String dateOfBirth;
	private DateOfBirth dateOfBirthInClass;//kada izvuces datum iz stringa proslijedi ga u konstruktor ove klase

	/**
	 * Initializes a new date from the month, day, and year.
	 * 
	 * @param month  the month (between 1 and 12)
	 * @param day the day (between 1 and 28-31, depending on the month)
	 * @param year the year
	 */

	public Person(String firstName, String lastName, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Return the month.
	 * 
	 * @return the month (an integer between 1 and 12)
	 */
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * Return the day.
	 * 
	 * @return the day (an integer between 1 and 31)
	 */
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Return the year.
	 * 
	 * @return the year
	 */
	public int year() {
		return year;
	}

	public void print() {
		System.out.println("Name: " + firstName);
		System.out.println("Date Of Birth: " + dateOfBirth);
		System.out.println("LastName: " + lastName);
	}

	/**
	 * Is this date after b?
	 * 
	 * @return true if this date is after date b; false otherwise
	 * @throws ParseException 
	 */
	/*public boolean isBornAfter(Date b){
		return compareTo(b) > 0;
	}


	/**
	 * Is this date before b?
	 * 
	 * @return true if this date is before date b; false otherwise
	 * @throws ParseException 
	 */
	/*public boolean isBornBefore(Date b) {
		return compareTo(b) < 0;
	}*/

	
	// NE ZNAM KAKO DA DATUME KOJE SAM IZDVOJILA IZ STINGA UPOREDJUJEM OVDJE
	//Ovdje bi trebala proslijediti objekat DateOfBirth klase
	private int compareTo(DateOfBirth b) {
		if(this.dateOfBirthInClass.gatEarlierDate(b).equals(b)){
			return 1; //vrati 1 ako je b ranije od objekta koji je pozvao metodu  			
		} else {
			return 0;
		}
	}

	/**
	 * Return a string representation of this date.
	 * 
	 * @return the string representation 
	 */
	public String toString() {
		String person = "First name: " + firstName + "\tLast name: " + lastName + "\tDate of birth: " + dateOfBirth	;
		return person ;
	}
	
	
 }

