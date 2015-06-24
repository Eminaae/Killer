package ba.bitcamp.week05.day4.vjezbe;

public class Workstation extends StationaryComputer{
	private Integer displayCount;
	private Integer coreCount;
	private Boolean hasEcc;
	
	public Integer getDisplayCount() {
		return displayCount;
	}
	public void setDisplayCount(Integer displayCount) {
		this.displayCount = displayCount;
	}
	public Integer getCoreCount() {
		return coreCount;
	}
	public void setCoreCount(Integer coreCount) {
		this.coreCount = coreCount;
	}
	public Boolean getHasEcc() {
		return hasEcc;
	}
	public void setHasEcc(Boolean hasEcc) {
		this.hasEcc = hasEcc;
	}
	

}
