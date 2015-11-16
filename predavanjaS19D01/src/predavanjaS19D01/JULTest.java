package predavanjaS19D01;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class JULTest {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(JULTest.class.getName()); //varti string ime pekidza
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new Formatter(){

			@Override
			public String format(LogRecord record) {
				return record.getLoggerName() + "::" + record.getMessage();
			}
			
		});
		
		log.addHandler(handler);
		doLogs(log);
		log.setLevel(Level.SEVERE);
		doLogs(log);
		
		
//		System.out.println(JULTest.class.getName());

	}
	
	private static void doLogs(Logger log) {
		log.fine("Fine logging!");
		log.info("Info logging!");
		log.warning("Warning logging!");
		log.severe("Severe logging!");
	}

}
