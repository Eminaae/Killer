package vjezbeS09D02;

public class StackStringList {
	private Node start;

	
	/**
	 * Checking is list empty
	 * @return - true or false
	 */
	public boolean isEmpty () {
		if (start == null) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param s1
	 * @return
	 */
	public String push (String s1) {
		if (start == null) {
			start = new Node(s1);
		}
		Node temp = new Node(s1);
		temp.next = start;
		start = temp;

		return s1;
	}
	
	/**
	 * 
	 * @return
	 */
	public String pop () {
		if (start == null) {
			return " ";
		}
		String temp = start.getStr();
		start = start.next;
		
		return temp;
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String peek () {
		return start.getStr();
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public int search (String s) {
		int counter = 0;
		if (start.getStr() == s) {
			return counter;
		} 
		while (start.next.getStr() != s) {
			counter++;
		}
		return counter;
	}
	
	private class Node {
		String str;
		Node next;
		
		public Node (String str) {
			this.str = str;
		}

		/**
		 * @return the str
		 */
		public String getStr() {
			return str;
		}

		/**
		 * @param str the str to set
		 */
		public void setStr(String str) {
			this.str = str;
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
	}
	
	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		StackStringList stack = new StackStringList();
		System.out.println(stack.isEmpty());
		System.out.println(stack.push("string"));
		stack.push("string1");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
		stack.push("jos stringova");
	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search("jos stringova"));
		System.out.println(System.currentTimeMillis() - t1);
	}

}
