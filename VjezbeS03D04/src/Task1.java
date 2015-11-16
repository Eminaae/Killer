/*
 * Napisati metodu koja odredjuje koji je vecci broj od data dva.
 * Method name: getMax
 * Parameters:int num1, int num2
 * Returns: num1 if num1 ≥ num2, or num2 if num2 > num1 Examples: getMax(5, 2) => 5
 * getMax(2, 9)=>9 getMax(4, 4)=>4
 */
public class Task1 {
	
	public static int getMax (int num1 , int num2) {
		  int max = Math.max(num1, num2);
		  return max;
	}

	public static void main(String[] args) {
		System.out.println("Max is : ");
		System.out.println(getMax(1,2));
	}

}
