package a;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jPrac {
	private static Logger log=LogManager.getLogger(Log4jPrac.class.getName());
	//LogManager is an API and getLogger is a function in it.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("debugging");
log.info("information");
log.error("errof file");
log.fatal("fatal error");
	}

}
