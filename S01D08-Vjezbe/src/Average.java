import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		System.out.println("Type number:" );
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int i;
	    int sum=0; //  s is sum
	    for(i=9999999; i<=99999999;i++){
	    while(i < n ){ 
	            if(n % i == 0){ 
	                sum += i;          
	            } i++; 
	        }if(sum == n){ 
		
	        }
	}System.out.println(i);
	}
}
