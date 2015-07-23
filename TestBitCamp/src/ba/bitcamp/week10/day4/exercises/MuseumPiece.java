package ba.bitcamp.week10.day4.exercises;

import java.util.ArrayList;

public class MuseumPiece implements Comparable, Searchable{

	private int id;
	private String name;
	private String description;
	
	
	/**
	 * Constructor constructs MuseumPiece
	 * @param id - MuseumPiece ID
	 * @param name - 
	 * @param description
	 */
	public MuseumPiece(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public String toString() {
		return "MuseumPiece [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MuseumPiece)) {
			return false;
		}
		MuseumPiece other = (MuseumPiece) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}




	/**
	 * Compare to method
	 */

	@Override
	public int compareTo(Object o) {
		
		return this.name.compareTo(this.getName());
	}


	/**
	 * Implemented searchable interface method
	 * @param s
	 * @return
	 */
	@Override
	public boolean fitsSearch(String s) {
		if(this.getName().equals(s))
			return true;
			return false;
	}

	
	
	
}
