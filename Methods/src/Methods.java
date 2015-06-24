
public class Methods {

	public static void sayHello(String name) {//ne vraca nista jer je void
		System.out.println("Hello" +name);

	}
	public static boolean isPositive(int num){//vraca poy vrijednost 
		return (num>=0)? true : false;
	}
	
	//public static void main(String[] args){
		
	public static boolean isPrime (int num){
		//2.3.5.7
		for(int i=2;i<=num; i++){
			if(num%i==0)
				return false;
		}
	return true;
	}
}
			
		
