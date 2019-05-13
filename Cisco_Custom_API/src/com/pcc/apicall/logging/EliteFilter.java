package com.pcc.apicall.logging;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class EliteFilter extends StrutsPrepareAndExecuteFilter {

	private static final String MODULE = "MODULE";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext servletContext = filterConfig.getServletContext();
		try {
			super.init(filterConfig);

			ConfigurationManager configuration = ConfigurationManager.getInstance();
			configuration.init(servletContext.getRealPath(""));
		} catch (Exception e) {
			e.printStackTrace();
			Logger.logError(MODULE, "Error while initialize Portal, Reason : " + e.getMessage());
			Logger.logTrace(MODULE, e);
		}
		Logger.logInfo(MODULE, "Init Method completed");
	}
}
