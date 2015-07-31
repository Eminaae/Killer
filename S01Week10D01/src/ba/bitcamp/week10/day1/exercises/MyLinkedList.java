package ba.bitcamp.week10.day1.exercises;

public class MyLinkedList<T> {
	
	private Node start;
	private int size;
	
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
	
	public int size() {
		return size;
	}
	
	private Node getLast() {
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
	}
	
	
	class Node {
		T value;
		Node next;
		
		public Node(T value) {
			this.value = value;
			this.next = null;
		}
	}
}