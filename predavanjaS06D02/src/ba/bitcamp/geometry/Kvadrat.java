package ba.bitcamp.geometry;

public class Kvadrat extends Pravougaonik{
	public Kvadrat (double a) {
		super(a,a);
	}

	@Override
	public String toString() {
		return String.format("Kvadrat(a = %f)", a);
	}
}
