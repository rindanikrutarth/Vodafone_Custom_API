package com.pcc.apicall.logging;

public interface ILogger {
	public void error(String module, String strMessage);

	public void debug(String module, String strMessage);

	public void info(String module, String strMessage);

	public void warn(String module, String strMessage);

	public void fatal(String module, String strMessage);

	public void trace(String module, Throwable e);

	public boolean isLogLevel(LogLevel level);
}
