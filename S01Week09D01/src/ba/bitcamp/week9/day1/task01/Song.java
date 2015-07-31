package ba.bitcamp.week9.day1.task01;

public class Song {
	
	private static final int POP = 1;
	private static final int ROCK = 2;
	private static final int POP_ROCK = 3;
	private String name;
	private String authorName;
	private int year;
	public int length;
	/**
	 * @param name
	 * @param authorName
	 * @param year
	 */
	public Song(String name, String authorName, int year) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.year = year;
	}
	@Override
	public String toString() {
		return  name + ", " + authorName + ", "
				+ year ;
	}
	
	

}
