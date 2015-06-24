package ba.bitcamp.week06.tasks;

public class Rectangle implements Shape, Drawable {
	public int width;
	public int height;
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
					System.out.print("*");			
			}
			System.out.println("*");
		}
	}

	@Override
	public int Circumference() {

		return 2 * width + 2 * height;
	}

	@Override
	public int gerArea() {

		return width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (height != other.height) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height
				+ ", Circumference()=" + Circumference() + ", gerArea()="
				+ gerArea() + ", toString()=" + super.toString() + "]";
	}

}