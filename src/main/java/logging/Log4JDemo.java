package network;

import org.apache.log4j.Logger;

public class Log4JDemo {
	public static void main(String[] args) {

		Logger myLogger = Logger.getLogger("com.darwinsys");

		// PropertyConfigurator.configure("log4j.properties");
		
		Object o = new Object();
		myLogger.info("I created an object: " + o);

	}
}
