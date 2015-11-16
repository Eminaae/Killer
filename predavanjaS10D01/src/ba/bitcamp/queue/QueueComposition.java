package ba.bitcamp.queue;

import java.util.LinkedList;

public class QueueComposition<E> {
	private LinkedList<E> values;
	public QueueComposition() {
		values = new LinkedList<E>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue (E val) {
		values.add(0,  val);
	}
	
	public E dequeue () {
		return values.remove(values.size() - 1);
	}
	

}
