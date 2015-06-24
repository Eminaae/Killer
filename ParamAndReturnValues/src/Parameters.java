import java.util.Scanner;


public class Parameters {

	public static void main(String[] args) {
		//threeNPlusOne(99);
		
		System.out.println(threeNPlusOne(25));
		
	}
	public static String threeNPlusOne(int n){
		String s = n + "";
		
		while(n> 1){
			if (n % 2 ==1){
				n = 3*n +1;
				s+=","+n;
			}else
				n = n/2;
		
	}
		return s;	
	}
	public static void Test2(String [] args){
		System.out.println( "Duzina niza je" + args.length);
		for (int i = 0; i < args.length; i++){
			System.out.println (args[i]);
		}
		
	}

	}


