package ba.bitcamp.geometry;

public class Pravougaonik implements ITijelo {
	double a,b;

	/**
	 * @param a
	 * @param b
	 */
	public Pravougaonik(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double povrsina() {
		return a*b;
	}

	@Override
	public double obim() {
		return 2*(a+b);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Pravougaonik(a = %f, b = %f)", a, b);
	}

}
