package ba.bitcamp.week9.day2.exercises;

import java.util.Arrays;
import java.util.EmptyStackException;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public class StackInt {
	
	private int[] array;
	
	public StackInt(){
		this.array = new int[0];
	}
	
	/**
	 * returns placed element
	 * @return
	 */
	public int push(int value){
		array = Arrays.copyOf(array, array.length +1);
		array[array.length -1] = value;
		return value;	
	}
	
	
	
	public boolean empty(){
		return(array.length == 0);
	}
	
	/**
	 * vrati element koji izbaci
	 */

	public int pop(){
	int temp = array[array.length -1];
	array = Arrays.copyOf(array, array.length -1);
	return temp;
	
	}
	
	public int peek() throws EmptyStackException{
		if(array.length > 0){
			return array[array.length -1];
		}else{
			throw new EmptyStackException();
		}
		
	}

	@Override
	public String toString() {
		return  Arrays.toString(array);
	}
	
	
}
