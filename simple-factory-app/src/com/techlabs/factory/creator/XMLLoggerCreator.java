package com.techlabs.factory.creator;

import com.techlabs.factory.product.ILogger;
import com.techlabs.factory.product.XMLLogger;

public class XMLLoggerCreator extends AbstractLoggerCreator {

	@Override
	public ILogger createLogger() {
		XMLLogger logger = new XMLLogger();
		return logger;
	}

}
