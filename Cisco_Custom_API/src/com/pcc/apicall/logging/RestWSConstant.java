package com.pcc.apicall.logging;

public enum RestWSConstant {
	URI_SCHEME("webservice.urischeme"), SEC_URI_SCHEME("webservice.sec.urischeme"), IP_ADDRESS("webservice.ip"), SEC_IP_ADDRESS("webservice.sec.ip"), PORT("webservice.port"), SEC_PORT("webservice.sec.port"), URL("webservice.resturl"), SEC_URL("webservice.sec.resturl"),
	CONNECTION_POOL_SIZE("webservice.httpconnpool"), CONNECTION_TIMEOUT("webservice.conntimeout"),
	USERNAME("auth.username"), PASSWORD("auth.password"), SSL_CERTIFICATE_PATH("webservice.sslcerificatepath"),
	SSL_PASSWORD("webservice.sslpassword"), WALLET_URL("webservice.wallet.resturl"), CONTEXT("webservice.context"), SEC_CONTEXT("webservice.sec.context");

	private String value;

	private RestWSConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
