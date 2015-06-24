import java.util.Scanner;


public class PredavanjaEmir {

	public static void main(String[] args) {
	System.out.println("Unesi max 5 brojeva, 0 za prekid unosa");
	Scanner in = new Scanner(System.in);
	int[] brojevi = new int [5];
	
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
/*	int num1 = input.nextInt();
	
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	
	int max =num1;
		if (num2>max){
			max=num2;
			System.out.println(max);	
	}if (num3>max){
		max=num3;
		System.out.println(max);	
	}if (num1>max){
		max=num1;
		System.out.println(max);	
	}
	}

	
	
}*/