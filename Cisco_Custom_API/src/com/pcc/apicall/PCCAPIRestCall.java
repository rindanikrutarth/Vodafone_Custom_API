package com.pcc.apicall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;

import com.broadhop.unifiedapi.soap.types.AddServiceResponse;
import com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse;
import com.broadhop.unifiedapi.soap.types.CredentialType;
import com.broadhop.unifiedapi.soap.types.DeleteServiceResponse;
import com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse;
import com.broadhop.unifiedapi.soap.types.ServiceType;
import com.broadhop.unifiedapi.soap.types.StatusType;
import com.broadhop.unifiedapi.soap.types.SwitchServiceResponse;
//import com.elitecore.portal.util.Logger;
import com.pcc.apicall.logging.ConfigurationManager;
import com.pcc.apicall.logging.Logger;
// Testing Git
public class PCCAPIRestCall {

//	private static final String GETSUBSCRIBER_APIURL = "http://10.151.32.227:9091/netvertexsm/rest/restful/subscriberProvisioning/getSubscriber?subscriberId=";
	private static final String GETSUBSCRIBER_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/getSubscriber?subscriberId=";
	private static final String CREATESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/addSubscriber?";
	private static final String CHANGEBASEPO_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/changeBaseProductOffer?";
	private static final String SUBSCRIBEADDONPO_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscription/subscribeAddOnProductOffer?";
	private static final String CHANGEADDONSUBSCRIPTION_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscription/changeDataAddOnSubscription?";
	private static final String UPDATESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/updateSubscriberProfile?";
	private static final String DELETESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/deleteSubscriber?subscriberId=";
	private static final String PURGESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getEliteSMPURL()
			+ "/subscriberProvisioning/purgeSubscriber?subscriberId=";
	
	private static final String SEC_GETSUBSCRIBER_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/getSubscriber?subscriberId=";
	private static final String SEC_CREATESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/addSubscriber?";
	private static final String SEC_CHANGEBASEPO_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/changeBaseProductOffer?";
	private static final String SEC_SUBSCRIBEADDONPO_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscription/subscribeAddOnProductOffer?";
	private static final String SEC_CHANGEADDONSUBSCRIPTION_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscription/changeDataAddOnSubscription?";
	private static final String SEC_UPDATESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/updateSubscriberProfile?";
	private static final String SEC_DELETESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/deleteSubscriber?subscriberId=";
	private static final String SEC_PURGESUBSCRIBER_APIURL = ConfigurationManager.getInstance().getSecPCCURL()
			+ "/subscriberProvisioning/purgeSubscriber?subscriberId=";
	
	private static final String GET_KEY = "GET";
	private static final String BLANK_KEY = "";
	private static final String SUCCESS_KEY = "SUCCESS";
	private static final String SUCCESS_CODE = "200";
	private static final String RESPONSE_CODE_KEY = "responseCode";
	private static final String RESPONSE_MESSAGE_KEY = "responseMessage";
	private static final String SUBSCRIBER_PROFILE_KEY = "subscriberProfile";
	private static final String KEY = "key";
	private static final String VALUE = "value";
	private static final String MSISDN_KEY = "MSISDN";
	private static final String SUBSCRIBER_IDENTITY_KEY = "SUBSCRIBER_IDENTITY";
	private static final String PRODUCT_OFFER_KEY = "PRODUCT_OFFER";
	private static final String CREATED_DATE_KEY = "CREATED_DATE";
	private static final String DEFAULT_FAILURE_CODE = "500";
	private static final String SUBSCRIBER_ID_KEY = "subscriberId";
	private static final String UPDATE_ACTION_KEY = "updateAction";
	private static final String ENTRY_KEY = "entry";
	private static final String SUBSCRIBERIDENTITY_KEY = "subscriberIdentity";
	private static final String TRUE_KEY = "true";
	
	private static int CONN_TIMEOUT = Integer
			.parseInt(ConfigurationManager.getInstance().getPropertyValue("CONN_TIMEOUT", "5000"));
	private static int SO_TIMEOUT = Integer
			.parseInt(ConfigurationManager.getInstance().getPropertyValue("SO_TIMEOUT", "5000"));
	private static final int HTTP_MAX_CONNECTION = Integer
			.parseInt(ConfigurationManager.getInstance().getPropertyValue("HTTP_MAX_CONNECTION", "50"));
	private static final String FAILOVER = ConfigurationManager.getInstance().getPropertyValue("FAILOVER", "false");
	private static final String MODULE = "PCC_API_Rest_Call";

	private static PoolingClientConnectionManager connectionManager = null;
	
	private static Map<String, String> resultCodeMap = new HashMap<String, String>() {{
		put("200","0");
		put("400","6");
		put("401","8");
		put("404","15");
		put("450","9");
		put("500","2");
		put("503","10");
		put("599","18");
	}};
	
	private static Map<String, String> resultCodeMessageMap = new HashMap<String, String>() {{
		put("0","Request completed successfully");
		put("6","Invalid Request: %s");
		put("8","Required Data: %s ");
		put("15","Error Searching for Object with key: %s");
		put("9","Duplicate Value for Unique Data Constraint: %s");
		put("2","Unable to process the request");
		put("10","Error Creating Object: %s");
		put("18","The expected module is not installed: %s");
	}};

	static {
		connectionManager = new PoolingClientConnectionManager();
		connectionManager.setMaxTotal(HTTP_MAX_CONNECTION);
	}

	public com.broadhop.unifiedapi.soap.types.GetSubscriberResponse getSubscriberCustom(
			com.broadhop.unifiedapi.soap.types.GetSubscriberRequest parameters) {
		System.out.println("FAILOVER FLAG --- " +FAILOVER);
		Logger.logWarn(MODULE, "[getSubscriberCustom] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getNetworkId() + "]");
		com.broadhop.unifiedapi.soap.types.GetSubscriberResponse getSubscriber = null;
		String getSubscriberResponse = "";
		try {
			if(parameters.getNetworkId() == null) {
				parameters.setNetworkId(BLANK_KEY);
			}
			if(FAILOVER.equals(TRUE_KEY)) {
				getSubscriberResponse = sendHTTPGET(SEC_GETSUBSCRIBER_APIURL + parameters.getNetworkId(), GET_KEY);
			}else {
				getSubscriberResponse = sendHTTPGET(GETSUBSCRIBER_APIURL + parameters.getNetworkId(), GET_KEY);
			}
			System.out.println("Get Subscriber HTTP Response --> " + getSubscriberResponse);
			Logger.logInfo(MODULE, "[getSubscriberCustom][PCC][getSubscriber] Response Received From PCC REST API Call = [" + getSubscriberResponse + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			if(getSubscriberResponse == null || BLANK_KEY.equals(getSubscriberResponse)) {
				System.out.println("Get Subscriber Null Response -- ");
				Logger.logWarn(MODULE, "[getSubscriberCustom] PCC Response is null for Subscriber = [" + parameters.getNetworkId() + "]");
				
				getSubscriber = new com.broadhop.unifiedapi.soap.types.GetSubscriberResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))), null);
				return getSubscriber;
			}
			
			JSONObject myResponse = new JSONObject(getSubscriberResponse.toString());
			
			System.out.println("JSON OBJ - " + myResponse.toString());
			System.out.println("JSON Response Code = " + myResponse.get(RESPONSE_CODE_KEY).toString());
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put(RESPONSE_CODE_KEY, myResponse.get(RESPONSE_CODE_KEY).toString());
			hm.put(RESPONSE_MESSAGE_KEY, myResponse.get(RESPONSE_MESSAGE_KEY).toString());
			
			com.broadhop.unifiedapi.soap.types.SubscriberType s2 = null;
			if(myResponse.get(RESPONSE_CODE_KEY).toString().equals(SUCCESS_CODE)) {
				JSONArray myResponsenew = myResponse.getJSONArray(SUBSCRIBER_PROFILE_KEY).getJSONObject(0).getJSONArray(ENTRY_KEY);
				for (int i = 0; i < myResponsenew.length(); i++) {
					System.out.println(myResponsenew.getJSONObject(i));
					String key = myResponsenew.getJSONObject(i).getString(KEY);
					String value = "";
					if ((myResponsenew.getJSONObject(i).has(VALUE))) {
						value = myResponsenew.getJSONObject(i).getString(VALUE);
					}
					hm.put(key, value);
				}
	
				for (Map.Entry<String, String> entry : hm.entrySet())
					System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				
				s2 = new com.broadhop.unifiedapi.soap.types.SubscriberType();
				s2.setId(hm.get(SUBSCRIBER_IDENTITY_KEY));
	
				com.broadhop.unifiedapi.soap.types.CredentialType credNetwork1 = new CredentialType(
						hm.get(SUBSCRIBER_IDENTITY_KEY).toString(), null, MSISDN_KEY, null, null, null);
	
				com.broadhop.unifiedapi.soap.types.CredentialType[] credential = { credNetwork1 };
				s2.setCredential(credential);
				
				com.broadhop.unifiedapi.soap.types.ServiceType serviceType = new ServiceType(
						hm.get(PRODUCT_OFFER_KEY).toString(), true, null, null);
				com.broadhop.unifiedapi.soap.types.ServiceType[] serviceArray = { serviceType };
				s2.setService(serviceArray);
	
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(Long.parseLong(hm.get(CREATED_DATE_KEY).toString()));
				s2.setStartDate(calendar);
	
				s2.setStatus(StatusType.ACTIVE);
	
			}
			
			getSubscriber = new com.broadhop.unifiedapi.soap.types.GetSubscriberResponse(
					new BigInteger(resultCodeMap.get(myResponse.get(RESPONSE_CODE_KEY).toString())),
					resultCodeMessageMap.get((resultCodeMap.get(myResponse.get(RESPONSE_CODE_KEY).toString()))).replace("%s", myResponse.get(RESPONSE_MESSAGE_KEY).toString()), s2);
			
			System.out.println("Response Object  -- " + getSubscriber.toString());

		} catch (Exception e) {
			Logger.logError(MODULE, "[getSubscriberCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			System.out.println("Catch @getSubscriberCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("E To string : " +e.toString());
			System.out.println("Get Stack Trace : " +e.getStackTrace().toString());
			System.out.println("Localized Message : " +e.getLocalizedMessage());
			
			getSubscriber = new com.broadhop.unifiedapi.soap.types.GetSubscriberResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))), null);
			return getSubscriber;
		}
		Logger.logWarn(MODULE, "[getSubscriberCustom] Custom API Response = [" + getSubscriber.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
		return getSubscriber;
	}

	public com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse createSubscriberCustom(
			com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest parameters) {
		Logger.logWarn(MODULE, "[createSubscriberCustom][PCC][addSubscriber] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getSubscriber().getCredential(0).getNetworkId().toString() + "]");
		com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse createSubscriber = null;
		String createSubscriberResponse = null;
		try {
			
			if(parameters.getSubscriber().getCredential(0).getNetworkId() == null) {
				parameters.getSubscriber().getCredential(0).setNetworkId(BLANK_KEY);
			}
			if(parameters.getSubscriber().getStatus() == null) {
				parameters.getSubscriber().setStatus(StatusType.ACTIVE);
			}
			if(parameters.getSubscriber().getService(0).getCode() == null) {
				parameters.getSubscriber().getService(0).setCode(BLANK_KEY);
			}
			
			JSONObject createSubscriberJSONOBJ = new JSONObject();

			JSONArray subscriberEntry = new JSONArray();
			JSONObject usernameObject = new JSONObject();
			usernameObject.put(KEY, "USERNAME");
			usernameObject.put(VALUE, parameters.getSubscriber().getCredential(0).getNetworkId());
			JSONObject statusObject = new JSONObject();
			statusObject.put(KEY, "STATUS");
			statusObject.put(VALUE, parameters.getSubscriber().getStatus());
			JSONObject MSISDNObject = new JSONObject();
			MSISDNObject.put(KEY, MSISDN_KEY);
			MSISDNObject.put(VALUE, parameters.getSubscriber().getCredential(0).getNetworkId());
			subscriberEntry.put(usernameObject);
			subscriberEntry.put(statusObject);
			subscriberEntry.put(MSISDNObject);

			createSubscriberJSONOBJ.put(ENTRY_KEY, subscriberEntry);
			createSubscriberJSONOBJ.put("creditLimit", "100");
			System.out.println("PO - " + parameters.getSubscriber().getService(0).getCode());
			System.out.println("SUBS ID - " + parameters.getSubscriber().getCredential(0).getNetworkId());
			System.out.println("Failover value - " + FAILOVER);
			createSubscriberJSONOBJ.put("productOffer", parameters.getSubscriber().getService(0).getCode());
			createSubscriberJSONOBJ.put(SUBSCRIBERIDENTITY_KEY,
					parameters.getSubscriber().getCredential(0).getNetworkId());

			if(FAILOVER.equals(TRUE_KEY)) {
				createSubscriberResponse = sendHTTPPOST(SEC_CREATESUBSCRIBER_APIURL, createSubscriberJSONOBJ);
			}else {
				createSubscriberResponse = sendHTTPPOST(CREATESUBSCRIBER_APIURL, createSubscriberJSONOBJ);
			}
			
			Logger.logInfo(MODULE, "[createSubscriberCustom][PCC][addSubscriber] Response Received From PCC REST API Call = [" + createSubscriberResponse + "]");
			System.out.println("Create subs http response -  " + createSubscriberResponse);
			
			if(createSubscriberResponse == null || BLANK_KEY.equals(createSubscriberResponse)) {
				System.out.println("Create Subscriber Null Response -- ");
				Logger.logWarn(MODULE, "[createSubscriberCustom] PCC Response is null for Subscriber = [" + parameters.getSubscriber().getCredential(0).getNetworkId() + "]");
				
				createSubscriber = new CreateSubscriberResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
				return createSubscriber;
			}
			
			JSONObject createSubscriberJSON = new JSONObject(createSubscriberResponse);
			System.out.println("JSON Created -- " + createSubscriberJSON.toString());
			
			createSubscriber = new CreateSubscriberResponse(
					new BigInteger(resultCodeMap.get(createSubscriberJSON.get(RESPONSE_CODE_KEY).toString())),
					resultCodeMessageMap.get((resultCodeMap.get(createSubscriberJSON.get(RESPONSE_CODE_KEY).toString()))).replace("%s", createSubscriberJSON.get(RESPONSE_MESSAGE_KEY).toString()));
			
			System.out.println("Create SUbscriber obj - " + createSubscriber.toString());

		} catch (Exception e) {
			Logger.logError(MODULE, "[createSubscriberCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getSubscriber().getCredential(0).getNetworkId() + "]");
			System.out.println("Catch @createSubscriberCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			
			createSubscriber = new CreateSubscriberResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
			return createSubscriber;
		}
		Logger.logWarn(MODULE, "[createSubscriberCustom] Custom API Response = [" + createSubscriber.toString() + "] for Subscriber = [" + parameters.getSubscriber().getCredential(0).getNetworkId() + "]");
		return createSubscriber;
	}

	public com.broadhop.unifiedapi.soap.types.AddServiceResponse addServiceCustom(
			com.broadhop.unifiedapi.soap.types.AddServiceRequest parameters) {
		Logger.logWarn(MODULE, "[addServiceCustom][PCC][subscribeAddOnProductOffer] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getNetworkId() + "]");
		com.broadhop.unifiedapi.soap.types.AddServiceResponse addServiceResponse = null;
		String subscribeAddonPOResponse = null;
		try {
			JSONObject addServiceJSONObj = new JSONObject();

			if(parameters.getNetworkId() == null) {
				parameters.setNetworkId(BLANK_KEY);
			}
			if(parameters.getService(0).getCode() == null) {
				parameters.getService(0).setCode(BLANK_KEY);
			}
			
			System.out.println("SUBS ID - " + parameters.getNetworkId());
			System.out.println("New PO - " + parameters.getService(0).getCode());
			addServiceJSONObj.put(SUBSCRIBER_ID_KEY, parameters.getNetworkId());
			addServiceJSONObj.put("addOnProductOfferName", parameters.getService(0).getCode());
			addServiceJSONObj.put(UPDATE_ACTION_KEY, "1");

			if(FAILOVER.equals(TRUE_KEY)) {
				subscribeAddonPOResponse = sendHTTPPOST(SEC_SUBSCRIBEADDONPO_APIURL, addServiceJSONObj);
			}else {
				subscribeAddonPOResponse = sendHTTPPOST(SUBSCRIBEADDONPO_APIURL, addServiceJSONObj);
			}
			
			Logger.logInfo(MODULE, "[addServiceCustom][PCC][subscribeAddOnProductOffer] Response Received From PCC REST API Call = [" + subscribeAddonPOResponse + "]");
			System.out.println("Subscribe Addon PO http response -  " + subscribeAddonPOResponse);
			
			if(subscribeAddonPOResponse == null || BLANK_KEY.equals(subscribeAddonPOResponse)) {
				System.out.println("Add Service Null Response -- ");
				Logger.logWarn(MODULE, "[addServiceCustom] PCC Response is null for Subscriber = [" + parameters.getNetworkId() + "]");
				
				addServiceResponse = new AddServiceResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
				return addServiceResponse;
			}
			
			JSONObject subscribeAddonPOResponseJson = new JSONObject(subscribeAddonPOResponse);
			System.out.println("JSON Created -- " + subscribeAddonPOResponseJson.toString());
			
			addServiceResponse = new AddServiceResponse(
					new BigInteger(resultCodeMap.get(subscribeAddonPOResponseJson.get(RESPONSE_CODE_KEY).toString())),
					resultCodeMessageMap.get((resultCodeMap.get(subscribeAddonPOResponseJson.get(RESPONSE_CODE_KEY).toString()))).replace("%s", subscribeAddonPOResponseJson.get(RESPONSE_MESSAGE_KEY).toString()));
			
			System.out.println("Subscribe Addon obj - " + addServiceResponse.toString());

		} catch (Exception e) {
			Logger.logError(MODULE, "[addServiceCustomaddServiceCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			System.out.println("Catch @addServiceCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			
			addServiceResponse = new AddServiceResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
			return addServiceResponse;
		}

		Logger.logWarn(MODULE, "[addServiceCustom] Custom API Response = [" + addServiceResponse.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
		return addServiceResponse;
	}

	public com.broadhop.unifiedapi.soap.types.DeleteServiceResponse deleteServiceCustom(
			com.broadhop.unifiedapi.soap.types.DeleteServiceRequest parameters) {
		Logger.logWarn(MODULE, "[deleteServiceCustom] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getNetworkId() + "]");
		com.broadhop.unifiedapi.soap.types.DeleteServiceResponse deleteServiceResponse = null;
		String changeAddonSubscriptionResponse = null;
		try {
			JSONObject deleteServiceJSONObj = new JSONObject();

			if(parameters.getNetworkId() == null) {
				parameters.setNetworkId(BLANK_KEY);
			}
			if(parameters.getServiceCode() == null) {
				parameters.setServiceCode(0, BLANK_KEY);
			}
			
			System.out.println("SUBS ID - " + parameters.getNetworkId());
			System.out.println("New PO - " + parameters.getServiceCode(0));
			deleteServiceJSONObj.put(SUBSCRIBER_ID_KEY, parameters.getNetworkId());
			deleteServiceJSONObj.put("dataAddOnProductOfferName", parameters.getServiceCode(0));
			deleteServiceJSONObj.put("subscriptionStatusValue", "5");
			deleteServiceJSONObj.put("subscriptionOrder", "OLDEST");
			deleteServiceJSONObj.put(UPDATE_ACTION_KEY, "1");

			if(FAILOVER.equals(TRUE_KEY)) {
				changeAddonSubscriptionResponse = sendHTTPPUT(SEC_CHANGEADDONSUBSCRIPTION_APIURL, deleteServiceJSONObj);
			}else {
				changeAddonSubscriptionResponse = sendHTTPPUT(CHANGEADDONSUBSCRIPTION_APIURL, deleteServiceJSONObj);
			}
			
			Logger.logInfo(MODULE, "[deleteServiceCustom][PCC][changeDataAddOnSubscription] Response Received From PCC REST API Call = [" + changeAddonSubscriptionResponse + "]");
			System.out.println("Change Addon Subscription http response -  " + changeAddonSubscriptionResponse);
			
			if(changeAddonSubscriptionResponse == null || BLANK_KEY.equals(changeAddonSubscriptionResponse)) {
				System.out.println("Delete Service Null Response -- ");
				Logger.logWarn(MODULE, "[deleteServiceCustom] PCC Response is null for Subscriber = [" + parameters.getNetworkId() + "]");
				
				deleteServiceResponse = new DeleteServiceResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
				return deleteServiceResponse;
			}
			
			JSONObject changeAddonSubscriptionResponseJson = new JSONObject(changeAddonSubscriptionResponse);
			System.out.println("JSON Created -- " + changeAddonSubscriptionResponseJson.toString());
			
			deleteServiceResponse = new DeleteServiceResponse(
					new BigInteger(resultCodeMap.get(changeAddonSubscriptionResponseJson.get(RESPONSE_CODE_KEY).toString())),
					resultCodeMessageMap.get((resultCodeMap.get(changeAddonSubscriptionResponseJson.get(RESPONSE_CODE_KEY).toString()))).replace("%s", changeAddonSubscriptionResponseJson.get(RESPONSE_MESSAGE_KEY).toString()));
			System.out.println("Change Addon Subscription obj - " + deleteServiceResponse.toString());

		} catch (Exception e) {
			Logger.logError(MODULE, "[deleteServiceCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			System.out.println("Catch @deleteServiceCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			
			deleteServiceResponse = new DeleteServiceResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
			return deleteServiceResponse;
		}
		Logger.logWarn(MODULE, "[deleteServiceCustom] Custom API Response = [" + deleteServiceResponse.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
		return deleteServiceResponse;
	}

	public com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse deleteSubscriberCustom(
			com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest parameters) {
		Logger.logWarn(MODULE, "[deleteSubscriberCustom] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getNetworkId() + "]");
		com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse deleteSubscriberResponse = null;
		String updateSubscriberResponse = null;
		try {

			JSONObject updateSubscriberJSONObj = new JSONObject();
			JSONArray updateSubscriberEntry = new JSONArray();
			JSONObject keySubscriberEntry = new JSONObject();
			if(parameters.getNetworkId() == null) {
				parameters.setNetworkId(BLANK_KEY);
			}
			keySubscriberEntry.put(KEY, MSISDN_KEY);
			keySubscriberEntry.put(VALUE, parameters.getNetworkId().toString());
			updateSubscriberEntry.put(keySubscriberEntry);
			JSONObject updateSubscriberProfile = new JSONObject();
			updateSubscriberProfile.put(ENTRY_KEY, updateSubscriberEntry);
			updateSubscriberProfile.put(SUBSCRIBERIDENTITY_KEY, parameters.getNetworkId());
			updateSubscriberJSONObj.put(SUBSCRIBER_PROFILE_KEY, updateSubscriberProfile);
			updateSubscriberJSONObj.put(SUBSCRIBER_ID_KEY, parameters.getNetworkId());
			updateSubscriberJSONObj.put(UPDATE_ACTION_KEY, "2");
			
			if(FAILOVER.equals(TRUE_KEY)) {
				updateSubscriberResponse = sendHTTPPUT(SEC_UPDATESUBSCRIBER_APIURL, updateSubscriberJSONObj);
			}else {
				updateSubscriberResponse = sendHTTPPUT(UPDATESUBSCRIBER_APIURL, updateSubscriberJSONObj);
			}
			
			if(updateSubscriberResponse == null || BLANK_KEY.equals(updateSubscriberResponse)) {
				System.out.println("Update Subscriber Null Response -- ");
				Logger.logWarn(MODULE, "[deleteSubscriberCustom] PCC Response for update Subscriber is null for Subscriber = [" + parameters.getNetworkId() + "]");
				
				deleteSubscriberResponse = new DeleteSubscriberResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
				return deleteSubscriberResponse;
			}

			if (updateSubscriberResponse.contains(SUCCESS_KEY)) {
				Logger.logInfo(MODULE, "[deleteSubscriberCustom] PCC updateSubscriber Response is SUCCESS so calling deleteSubscriber for Network ID : [" + parameters.getNetworkId().toString() + "]");
				String deleteSubResponse = null;
				if(FAILOVER.equals(TRUE_KEY)) {
					deleteSubResponse = sendHTTPDelete(SEC_DELETESUBSCRIBER_APIURL.concat(parameters.getNetworkId()));
				}else {
					deleteSubResponse = sendHTTPDelete(DELETESUBSCRIBER_APIURL.concat(parameters.getNetworkId()));
				}
				
				if(deleteSubResponse == null || BLANK_KEY.equals(deleteSubResponse)) {
					System.out.println("Delete Subscriber Null Response -- ");
					Logger.logWarn(MODULE, "[deleteSubscriberCustom] PCC Response for delete Subscriber is null for Subscriber = [" + parameters.getNetworkId() + "]");
					
					deleteSubscriberResponse = new DeleteSubscriberResponse(
							new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
							resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
					return deleteSubscriberResponse;
				}
				
				if (deleteSubResponse.contains(SUCCESS_KEY)) {
					Logger.logInfo(MODULE, "[deleteSubscriberCustom] PCC deleteSubscriber Response is SUCCESS so calling purgeSubscriber for Network ID : [" + parameters.getNetworkId().toString() + "]");
					String purgeSubscriberResponse = null;
					if(FAILOVER.equals(TRUE_KEY)) {
						purgeSubscriberResponse = sendHTTPDelete(SEC_PURGESUBSCRIBER_APIURL.concat(parameters.getNetworkId()));
					}else {
						purgeSubscriberResponse = sendHTTPDelete(PURGESUBSCRIBER_APIURL.concat(parameters.getNetworkId()));
					}
					
					Logger.logInfo(MODULE, "[deleteSubscriberCustom][PCC][purgeSubscriber] Response Received From PCC REST API Call = [" + purgeSubscriberResponse + "]");
					System.out.println("Purge Subscriber http response -  " + purgeSubscriberResponse);
					
					if(purgeSubscriberResponse == null || BLANK_KEY.equals(purgeSubscriberResponse)) {
						System.out.println("Purge Subscriber Null Response -- ");
						Logger.logWarn(MODULE, "[deleteSubscriberCustom] PCC Response for purge Subscriber is null for Subscriber = [" + parameters.getNetworkId() + "]");
						
						deleteSubscriberResponse = new DeleteSubscriberResponse(
								new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
								resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
						return deleteSubscriberResponse;
					}
					
					JSONObject purgeSubscriberJSONObj = new JSONObject(purgeSubscriberResponse);
					System.out.println("JSON Created -- " + purgeSubscriberJSONObj.toString());
					
					deleteSubscriberResponse = new DeleteSubscriberResponse(
							new BigInteger(resultCodeMap.get(purgeSubscriberJSONObj.get(RESPONSE_CODE_KEY).toString())),
							resultCodeMessageMap.get((resultCodeMap.get(purgeSubscriberJSONObj.get(RESPONSE_CODE_KEY).toString()))).replace("%s", purgeSubscriberJSONObj.get(RESPONSE_MESSAGE_KEY).toString()));
					System.out.println("Delete Subscriber obj - " + deleteSubscriberResponse.toString());
				}else {
					Logger.logInfo(MODULE, "[deleteSubscriberCustom] PCC deleteSubscriber Response is not SUCCESS so skipping further process for Network ID : [" + parameters.getNetworkId().toString() + "]");
					JSONObject deleteSubResponseJSONObj = new JSONObject(deleteSubResponse);
					deleteSubscriberResponse = new DeleteSubscriberResponse(
							new BigInteger(resultCodeMap.get(deleteSubResponseJSONObj.get(RESPONSE_CODE_KEY).toString())),
							resultCodeMessageMap.get((resultCodeMap.get(deleteSubResponseJSONObj.get(RESPONSE_CODE_KEY).toString()))).replace("%s", deleteSubResponseJSONObj.get(RESPONSE_MESSAGE_KEY).toString()));
				}
			}else {
				Logger.logInfo(MODULE, "[deleteSubscriberCustom] PCC updateSubscriber Response is not SUCCESS so skipping further process for Network ID : [" + parameters.getNetworkId().toString() + "]");
				JSONObject updateSubscriberResponseJSONObj = new JSONObject(updateSubscriberResponse);
				deleteSubscriberResponse = new DeleteSubscriberResponse(
						new BigInteger(resultCodeMap.get(updateSubscriberResponseJSONObj.get(RESPONSE_CODE_KEY).toString())),
						resultCodeMessageMap.get((resultCodeMap.get(updateSubscriberResponseJSONObj.get(RESPONSE_CODE_KEY).toString()))).replace("%s", updateSubscriberResponseJSONObj.get(RESPONSE_MESSAGE_KEY).toString()));
			}
			
		} catch (Exception e) {
			Logger.logError(MODULE, "[deleteSubscriberCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			System.out.println("Catch @deleteSubscriberCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			
			deleteSubscriberResponse = new DeleteSubscriberResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
			return deleteSubscriberResponse;
		}
		Logger.logWarn(MODULE, "[deleteSubscriberCustom] Custom API Response = [" + deleteSubscriberResponse.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
		return deleteSubscriberResponse;
	}

	public com.broadhop.unifiedapi.soap.types.SwitchServiceResponse switchServiceCustom(
			com.broadhop.unifiedapi.soap.types.SwitchServiceRequest parameters) {
		Logger.logWarn(MODULE, "[switchServiceCustom] Custom API Called with Request Parameters : " + parameters.toString() + " for Subscriber = [" + parameters.getNetworkId() + "]");
		com.broadhop.unifiedapi.soap.types.SwitchServiceResponse switchServiceResponse = null;
		String changeBasePOResponse = null;
		try {
			JSONObject switchServiceJSONObj = new JSONObject();

			if(parameters.getNetworkId() == null) {
				parameters.setNetworkId(BLANK_KEY);
			}
			if(parameters.getService().getCode() == null) {
				parameters.getService().setCode(BLANK_KEY);
			}
			if(parameters.getOldServiceCode() == null) {
				parameters.setOldServiceCode(BLANK_KEY);
			}
			
			System.out.println("Current PO - " + parameters.getOldServiceCode());
			System.out.println("SUBS ID - " + parameters.getNetworkId());
			System.out.println("New PO - " + parameters.getService().getCode());
			switchServiceJSONObj.put(SUBSCRIBER_ID_KEY, parameters.getNetworkId());
			switchServiceJSONObj.put("currentProductOfferName", parameters.getOldServiceCode());
			switchServiceJSONObj.put("newProductOfferName", parameters.getService().getCode());
			switchServiceJSONObj.put(UPDATE_ACTION_KEY, "1");

			if(FAILOVER.equals(TRUE_KEY)) {
				changeBasePOResponse = sendHTTPPUT(SEC_CHANGEBASEPO_APIURL, switchServiceJSONObj);
			}else {
				changeBasePOResponse = sendHTTPPUT(CHANGEBASEPO_APIURL, switchServiceJSONObj);
			}
			
			Logger.logInfo(MODULE, "[switchServiceCustom][PCC][changeBaseProductOffer] Response Received From PCC REST API Call = [" + changeBasePOResponse + "]");
			System.out.println("Change Base PO http response -  " + changeBasePOResponse);
			
			if(changeBasePOResponse == null || BLANK_KEY.equals(changeBasePOResponse)) {
				System.out.println("Switch Service Null Response -- ");
				Logger.logWarn(MODULE, "[switchServiceCustom] PCC Response is null for Subscriber = [" + parameters.getNetworkId() + "]");
				
				switchServiceResponse = new SwitchServiceResponse(
						new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
						resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
				return switchServiceResponse;
			}
			
			JSONObject changeBasePOResponseJson = new JSONObject(changeBasePOResponse);
			System.out.println("JSON Created -- " + changeBasePOResponseJson.toString());
			
			switchServiceResponse = new SwitchServiceResponse(
					new BigInteger(resultCodeMap.get(changeBasePOResponseJson.get(RESPONSE_CODE_KEY).toString())),
					resultCodeMessageMap.get((resultCodeMap.get(changeBasePOResponseJson.get(RESPONSE_CODE_KEY).toString()))).replace("%s", changeBasePOResponseJson.get(RESPONSE_MESSAGE_KEY).toString()));
			
			System.out.println("Create SUbscriber obj - " + switchServiceResponse.toString());

		} catch (Exception e) {
			Logger.logError(MODULE, "[switchServiceCustom] Exception Occured in Custom API : [" + e.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
			System.out.println("Catch @switchServiceCustom ---->");
			System.out.println(e.toString());
			e.printStackTrace();
			
			switchServiceResponse = new SwitchServiceResponse(
					new BigInteger(resultCodeMap.get(DEFAULT_FAILURE_CODE)),
					resultCodeMessageMap.get((resultCodeMap.get(DEFAULT_FAILURE_CODE))));
			return switchServiceResponse;
		}
		Logger.logWarn(MODULE, "[switchServiceCustom] Custom API Response = [" + switchServiceResponse.toString() + "] for Subscriber = [" + parameters.getNetworkId() + "]");
		return switchServiceResponse;
	}

	private String sendHTTPDelete(String url) {
		Logger.logDebug(MODULE, "[sendHTTPDelete] Method Called for URL : " + url);
		System.out.println("@sendHTTPDelete Called of PCCAPIRestCall Class ----");
		String line = "";
		try {
			HttpDelete delete = new HttpDelete(url);
			HttpParams params = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(params, CONN_TIMEOUT);
			HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);
			HttpClient client = new DefaultHttpClient(connectionManager, params);
			HttpResponse httpResponse = client.execute(delete);
			BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			while ((line = rd.readLine()) != null) {
				System.out.println("Line - " + line);
				return line;
			}
		} catch (Exception e) {
			Logger.logError(MODULE, "[sendHTTPDelete] Exception Occured in REST Call : [" + e.toString() + "]");
			System.out.println("Catch @sendHTTPDelete ---->");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		Logger.logDebug(MODULE, "[sendHTTPDelete] PCC Response = [" + line + "] for URL : " + url);
		return line;
	}

	private String sendHTTPPOST(String url, JSONObject obj) {
		Logger.logDebug(MODULE, "[sendHTTPPOST] Method Called for URL : " + url + " and JSON Object : " + obj.toString());
		System.out.println("@sendHTTP Called of PCCAPIRestCall Class ----");
		String line = "";
		try {
			StringEntity input = new StringEntity(obj.toString());
			input.setContentType("application/json");
			HttpPost post = new HttpPost(url);
			post.setEntity(input);
			HttpParams params = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(params, CONN_TIMEOUT);
			HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);
			HttpClient client = new DefaultHttpClient(connectionManager, params);
			HttpResponse httpResponse = client.execute(post);
			BufferedReader rd = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			while ((line = rd.readLine()) != null) {
				System.out.println("Line - " + line);
				return line;
			}
		} catch (Exception e) {
			Logger.logError(MODULE, "[sendHTTPPOST] Exception Occured in REST Call : [" + e.toString() + "]");
			System.out.println("Catch @sendHTTPPOST ---->");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		Logger.logDebug(MODULE, "[sendHTTPPOST] PCC Response = [" + line + "] for URL : " + url + " and JSON Object : " + obj.toString());
		return line;
	}

	private String sendHTTPGET(String url, String requestMethod) {
		Logger.logDebug(MODULE, "[sendHTTPGET] Method Called for URL : " + url);
		System.out.println("@sendHTTP Called of PCCAPIRestCall Class ----");
		StringBuffer response = null;
		try {
			System.out.println("\nSending 'GET' request to URL : " + url);
			HttpGet request = new HttpGet(url);
			HttpParams params = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(params, CONN_TIMEOUT);
			HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);
			HttpClient client = new DefaultHttpClient(connectionManager, params);
			HttpResponse httpResponse = client.execute(request);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
			String inputLine;
			response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			
			System.out.println("REST Response - " + response.toString());
			System.out.println("REST Response 1- " + response);
			in.close();
		} catch (Exception e) {
			Logger.logError(MODULE, "[sendHTTPGET] Exception Occured in REST Call : [" + e.toString() + "]");
			System.out.println("Catch @sendHTTPGET ---->");
			System.out.println(e.toString());
			e.printStackTrace();
	//		return response.toString();
		}
		Logger.logDebug(MODULE, "[sendHTTPGET] PCC Response = [" + response + "] for URL : " + url);
		System.out.println("Response in HTTP --- " +response);
		if(response == null || response.toString().equals("")) {
			return null;
		}
		return response.toString();
	}

	private String sendHTTPPUT(String url, JSONObject obj) {
		Logger.logDebug(MODULE, "[sendHTTPPUT] Method Called for URL : " + url + " and JSON Object : " + obj.toString());
		System.out.println("@sendHTTP PUT Called of PCCAPIRestCall Class ----");
		String line = "";
		try {
			StringEntity input = new StringEntity(obj.toString());
			input.setContentType("application/json");
			HttpPut putRequest = new HttpPut(url);
			putRequest.setEntity(input);
			HttpParams params = new BasicHttpParams();
			HttpConnectionParams.setConnectionTimeout(params, CONN_TIMEOUT);
			HttpConnectionParams.setSoTimeout(params, SO_TIMEOUT);
			HttpClient client = new DefaultHttpClient(connectionManager, params);
			HttpResponse response = client.execute(putRequest);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			while ((line = rd.readLine()) != null) {
				System.out.println("Line - " + line);
				return line;
			}
		} catch (Exception e) {
			Logger.logError(MODULE, "[sendHTTPPUT] Exception Occured in REST Call : [" + e.toString() + "]");
			System.out.println("Catch @sendHTTPPUT ---->");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		Logger.logDebug(MODULE, "[sendHTTPPUT] PCC Response = [" + line + "] for URL : " + url + " and JSON Object : " + obj.toString());
		return line;
	}

}
