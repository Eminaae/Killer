package ba.bitcamp.week06.tasks;

public class Main {

	public static void main(String[] args) {
		Line l = new Line(10);
		l.drawOnConsole();

		System.out.println();

		Rectangle r = new Rectangle(5, 2);
		r.drawOnConsole();

		Drawable[] d = new Drawable[50];
		for (int i = 0; i < d.length; i++) {
			if (i % 2 == 0) {
				d[i] = new Line((int) (Math.random() * 5) + 1);

			} else {
				d[i] = new Rectangle((int) (Math.random() * 5) + 1,
						(int) (Math.random() * 5) + 1);
			}

			d[i].drawOnConsole();
			System.out.println();
		}
	}
}

/*
 * r.drawOnConsole(); r.gerArea(); r.Circumference();
 * System.out.println(r.toString()); System.out.println(l.equals(r));
 */
