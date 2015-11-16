package vjezbes02d01;

//Program koji ispisuje na konzolu duzinu datog pozitivnog cijelog broja n.
//Ukoliko je broj 128 onda je rezultat (duzina) 3, jer ima tri cifre.

public class Length {

	public static void main(String[] args) {
	
		int length = 1;
		int num = 123456;
		
		while (num >= 10){
			num = num / 10;
		    length ++;   
		 }	
		 System.out.println(length);	
	}

}
