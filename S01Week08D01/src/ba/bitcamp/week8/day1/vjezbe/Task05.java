package ba.bitcamp.week8.day1.vjezbe;

public class Task05 {
	
	public static void main(String[] args){
		char[] array = {'a','l','M','a', 'D', 'y'};
		
		for (char element : array){
			if(element >= 65 && element <= 90){
				System.out.print(element);
			}
		}
	}
}
