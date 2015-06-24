import java.util.Scanner;


public class maxNum {

	public static void main(String[] args) {
			System.out.println("Unesi max broj elemenata");
			Scanner in = new Scanner(System.in);
			
			int maxBrojElemenata = in.nextInt();
			System.out.println("Unesite max ");
			int[] brojevi = new int [maxBrojElemenata];
			
			for(int idx = 0; idx < brojevi.length; idx++){ //izvrsi se za 0 1 2 3 4
				int br = in.nextInt(); // privremena varijabla
				if(br > 0){
					brojevi[idx]=br;
				}else{
					break;
				}
			}
			int max = -1;
			for(int idx =0; idx < brojevi.length; idx++){//najcesca greksa ako stavimo idx <= brojevi.length;
				int elementNiza= brojevi[idx];
				
						if(elementNiza>max){
					max=elementNiza;
				}
			}
			}
		
	}


