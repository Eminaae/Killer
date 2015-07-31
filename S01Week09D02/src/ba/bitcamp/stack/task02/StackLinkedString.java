package ba.bitcamp.stack.task02;

import java.util.EmptyStackException;

public class StackLinkedString {

	private Node start;
	
	public StackLinkedString(){
		start = null;
	}
	
	
	
	public String pop(){
		if(start == null){
			throw new EmptyStackException();
		}
		String temp = start.getValue();
		start = start.getNext();
		return temp;
	}
	
	
	public String push(String value){
		if(start == null){
			start = new Node(value);
		}else{
			Node temp = new Node(value);
			temp.setNext(start);
			start = temp;
		}
		return value;
		
	}
	
	
	public boolean isEmpty(){
		return (start == null);
	}
	
	public String peek(){
		return start.getValue();
	}
	
	/**
	 * NODE class
	 * @author emina.arapcic
	 *
	 */
	
	private class Node{
		private String value;
		private Node next;
		
		
	public Node(String value){
		this.value = value;
		next = null;
		}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		if(next == null){
			return value + " ";
		}
		return value + " " + next.toString();
	}
	}
}
