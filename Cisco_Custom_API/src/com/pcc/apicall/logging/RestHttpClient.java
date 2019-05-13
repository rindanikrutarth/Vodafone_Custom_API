package com.pcc.apicall.logging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.cxf.common.util.Base64Utility;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

//import com.elitecore.core.constant.RestWSConstant;

public class RestHttpClient {
	private String uriScheme;
	private String ip;
	private int port;
	private String context;
	private String serviceEndPoint;
	private HttpClient httpClient;
	private Map<String, String> headers;
	
	private String secPCCUriScheme;
	private String secIp;
	private int secPort;
	private String secContext;

	public RestHttpClient(String uriScheme, String ip, int port, String serviceEndPoint, HttpClient httpClient) {
		this.uriScheme = uriScheme;
		this.ip = ip;
		this.port = port;
		this.serviceEndPoint = serviceEndPoint;
		this.httpClient = httpClient;
		this.headers = new HashMap<String, String>();
	}
	
	public RestHttpClient(String serviceEndPoint, HttpClient httpClient, String secPCCUriScheme, String secIP, int secPort) {
		this.serviceEndPoint = serviceEndPoint;
		this.httpClient = httpClient;
		this.headers = new HashMap<String, String>();
		
		this.secPCCUriScheme = secPCCUriScheme;
		this.secIp = secIP;
		this.secPort = secPort;
	}

	public static RestHttpClient buildRestHttpClient(Map<String, String> parameters) throws ConfigurationException {

		StringBuilder restUrlFullPath = new StringBuilder();
		String context = parameters.get(RestWSConstant.CONTEXT.getValue());
		String tempContext = System.getProperty(RestWSConstant.CONTEXT.getValue());
		if (StringUtils.isNotBlank(tempContext)) {
			context = tempContext;
		}
		if (context != null) {
			restUrlFullPath.append(context);
		}

		String restUrl = parameters.get(RestWSConstant.URL.getValue());
		String tempResturl = System.getProperty(RestWSConstant.URL.getValue());
		if (StringUtils.isNotBlank(tempResturl)) {
			restUrl = tempResturl;
		}
		if (restUrl == null) {
			throw new ConfigurationException(" Parameter[ " + RestWSConstant.URL.getValue() + "] not configured ");
		}

		restUrlFullPath.append(restUrl);

		String uriScheme = parameters.get(RestWSConstant.URI_SCHEME.getValue());
		String tempUrischeme = System.getProperty(RestWSConstant.URI_SCHEME.getValue());
		if (StringUtils.isNotBlank(tempUrischeme)) {
			uriScheme = tempUrischeme;
		}
		if (uriScheme == null) {
			throw new ConfigurationException(
					" Parameter[ " + RestWSConstant.URI_SCHEME.getValue() + "] not configured ");
		}

		String ip = parameters.get(RestWSConstant.IP_ADDRESS.getValue());
		String tempIp = System.getProperty(RestWSConstant.IP_ADDRESS.getValue());
		if (StringUtils.isNotBlank(tempIp)) {
			ip = tempIp;
		}
		if (ip == null) {
			throw new ConfigurationException(" Parameter[wiapwebservice.ip] not configured ");
		}
		String portStr = parameters.get(RestWSConstant.PORT.getValue());
		String tempPort = System.getProperty(RestWSConstant.PORT.getValue());
		if (StringUtils.isNotBlank(tempPort)) {
			portStr = tempPort;
		}
		if (portStr == null) {
			throw new ConfigurationException(" Parameter[ " + RestWSConstant.PORT.getValue() + "] not configured ");
		}
		int port = Integer.parseInt(portStr.trim());

		String serviceEndPoint = restUrlFullPath.toString();

		try {
			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme(uriScheme, 80, PlainSocketFactory.getSocketFactory()));
			PoolingClientConnectionManager poolingClientConnectionManager = new PoolingClientConnectionManager();

			HttpClient httpClient = new DefaultHttpClient(poolingClientConnectionManager);

			String maxPoolStr = parameters.get(RestWSConstant.CONNECTION_POOL_SIZE.getValue());
			String tempHttpconnpool = System.getProperty(RestWSConstant.CONNECTION_POOL_SIZE.getValue());
			if (StringUtils.isNotBlank(tempHttpconnpool)) {
				maxPoolStr = tempHttpconnpool;
			}
			if (maxPoolStr != null) {
				int maxPool = Integer.parseInt(maxPoolStr.trim());
				poolingClientConnectionManager.setMaxTotal(maxPool);
				poolingClientConnectionManager.setDefaultMaxPerRoute(maxPool);
			}

			String connTimeoutStr = parameters.get(RestWSConstant.CONNECTION_TIMEOUT.getValue());
			String tempConntimeout = System.getProperty(RestWSConstant.CONNECTION_TIMEOUT.getValue());
			if (StringUtils.isNotBlank(tempConntimeout)) {
				connTimeoutStr = tempConntimeout;
			}
			if (connTimeoutStr != null) {
				int timeout = Integer.parseInt(connTimeoutStr.trim());
				if (timeout > 0) {
					httpClient.getParams().setParameter(HttpConnectionParams.CONNECTION_TIMEOUT, timeout);
				}
			}

			RestHttpClient restHttpClient = new RestHttpClient(uriScheme, ip, port, serviceEndPoint, httpClient);

			restHttpClient.setContext(context);
			restHttpClient.setUriScheme(uriScheme);
			restHttpClient.setIp(ip);
			restHttpClient.setPort(port);

			/* Authorization */
			String userName = parameters.get(RestWSConstant.USERNAME.getValue());
			String password = parameters.get(RestWSConstant.PASSWORD.getValue());
			String tempUsername = System.getProperty(RestWSConstant.USERNAME.getValue());
			String tempPassword = System.getProperty(RestWSConstant.PASSWORD.getValue());
			if (StringUtils.isNotBlank(tempUsername) && StringUtils.isNotBlank(tempPassword)) {
				userName = tempUsername;
				password = tempPassword;
			}
			if (userName != null && password != null) {
				String credential = Base64Utility.encode((userName.trim() + ":" + password.trim()).getBytes());
				restHttpClient.addHeader("Authorization", "Basic " + credential);
			}

			/* SSL */
			if ("https".equals(uriScheme)) {
				String sslCertificatePath = parameters.get(RestWSConstant.SSL_CERTIFICATE_PATH.getValue());
				String tempSslcerificatepath = System.getProperty(RestWSConstant.SSL_CERTIFICATE_PATH.getValue());
				if (StringUtils.isNotBlank(tempSslcerificatepath)) {
					sslCertificatePath = tempSslcerificatepath;
				}
				if (sslCertificatePath == null) {
					throw new ConfigurationException(
							" Parameter[" + RestWSConstant.SSL_CERTIFICATE_PATH.getValue() + "] not configured ");
				}
				String sslPassword = parameters.get(RestWSConstant.SSL_PASSWORD.getValue());
				String tempSslpassword = System.getProperty(RestWSConstant.SSL_PASSWORD.getValue());
				if (StringUtils.isNotBlank(tempSslpassword)) {
					sslPassword = tempSslpassword;
				}
				if (sslPassword == null) {
					throw new ConfigurationException(
							" Parameter[ " + RestWSConstant.SSL_PASSWORD.getValue() + "] not configured ");
				}
				restHttpClient.enbaleSSL(sslCertificatePath.trim(), sslPassword.trim());
			}

			return restHttpClient;
		} catch (Exception e) {
			throw new ConfigurationException(e);
		}
	}
	
	// New Added Method
	public static RestHttpClient buildSecRestHttpClient(Map<String, String> parameters) throws ConfigurationException {

		StringBuilder restUrlFullPath = new StringBuilder();
		String secContext = parameters.get(RestWSConstant.SEC_CONTEXT.getValue());
		String tempContext = System.getProperty(RestWSConstant.SEC_CONTEXT.getValue());
		if (StringUtils.isNotBlank(tempContext)) {
			secContext = tempContext;
		}
		System.out.println("Secondary Context : " +secContext);
		if (secContext != null) {
			restUrlFullPath.append(secContext);
		}

		String secRestUrl = parameters.get(RestWSConstant.SEC_URL.getValue());
		String tempResturl = System.getProperty(RestWSConstant.SEC_URL.getValue());
		if (StringUtils.isNotBlank(tempResturl)) {
			secRestUrl = tempResturl;
		}
		if (secRestUrl == null) {
			throw new ConfigurationException(" Parameter[ " + RestWSConstant.SEC_URL.getValue() + "] not configured ");
		}

		restUrlFullPath.append(secRestUrl);

		String secUriScheme = parameters.get(RestWSConstant.SEC_URI_SCHEME.getValue());
		String tempUrischeme = System.getProperty(RestWSConstant.SEC_URI_SCHEME.getValue());
		if (StringUtils.isNotBlank(tempUrischeme)) {
			secUriScheme = tempUrischeme;
		}
		if (secUriScheme == null) {
			throw new ConfigurationException(
					" Parameter[ " + RestWSConstant.SEC_URI_SCHEME.getValue() + "] not configured ");
		}

		String secIp = parameters.get(RestWSConstant.SEC_IP_ADDRESS.getValue());
		String tempIp = System.getProperty(RestWSConstant.SEC_IP_ADDRESS.getValue());
		if (StringUtils.isNotBlank(tempIp)) {
			secIp = tempIp;
		}
		if (secIp == null) {
			throw new ConfigurationException(" Parameter[wiapwebservice.ip] not configured ");
		}
		String secPortStr = parameters.get(RestWSConstant.SEC_PORT.getValue());
		String tempPort = System.getProperty(RestWSConstant.SEC_PORT.getValue());
		if (StringUtils.isNotBlank(tempPort)) {
			secPortStr = tempPort;
		}
		if (secPortStr == null) {
			throw new ConfigurationException(" Parameter[ " + RestWSConstant.SEC_PORT.getValue() + "] not configured ");
		}
		int secPort = Integer.parseInt(secPortStr.trim());

		String serviceEndPoint = restUrlFullPath.toString();

		try {
			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme(secUriScheme, 80, PlainSocketFactory.getSocketFactory()));
			PoolingClientConnectionManager poolingClientConnectionManager = new PoolingClientConnectionManager();

			HttpClient httpClient = new DefaultHttpClient(poolingClientConnectionManager);

			String maxPoolStr = parameters.get(RestWSConstant.CONNECTION_POOL_SIZE.getValue());
			String tempHttpconnpool = System.getProperty(RestWSConstant.CONNECTION_POOL_SIZE.getValue());
			if (StringUtils.isNotBlank(tempHttpconnpool)) {
				maxPoolStr = tempHttpconnpool;
			}
			if (maxPoolStr != null) {
				int maxPool = Integer.parseInt(maxPoolStr.trim());
				poolingClientConnectionManager.setMaxTotal(maxPool);
				poolingClientConnectionManager.setDefaultMaxPerRoute(maxPool);
			}

			String connTimeoutStr = parameters.get(RestWSConstant.CONNECTION_TIMEOUT.getValue());
			String tempConntimeout = System.getProperty(RestWSConstant.CONNECTION_TIMEOUT.getValue());
			if (StringUtils.isNotBlank(tempConntimeout)) {
				connTimeoutStr = tempConntimeout;
			}
			if (connTimeoutStr != null) {
				int timeout = Integer.parseInt(connTimeoutStr.trim());
				if (timeout > 0) {
					httpClient.getParams().setParameter(HttpConnectionParams.CONNECTION_TIMEOUT, timeout);
				}
			}

			RestHttpClient restHttpClient = new RestHttpClient(serviceEndPoint, httpClient, secUriScheme, secIp, secPort);

			restHttpClient.setSecContext(secContext);
			restHttpClient.setSecPCCUriScheme(secUriScheme);
			restHttpClient.setSecIp(secIp);
			restHttpClient.setSecPort(secPort);

			/* Authorization */
			String userName = parameters.get(RestWSConstant.USERNAME.getValue());
			String password = parameters.get(RestWSConstant.PASSWORD.getValue());
			String tempUsername = System.getProperty(RestWSConstant.USERNAME.getValue());
			String tempPassword = System.getProperty(RestWSConstant.PASSWORD.getValue());
			if (StringUtils.isNotBlank(tempUsername) && StringUtils.isNotBlank(tempPassword)) {
				userName = tempUsername;
				password = tempPassword;
			}
			if (userName != null && password != null) {
				String credential = Base64Utility.encode((userName.trim() + ":" + password.trim()).getBytes());
				restHttpClient.addHeader("Authorization", "Basic " + credential);
			}

			/* SSL */
			if ("https".equals(secUriScheme)) {
				String sslCertificatePath = parameters.get(RestWSConstant.SSL_CERTIFICATE_PATH.getValue());
				String tempSslcerificatepath = System.getProperty(RestWSConstant.SSL_CERTIFICATE_PATH.getValue());
				if (StringUtils.isNotBlank(tempSslcerificatepath)) {
					sslCertificatePath = tempSslcerificatepath;
				}
				if (sslCertificatePath == null) {
					throw new ConfigurationException(
							" Parameter[" + RestWSConstant.SSL_CERTIFICATE_PATH.getValue() + "] not configured ");
				}
				String sslPassword = parameters.get(RestWSConstant.SSL_PASSWORD.getValue());
				String tempSslpassword = System.getProperty(RestWSConstant.SSL_PASSWORD.getValue());
				if (StringUtils.isNotBlank(tempSslpassword)) {
					sslPassword = tempSslpassword;
				}
				if (sslPassword == null) {
					throw new ConfigurationException(
							" Parameter[ " + RestWSConstant.SSL_PASSWORD.getValue() + "] not configured ");
				}
				restHttpClient.enbaleSSL(sslCertificatePath.trim(), sslPassword.trim());
			}

			return restHttpClient;
		} catch (Exception e) {
			throw new ConfigurationException(e);
		}
	}
	
	

	private void enbaleSSL(String sslCertificatePath, String certificatePassword)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException,
			KeyManagementException, UnrecoverableKeyException {
		KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());

		FileInputStream instream = new FileInputStream(new File(sslCertificatePath));
		try {
			trustStore.load(instream, certificatePassword.toCharArray());
		} finally {
			try {
				instream.close();
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
		}

		SSLSocketFactory socketFactory = new SSLSocketFactory(SSLSocketFactory.TLS, null, null, trustStore, null, null,
				SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

		Scheme sch = new Scheme("https", 443, socketFactory);
		httpClient.getConnectionManager().getSchemeRegistry().register(sch);
	}

	public void addHeader(String headerName, String headerValue) {
		headers.put(headerName, headerValue);
	}

	public HttpResponse executePost(String operationPath, Map<String, String> requestParameters, String requestJSON,
			ContentType contentType) throws URISyntaxException, ClientProtocolException, IOException {
		URIBuilder builder = new URIBuilder();
		builder.setScheme(uriScheme).setHost(ip).setPort(port).setPath(serviceEndPoint + operationPath);
		if (requestParameters != null && !requestParameters.isEmpty()) {
			for (Map.Entry<String, String> entry : requestParameters.entrySet()) {
				builder.setParameter(entry.getKey(), entry.getValue());
			}
		}
		HttpPost postRequest = new HttpPost(builder.build());
		if (contentType != null) {
			postRequest.setHeader("accept", contentType.getMimeType());
		}
		if (requestJSON != null) {
			StringEntity entity = new StringEntity(requestJSON, contentType);
			postRequest.setEntity(entity);
		}

		if (!headers.isEmpty()) {
			for (Map.Entry<String, String> headerEntry : headers.entrySet()) {
				postRequest.addHeader(headerEntry.getKey(), headerEntry.getValue());
			}
		}
		return httpClient.execute(postRequest);
	}

	public HttpResponse executePlain(HttpPost postRequest)
			throws URISyntaxException, ClientProtocolException, IOException {

		return httpClient.execute(postRequest);
	}

	public HttpPost createRequest(String path, Map<String, String> requestParam, boolean setContentType)
			throws URISyntaxException, UnsupportedEncodingException {
		HttpPost postReq = null;

		URIBuilder builder = new URIBuilder();
		builder.setScheme(uriScheme).setHost(ip).setPort(port).setPath(serviceEndPoint + path);
		if (requestParam != null && !requestParam.isEmpty())
			for (Map.Entry<String, String> entry : requestParam.entrySet())
				builder.setParameter(entry.getKey(), entry.getValue());

		postReq = new HttpPost(builder.build());
		if (setContentType) {
			postReq.setHeader("Accept", ContentType.APPLICATION_JSON.getMimeType());
			postReq.setHeader(HTTP.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
		}

		return postReq;
	}

	public String execute(String operationPath, Map<String, String> requestParameters, String requestJSON,
			ContentType contentType) throws URISyntaxException, ClientProtocolException, IOException {
		HttpResponse httpResponse = executePost(operationPath, requestParameters, requestJSON, contentType);
		StatusLine statusLine = httpResponse.getStatusLine();
		HttpEntity entity = httpResponse.getEntity();
		if (entity == null) {
			EntityUtils.consume(entity);
			throw new HttpResponseException(statusLine.getStatusCode(),
					"Error while parsing Web-Service response, Reason: response Body is null");
		}

		if (statusLine.getStatusCode() >= 300 || statusLine.getStatusCode() < 200) {
			EntityUtils.consume(entity);
			throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
		}
		return EntityUtils.toString(entity);
	}

//	@Override
//	public String toString() {
//		return "RestHttpClient [uriScheme=" + uriScheme + ", ip=" + ip + ", port=" + port + ", serviceEndPoint="
//				+ serviceEndPoint + ", httpClient=" + httpClient + ", headers=" + headers + "]";
//	}

	@Override
	public String toString() {
		return "RestHttpClient [uriScheme=" + uriScheme + ", ip=" + ip + ", port=" + port + ", serviceEndPoint="
				+ serviceEndPoint + ", httpClient=" + httpClient + ", headers=" + headers + ", secPCCUriScheme="
				+ secPCCUriScheme + ", secIp=" + secIp + ", secPort=" + secPort + "]";
	}
	
	public String getUriScheme() {
		return uriScheme;
	}


	public void setUriScheme(String uriScheme) {
		this.uriScheme = uriScheme;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	public String getSecPCCUriScheme() {
		return secPCCUriScheme;
	}

	public void setSecPCCUriScheme(String secPCCUriScheme) {
		this.secPCCUriScheme = secPCCUriScheme;
	}

	public String getSecIp() {
		return secIp;
	}

	public void setSecIp(String secIp) {
		this.secIp = secIp;
	}

	public int getSecPort() {
		return secPort;
	}

	public void setSecPort(int secPort) {
		this.secPort = secPort;
	}

	public String getSecContext() {
		return secContext;
	}

	public void setSecContext(String secContext) {
		this.secContext = secContext;
	}


}
