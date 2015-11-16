package predavanjas02d01;

public class FizzBuzzWhile {

	public static void main(String[] args) {
		int brojeva = 15;
		int brojac = 1;
		
		while (brojac <= brojeva) {
			brojac++;
	
		if (brojac % 3 == 0 && brojac % 5 ==0){
			System.out.println("FizzBuzz");
		} else if (brojac % 3 == 0) {
			System.out.println("Fizz");
		} else if (brojac % 5  == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(brojac);
		}
	}
	}

}
