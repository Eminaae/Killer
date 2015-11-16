
/*
 * Create a class Movie that represents movies. Make the constructor who has all the attributes and make the
 * toString () method, which must include every attribute in a string that comes back. In main method create
 * two Movie object, with values taken from arbitrary films. Besides it is necessary to demonstrate the operation
 * of your toString () method so you print out both objects on the console. The class should contain the following
 * attributes, which you need to determine which are the type:
 */
public class Task6 {

	public static void main(String[] args) {
	    /*Constructor 
	     * Movie (String name, Integer year, String director, String genere, Double imdb, Boolean oscar)
	     */
		Movie movie1 = new Movie("Fight Club", 1999, "David Fincher", "Drama", 8.9, false);
		Movie movie2 = new Movie ("A Beautiful Mind", 2001, "Ron Howard", "Biography, Drama ", 8.2, true);
		
		// Printing 
		System.out.println(movie1);
		System.out.println(movie2);

	}

}