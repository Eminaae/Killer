package ba.bitcamp.week10.day4.exercises;

import java.util.ArrayList;

/**
 * Museum class, contains Museum name, MuseumPiece list, WorkOfArt list, takes care of Artifact and employees 
 * @author emina.arapcic
 *
 */
public class Museum {
	
	private String museumName; // Museum name
	
	ArrayList <MuseumPiece> museumPiece = new ArrayList<>(); 
	ArrayList<Employee> employees = new ArrayList<>(); 
	ArrayList<Artifact> artifacts = new ArrayList<>(); 
	ArrayList<WorkOfArt> arthWorks = new ArrayList<>(); 
	
	
	/**
	 * Constructor
	 * @param museumName
	 * @param museumPiece
	 * @param employees
	 * @param artifacts
	 * @param arthWorks
	 */
	public Museum(String museumName, MuseumPiece museumPiece,
			ArrayList<Employee> employees, ArrayList<Artifact> artifacts,
			ArrayList<WorkOfArt> arthWorks) {
		super();
		this.museumName = museumName;
		this.employees = employees;
		this.artifacts = artifacts;
		this.arthWorks = arthWorks;
	}

	

	/**
	 * To String method implementation
	 */
	@Override
	public String toString() {
		return "Museum [museumPiece=" + museumPiece + ", arthWorks="
				+ arthWorks + ", artifacts=" + artifacts + "]";
	}


	/**
	 * Equals method implementation
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Museum)) {
			return false;
		}
		Museum other = (Museum) obj;
		if (arthWorks == null) {
			if (other.arthWorks != null) {
				return false;
			}
		} else if (!arthWorks.equals(other.arthWorks)) {
			return false;
		}
		if (artifacts == null) {
			if (other.artifacts != null) {
				return false;
			}
		} else if (!artifacts.equals(other.artifacts)) {
			return false;
		}
		if (museumName == null) {
			if (other.museumName != null) {
				return false;
			}
		} else if (!museumName.equals(other.museumName)) {
			return false;
		}
		if (museumPiece == null) {
			if (other.museumPiece != null) {
				return false;
			}
		} else if (!museumPiece.equals(other.museumPiece)) {
			return false;
		}
		return true;
	}
	
}
	

