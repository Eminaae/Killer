package ba.bitcamp.week05.day4.vjezbe;

public class PocketPC extends PortableComputer{
	private Boolean isTouch;
	private Boolean sim;
	private Boolean microSim;
	

	public PocketPC(Boolean isTouch, Boolean sim, Boolean microSim) {
		super();
		this.isTouch = isTouch;
		this.sim = sim;
		this.microSim = microSim;
	}
	public PocketPC() {
		super(Integer weight,Integer displaySize,);
		
	}
	public Boolean getIsTouch() {
		return isTouch;
	}
	public void setIsTouch(Boolean isTouch) {
		this.isTouch = isTouch;
	}
	public Boolean getSim() {
		return sim;
	}
	public void setSim(Boolean sim) {
		this.sim = sim;
	}
	public Boolean getMicroSim() {
		return microSim;
	}
	public void setMicroSim(Boolean microSim) {
		this.microSim = microSim;
	}
	
	

}
