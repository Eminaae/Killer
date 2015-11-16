package vjezbeS04D01;
/*
 * Napisati program koji ispise sve neparne brojeve od 1 do 1000 na konzolu, svaki broj u zasebnu liniju. Zapakovati predhodni program u jar i pokrenuti ga preko 
 * command line-a. Pokrenuti ga na taj nacin da ispise i u file sta ispise na konzolu.
 * Napisati program koji ucitaje args parametar, koji ce zapravo imati u sebi te neparne brojeve, i ispisati na konzolu iste te brojeve, ali one koji su djeljivi i 
 * sa 5. Zapakovati program u jar file i pokrenuti ga preko command line-a, ali ga pokrenuti na taj nacin da args bude ucitan iz file-a, tj. onog kojeg se napravili
 * sa predhodnim podzadatkom.
 */
public class Task7 {

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
