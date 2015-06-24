import java.util.Scanner;


public class PerfectNum {

	public static void main(String[] args) {

		
		/*int input;
		int countEven = 0;
		int countOdd=0;
		do{
			input=in.nextInt();
			if(input % 2 == 0 && input!=0){
				countEven++;
			}else{
				countOdd++;	
			}
		}while(input != 0);
			
				System.out.printf("Parnih ima %d, a neparnih ima %d",countEven,countOdd);
				*/
		

	     

	      int num=28;
	      int input;
	      
	      int counter=1, s=0; // b is a counter, s is sum
	      while(counter<num ){ 
	            if(num % counter == 0){ 
	                s += counter;          
	            } counter++; 
	        }if(s == num){ 
	        	
	            System.out.println(s+" is a perfect number"); 
	        
	        } 	
		}
	}
  
 


