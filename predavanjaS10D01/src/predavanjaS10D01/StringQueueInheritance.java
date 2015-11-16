package predavanjaS10D01;

import java.util.LinkedList;

public class StringQueueInheritance  extends LinkedList<String>{
	private static final long serialVersionUID = -32334703115906881L;
	
	public void enqueue (String val) {
		add(0, val);
	}
	
	public String dequeue () {
		return remove(size() - 1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
