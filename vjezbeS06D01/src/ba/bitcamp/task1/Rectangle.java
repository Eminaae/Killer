package ba.bitcamp.task1;

public class Rectangle implements Shapeble, Drawable {
	private int length;
	private int width;

	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width - 1; j++) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}

	@Override
	public int getCircumference() {
		return 2 * length + 2 * width;
	}

	@Override
	public int getArea() {
		return length * width;
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
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
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
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
