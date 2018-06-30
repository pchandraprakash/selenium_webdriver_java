package log4j2Reporting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConsoleLogging {
	
	private static final Logger log = LogManager.getLogger(log4j2Reporting.ConsoleLogging.class.getName());
	public static void main(String[] args) {
		log.debug("Debug message logged");
		log.error("Error message logged");
		log.fatal("Fatal message logged");
	}
}