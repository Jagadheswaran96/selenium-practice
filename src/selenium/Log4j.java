package selenium;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j {
	//create an object for logger class without using "new" keyword, find the below:
	static Logger logger=Logger.getLogger(Log4j.class);// this is called as factory design pattern

	public static void main(String[] args) {
		//Logger logger=Logger.getLogger(Log4j.class);// this is called as factory design pattern
		BasicConfigurator.configure();
		logger.debug("this is bug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is an error");
		logger.fatal("this is fatal");

	}

}
