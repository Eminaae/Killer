import java.util.Arrays;

/*
 * Povecati niz
 * Napisati program gdje vi, a ne korisnik, napravite jedan niz proizvoljne velicine i popunite ga sa proizvoljnim int vrijednostima. Napravite drugi, duplo vecci, niz i popunite prvih
 * pola indeksa sa vrijednostima prvoga niza. Ostatak niza će biti ispunjen nulama. Tako ste, zapravo, uradili „poveccanje“ niza.
 */
public class Task5 {

	public static void main(String[] args) {
		int [] arr = new int [5];
		int [] arr1 = new int [10];
		//unos random brojeva u niz
		for (int i = 0; i < arr.length; i++) {
			arr [i] = (int)(Math.random() * 10 + 1);
		}
		for (int j = 0; j < arr1.length; j++) {
			arr1 [j] = (int)(Math.random() * 10 + 1);
		
		}
          System.out.println(Arrays.toString(arr1));
	}

}
