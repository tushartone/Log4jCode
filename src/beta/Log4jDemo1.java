package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo1 {

	private static Logger log = LogManager.getLogger(Log4jDemo1.class.getName());
	public static void main(String[] args) {
		
		log.debug("Debugging the code");
		log.info("Object is present");
		log.error("object is not present");
		log.fatal("this is fatal error");
		

	}

}
