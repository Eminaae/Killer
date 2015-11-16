import java.util.Arrays;

/*
 * Dva niza u jedan niz
 * Napraviti program gdje vi, a ne korisnik, napravite dva niza, proizvoljne duzine, i odmah unesete vrijednosti (npr. int[] array1 = {1, 5, 2, 3}). Napravite treci  niz sa dovoljnom 
 * velicinom da moze  prihvatiti i prvi i drugi niz. Stavite prvi, zatim i drugi niz, u taj novi niz i isprintati taj treci  niz na konzolu.
 */
public class Task7 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		// unos random brojeva u niz
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10 + 1);
		}
		int[] arr2 = new int[5];
		// unos random brojeva u niz
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 10 + 1);
		}
		int[] arr3 = new int[8];
		
		for (int i = 0; i < arr3.length - arr2.length; i++) {
			arr3[i] = arr1[i];	
		}
		for (int j = 0; j < arr3.length; j++) {		
				arr3 [j] = arr2 [j];
		}
		System.out.println(Arrays.toString(arr3));
	}

}
