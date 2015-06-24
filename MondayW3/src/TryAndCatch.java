
public class TryAndCatch {
	
	public static int divide(int a, int b){
		if(b==0){
			throw new ArithmeticException();
		}
			return a/b;
		}

	
	public static void main(String[] args) {
		try{
			System.out.println(divide(2,0));
		}catch(ArithmeticException e){
			
		System.out.println(e.getMessage());
		System.out.println("Nije moguce");
		
		}
		System.out.println("Ovo je kraj programa");
	}

}
