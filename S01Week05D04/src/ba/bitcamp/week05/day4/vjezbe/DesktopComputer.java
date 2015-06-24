package ba.bitcamp.week05.day4.vjezbe;

public class DesktopComputer extends StationaryComputer {
	private Integer ramSlots;
	private Boolean isOverclock;
	private Boolean hasOpticalDrive;

	public DesktopComputer() {
		super();

	}

	/**
	 * @param ramSlots
	 * @param isOverclock
	 * @param hasOpticalDrive
	 */
	public DesktopComputer(Integer ramSlots, Boolean isOverclock,
			Boolean hasOpticalDrive) {
		super();
		this.ramSlots = ramSlots;
		this.isOverclock = isOverclock;
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public Integer getRamSlots() {
		return ramSlots;
	}

	public void setRamSlots(Integer ramSlots) {
		this.ramSlots = ramSlots;
	}

	public Boolean getIsOverclock() {
		return isOverclock;
	}

	public void setIsOverclock(Boolean isOverclock) {
		this.isOverclock = isOverclock;
	}

	public Boolean getHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(Boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

}
