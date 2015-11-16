package ba.bitcamp.sport;

/**
 * This class represents ski jumping
 * @author kristina.pupavac
 *
 */
public class SkiJumping extends SkiSports {
	private String jumperName;
	private String jumpingHillName;

	/**
	 * @return the jumperName
	 */
	public String getJumperName() {
		return jumperName;
	}

	/**
	 * @param jumperName
	 *            the jumperName to set
	 */
	public void setJumperName(String jumperName) {
		this.jumperName = jumperName;
	}

	/**
	 * @return the jumpingHillName
	 */
	public String getJumpingHillName() {
		return jumpingHillName;
	}

	/**
	 * @param jumpingHillName
	 *            the jumpingHillName to set
	 */
	public void setJumpingHillName(String jumpingHillName) {
		this.jumpingHillName = jumpingHillName;
	}

}
