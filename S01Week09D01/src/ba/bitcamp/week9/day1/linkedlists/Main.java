package ba.bitcamp.week9.day1.linkedlists;

public class Main {

	public static void main(String[] args) {
		LinkedListInt list = new LinkedListInt();
		System.out.println(list);
		
		list.add(5);
		list.add(2);
		list.add(3);
		System.out.println(list.get(0));
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
	}

}