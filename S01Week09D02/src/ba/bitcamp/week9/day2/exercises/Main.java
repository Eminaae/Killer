package ba.bitcamp.week9.day2.exercises;

public class Main {

	public static void main(String[] args) {
		StackInt stack = new StackInt();
		stack.push(3);
		stack.push(1);
		System.out.println(stack.empty());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		stack.push(1);
		
		

	}

}
