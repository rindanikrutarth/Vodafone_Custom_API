package com.pcc.apicall.logging;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.rolling.RollingFileAppender;
import org.apache.log4j.rolling.TimeBasedRollingPolicy;
import com.pcc.apicall.logging.ConfigurationManager;

public class Log4jLogger implements ILogger {
	public static Logger logger = null;
	private static ThreadLocal<SimpleDateFormat> sdfPool = new ThreadLocal<SimpleDateFormat>() {
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		};
	};
	private static final String MODULE = "LOGGER";
	private static final String LOGLEVEL = ConfigurationManager.getInstance().getPropertyValue("LOGLEVEL", "WARN");

	public Log4jLogger(String absolutePath) {
		logger = Logger.getLogger("EliteLog4j");
		System.out.println("Logger is going to init()");
//		logger.info("Logger is going to init()");
		String fileName = null;
		Layout layout = new PatternLayout("%m%n");
		RollingFileAppender rollFileAppender = null;

		try {
			File logDir = new File(absolutePath + File.separator + "logs");

			fileName = logDir.getAbsolutePath() + File.separator + "elite-middleware.log";

			System.out.println("WIP Logfile :" + fileName);
//			logger.info("WIP Logfile :" + fileName);

			rollFileAppender = new RollingFileAppender();
			rollFileAppender.setLayout(layout);
			rollFileAppender.setFile(fileName);
			rollFileAppender.setAppend(true);

			TimeBasedRollingPolicy rollingPolicy = new TimeBasedRollingPolicy();
			rollingPolicy.setFileNamePattern(fileName + "_%d" + ".log" + ".gz");
			rollingPolicy.activateOptions();

			rollFileAppender.setTriggeringPolicy(rollingPolicy);
			rollFileAppender.setRollingPolicy(rollingPolicy);
			rollFileAppender.activateOptions();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not able to get File appender");
//			logger.info("Not able to get File appender");
		}

		logger.addAppender(rollFileAppender);
		System.out.println("LOG LEVEL ---- " +LOGLEVEL);
		logger.setLevel(Level.toLevel(LOGLEVEL));

		logger.info("[" + dateToString(new Date()) + "] " + "[ WARN  ] " + "[" + MODULE + "]"
				+ "  :  Server Started on " + dateToString(new Date()));

	}

	public void setLogLevel(Level level) {
		logger.setLevel(level);
	}

	public void trace(String module, Throwable e) {
		logger.trace("[" + dateToString(new Date()) + "] [ " + module + " ]" + "[ TRACE ] " + getClientAddress() + "\n"
				+ EliteExceptionUtils.getRootCauseStackTraceAsString(e));
	}

	public void debug(String module, String strMessage) {
		logger.debug("[" + dateToString(new Date()) + "] [ " + module + " ]" + "[ DEBUG ] " + getClientAddress()
				+ strMessage);
	}

	public void info(String module, String strMessage) {
		logger.info("[" + dateToString(new Date()) + "] [ " + module + " ]" + "[ INFO  ] " + getClientAddress()
				+ strMessage);
	}

	public boolean isLogLevel(Level level) {
		return logger.isEnabledFor(level);
	}

	public void warn(String module, String strMessage) {
		logger.warn("[" + dateToString(new Date()) + "] [ " + module + " ] " + "[ WARN ] " + getClientAddress()
				+ strMessage);
	}

	public void error(String module, String strMessage) {
		logger.error("[" + dateToString(new Date()) + "] [ " + module + " ] " + "[ ERROR ] " + getClientAddress()
				+ strMessage);
	}

	public void fatal(String module, String strMessage) {
		logger.fatal("[" + dateToString(new Date()) + "] [ " + module + " ] : " + "[ FATAL ] " + getClientAddress()
				+ strMessage);
	}

	@Override
	public boolean isLogLevel(LogLevel level) {
		return logger.getLevel().toInt() >= level.getLevel();
	}

	protected String dateToString(Date date) {
		return sdfPool.get().format(date);
	}

	private static String getClientAddress() {

		String clientAddress = "";

		String remoteAddress = (String) MDC.get("remoteaddress");

		if (remoteAddress != null) {
			clientAddress = "[" + remoteAddress + "] ";
		}
		return clientAddress;
	}
}
