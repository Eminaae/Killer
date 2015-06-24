import java.util.Scanner;


public class Task01 {
	
	public static void main(String[] args){
		Scanner num= new Scanner(System.in);
		System.out.println("Input a, b, c");
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		System.out.println(getSum(a,b,c));
	}
		
	public static int getSum(int a, int b, int c){
	
	
		int suma=0;
		int sumb=0;
		int sumc=0;
		
		for(int i=1; i<= a; i++){
			suma=suma+i;	
		} 
		for(int j=1; j < b; j++){
			sumb=suma+j;	
		}
		for(int k=1; k < c; k++){
			sumc=sumc+k;
		}return(suma+sumb+sumc);
		
	}
	
}


