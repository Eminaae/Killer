package ba.bitcamp.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StringStack {
	
	private String[] array;
	
	
	/**
	 * Constructor
	 */
	public StringStack(){
		this.array = new String[0];
	}
	
	
	public boolean isEmpty(){
		return (array.length == 0);
	}
	
	
	public String push(String item) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = item;
		return item;
	}
	
	public String pop(){
		String temp = array[array.length -1];
		array = Arrays.copyOf(array, array.length - 1);
		return temp;
	}
	
	public String peek(){
		if(array.length > 0){
		return array[array.length -1];
	}else{
		throw new EmptyStackException();
	}
	
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(array);
	}
}
