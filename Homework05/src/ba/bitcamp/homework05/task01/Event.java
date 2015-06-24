package ba.bitcamp.homework05.task01;
/**
 * Describes what is happening in the story.
 * @author USER
 *
 */
public class Event {
	
	/**
	 * Constants initialization
	 */
	public static final int DEFEAT = 0;
	public static final int FRIENDSHIP = 1;
	public static final int LOVE = 2;
	public static final int REVENGE = 3;
	public static final int MANIPULATION = 4;
	
	private int event;
	
	public Event(int event){
		this.event = event;
	}

	@Override
	public String toString() {
		return "Event [event=" + event + "]";
	}
	
}