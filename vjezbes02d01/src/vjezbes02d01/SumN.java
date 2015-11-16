package vjezbes02d01;
//Program koji sadrzi pozitivni cijeli broj n.Sabrati sve brojeve od 1 do n i ispisati
//na konzolu rjesenje.

public class SumN {

	public static void main(String[] args) {
		int n = 8;
		int sum = 0;
		int num = 1;
		
		do {
			sum = sum + num;
			num++;
		} while (num <=  n); 
			System.out.println(sum);	

}
}
