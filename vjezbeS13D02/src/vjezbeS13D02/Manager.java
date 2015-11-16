package vjezbeS13D02;


public class Manager {
	private Integer employeeid;
	private String name;

	public Manager() {

	}

	/**
	 * @param employeeid
	 * @param name
	 */
	public Manager(Integer employeeid, String name) {
		super();
		this.employeeid = employeeid;
		this.name = name;
	}

	/**
	 * @return the employeeid
	 */
	public Integer getEmployeeid() {
		return employeeid;
	}

	/**
	 * @param employeeid
	 *            the employeeid to set
	 */
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Manager [employeeid=" + employeeid + ", name=" + name + "]";
	}

}
