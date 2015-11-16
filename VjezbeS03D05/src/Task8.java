import java.util.Arrays;

/* 
 * Napisati metodu koja prima jedan String, koji predstavlja ime file-a. Ucitati iz tog file-a niz, koristeci TextIO i eof, i vratiti taj niz iz spomenute metode, pri tome
 * obraccajuci paznju na moguci exception koji se moze desiti ako trazeno  file ne postoji. Dobro obratiti pažnju na duzinu niza, jer dužina niza nije precizirana prije unosa
 * elemanata niza. Moguce je napraviti jedan niz, odredjene dužine, i onda povecati ga ukoliko bude potrebno.
 * Metoda:int[] getArray3(String filename)
 */
public class Task8 {
	public static int[] getArray3(String filename){
		try {
			int lenght = 0;
			TextIO.readFile(filename);
			while (!TextIO.eof()) {
				TextIO.getln();
				lenght++;
			}
			TextIO.readFile(filename);
			int[] array = new int[lenght];
			for (int i = 0; i < array.length; i++) {
				array[i] = TextIO.getlnInt();
			}
			return array;
			
		} catch (Exception e) {
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray3("text.txt")));

	}

}
