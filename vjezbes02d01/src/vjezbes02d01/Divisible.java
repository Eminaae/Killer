package vjezbes02d01;

//Program koji sadrzi pozitivni cijeli broj n. Ispisati sve brojeve od 1 do n koji su
//neparni i djeljivi sa tri, a nisu sa pet.

public class Divisible {

	public static void main(String[] args) {
		int n = 10;
		int num = 1;
		
		do {
			num ++;
			if (num % 2 != 0 && num % 3 == 0 && num % 5 != 0){
				System.out.println(num);
			}
			} while (num < n);
		
		
	
	}

}
