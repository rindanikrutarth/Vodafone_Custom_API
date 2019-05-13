package com.pcc.apicall.logging;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class EliteExceptionUtils extends ExceptionUtils {
	public static String convertToString(String[] args0) {
		StringBuffer sb = new StringBuffer();
		if (args0 != null) {
			for (int i = 0; i < args0.length; i++) {
				sb.append("\n");
				sb.append(args0[i]);
			}
		}
		return sb.toString();
	}

	public static String getRootCauseStackTraceAsString(Throwable args) {
		String[] trace = ExceptionUtils.getRootCauseStackTrace(args);
		return convertToString(trace);
	}
}
