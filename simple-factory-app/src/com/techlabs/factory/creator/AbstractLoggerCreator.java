package com.techlabs.factory.creator;

import com.techlabs.factory.product.ILogger;

public abstract class AbstractLoggerCreator {

	public abstract ILogger createLogger();

	public ILogger getLogger() {
		ILogger logger = createLogger();
		return logger;
	}

}
