package predavanjaS12D04;

public class Message {

	private String sender;
	private String content;

	public Message(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMessage() {
		return String.format("%s : %s\n" , sender, content);
	}

}
