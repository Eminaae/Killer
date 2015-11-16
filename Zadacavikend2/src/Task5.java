
/*
 * Write the following methods even though you are not given precise explanations of methods:
 * a. public static int getNextOddNumber (int num)
 * and. getNextOddNumber (3) returns 5
 * ii. getNextOddNumber (4) returns 5
 * iii. getNextOddNumber (10) returns 11
 * b. public static double getAreaOfCircle (int diameter)
 * and. getAreaOfCircle (4) returns around 12:57
 * ii. getAreaOfCircle (20) returns approximately 314.16
 * iii. getAreaOfCircle (200) returns approximately 31415.93
 * c. public static boolean isInRange (int start, int finish, int n)
 * and. isInRange (1, 5, 2) returns true
 * ii. isInRange (10, 50, 55) returns false
 * iii. isInRange (1, 5, 5) returns false
 */
public class Task5 {
	//Method that prints the next odd number
	public static int getNextOddNumber(int num){
		if (num % 2 == 0) {
			num = num + 1;
		} else 
			num = num +2;
		return num;
	}
	//Method that calculated circle area 
	public static double getAreaOfCircle(int diameter) {
		return (double)(diameter / 2) * (double)(diameter / 2) * Math.PI; 
		
	}
	//Method that checks is number in the given range
	public static boolean isInRange(int start, int finish, int n) {
		boolean numIsInRange = true;
		if (start < n  && n < finish) {
			numIsInRange = true;
		} else 
			numIsInRange = false;
		return numIsInRange;
	}

	public static void main(String[] args) {
		//Printing
		System.out.println("Next odd number is: ");
		System.out.println(getNextOddNumber(3));
		
		System.out.println("Area of circle is: ");
		System.out.println(getAreaOfCircle(4));
		
		System.out.println("Number is in range: ");
		System.out.println(isInRange(1, 5, 2));
		
	}

}