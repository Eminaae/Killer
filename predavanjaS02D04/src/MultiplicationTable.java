
public class MultiplicationTable {

	public static void main(String[] args) {
		
		    int num;
		    
		    System.out.print("* |  ");
		    for( int i = 1; i <10; i++) {
		    	System.out.print(" " + i + "  ");
		    }
		    System.out.println();
		    System.out.println(" _    _   _   _   _   _   _   _   _   _");
	        for (int i = 1; i < 10; i++) { 
	        	System.out.print(i + " | ");
	        	for(int j = 1; j < 10; j++) {
	        		num = i * j;
	        		
	        		System.out.printf(" %2d ", num);
	        		
	        	}
	        	
		        System.out.println();
		       
		        
	        }
		

	}

}
