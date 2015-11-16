
public class Main {

	public static int getSomething() {
		return 28;
	}
	public static int getSum (int a , int b) {
		return a + b;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = getSum (num1, num2);
		System.out.println(sum);
		System.out.println(getSum(10, 10));
	}
	
	

}
