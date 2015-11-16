package predavanjaS09D02;

public class Main {

	public static void main(String[] args) {
		LinkedListInt list = new LinkedListInt();
		System.out.println(list.toString());
		
		list.addOnEnd(2);
		list.addOnEnd(6);
		
		System.out.println(list.toString());
		
		list.addOnStart(1);
		System.out.println(list.toString());

	}

}
