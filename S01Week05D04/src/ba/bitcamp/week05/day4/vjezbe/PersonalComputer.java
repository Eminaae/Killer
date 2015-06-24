package ba.bitcamp.week05.day4.vjezbe;

public class PersonalComputer {
	protected String os;
	private Integer ram;
	private Integer price;
	
	
	/**
	 * @param os
	 * @param ram
	 * @param price
	 */
	public PersonalComputer(String os, Integer ram, Integer price) {
		super();
		this.os = os;
		this.ram = ram;
		this.price = price;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
