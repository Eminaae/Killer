package predavanjaS09D02;


public class LinkedListInt {
	private Node start;
	
	class Node {
		int value;
		Node next;
		
	}
	
	public void addFront (int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = start;
		start = newNode;
	}
	
	public int removeFront () {
		if (start == null) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			int value = start.value;
			start = start.next;
			return value;
		}
	}
	
	public boolean isEmpty () {
		if (start == null) {
			return true;
		}
		return false;
	}
	
	public void ispisiListu () {
		Node temp = start;
		while(temp != null){
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListInt lista1 = new LinkedListInt();
		lista1.addFront(5);
		lista1.addFront(7);
		lista1.addFront(2);
		//lista1.ispisiListu();
		while(!lista1.isEmpty()){
			System.out.print(lista1.removeFront() + " ");
		}
		
	}
	
	
	
	
//	
//	Node start;
//	
//	public LinkedListInt() {
//		this.start = null;
//	}
//	
//	
//	
//	/**
//	 * @return the start
//	 */
//	public Node getStart() {
//		return start;
//	}
//
//
//
//	/**
//	 * @param start the start to set
//	 */
//	public void setStart(Node start) {
//		this.start = start;
//	}
//
//
//
//	/**
//	 * 
//	 * @param element
//	 */
//	public void addOnEnd (int element) {
//		if (start == null) {
//			start = new Node(element);
//		} else {
//			Node last = getLastNode();
//			
//			last.setNext(new Node(element));
//		}
//	}
//	
//	public void addOnStart (int element) {
//		if (start == null) {
//			start = new Node(element);
//		} else {
//			setStart(new Node(element));
//			Node temp = start;
//	
//			Node previous = getPreviousNode(temp);
//			
//			previous.setNext(temp.getNext());
//		}
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	private Node getLastNode() {
//		if (start == null) {
//			return null;
//		}
//		
//		Node temp = start;
//		while (temp.getNext() != null) {
//			temp = temp.getNext();
//		}
//		
//		return temp;
//	}
//	
//	/**
//	 * 
//	 * @param index
//	 */
//	public void remove(int index) {
//		Node temp = start;
//		for (int i = 0; i < index; i++) {
//			temp = temp.getNext();
//		}
//		
//		Node previous = getPreviousNode(temp);
//		
//		previous.setNext(temp.getNext());
//	}
//	
//	/**
//	 * 
//	 * @param n
//	 * @return
//	 */
//	public Node getPreviousNode(Node n) {
//		if (n == start) {
//			return null;
//		}
//		
//		Node temp = start;
//		while (temp.getNext() != n) {
//			temp = temp.getNext();
//		}
//		
//		return temp;
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		if (start == null) {
//			return "The list is empty";
//		}
//		return start.toString();
//	}
//
//
//
//	public class Node {
//		int value;
//		Node next;
//		
//		/**
//		 * @param value
//		 */
//		public Node(int value) {
//			this.value = value;
//		
//		}
//
//		/**
//		 * @return the value
//		 */
//		public int getValue() {
//			return value;
//		}
//
//		/**
//		 * @param value the value to set
//		 */
//		public void setValue(int value) {
//			this.value = value;
//		}
//
//		/**
//		 * @return the next
//		 */
//		public Node getNext() {
//			return next;
//		}
//
//		/**
//		 * @param next the next to set
//		 */
//		public void setNext(Node next) {
//			this.next = next;
//		}
//
//		/* (non-Javadoc)
//		 * @see java.lang.Object#toString()
//		 */
//		@Override
//		public String toString() {
//			if (next == null) {
//				return value + "";
//			}
//			return  value  + " "+ next.toString();
//		}
//	}

}
