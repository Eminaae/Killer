package ba.bitcamp.queue;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		QueueComposition<Integer> queueInt = new QueueComposition<Integer>();
		queueInt.enqueue(3);
		queueInt.enqueue(3);
		queueInt.enqueue(3);

		for (int i = 0; i < 3; i++) {
			System.out.println(queueInt.dequeue());
			System.out.println(queueInt.size());
		}
		
		//test enqueAll
		
		HashSet<Integer> intSet = new HashSet<Integer>();
		intSet.add(10);
		intSet.add(11);
		//queueInt.enqueueAll(nums);
		
		//test dequeTo
	
	  
		//test Number queue
		System.out.println("Using base class Number as type");
		QueueInheritance<Number> nums = new QueueInheritance<Number>();
		nums.enqueue(1);
		nums.enqueue(10L);
		nums.enqueue(20.12);
		System.out.println("Mixed number queue:" + nums);
		
		//cannot pass Collection<Integer> where expected 
		//nums.enqueueAll(numSet);
		;
		
		//unless use ? extends" to note Collection of any subclass
		nums.enqueueAllAnySubtype(intSet);
		
		//in oposite direction  - try to dequeueTo queue of integers to Collection
		HashSet<Number> numSet = new HashSet<Number> ();
		ints.dequeToCollection(numSet);
	}
}
