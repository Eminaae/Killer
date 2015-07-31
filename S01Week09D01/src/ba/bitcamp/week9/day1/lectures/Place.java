package ba.bitcamp.week9.day1.lectures;

public class Place {
	
	private String name;
	private Place next;
	/**
	 * @param name
	 * @param next
	 */
	public Place(String name) {
		super();
		this.name = name;
	//	this.next = next;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Place getNext() {
		return next;
	}
	public void setNext(Place next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Place [name=" + name + ", next=" + next + "]";
	}

	
	

}
