package vjezbeS04D01;
/**
 * dokumentacija za klasu
 * @author kristina.pupavac
 *
 */
public class Main {

	public static void main(String[] args) {
		//printHello();
		System.out.println(getMax(2, 6));

	}
//	/**
//	 * Prints "Hello" on the console.
//	 */
//	public static void printHello() {
//		System.out.println("Hello!");
//	}
	/**
	 * Deturmines <i>which</i> number is bigger.
	 * 
	 * @param a - a number
	 * @param b - b number
	 * @return Max number
	 */
	public static int getMax (int a, int b){
		return(a > b) ? a : b;
	}

}
