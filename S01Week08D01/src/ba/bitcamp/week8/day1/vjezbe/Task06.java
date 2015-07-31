package ba.bitcamp.week8.day1.vjezbe;

import java.util.Arrays;


public class Task06 {
	
	private int day;
	private int month;
	private int year;
	
	
	public Task06(){
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Task06(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public static void printArray(int[] array){
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args){
		
		int [] date1 = {1,2,2003};
		String [] date2 = {"1.2.2010."};
		String [] date3 = {"1.5.2003."};
		String [] date14 = {"14.2.2003."};
		
		printArray(date1);
	}
	@Override
	public String toString() {
		return day + "." + month + "." + year
				+ ".";
	}
	
	
	

}
