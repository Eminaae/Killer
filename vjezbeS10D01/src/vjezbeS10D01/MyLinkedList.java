package vjezbeS10D01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public class MyLinkedList<T> {

	private Node start;
	private int size;

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
		 * @param value the value to set
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
		 * @param next the next to set
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
			return  value + ", " + next;
			
		}
	}

	public MyLinkedList() {
		start = null;
		size = 0;
	}

	public void add(T value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLast();

			last.next = new Node(value);
		}
		size++;
	}

	private Node getLast() {
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}
	
	public int indexOf(T value) {
		int index = 0;
		if (start == null) {
			return 0;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			index++;
			temp = temp.getNext();
		}
		return index;
	}
	
	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	private void remove (T value) {
		Node temp = start;
		for (int i = 0; i < indexOf(value); i++) {
			
			temp = temp.getNext();
			
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNext(temp.getNext());
	}
	
	public boolean contain (T value) {
		if (start.getValue().equals(value)) {
			return true;
		} else if (start.next.getValue().equals(value)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void  addAll (Collection<T> coll) {
		Iterator<T> it = coll.iterator();
		while (it.hasNext()) {
			this.add(it.next());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyLinkedList: " + start;
	}

	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("zadataks");
		
		list.add("Kristina");
		list.add("Pupavac");

		System.out.println(list.toString());
		System.out.println(list.contain("Pupavac"));
		
		list.remove("Pupavac");
		
		System.out.println(list.toString());
	
		System.out.println(list.indexOf("Kristina"));
		
		list.addAll(list1);
		
		System.out.println(list);

	}

}
