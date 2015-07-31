package ba.bitcamp.week9.day2.exercises;

import java.util.EmptyStackException;

public class StackLinkedInt {
	private Node head;
	
	public StackLinkedInt(){
		head = null;
	}
	
	public boolean empty(){
		return head == null;
	}
	
	public int push(int value){
		if(head == null){
			head = new Node(value);
		}else{
			Node temp = new Node(value);
			temp.setNext(head);
			head = temp;
		}
		return value;
	}
	
	
	public int peek(){
		return head.getValue();
	}
	
	
	public int pop(){
		if(head == null){
			throw new EmptyStackException();
		}
		int temp = head.getValue();
		head = head.getNext();
		return temp;
	}
	
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value){
			this.value = value;
			next = null;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		public String toString(){	
			if(next == null){
				return value + " ";
			}
			return value + "" + next.toString();
		}
	
	}
	
	public static void main(String[] args){
		StackLinkedInt stack = new StackLinkedInt();
		System.out.println(stack.empty());
	}
}




