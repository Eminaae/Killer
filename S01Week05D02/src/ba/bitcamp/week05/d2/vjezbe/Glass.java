package ba.bitcamp.week05.d2.vjezbe;

public class Glass {
	/**
	 * Attributes describing glass
	 */
	private String typeOfLiquid;
	private int currentCapacity;
	private int maxCapacity;

	/**
	 * Constructor initialize parameters to certain values
	 * 
	 * @param typeOfLiquid
	 * @param currentCapacity
	 * @param maxCapacity
	 */
	public Glass(String typeOfLiquid, int currentCapacity, int maxCapacity) {
		this.typeOfLiquid = null;
		this.currentCapacity = 0;
		this.maxCapacity = maxCapacity;

	}
	/**
	 * Returns type of liquid in the glass
	 * @return typeOfLiquid
	 */
	public String getTypeOfLiquid() {
		return typeOfLiquid;
	}
	/**
	 * Returns maximal glass capacity
	 * @return maxCapacity
	 */
	public int getMaxCapacity(){
		return maxCapacity;
	}
	/**
	 * Returns current glass capacity
	 * @return currentCapacity
	 */
	public int getCurrentCapacity(){
		return currentCapacity;
	}
	
	/**
	 * Adds some other liquid, some quantity to the glass
	 * @param otherTypeOfLiquid
	 * @param otherLiquid
	 */
	public void addTypeOfLiquid(String otherTypeOfLiquid, int otherLiquid) {
		if (otherTypeOfLiquid.equals(typeOfLiquid)) {
			currentCapacity += otherLiquid;
			if (currentCapacity > maxCapacity) {
				otherLiquid = currentCapacity;
			}
		}
	}
	
	/**
	 * Spill all liquid
	 */
	private void emptyGlass() {
		typeOfLiquid = null;
		currentCapacity = 0;
		}	
	}


