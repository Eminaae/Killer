package ba.bitcamp.interface12;

public interface Adorable {
	public int CONSTANT = 0;
	
	public void print();
	public void print2(String s);
	
	default void print3() {
		System.out.println("evo printa!");
	}

}
