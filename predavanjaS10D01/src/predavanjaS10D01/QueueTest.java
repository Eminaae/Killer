package predavanjaS10D01;

public class QueueTest {
	public static void main(String[] args) {
		//internally in LinkedList
		System.out.println("StringQueueComposition");
		StringQueueComposition strComp = new StringQueueComposition();
		strComp.enqueue("A");
		strComp.enqueue("B");
		strComp.enqueue("C");
		System.out.println(strComp.toString()); //
		for(int i = 0; i < 3; i++) {
		System.out.println(strComp.dequeue());
		System.out.println(strComp.size());
		}
		
		//string queue implements using inheritance
		System.out.println("\nStringQueueInheritance");
		StringQueueInheritance strInh = new StringQueueInheritance();
		strInh.enqueue("A");
		strInh.enqueue("B");
		strInh.enqueue("C");
		System.out.println(strInh.toString()); //inherited form LinkedeList
		for(int i = 0; i < 3; i++) {
		System.out.println(strInh.dequeue());
		System.out.println(strInh.size());
		}
		
	}
}
