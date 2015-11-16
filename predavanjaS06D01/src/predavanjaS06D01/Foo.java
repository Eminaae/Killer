package predavanjaS06D01;

public class Foo implements Compare, Comparable {
	int foonest;

	/**
	 * @param foonest
	 */
	public Foo(int foonest) {
		this.foonest = foonest;
	}
//
//	public int compare (Foo other) {
//		if (this.foonest > other.foonest) {
//			return this.foonest = 1;
//		} else if (this.foonest == 0) {
//			return this.foonest = 0;
//		} else  {
//			return this.foonest = -1;
//		}
//	
//	}
	
	public String toString () {
		String s = "";
		return s = s + "Foo: " + foonest;
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Foo) {
		Foo other = (Foo)o;
		if (this.foonest > other.foonest) {
			return this.foonest = 1;
		} else if (this.foonest == 0) {
			return this.foonest = 0;
		} else  {
			return this.foonest = -1;
		}	
		} else {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public int compareTo(Object o) {
		return compare(o);
	}

}
