package com.pcc.apicall.logging;

public class ConfigurationException extends Exception {
	private static final long serialVersionUID = 4092689866915772866L;

	public ConfigurationException() {
		super();
	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(Throwable cause) {
		super(cause);
	}
}
