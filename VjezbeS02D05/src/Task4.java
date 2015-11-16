
public class Task4 {
	
	public static void sayHello(String name){
		System.out.println("Hello " + name);
	}
	public static boolean isPositive (int num) {
		return (num >= 0)? true : false;
		
	}
	public static boolean isEven (int num){
		if (num % 2 == 0){
			return true;
		}
			return false;
	}
	public static boolean isPrime (int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}	
		}
		return true; 
	}

	public static void main(String[] args) {
		//sayHello("Kristina");
		boolean c = isPrime(4);
		System.out.println(c);
		
		System.out.println(isEven(10));
		boolean b = isPositive(5);
		System.out.println(b);
		System.out.println(isPositive(2));
	}

}
