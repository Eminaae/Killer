package ba.bitcamp.task1;

public class Mani {

	public static void main(String[] args) {
		Line l = new Line(5);
		Rectangle r = new Rectangle(3, 3);

		l.drawOnConsole();
		r.drawOnConsole();

		System.out.println("Line circumference: " + l.getCircumference());
		System.out.println("Rectangle circumference: " + r.getCircumference());

		System.out.println("Line are: " + l.getArea());
		System.out.println("rectangle area: " + r.getArea());

		System.out.println(l.toString());
		System.out.println(r.toString());

		System.out.println(l.equals(r));

		Drawable[] d = new Drawable[50];

		for (int i = 0; i < 50; i++) {
			if (i % 2 != 0) {
				d[i] = new Line((int) (Math.random() * 4 + 1));
			} else {
				d[i] = new Rectangle((int) (Math.random() * 4 + 1),
						(int) (Math.random() * 4 + 1));

			}

		}

		for (int i = 0; i < 50; i++) {
			if (i % 2 != 0) {
				d[i].drawOnConsole();
				System.out.println();
			} else {
				d[i].drawOnConsole();
				System.out.println();
			}
		}
	}

}
