package vjezbeS12D01;

public class Student {
	private int id;
	private String name;
	private String faculty;
	private int semester;
	
	public Student () {
		id = 0;
		name = "";
		faculty = "";
		semester = 0;
	}

	/**
	 * @param id
	 * @param name
	 * @param faculty
	 * @param semester
	 */
	public Student(int id, String name, String faculty, int semester) {
		this.id = id;
		this.name = name;
		this.faculty = faculty;
		this.semester = semester;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
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

	/**
	 * @return the faculty
	 */
	public String getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty
	 *            the faculty to set
	 */
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}

	/**
	 * @param semester
	 *            the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}

}
