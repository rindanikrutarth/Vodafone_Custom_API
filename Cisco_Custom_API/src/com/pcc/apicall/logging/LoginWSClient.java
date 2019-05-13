package com.pcc.apicall.logging;

import java.util.Map;

/**
 * Define Contract for Login Web Service Client
 * 
 * @author punit.j.patel
 *
 */
public interface LoginWSClient {

//	Map<String, String> wsLogin(String userIdentity, String password, Map<String, String> additionalInfoMap);

	Map<String, String> wsAddSubscriber();
}
