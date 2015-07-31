package ba.bitcamp.examples;

public class DateOfBirth {

	private int day;
	private int month;
	private int year;
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public DateOfBirth(int day, int month, int year) {
		super();
		//Ovdje bi trebalo da provjeris da li je dati dan validan i ako nije bacis exception
		//Isto i za mjesec i godinu
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * Vratice ti raniji datum 
	 * @param other
	 * @return
	 */
	public DateOfBirth gatEarlierDate(DateOfBirth other){
		if(this.month < other.month){
			return this;
		} else if (this.month > other.month){
			return other;
		}
		if(this.day < other.day){
			return this;
		} else {
			return other;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof DateOfBirth))
			return false;
		DateOfBirth other = (DateOfBirth) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	
	
}