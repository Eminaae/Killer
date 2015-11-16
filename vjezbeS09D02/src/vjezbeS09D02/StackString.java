package vjezbeS09D02;

import java.util.Arrays;

public class StackString {

	String[] str;
	
	/**
	 * Constructor empty string array
	 */
	public StackString() {
		str = new String[0]; 
	}
	
	/**
	 * Checking is empty
	 * @return - true or false
	 */
	public boolean isEmpty () {
		if (str.length == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Adding element to stack
	 * @param s1 - string which is adding
	 * @return added element
	 */
	public String push (String s1) {
		str = Arrays.copyOf(str, str.length + 1);
		str[str.length - 1] = s1;
		return s1;
	}
	
	/**
	 * Removing last element form stack
	 * @return - last element in stack
	 */
	public String pop () {
		try {
		str = Arrays.copyOf(str, str.length - 1);
		
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Empty stack!");
		}
		return str[str.length - 1];
	}
	
	/**
	 * Checking which is last element in array
	 * @return - last element in array
	 */
	public String peek () {
		if (str.length == 0) {
			return null;
		}
		return str[str.length - 1];
	}
	
	/**
	 * Searching string in string array, and returning index of string in array
	 * @param s
	 * @return
	 */
	public int search (String s) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] == s) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		
		StackString stack = new StackString();
		System.out.println(stack.isEmpty());
		System.out.println(stack.push("nesto"));
		stack.push("nesto drugo");
		stack.push("string");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.search("string"));
		System.out.println(System.currentTimeMillis() - t1);
		

	}

}
