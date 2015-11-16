package predavanjaS03D01;

public class Task2 {
	public static int divide (int a, int b) {
		if (b == 0){
			throw new ArithmeticException("Not 0");
		}
		return a/b;
	}
	public static void main(String[] args) {
		try {
		System.out.println(divide(2, 0));
		} catch (ArithmeticException e) { //samo Exception hvata bilo koju vrednost
		System.out.println(e.getMessage());
		System.out.println("Nije moguce.");
		}
		System.out.println("Ovo je krja programa.");
	}
}
