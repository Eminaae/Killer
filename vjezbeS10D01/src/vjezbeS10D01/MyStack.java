package vjezbeS10D01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class MyStack<T> {
	private Node start;

	/**
	 * @param start the start to set
	 */
	public void setStart(Node start) {
		this.start = start;
	}

	class Node {
		T value;
		Node next;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}

		/**
		 * @return the value
		 */
		public T getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(T value) {
			this.value = value;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "" + value + ", " + next;
		}
	}

	public int search(T value) {
		int counter = 0;
		if (start.getValue() == value) {
			return counter;
		}
		while (start.next.getValue() != value) {
			counter++;
		}
		return counter;
	}
	
	public T push (T t) {
		if (start == null) {
			start = new Node(t);
		} else {
		Node temp = new Node(t);
		temp.next = start;
		start = temp;
		}
		return t;
	}
	
	public T pop () {
		if (start == null) {
			return start.getValue();
		}
		T temp = start.getValue();
		start = start.next;
		
		return temp;	
	}
	
	public T peek () {
		return start.getValue();
	}
	
	public void  addAll (Collection<T> coll) {
		Iterator<T> it = coll.iterator();
		while (it.hasNext()) {
			this.push(it.next());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyStack: " + start;
	}

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<>();
		ArrayList<String> list = new ArrayList<>();
		list.add("zadatak");
		
		stack.push("Kristina");
		stack.push("Pupavac");
		stack.push("BitCamp");
		System.out.println(stack.toString());
		stack.pop();
		
		System.out.println(stack.toString());
		
		System.out.println(stack.search("Kristina"));
		
		System.out.println(stack.peek());
		
		stack.addAll(list);
		
		System.out.println(stack);
		
		
	}
}
