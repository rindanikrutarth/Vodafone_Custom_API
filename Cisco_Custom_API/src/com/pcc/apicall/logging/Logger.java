package com.pcc.apicall.logging;

public class Logger {
	private static ILogger logger = null;

	public static void logError(String strModule, String strMessage) {
		logger.error(strModule, strMessage);
	}

	public static void logDebug(String strModule, String strMessage) {
		logger.debug(strModule, strMessage);
	}

	public static void logInfo(String strModule, String strMessage) {
		logger.info(strModule, strMessage);
	}

	public static void logWarn(String strModule, String strMessage) {
		logger.warn(strModule, strMessage);
	}

	public static void logFatal(String strModule, String strMessage) {
		logger.fatal(strModule, strMessage);
	}

	public static void logTrace(String module, Exception e) {
		logger.trace(module, e);
	}

	public static void setLogger(ILogger newlogger) {
		logger = newlogger;
	}

	public static ILogger getLogger() {
		return logger;
	}
}
