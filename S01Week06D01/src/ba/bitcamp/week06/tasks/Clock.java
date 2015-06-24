package ba.bitcamp.week06.tasks;


public class Clock implements WriteableClock{
	public int hour;
	public int minute;
	public int second;
	
	
	/**
	 * @param hour
	 * @param minute
	 * @param secunde
	 */
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	@Override
	public void writeToFile(String filename, String time) {
	
	}
	@Override
	public void addToFile(String filename, int format) {
		String formatedTime = "";
		if( format == AMPM_FORMAT ){
			String time = "AM";
			if( hour > 12 ){
				hour = hour % 12;
				time = "PM";
			}
			formatedTime = hour + ":" + minute + ":" + second;
			writeToFile(filename, formatedTime);
			
		} else if( format == AMPM_FORMAT_NO_SECONDS ){
			String time = "AM";
			if( hour > 12 ){
				hour = hour % 12;
				time = "PM";
			}
			formatedTime = hour + ":" + minute;
			writeToFile(filename, formatedTime);
			
		} else if( format == MILITARY_FORMAT){
			formatedTime = hour + ":" + minute + ":" + second;
			writeToFile(filename, formatedTime);
		} else if( format == MILITARY_FORMAT_NO_SECONDS ){
			formatedTime = hour + ":" + minute;
			writeToFile(filename, formatedTime);
		}
		
	}
}




