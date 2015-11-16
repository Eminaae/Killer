package predavanjaS06D01;

public class Bar implements Compare {
	String name;

	/**
	 * @param name
	 */
	public Bar(String name) {
		this.name = name;
	}

	// public int compare (Bar other) {
	// int thisLength = this.name.length();
	// int otherLength = other.name.length();
	// if (thisLength > otherLength) {
	// return 1;
	// } else if (thisLength == 0) {
	// return 0;
	// } else {
	// return -1;
	// }
	// }

	public String toString() {
		String s = "";
		return s = s + "Bar: " + name;
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Bar) {
			Bar other = (Bar) o;
			int thisLength = this.name.length();
			int otherLength = other.name.length();
			if (thisLength > otherLength) {
				return 1;
			} else if (thisLength == 0) {
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

}
