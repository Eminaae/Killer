/*
 * Pravljenje niza
* Napisati program koji će napraviti niz od deset brojeva. Popuniti taj niz sa random brojevima od 1 do 10. Isprintati taj niz na ekran preko foreach petlje.
 */
public class Task1 {

	public static void main(String[] args) {
		int [] arr = new int [10];
		//unos random brojeva u niz
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random() * 10 + 1);
		}
		//ispisivanje niza
		for (int number : arr) {
			System.out.println(number);
		}
		
	}

}
