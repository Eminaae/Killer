package ba.bitcamp.week06.D01;

public class Bar implements Compare {
	public static String name;

	public Bar(String name) {
		this.name = name;
	}

	public String toString() {
		return "Bar: " + name;
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Bar) {	
			int thisLength = this.name.length();
			int otherLength = other.name.length();

			if (thisLength > otherLength)
				return 1;
			else if (thisLength < otherLength)
				return -1;
			else
				return 0;

		} else {
			throw new IllegalArgumentException();
		}

	}

}