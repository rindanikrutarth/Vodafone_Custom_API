package com.pcc.apicall.logging;

public enum LogLevel {
	NONE(0), ERROR(1), WARN(2), INFO(3), DEBUG(4), TRACE(5), ALL(6),;

	private int level;

	private LogLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
