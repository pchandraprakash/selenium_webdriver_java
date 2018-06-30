package log4j2Reporting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	
	private static final Logger log = LogManager.getLogger(log4j2Reporting.Log4jDemo.class.getName());
	public static void main(String[] args) {
		log.debug("Debug message logged");
		log.error("Error message logged");
	}
}