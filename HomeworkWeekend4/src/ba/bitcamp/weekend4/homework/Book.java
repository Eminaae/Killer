package ba.bitcamp.weekend4.homework;

public class Book {
	/**
	 * Books name.
	 */
	public String name;
	/**
	 * Year it was published in.
	 */
	public Integer yearPublished;
	/**
	 * Genre of the book.
	 */
	public String genre;
	/**
	 * True if it is a bestseller.
	 */
	public Boolean isBestseller;
	
	/**
	 * Constructs an object representing a book.
	 * @param name Book name
	 * @param yearPublished Year when book was published in
	 * @param genre Genre
	 * @param isBestseller True if its a bestseller
	 */
	public Book(String name, Integer yearPublished, String genre,
			Boolean isBestseller) {
		super();
		this.name = name;
		this.yearPublished = yearPublished;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
	
	/**
	 * Returns a String representing books infos.
	 */
	public String toString(){
		String s = "Name: " + name + "\n";
		s += "Published: " + yearPublished + "\n";
		s += "Genre: " + genre + "\n";
		s += "Is bestseller: " + isBestseller;
		return s;
	}
}
