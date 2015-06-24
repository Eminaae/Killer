package ba.bitcamp;

public class Planeta {

	private static final Integer g = 10;
	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;

	// Pravimo konstruktor CTRL SPACE source generate constructor using fields
	// ovo je defaultni konstruktor

	public Planeta(Integer tezina, Integer masa, String oblik, String ime) {
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;

	}

	public void dodajMasu(Integer dodatak) {
		this.masa += dodatak;
	}

	/**
	 * metoda za ispis vrijednosti mase
	 * 
	 * @return
	 */
	public Integer vrijednostMase() {
		return this.masa;

	}

	/**
	 * Metoda za racunanje tezine tijela
	 * 
	 * @return
	 */
	public Integer racunajTezinu() {
		this.tezina = this.masa * g;
		return this.tezina;
	}
}
