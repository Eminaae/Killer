/*
 * Popravi pravopis
 * Napisati metodu koja prima jedan String, koji predstavlja jednu recenicu. Potrebno je vratiti
 * String, ali sa par popravljenih pravopisnih gresaka. Greske u pitanju su da prvo slovo nije početno i da na kraju recenice nema tacke (zanemariti ostale interpunkcijske znakove). 
 * Method name: fixSentence
 * Parameters:String sentence
 * Returns: a String that is fixed
 * Examples: fixSentence(„sky is blue“) => „Sky is blue.“
 * fixSentence(„Hello“) => „Hello.“ fixSentence(„all is good.“)=>„All is good.“
 */
public class Task6 {
	public static String fixSentence(String sentence) {

	
		String lastElement = sentence.charAt(sentence.length() - 1) + "";
		String firstLetter = sentence.charAt(0)+ "";
		String str = "";

		if (!lastElement.equals(".")) {
			String str1 = sentence.substring(1, sentence.length());
			str = firstLetter.toUpperCase() + str1 + ".";
		} else {
			String str1 = sentence.substring(1, sentence.length());
			str = firstLetter.toUpperCase() + str1;
			
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(fixSentence("all is good"));

	}

}
