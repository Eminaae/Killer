package ba.bitcamp.week8.day3.vjezbe;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		   int []array = {5,8,2,1,3,0,1,7};
		    int min = 0;
		    int temp;

		    for(int i=0; i<array.length; i++)
		    {
		        min = i;
		        for(int j=i; j< array.length; j++)
		        {
		            if(array[j] < array[min])
		                min = j;

		        }
		         temp = array[i];
		         array[i] = array[min];
		         array[min] = temp;
		    }
		    System.out.println(Arrays.toString(array));
	}

}
