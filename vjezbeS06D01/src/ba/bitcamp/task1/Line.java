package ba.bitcamp.task1;

public class Line implements Shapeble, Drawable {
	private int length;

	/**
	 * @param length
	 */
	public Line(int length) {
		this.length = length;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("* ");
		}
		System.out.println();

	}

	@Override
	public int getCircumference() {
		return length;
	}

	@Override
	public int getArea() {
		return 0;
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
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Line [length=" + length + "]";
	}

}
