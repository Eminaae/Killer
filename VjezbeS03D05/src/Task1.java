/*
 * Napisati metodu koja spaja dva data String-a na sljedeci nacin: Prvi String staviti u sredinu drugog String- a. Koristiti concat i substring metode!
 * Metoda:String merge(String s1, String s2)
 * Primjeri
 * merge(„Java“, „Srce“)=„SrJavace“ 
 * merge(„int“, „int“)= „iintnt“ 
 * merge(„pamet“, „“)=„pamet“ 
 * merge(„“, „glava“)=„glava“
 */
public class Task1 {
	public static String merge (String s1, String s2) {
		
		String s3 = "";
		s3 = s2.substring(0, 2).concat(s1 + s2.substring(2, s2.length()));
		
		return s3;
		
	}

	public static void main(String[] args) {
		System.out.println(merge("Java", "Srce"));

	}

}
