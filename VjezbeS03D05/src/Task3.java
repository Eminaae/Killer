/*
 * Napisati metodu koja prima dva String-a i vraća String koji predstavlja nastavak drugog u prvom String- u. Koristiti indexOf i substring metode!
 * Metoda:String getTheRest(String s1, String s2) Primjeri
 * getTheRest(„BitCamp“, „Ca“)=„Camp“ 
 * getTheRest(„Boolean“, „ole“)=„olean“ 
 * getTheRest(„String“, „int“)=null 
 * getTheRest(„String“, „“)=„String“
 */
public class Task3 {
	public static String getTheRest(String s1, String s2) {
		int index = s1.indexOf(s2.charAt(0));
		String s3 = "";
		s3 = s1.substring(index, s1.length());
		return s3;
		
	}

	public static void main(String[] args) {
		System.out.println(getTheRest("BitCamp", "Ca"));

	}

}
