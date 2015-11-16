import ba.bitcamp.task1.Speaker;
import ba.bitcamp.task3.Anntena;
import ba.bitcamp.task4.Display;

/**
 * This class reperesents mobile phone
 * @author kristina.pupavac
 *
 */
public class Mobile {
	private String name;
	private Display display;
	private Speaker speaker;
	private Anntena anntena;
	
	/**
	 * Defalut mobile constructor
	 * @param name
	 * @param display
	 * @param speaker
	 * @param anntena
	 */
	public Mobile(String name, Display display, Speaker speaker, Anntena anntena) {
		this.name = name;
		this.display = display;
		this.speaker = speaker;
		this.anntena = anntena;
	}
	
	

}
