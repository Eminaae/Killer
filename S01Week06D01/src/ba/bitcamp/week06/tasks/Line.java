package ba.bitcamp.week06.tasks;

public class Line implements Shape, Drawable{
	public int width;
	
	/**
	 * @param width
	 */
	public Line(int width) {
		
		this.width = width;
	}

	@Override
	public void drawOnConsole() {
		
		for (int i = 0; i < width; i++ ){
		System.out.print("-");
		}
	}

	@Override
	public int Circumference() {
		return width;
	}

	@Override
	public int gerArea() {
		return 0;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Line)) {
			return false;
		}
		Line other = (Line) obj;
		if (width != other.width) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Line [width=" + width + ", Circumference()=" + Circumference()
				+ ", gerArea()=" + gerArea() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

	

}