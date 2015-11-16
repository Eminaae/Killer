package ba.bitcamp.kristina.test;

import java.util.ArrayList;

/**
 * 
 * @author kristina.pupavac
 * Class museum that contains list of empolyee, list of museum showpieces , list of worksOfArt and
 * list of artifacts
 */
public class Museum {
	ArrayList<Showpiece> showpiece;
	ArrayList<WorksOfArt> worksOfArt;
	ArrayList<Artifacts> artifacts;
	ArrayList<Employee> employee;

	/**
	 * Constructor 
	 * @param showpiece - arraylist
	 * @param worksOfArt - arraylist
	 * @param artifacts - arraylist
	 * @param employee - arraylist
	 */
	public Museum(ArrayList<Showpiece> showpiece,
			ArrayList<WorksOfArt> worksOfArt, ArrayList<Artifacts> artifacts,
			ArrayList<Employee> employee) {
		super();
		this.showpiece = showpiece;
		this.worksOfArt = worksOfArt;
		this.artifacts = artifacts;
		this.employee = employee;
	}

	/**
	 * @return the showpiece
	 */
	public ArrayList<Showpiece> getShowpiece() {
		return showpiece;
	}

	/**
	 * @param showpice
	 *            the showpiece to set
	 */
	public void setShowpiece(ArrayList<Showpiece> showpice) {
		this.showpiece = showpice;
	}

	/**
	 * @return the worksOfArt
	 */
	public ArrayList<WorksOfArt> getWorksOfArt() {
		return worksOfArt;
	}

	/**
	 * @param worksOfArt
	 *            the worksOfArt to set
	 */
	public void setWorksOfArt(ArrayList<WorksOfArt> worksOfArt) {
		this.worksOfArt = worksOfArt;
	}

	/**
	 * @return the artifacts
	 */
	public ArrayList<Artifacts> getArtifacts() {
		return artifacts;
	}

	/**
	 * @param artifacts
	 *            the artifacts to set
	 */
	public void setArtifacts(ArrayList<Artifacts> artifacts) {
		this.artifacts = artifacts;
	}

	/**
	 * @return the employee
	 */
	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
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
		Museum other = (Museum) obj;
		if (artifacts == null) {
			if (other.artifacts != null)
				return false;
		} else if (!artifacts.equals(other.artifacts))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (showpiece == null) {
			if (other.showpiece != null)
				return false;
		} else if (!showpiece.equals(other.showpiece))
			return false;
		if (worksOfArt == null) {
			if (other.worksOfArt != null)
				return false;
		} else if (!worksOfArt.equals(other.worksOfArt))
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
		String s = "Museum\n";
		s += "Showpices: " + showpiece + "\n";
		s += "WorksOfArts: " + worksOfArt + "\n";
		s += "Artifacts: " + artifacts + "\n";
		s += "Employee: " + employee + "\n";
		return s;
	}

}
