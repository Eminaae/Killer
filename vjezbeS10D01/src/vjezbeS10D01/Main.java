package vjezbeS10D01;

import vjezbeS10D01.Application.Editor;

public class Main {

	public static void main(String[] args) {
		Application a = new Application("A1", 1999, 10, 1024);
		
		MyLinkedList<Application> lista = new MyLinkedList<Application>();
		lista.add(a);
		System.out.println(lista.toString());
		
		MyStack<Application.Editor> stack = new MyStack<Application.Editor>();
		
		Editor e = new Editor (true, "TEXT");
		
		stack.push(e);
		
		System.out.println(stack);

	}

}
