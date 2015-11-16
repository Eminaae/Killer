/*
 * Napisati metodu koja prima tri String-a i vraca String koji dodje prvi po abecedi, ne obracajući toliko paznju na velika i mala slova. Koristiti compareTo metodu!
 * Metoda:String getFirst(String s1, String s2, String s3) Primjeri
 * getFirst(„Bit“, „Camp“, „Java“)=„Bit“ 
 * getFirst(„Int“, „Boolean“, „Char“)=„Boolean“ 
 * getFirst(„Ajla“, „Azra“, „Aida“)=„Aida“ 
 * getFirst(„Abcd“, „Abcd“, „Bcd“)=„Abcd“
 */
public class Task2 {
	public static String getFirst(String s1, String s2, String s3) {
		int a = s1.compareTo(s2);
		int b = s3.compareTo(s1);
		int c = s2.compareTo(s3);
		if (a < 0 && b > 0) {
			return s1;
		} else if (a > 0 && b > 0 && c > 0) {
			return s3;
		} else if (a > 0 && c < 0) {
			return s2;
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(getFirst("Bit", "Camp", "Java"));

	}

}
