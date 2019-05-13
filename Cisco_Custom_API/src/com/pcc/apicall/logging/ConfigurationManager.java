package com.pcc.apicall.logging;

import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * 
 * @author elitecore
 */
public final class ConfigurationManager {

	private static final String MODULE = "ConfigurationManager-Middleware";
	private static final String WS_CONFIG_FILE = File.separator + "WEB-INF" + File.separator
			+ "webservice-config.properties";
	private static final String WS_CRM_FILE = File.separator + "WEB-INF" + File.separator + "global-config.properties";

//	private static final String MIDDLEWARE_DS_KEY = "middleware.connection.datasource";
//	private static final String DEFAULT_SERVER_DS_NAME = "middleware";

	private static final String serviceIP = "IP";
	private static final String servicePORT = "PORT";
//	private static final QName SERVICE_NAME = new QName("http://schema.concierge.com", "EaiEnvelope");
	private String absolutePath;
	private boolean isInialized = false;
	private boolean isCRMInitialized = false;

	private Map<String, String> propertyMap;
//	private Map<String, WipCalledStations> hotSpotDetails;
	private RestHttpClient restHttpClient;
	private RestHttpClient secRestHttpClient;
	private WebServiceClient wsClient;

	private ILogger logger;

	private Map<String, String> configurationMap;
	private DataSource middlewareDataSource;
	private DataSource mobileServerDataSource;
//	private AuditService auditService;
	private String eliteSMPURL;
	private String secPCCURL;

	private static ConfigurationManager configurationManager = new ConfigurationManager();

//	private URL fetchIMSIWsLocation_URL;
//	private URL topUpBalanceWsLocation_URL;
//	private URL purchaseBundleWsLocation_URL;
//	private URL mainBalanceUpdateWsLocation_URL;
//	private URL balanceDetailWsLocation_URL;
//	private URL syncBundlesWsLocation_URL;

//	private com.concierge.schema.imsistatus.EaiEnvelope fetchIMSIEnvelopeWS;
//	private com.concierge.schema.topup.EaiEnvelope topUpBalanceWS;
//	private com.concierge.schema.purchasebundle.EaiEnvelope purchaseBundleWS;
//	private com.concierge.schema.updatebalance.EaiEnvelope updateBalanceWS;
//	private com.concierge.schema.balancedetail.EaiEnvelope balanceDetailWS;
//	private com.concierge.schema.syncbundle.EaiEnvelope syncBundleWS;

//	public com.concierge.schema.imsistatus.EaiEnvelopeSoap getIMSIEnvelope_Port(){
//		
//		return fetchIMSIEnvelopeWS.getEaiEnvelopeSoap();
//	}
//	
//	public com.concierge.schema.topup.EaiEnvelopeSoap getTopUpBalance_Port(){
//		
//		return topUpBalanceWS.getEaiEnvelopeSoap();
//	}
//	
//	public com.concierge.schema.purchasebundle.EaiEnvelopeSoap getPurchaseBundle_Port(){
//		
//		return purchaseBundleWS.getEaiEnvelopeSoap();
//	}
//	
//	public com.concierge.schema.updatebalance.EaiEnvelopeSoap getUpdateBalance_Port(){
//		
//		return updateBalanceWS.getEaiEnvelopeSoap();
//	}
//	
//	public com.concierge.schema.balancedetail.EaiEnvelopeSoap getBalanceDetail_Port(){
//		
//		return balanceDetailWS.getEaiEnvelopeSoap();
//	}
//	
//	public com.concierge.schema.syncbundle.EaiEnvelopeSoap getSyncBundle_Port(){
//		
//		return syncBundleWS.getEaiEnvelopeSoap();
//	}

	private ConfigurationManager() {

		propertyMap = new HashMap<String, String>();
		configurationMap = new HashMap<String, String>();

	}

	public static ConfigurationManager getInstance() {
		return configurationManager;
	}

	public synchronized void init(String absolutePath) {
		if (isInialized) {
			return;
		}
		this.absolutePath = absolutePath;
		try {
			readCRMConfigFile();
			logger = new Log4jLogger(absolutePath);
			Logger.setLogger(logger);
			Logger.logDebug(MODULE, "Initialize Configuration");

			initializeServices();

//			auditService = new AuditService(middlewareDataSource);
			isInialized = true;
			Logger.logDebug(MODULE, "Configuration initialized successfully");
		} catch (Exception e) {
			Logger.logError(MODULE, "Error while read Configuration, Reason : " + e.getMessage());
			Logger.logTrace(MODULE, e);
		}

	}

	private void initializeServices() {

		try {

			readWSConfigFile();
//			readCRMConfigFile();
//			readConfiguration();			
//			readConfigurationData();
			assignEliteSMPServer();
			restHttpClient = RestHttpClient.buildRestHttpClient(configurationMap);
			secRestHttpClient = RestHttpClient.buildSecRestHttpClient(configurationMap);
//			wsClient = new WebServiceClient(restHttpClient, null, logger);
			setEliteSMPURL(buildEliteSMPURL());
			setSecPCCURL(buildSecPCCURL());
			
		} catch (Exception ex) {

			Logger.logError(MODULE, "Error while read intializeServices, Reason : " + ex.getMessage());
			Logger.logTrace(MODULE, ex);
		}
	}

//	private void readConfiguration() {
//		Logger.logInfo(MODULE, "Initializing JNDI DataSource Configuration");
//		
//		try {
//			String middlewareDSName = propertyMap.get(MIDDLEWARE_DS_KEY);
//			if( middlewareDSName == null ) {
//				Logger.logDebug(MODULE, "Middleware DataSouce not found, Used default DataSource");
//				middlewareDSName = DEFAULT_SERVER_DS_NAME;
//			}
//			
//			//Logger.logInfo(MODULE, "middlewareDSName : "+middlewareDSName);
//			middlewareDataSource = JNDIDSManager.getInstance().getJDBCDataSource(middlewareDSName);
//			//Logger.logInfo(MODULE, "middlewareDataSource : "+middlewareDataSource);
//			if (middlewareDataSource == null) {
//				Logger.logDebug(MODULE, "Middleware JNDI Datasource not configured");
//				throw new ConfigurationException("Middleware JNDI Datasource not configured"); 
//			}
//			
//		} catch (Exception e) {
//			Logger.logError(MODULE, "Error while Initializing JNDI DataSource Configuration, Reason : " + e.getMessage());
//			Logger.logTrace(MODULE, e);
//		}
//	}

	private String buildEliteSMPURL() {

		StringBuilder smpBuilder = new StringBuilder();
		smpBuilder.append(restHttpClient.getUriScheme() + "://").append(restHttpClient.getIp() + ":")
				.append(restHttpClient.getPort() + "/").append(restHttpClient.getContext());

		return smpBuilder.toString();

	}
	
	private String buildSecPCCURL() {

		StringBuilder secPccBuilder = new StringBuilder();
		secPccBuilder.append(secRestHttpClient.getSecPCCUriScheme() + "://").append(secRestHttpClient.getSecIp() + ":")
				.append(secRestHttpClient.getSecPort() + "/").append(secRestHttpClient.getSecContext());

		return secPccBuilder.toString();

	}

	public void assignEliteSMPServer() {

		try {

			Enumeration e = NetworkInterface.getNetworkInterfaces();
			String hostAddress = "";
			while (e.hasMoreElements()) {
				NetworkInterface n = (NetworkInterface) e.nextElement();
				Enumeration ee = n.getInetAddresses();
				while (ee.hasMoreElements()) {
					InetAddress i = (InetAddress) ee.nextElement();
					hostAddress = i.getHostAddress();
					Logger.logDebug(MODULE, hostAddress);
					if (propertyMap.containsKey(hostAddress + serviceIP)) {

						propertyMap.put(RestWSConstant.IP_ADDRESS.getValue(), propertyMap.get(hostAddress + serviceIP));

					}

					if (propertyMap.containsKey(hostAddress + servicePORT)) {

						propertyMap.put(RestWSConstant.PORT.getValue(), propertyMap.get(hostAddress + servicePORT));
					}

				}
			}

		} catch (Exception e) {

			Logger.logError(MODULE, "Error while assignMiddlewareServer, Reason : " + e.getMessage());
			Logger.logTrace(MODULE, e);
		}

	}

//	private Map<String, String> readConfigurationData() {
//		
//		Logger.logInfo(MODULE, "Trying to get details ConfigurationMap...");
//
//		Connection connection = null;
//		
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//	
//		try {
//			connection = middlewareDataSource.getConnection();
//			
//			preparedStatement = connection.prepareStatement("SELECT * FROM TBLMCONFIGURATION");
//			
//			resultSet = preparedStatement.executeQuery();
//			
//			while(resultSet.next()) {
//				configurationMap.put(resultSet.getString("ALIAS"), resultSet.getString("VALUE"));
//			}
//			
//			Logger.logInfo(MODULE, "********************* Configuration Values *********************");
//			for (Map.Entry<String, String> entry : configurationMap.entrySet()) {
//				Logger.logDebug(MODULE, entry.getKey() + " : " + entry.getValue());
//			}
//			
//		} catch (SQLException e) {
//			Logger.logError(MODULE, "Error while getting details of Configuration. Reason: " + e.getMessage());
//			Logger.logTrace(MODULE, e);
//		} catch (Exception e) {
//			Logger.logError(MODULE, "Error while getting details of Configuration. Reason: " + e.getMessage());
//			Logger.logTrace(MODULE, e);
//		} finally {
//			if(resultSet != null) {
//				try {
//					resultSet.close();
//				} catch (SQLException e) {
//					Logger.logError(MODULE, "Error in closing ResultSet, Reason: " + e.getMessage());
//					Logger.logTrace(MODULE, e);
//				}
//			}
//			if(preparedStatement != null) {
//				try {
//					preparedStatement.close();
//				} catch (SQLException e) {
//					Logger.logError(MODULE, "Error in closing Prepare Statement, Reason: " + e.getMessage());
//					Logger.logTrace(MODULE, e);
//				}
//			}
//			if(connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					Logger.logError(MODULE, "Error in closing Connection, Reason: " + e.getMessage());
//					Logger.logTrace(MODULE, e);
//				}
//			}
//		}
//		
//		return configurationMap;
//	}

//	public void initializeCRMServices(){
//		
//		try{
//			
//			if(isCRMInitialized){
//				
//				return;
//			}
//			
//			readCRMConfigFile();
//
//			String imsiServiceLocation = getCRMServiceURL("imsiwsdl.url");
//			if(imsiServiceLocation!=null)
//				fetchIMSIWsLocation_URL = new URL(imsiServiceLocation);
//			
//			Logger.logInfo(MODULE,"Fecth IMSI Service URL: "+fetchIMSIWsLocation_URL);
//			fetchIMSIEnvelopeWS = new com.concierge.schema.imsistatus.EaiEnvelope(fetchIMSIWsLocation_URL);
//			
//			String topUpBalanceLocation = getCRMServiceURL("topupbalance.url");
//			if(topUpBalanceLocation!=null)
//				topUpBalanceWsLocation_URL = new URL(topUpBalanceLocation);
//			
//			Logger.logInfo(MODULE,"Top up balance Service URL: "+topUpBalanceWsLocation_URL);
//			topUpBalanceWS = new com.concierge.schema.topup.EaiEnvelope(topUpBalanceWsLocation_URL, SERVICE_NAME);
//			
//			String purchaseBundleLocation = getCRMServiceURL("purchasebundle.url");
//			if(purchaseBundleLocation!=null)
//				purchaseBundleWsLocation_URL = new URL(purchaseBundleLocation);
//			
//			Logger.logInfo(MODULE,"Purchase bundle Service URL: "+purchaseBundleWsLocation_URL);
//			purchaseBundleWS = new com.concierge.schema.purchasebundle.EaiEnvelope(purchaseBundleWsLocation_URL, SERVICE_NAME);
//			
//			String updateBalanceLocation = getCRMServiceURL("updatemainbalance.url");
//			if(updateBalanceLocation!=null)
//				mainBalanceUpdateWsLocation_URL = new URL(updateBalanceLocation);
//			
//			Logger.logInfo(MODULE,"Update main balance Service URL: "+mainBalanceUpdateWsLocation_URL);
//			updateBalanceWS = new com.concierge.schema.updatebalance.EaiEnvelope(mainBalanceUpdateWsLocation_URL, SERVICE_NAME);
//			
//			String balanceDetailServiceLocation = getCRMServiceURL("balancedetail.url");
//			if(balanceDetailServiceLocation!=null)
//				balanceDetailWsLocation_URL = new URL(balanceDetailServiceLocation);
//			
//			Logger.logInfo(MODULE,"Get Balance Detail Service URL: "+balanceDetailWsLocation_URL);
//			balanceDetailWS = new com.concierge.schema.balancedetail.EaiEnvelope(balanceDetailWsLocation_URL, SERVICE_NAME);
//			
//			String syncBundleServiceLocation = getCRMServiceURL("syncbundle.url");
//			if(syncBundleServiceLocation!=null)
//				syncBundlesWsLocation_URL = new URL(syncBundleServiceLocation);
//			
//			Logger.logInfo(MODULE,"Sync Bundle Detail Service URL: "+syncBundlesWsLocation_URL);
//			syncBundleWS = new com.concierge.schema.syncbundle.EaiEnvelope(syncBundlesWsLocation_URL, SERVICE_NAME);
//			
//			isCRMInitialized = true;
//			
//		}catch(Exception ex){
//			
//			Logger.logError(MODULE, "Error in intializeCRMServices. Reason: " + ex.getMessage());
//			Logger.logTrace(MODULE, ex);
//		}
//	}

//	private String getCRMServiceURL(String path){
//		
//		StringBuilder urlBuilder = new StringBuilder();
//		urlBuilder.append(propertyMap.get("crmwebservice.scheme"));
//		urlBuilder.append("://");
//		urlBuilder.append(propertyMap.get("crmwebservice.ip"));
//		urlBuilder.append(":");
//		urlBuilder.append(propertyMap.get("crmwebservice.port"));
//		urlBuilder.append(propertyMap.get("crmwebservice.context"));
//		urlBuilder.append(propertyMap.get(path));
//		return urlBuilder.toString();
//	}

	private void readCRMConfigFile() throws ConfigurationException {
		try {
			File file = new File(absolutePath + File.separator + WS_CRM_FILE);
			Properties properties = new Properties();
			properties.load(new FileInputStream(file));
			for (String name : properties.stringPropertyNames()) {
				propertyMap.put(name, properties.getProperty(name));
			}
		} catch (Exception e) {
			throw new ConfigurationException(e);
		}
	}

//	public List<ReloadConfDetail> reloadServerConfiguration() {
//
//		List<ReloadConfDetail> reloadDetail=new ArrayList<ReloadConfDetail>() ;
//		ReloadConfDetail reloadConfDetail=new ReloadConfDetail();
//		
//		Logger.logInfo(MODULE, "Trying to Reloading Configuration");
//		try {
//			Logger.logInfo(MODULE, "********************* Configuration Values After Reloading *********************");
//
//			initializeServices();
//			
//			reloadConfDetail.setName("Configuration Data");
//			reloadConfDetail.setStatus(ReloadConfStatus.SUCCESS);
//
//		} catch (Exception e) {
//			Logger.logError(MODULE, "Error in Reloading Server Configuration. Reason: " + e.getMessage());
//			Logger.logTrace(MODULE, e);
//
//			reloadConfDetail.setName("Configuration Data");
//			reloadConfDetail.setStatus(ReloadConfStatus.FAIL);
//		}
//		reloadDetail.add(reloadConfDetail);
//
//		Logger.logInfo(MODULE, "Configuration reloaded successfully.");
//		
//
//		return reloadDetail;
//	}

	public String getPropertyValue(String keyName, String defaultValue) {

		if (propertyMap != null && propertyMap.containsKey(keyName)) {

			return propertyMap.get(keyName);
		}

		return defaultValue;

	}

//	public String getConfigValue(String keyName,String defaultValue){
//		
//		if(configurationMap!=null && configurationMap.containsKey(keyName)){
//			
//			return configurationMap.get(keyName);
//		}
//		
//		return defaultValue;
//		
//	}

	private void readWSConfigFile() throws ConfigurationException {
		try {
			File file = new File(absolutePath + File.separator + WS_CONFIG_FILE);
			Properties properties = new Properties();
			properties.load(new FileInputStream(file));
			for (String name : properties.stringPropertyNames()) {
				configurationMap.put(name, properties.getProperty(name));
			}
		} catch (Exception e) {
			throw new ConfigurationException(e);
		}
	}

	public boolean isInialized() {
		return isInialized;
	}

	public RestHttpClient getRestHttpClient() {
		return restHttpClient;
	}
	
	public RestHttpClient getSecRestHttpClient() {
		return secRestHttpClient;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public WebServiceClient getWsClient() {
		return wsClient;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	public Map<String, String> getPropertyMap() {
		return propertyMap;
	}

	public Map<String, String> getCrmConfigurationMap() {
		return propertyMap;
	}

	public Map<String, String> getConfigurationMap() {
		return configurationMap;
	}

	public ILogger getLogger() {
		return logger;
	}

	public DataSource getMobileServerDataSource() {
		return mobileServerDataSource;
	}

	public DataSource getMiddlewareDataSource() {
		return middlewareDataSource;
	}

//	public AuditService getAuditService() {
//		return auditService;
//	}

	public String getEliteSMPURL() {
		return eliteSMPURL;
	}

	public void setEliteSMPURL(String eliteSMPURL) {
		this.eliteSMPURL = eliteSMPURL;
	}
	
	public String getSecPCCURL() {
		return secPCCURL;
	}

	public void setSecPCCURL(String secPCCURL) {
		this.secPCCURL = secPCCURL;
	}
	
//	public Map<String, WipCalledStations> getHotSpotDetails() {
//		return hotSpotDetails;
//	}
//
//	public void setHotSpotDetails(Map<String, WipCalledStations> hotSpotDetails) {
//		this.hotSpotDetails = hotSpotDetails;
//	}

	public boolean isCRMInitialized() {
		return isCRMInitialized;
	}

	public void setCRMInitialized(boolean isCRMInitialized) {
		this.isCRMInitialized = isCRMInitialized;
	}
}
