package ba.bitcamp.weekend4.homework;

public class AuthorBooks {
	/**
	 * Author name
	 */
	public String name;
	/**
	 * Authors year of birth
	 */
	public Integer yearOfBirth;
	/**
	 * An array of books.
	 */
	public Book[] books;
	
	/**
	 * Constructs an object representing an author.
	 * @param name Name of the author
	 * @param yearOfBirth Year of birth
	 * @param books Books written
	 */
	public AuthorBooks(String name, Integer yearOfBirth, Book[] books) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}
	
	/**
	 * Returns a String representing authors information.
	 */
	public String toString(){
		String s = "Author: " + name + "\n";
		s += "Born: " + yearOfBirth + "\n";
		s += "*********************";
		for (int i = 0; i < books.length; i++) {
			s += "\n" + books[i] + "\n";
		}
		s += "*********************\n";
		return s;
	}
}
