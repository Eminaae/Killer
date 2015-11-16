package ba.bitcamp.kristina.test;

/**
 * 
 * @author kristina.pupavac
 * Class WorksOfArt extends Showpiece and contains worksofart autor and course in art 
 */
public class WorksOfArt extends Showpiece {
	//attributes
	private String autor;
	CourseInArt course;

	public enum CourseInArt {
		RENIASSANCE, NEOCLASSICISM, MODERN, CONTEMPORARY_ART
	};
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 * @param autor
	 * @param course
	 */
	public WorksOfArt(int id, String name, String description, String autor,
			CourseInArt course) {
		super(id, name, description);
		this.autor = autor;
		this.course = course;
	}

	/**
	 * @return the course
	 */
	public CourseInArt getCourse() {
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(CourseInArt course) {
		this.course = course;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorksOfArt other = (WorksOfArt) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Autor: " + autor + ", Course in art: " + course;
	}

}
