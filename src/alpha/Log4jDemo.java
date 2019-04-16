package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	public static void main(String[] args) {
		
		log.debug("I have clicked on button");
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Butotn is missing");
		

	}

}
