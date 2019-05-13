package com.pcc.apicall.logging;

import java.util.Map;
//import com.elitecore.core.ws.impl.RestExtendedWSClient;
//import com.pcc.apicall.logging.RestLoginWSClient;
//import com.elitecore.core.ws.impl.RestOTPWSClient;
//import com.elitecore.core.ws.impl.RestPartnerDashboardWSClient;
//import com.elitecore.core.ws.impl.RestPartnerWSClient;
//import com.elitecore.core.ws.impl.RestProvisionWSClient;
//import com.elitecore.core.ws.impl.RestWalletWSClient;
//import com.elitecore.corewebin.data.Plan;

public class WebServiceClient implements LoginWSClient /*
														 * ,ProvisionWSClient,OTPWSClient, ExtendedWSClient,
														 * WalletWSClient, PartnerWSClient, PartnerDashboardWSClient
														 */ {
	private LoginWSClient loginWSClient;
//	private ProvisionWSClient provisionWSClient;
//	private OTPWSClient otpWSClient;
//	private ExtendedWSClient extendedWSClient;
//	private WalletWSClient walletWSClient;
//	
//	private PartnerWSClient partnerWSClient;
//	private PartnerDashboardWSClient partnerDashboardWSClient;

	public WebServiceClient(RestHttpClient restHttpClient /* ,RestWalletHttpClient restWalletHttpClient */,
			ILogger logger) {
//		loginWSClient = new RestLoginWSClient(restHttpClient, logger);
//		provisionWSClient = new RestProvisionWSClient( restHttpClient, logger );
//		otpWSClient = new RestOTPWSClient( restHttpClient, logger );
//		extendedWSClient = new RestExtendedWSClient( restHttpClient, logger);
//		walletWSClient = new RestWalletWSClient(restWalletHttpClient, logger);
//		
//		partnerWSClient = new RestPartnerWSClient(restHttpClient, logger);
//		partnerDashboardWSClient = new RestPartnerDashboardWSClient(restHttpClient, logger);
	}

	@Override
	public Map<String, String> wsAddSubscriber() {
		return null;// loginWSClient.wsLogin();
	}
//
//	@Override
//	public Map<String, String> wsLogout(String userIdentity, Map<String, String> additionalInfoMap) {
//		return loginWSClient.wsLogout(userIdentity, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsChangePassword(String userIdentity, String oldPassword, String newPassword,
//			Map<String, String> additionalInfoMap) {
//		return loginWSClient.wsChangePassword(userIdentity, oldPassword, newPassword, additionalInfoMap);
//	}
//	/*@Override
//	public Map<String, String> wsSubscriberChangePassword(String userIdentity, String oldPassword, String newPassword,
//			Map<String, String> additionalInfoMap) {
//		return loginWSClient.wsSubscriberChangePassword(userIdentity, oldPassword, newPassword, additionalInfoMap);
//	}*/
//
//	@Override
//	public Map<String, String> wsForgotPassword(String userIdentity, Map<String, String> additionalInfoMap) {
//		return loginWSClient.wsForgotPassword(userIdentity, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsGetSubscriberData(String userIdentity, Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsGetSubscriberData(userIdentity, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsVoucherVerification(String voucherCode, Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsVoucherVerification(voucherCode, additionalInfoMap);
//	}
//	
//	@Override
//	public Map<String, String> wsPromocodeVerification(String promoCode, Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsPromocodeVerification(promoCode, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsPasswordVerification(String password, Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsPasswordVerification(password, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsRegisterAccount( Map<String, String> registerAccount ) {
//		return provisionWSClient.wsRegisterAccount(registerAccount);
//	}
//
//	@Override
//	public Map<String, String> wsRechargeAccount( Map<String, String> rechargeAccount) {
//		return provisionWSClient.wsRechargeAccount(rechargeAccount);
//	}
//
//	@Override
//	public Map<String, String> wsRenewAccount(Map<String, String> renewAccount) {
//		return provisionWSClient.wsRenewAccount(renewAccount);
//	}
//	
//	@Override
//	public Map<String, String> wsPurgeSubscriber(Map<String, String> purgeSubscriber, String customerType) {
//		return provisionWSClient.wsPurgeSubscriber(purgeSubscriber, customerType);
//	}
//	
//	@Override
//	public List<Plan> wsGetPackages(Map<String, String> packageDetailMap, String operation) {
//		return provisionWSClient.wsGetPackages(packageDetailMap, operation);
//	}
//
//	@Override
//	public List<String> wsGetPaymentGateway(String brandName, Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsGetPaymentGateway(brandName, additionalInfoMap);
//	}
//	
//	@Override
//	public Map<String, String> wsGetActivePromotions(Map<String, String> additionalInfoMap) {
//		return provisionWSClient.wsGetActivePromotions(additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsSendOTP(String mobileNumber, Map<String, String> additionalInfoMap) {
//		return otpWSClient.wsSendOTP(mobileNumber, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsVerifyOTP(String mobileNumber, String otp, Map<String, String> additionalInfoMap) {
//		return otpWSClient.wsVerifyOTP(mobileNumber, otp, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsGetBrandData(Map<String, String> brandDetailMap) {
//		return extendedWSClient.wsGetBrandData(brandDetailMap);
//	}
//
//	@Override
//	public Map<String, String> wsDBScan(String name, String operation,
//			String baseSearch, String queryData, String recordFetchCount,
//			String offset, Map<String, String> additionalInfoMap) {
//		return extendedWSClient.wsDBScan(name, operation, baseSearch, queryData, recordFetchCount, offset, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsSendNotification(String notificationEvent, Map<String, String> additionInfoMap) {
//		return extendedWSClient.wsSendNotification(notificationEvent, additionInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsSessionLookup(Map<String, String> criteriaMap) {
//		return extendedWSClient.wsSessionLookup(criteriaMap);
//	}
//	
//	@Override
//	public Map<String, String> wsCreateWallet(String userName, String password, Map<String, String> walletMap) {
//		return walletWSClient.wsCreateWallet(userName, password, walletMap);
//	}	
//
//	@Override
//	public Map<String, String> wsCreditBalance(String amount, String walletAccountNumber, Map<String, String> additionalMap) {		
//		return walletWSClient.wsCreditBalance(amount, walletAccountNumber, additionalMap);
//	}
//
//	@Override
//	public Map<String, String> wsDebitBalance(String amount, String walletAccountNumber, Map<String, String> additionalMap) {
//		 return walletWSClient.wsDebitBalance(amount, walletAccountNumber, additionalMap);
//	}
//
//	@Override
//	public Map<String, String> wsFindWallet(String subscriberId, Map<String, String> additionalMap) {
//		return walletWSClient.wsFindWallet(subscriberId, additionalMap);
//	}
//
//	
//	
//	
//	
//	
//	
//	@Override
//	public List<Plan> wsGetPartnerPlan(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsGetPartnerPlan(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsAuthenticatePartner(String username, String password, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsAuthenticatePartner(username, password, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsResetPasswordRequest(String username, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsResetPasswordRequest(username, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsResetPassword(String partner, String password, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsResetPassword(partner, password, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsBuyVoucher(String partner, String planJson, Map<String, String> voucherDetailMap) {
//		return partnerWSClient.wsBuyVoucher(partner, planJson, voucherDetailMap);
//	}
//
//	@Override
//	public Map<String, String> wsSearchVoucher(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsSearchVoucher(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsSearchVoucherBatch(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsSearchVoucherBatch(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Response wsDownloadVoucher(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsDownloadVoucher(partner, additionalInfoMap);
//	}
//	
//	@Override
//	public Map<String, String> wsChangeStatus(String partner, String batchJson, String status, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsChangeStatus(partner, batchJson, status, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsUpdatePartnerProfile(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsUpdatePartnerProfile(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsPartnerChangePassword(String partner, String oldPassword, String newPassword, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsPartnerChangePassword(partner, oldPassword, newPassword, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsProcessPartnerPostLogin(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsProcessPartnerPostLogin(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsGetPartnerResources(String partner, Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsGetPartnerResources(partner, additionalInfoMap);
//	}
//	
//	
//	@Override
//	public Map<String, String> wsGetPartnerData(Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsGetPartnerData(additionalInfoMap);
//	}
//	
//	@Override
//	public Map<String, String> wsListSubscribers(Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsListSubscribers(additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsGetBrandsByPartner(Map<String, String> additionalInfoMap) {
//		return partnerWSClient.wsGetBrandsByPartner(additionalInfoMap);
//	}
//
//	
//	@Override
//	public Map<String, String> wsPlanWiseVoucherSummary(String partner, Map<String, String> additionalInfoMap) {
//		return partnerDashboardWSClient.wsPlanWiseVoucherSummary(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsPlanWiseSubscriber(String partner, Map<String, String> additionalInfoMap) {
//		return partnerDashboardWSClient.wsPlanWiseSubscriber(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsPlanWiseRevenue(String partner, Map<String, String> additionalInfoMap) {
//		return partnerDashboardWSClient.wsPlanWiseRevenue(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsBatchWiseVoucher(String partner, Map<String, String> additionalInfoMap) {
//		return partnerDashboardWSClient.wsBatchWiseVoucher(partner, additionalInfoMap);
//	}
//
//	@Override
//	public Map<String, String> wsRenewAccountForPartner(
//			Map<String, String> renewAccountForPartner) {
//		return partnerWSClient.wsRenewAccountForPartner(renewAccountForPartner);
//	}
//
//	@Override
//	public Map<String, String> wsUpdatePartnerBalance(
//			Map<String, String> partnerDetails) {
//		return partnerWSClient.wsUpdatePartnerBalance(partnerDetails);
//	}
//
//	@Override
//	public Map<String, String> wsRechargeAccountForPartner(
//			Map<String, String> rechargeAccountForPartner) {
//		return partnerWSClient.wsRechargeAccountForPartner(rechargeAccountForPartner);
//	}
//
//	@Override
//	public Map<String, String> wsRegisterAccountForPartner(
//			Map<String, String> registerAccountForPartner) {
//		return partnerWSClient.wsRegisterAccountForPartner(registerAccountForPartner);
//	}
//	
//	@Override
//	public Map<String, String> wsUpdateSubscriberStatus(
//			Map<String, String> updateSubscriberStatus) {
//		return provisionWSClient.wsUpdateSubscriberStatus(updateSubscriberStatus);
//	}
}
