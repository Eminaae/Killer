package vjezbeS12D01;

public class Msg {
	private String name;
	private String timeStamp;
	private String message;

	public Msg() {
		name = "";
		timeStamp = "";
		message = "";
	}

	/**
	 * @param name
	 * @param timeStamp
	 * @param message
	 */
	public Msg(String name, String timeStamp, String message) {
		super();
		this.name = name;
		this.timeStamp = timeStamp;
		this.message = message;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp
	 *            the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
