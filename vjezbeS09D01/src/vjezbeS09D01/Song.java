package vjezbeS09D01;

public class Song {
	public static final int ROCK = 0;
	public static final int POP = 1;
	public static final int RNB = 2;
	
	private String name;
	private String author;
	private int year;
	private int gener;
	
	/**
	 * @param name
	 * @param author
	 * @param year
	 * @param gener
	 */
	public Song(String name, String author, int year, int gener) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
		this.gener = gener;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the gener
	 */
	public int getGener() {
		return gener;
	}

	/**
	 * @param gener the gener to set
	 */
	public void setGener(int gener) {
		this.gener = gener;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (gener != other.gener)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "";
		s += "Song: name: " + name + ", author: " + author + ", year: " + year;
		if (gener == 0) {
			s += " gener: ROCK";
		} else if (gener == 1) {
			s += " gener: POP";
		} else {
			s += " gener: RNB";
		}
		return s;
				
	}
}
