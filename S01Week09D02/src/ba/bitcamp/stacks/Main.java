package ba.bitcamp.stacks;

public class Main {

	public static void main(String[] args) {
		StringStack stack = new StringStack();
		
		System.out.println(stack.push("U"));
		System.out.println(stack.push("T"));
		System.out.println(stack.push("O"));

		System.out.println(stack.pop());
		System.out.println(stack.push("V"));
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

		

	}

}
