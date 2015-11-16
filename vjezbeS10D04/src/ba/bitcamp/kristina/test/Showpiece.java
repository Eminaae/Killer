package ba.bitcamp.kristina.test;

/**
 * 
 * @author kristina.pupavac
 * Class Showpiece implements interface Comparable and contains showpiece id, name and description 
 */
public class Showpiece implements Comparable<Showpiece>, Searchable {
	//attributes
	private Integer id;
	private String name;
	private String description;

	/**
	 * Constructor 
	 * @param id
	 * @param name
	 * @param description
	 */
	public Showpiece(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Showpiece other = (Showpiece) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		return "id: " + id + ", name: " + name + ", description: "
				+ description;
	}

	@Override
	public int compareTo(Showpiece s) {
		if (s.id.toString().equals(id.toString())) {
			return 1;
		}
		if (s.name.equals(name)) {
			return 1;
		}
		if (s.description.equals(description)) {
			return 1;
		}
		return -1;
	}

	@Override
	public boolean fitsSearch(String s) {
		if (s.equals(id.toString())) {
			return true;
		} else if (s.equals(name)) {
			return true;
		} else if (s.equals(description)) {
			return true;
		} else

			return false;
	}

}
