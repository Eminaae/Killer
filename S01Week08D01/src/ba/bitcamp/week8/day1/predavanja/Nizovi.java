package ba.bitcamp.week8.day1.predavanja;

/**
 * Sabire sve parametre koje dobije i vraca vrijednost
 * 
 * @author emina.arapcic
 *
 */

public class Nizovi {

	private static int sumParams(int... params) { // ... znaci da metoda moze
													// primiti neodredjen br
													// parametara
		// params se kasnije ponasa kao niz
		int sum = 0;
		for (int i = 0; i < params.length; i++) {
			sum += params[i];
		}
		return sum;
	}
	/**
	 * metoda uzima sve parametre, dodaje ih u string i vraca taj isti string
	 */
	
	private static String stringify(String...params){
		StringBuilder sb = new StringBuilder();
		for(String s: params){
			sb.append(s);
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		System.out.println(sumParams(1, 2, 3, 4, 5, 6));
		System.out.println(sumParams(1, 2));
		System.out.println(sumParams(1));
		System.out.println(sumParams(new int[]{1, 3, 5}));//mozemo poslati i niz
		
		System.out.println(stringify("Neki","String"));
		//System.out.println(stringify(1, 2, 3, 4, 5)); //u metodi umjesto String...params, pisemo Object...params
	}
}
