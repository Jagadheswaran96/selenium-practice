package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jUsingFileAppender {

	public static void main(String[] args) {

		Logger logger=Logger.getLogger(Log4jUsingFileAppender.class);
		//PropertyConfigurator.configure("Log4j.properties");
		PropertyConfigurator.configure("Log4j.properties");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is an error");
		logger.fatal("this is fatal");
	}

}
//Log4j.properties