package predavanjaS09D03;

public class Student implements Comparable<Student>{
	public String ime;
	
	public Student (String ime) {
		this.ime= ime;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ime;
	}



	@Override
	public int compareTo(Student o) {
		if (o != null) {
			
		}
		return ime.compareTo(o.ime);
	}
	
}
