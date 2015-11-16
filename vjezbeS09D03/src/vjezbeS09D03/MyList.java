package vjezbeS09D03;

import java.util.Collection;
import java.util.Iterator;

public class MyList implements Collection <MyList> {
	Node start;
	
	public class Node {
		int value;
		Node next;
		
		public Node (int value) {
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(int value) {
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

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			if (next == null) {
				return value + ""; 
			}
			return value + " " + next.toString();
		}
		
		
	}
	
	public MyList () {
		this.start = null;
	}
	
	public void add(int element) {
		if (start == null) {
			start = new Node(element);
		} else {
			Node last = getLastNode();
			
			last.setNext(new Node(element));
		}
	}
	
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		
		return temp;
	}

	
	@Override
	public int size() {
		int counter = 1;
		if (start == null) {
			return 0;
		}
		Node temp = start;
		while (temp.getNext() != null) {
			counter++;
			temp = temp.getNext();
		}
		return counter;
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<MyList> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		for (int i = 0; i < size(); i++) {
			array[i] = start.next.getValue();
		}
		return array;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(MyList e) {
		for (int i = 0; i < e.size(); i++) {
			e.add(i);
		}	
		return true;
	}

	@Override
	public boolean remove(Object o) {
		
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends MyList> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		start = null;
		
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		return "MyList [" + start.toString() + "]";
	}

	public static void main(String[] args) {
		MyList list = new MyList();
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		MyList list1 = new MyList();
		list1.add(6);
		list1.add(5);
		list.add(list1);
		
		list.toString();

	}

}
