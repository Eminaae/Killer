package ba.bitcamp.week10.day4.exercises;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Employee class describes employees in Museum with first and last name, position as well
 * @author emina.arapcic
 *
 */
public class Employee implements Searchable{
	
	private String firstName;
	private String lastName;
	private String position;
	
	/**
	 * Constructor, construct employee
	 * @param firstName - employee first name
	 * @param lastName - employee last name
	 * @param position - employee position in Museum
	 */
	public Employee(String firstName, String lastName, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
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


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	/**
	 * Equals method implementation
	 */
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
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (position == null) {
			if (other.position != null) {
				return false;
			}
		} else if (!position.equals(other.position)) {
			return false;
		}
		return true;
	}

	/**
	 * To String method implementation
	 */
	@Override
	public String toString() {
		return  "Employee: " + firstName +  lastName + "Job: "+ position ;
				
	}

	/**
	 * Implemented searchable interface fitSearch method
	 */
	@Override
	public boolean fitsSearch(String s) {
		if(this.firstName.equals(s))
		return true;
		return false;
	}
	
}
