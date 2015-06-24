import java.util.Arrays;
import java.util.Scanner;


public class Nbrojeva {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unos max broj elemenata (min5): ");
		
		int maxBrojElemenata = Math.max(maxBrojElemenata, 5);
		int pozicija = 0;
		int[] brojevi = new int[maxBrojElemenata];
				while(true){
					int br = in.nextInt();
					if (br >= 0){
						if(pozicija < brojevi.length){
							brojevi[pozicija]=br;
							pozicija ++;
						}else{
							for (int i =1; i < brojevi.length; i++){
								brojevi [i -1] = brojevi[i];
							}
							brojevi[brojevi.length-1]=br;
							pozicija++; //da znamo koliko smo unijeli brojeva
							}
							
							/*brojevi[pozicija]=br;
						pozicija++;
						if(pozicija == brojevi.length){
							pozicija = 0;
							*/
					}else{
						break;
					}
				}System.out.println("Unijeto ukupno:" +pozicija);
				System.out.println("Zadnjih" +brojevi.length + "brojeva");
				for(int br:brojevi){
					System.out.println(br);
				}
				
				for(int idx = 0; idx <brojevi.length; idx++){
					int elementNiza = brojevi[idx];
					if(elementNiza >maxBrojElemenata){
						maxBrojElemenata=elementNiza;
					}
				}
				}
	

	}

