package b;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Prac {

	/**
	 * @param args
	 */
	private static Logger log =LogManager.getLogger(Log4j2Prac.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");

		log.info("Info");

		log.fatal("fatal error");

		log.error("error");

	}

}