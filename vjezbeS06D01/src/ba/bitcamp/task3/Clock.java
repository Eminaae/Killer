package ba.bitcamp.task3;

public class Clock implements WriteableClock {
	private int ours;
	private int minutes;
	private int seconds;

	/**
	 * @param ours
	 * @param minutes
	 * @param seconds
	 */
	public Clock(int ours, int minutes, int seconds) {
		this.ours = ours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	@Override
	public void addToFile(String filename, int format) {
		if (format == AMPM_FORMAT) {
			if (ours <= 12) {
				String s = ours + ":" + minutes + ":" + seconds + " AM";
				writeToFile(filename, s);
			} else {
				String s = ours % 12 + ":" + minutes + ":" + seconds + " PM";
				writeToFile(filename, s);
			}
		}
		if (format == AMPM_FORMAT_NO_SECONDS) {
			if (ours <= 12) {
				String s = ours + ":" + minutes + " AM";
				writeToFile(filename, s);
			} else {
				String s = ours %12 + ":" + minutes + " PM";
				writeToFile(filename, s);
			}
		} else if (format == MILITARY_FORMAT) {
			String s = ours + ":" + minutes + ":" + seconds;
			writeToFile(filename, s);
		} else if (format == MILITARY_FORMAT_NO_SECONDS) {
			String s = ours + ":" + minutes;
			writeToFile(filename, s);
		}
	}

}
