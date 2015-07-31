package ba.bitcamp.week9.day2.lectures;

public class LinkedListInt {
 /**
  * IMPLEMENTACIJA STACKA
  */
	private Node start; //obj tipa linked list, start na pocetku je null

	
	public void addFront(int value){
		Node newNode = new Node(); //item je 0, next je null
		newNode.value = value; //mijenjamo value
		newNode.next = start; //u prvom slucaju ova linija je suvisna ali treba u buducnosti
		start = newNode;
	}
	
	//da li je lista prazna
	public boolean isEmpty(){
		if(start == null)
			return true;
		else 
			return false;
	}
	
	public void ispisiListu(){
		//prolazimo kroz listu od poc do kraja
		
		Node temp = start;
		while(temp != null){
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public int removeFront(){
		if(start == null)
			throw new ArrayIndexOutOfBoundsException();
		else{
			int value = start.value;
			start = start.next;
			return start.value;
		}
	}
	
	/**
	 * Inner class Node
	 * @author emina.arapcic
	 *
	 */
	private class Node{
		
		private int value;
		private Node next;
		
	}
	
	public static void main(String[] args){
		LinkedListInt lista1 = new LinkedListInt();
		lista1.addFront(5);
		lista1.addFront(7);
		lista1.addFront(2);
		//lista1.ispisiListu();
		while(!lista1.isEmpty()){
			System.out.println(lista1.removeFront() + " ");
		}
	}
}
