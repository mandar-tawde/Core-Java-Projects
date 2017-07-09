package com.techlabs.factory.test;

import com.techlabs.factory.creator.AbstractLoggerCreator;
import com.techlabs.factory.creator.XMLLoggerCreator;
import com.techlabs.factory.product.ILogger;

public class Client {

	private void someMethodThatLogs(AbstractLoggerCreator logCreator) {
		ILogger logger = logCreator.createLogger();
		logger.log("message");
	}

	public static void main(String[] args) {

		AbstractLoggerCreator creator = new XMLLoggerCreator();
		Client client = new Client();
		client.someMethodThatLogs(creator);
	}

}
