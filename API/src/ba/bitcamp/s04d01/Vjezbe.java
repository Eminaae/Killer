package ba.bitcamp.s04d01;

public class Vjezbe {

	public static void main(String[] args) {
		System.out.println(getMax(55,22));

	}
	/**
	 * Determines which <b> number </b> is bigger.
	 * @param a - a number
	 * @param b - b number
	 * @return Max number
	 */
public static int getMax(int a, int b){
	return (a > b)? a:b;
}
}
