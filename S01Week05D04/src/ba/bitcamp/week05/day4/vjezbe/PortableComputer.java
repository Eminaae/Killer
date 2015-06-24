package ba.bitcamp.week05.day4.vjezbe;

public class PortableComputer extends PersonalComputer{
	private Integer weight;
	private Integer displaySize;
	private Boolean hasWiFi;
	
	
	public PortableComputer() {
		super(os, displaySize, displaySize);
		this.weight = weight;
		this.displaySize = displaySize;
		this.hasWiFi = hasWiFi;
	}
	
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	public void setHasWiFi(Boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	public Integer getDisplaySize() {
		return displaySize;
	}
	
	public Boolean getHasWiFi() {
		return hasWiFi;
	}
}
