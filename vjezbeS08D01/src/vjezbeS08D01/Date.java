package vjezbeS08D01;

public class Date {
	public int day;
	public int month;
	public int year;

	/**
	 * 
	 */
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		String s = "";
		return s += day + "." + month + "." + year + ". ";
	}

	public static void main(String[] args) {
		Date[] date = {new Date(1, 2, 2001), new Date(5, 4, 2005),new  Date()};
		for (Date d : date) {
			System.out.print("Date: " + d.toString());
		}
		

	}

}
