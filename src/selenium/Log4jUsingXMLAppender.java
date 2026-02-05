package selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jUsingXMLAppender {

	static Logger logger = Logger.getLogger(Log4jUsingXMLAppender.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PropertyConfigurator.configure("Log4j.properties");
		DOMConfigurator.configure("log4j.xml");
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is an error");
		logger.fatal("this is fatal");
	}

}
