package ba.bitcamp.week06.D01;

public class Foo implements Compare {

	private int foones;

	public Foo(int foones) {
		this.foones = foones;
	}

	public String toString() {
		return "Foo: " + foones;
	}

	public int compare(Object o) {
		if (o instanceof Foo) {
			Foo other = (Foo) o;
			if (this.foones > other.foones) {
				return 1;
			} else if (this.foones == other.foones) {
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}