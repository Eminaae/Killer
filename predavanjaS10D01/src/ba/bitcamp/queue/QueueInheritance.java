package ba.bitcamp.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueInheritance<E> extends LinkedList<E> {
	private static final long serialVersionUID = -8213109600773537820L;
	

	public void enqueue (E val) {
		add(0, val);
	}
	
	public E dequeue () {
		return remove(size() - 1);
	}

	
	public void enqueueAll(Collection< E> elements) {
		Iterator< E> iter = elements.iterator(); 
		while(iter.hasNext()) {
			enqueue(iter.next());
		}
	}
	
	public void enqueueAllAnySubtype(Collection<? extends E> elements) { //bilo koja klasa koja nasljedjuje E
		Iterator<? extends E> iter = elements.iterator(); 
		while(iter.hasNext()) {
			enqueue(iter.next());
		}
	}
	
	public void dequeTo (QueueInheritance<E> target) {
		while (size() > 0) {
			target.enqueue(dequeue());
		}
	}
	
	public void dequeToCollectino (Collection<E> target) {
		int size = size();
		for (int i = 0; i < size; i++) {
			target.add(dequeue());
		}
	}


	public void dequeToCollectinoAnySubType (Collection< ? super extends E> target) {
		int size = size();
		for (int i = 0; i < size; i++) {
			target.add(dequeue());
		}
	}

}
