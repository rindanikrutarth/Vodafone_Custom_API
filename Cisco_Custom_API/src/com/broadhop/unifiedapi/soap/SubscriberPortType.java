/**
 * SubscriberPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap;

public interface SubscriberPortType extends java.rmi.Remote {
    public com.broadhop.unifiedapi.soap.types.AddCredentialResponse addCredential(com.broadhop.unifiedapi.soap.types.AddCredentialRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.AddCredentialsResponse addCredentials(com.broadhop.unifiedapi.soap.types.AddCredentialsRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.AddServiceResponse addService(com.broadhop.unifiedapi.soap.types.AddServiceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse authenticateSubscriber(com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse changeCredentialPassword(com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse changeCredentialUsername(com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse changeSubscriberAvps(com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse changeSubscriberStatus(com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse createSubscriber(com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse createSubscribers(com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse deleteCredential(com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse deleteCredentials(com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteServiceResponse deleteService(com.broadhop.unifiedapi.soap.types.DeleteServiceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse deleteSubscriber(com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse getSubscriberCount(com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GetSubscriberResponse getSubscriber(com.broadhop.unifiedapi.soap.types.GetSubscriberRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.KeepAliveResponse keepAlive(com.broadhop.unifiedapi.soap.types.KeepAliveRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse provisionService(com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse searchSubscribers(com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.SwitchServiceResponse switchService(com.broadhop.unifiedapi.soap.types.SwitchServiceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.UpdateServiceResponse updateService(com.broadhop.unifiedapi.soap.types.UpdateServiceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse updateSubscriber(com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ExecuteActionResponse executeAction(com.broadhop.unifiedapi.soap.types.ExecuteActionRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.QuerySessionResponse querySession(com.broadhop.unifiedapi.soap.types.QuerySessionRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.StopSessionResponse stopSession(com.broadhop.unifiedapi.soap.types.StopSessionRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.UpdateSessionResponse updateSession(com.broadhop.unifiedapi.soap.types.UpdateSessionRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse changeBalanceSubscriberId(com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse changeRecurringRefreshDay(com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse changeBillCycle(com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreateBalanceResponse createBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreditResponse credit(com.broadhop.unifiedapi.soap.types.CreditRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DebitResponse debit(com.broadhop.unifiedapi.soap.types.DebitRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse deleteBalance(com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteCreditResponse deleteCredit(com.broadhop.unifiedapi.soap.types.DeleteCreditRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse deleteQuota(com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.ExtendCreditResponse extendCredit(com.broadhop.unifiedapi.soap.types.ExtendCreditRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.QueryBalanceResponse queryBalance(com.broadhop.unifiedapi.soap.types.QueryBalanceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.RolloverCreditResponse rolloverCredit(com.broadhop.unifiedapi.soap.types.RolloverCreditRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse updateBalance(com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreateVoucherResponse createVoucher(com.broadhop.unifiedapi.soap.types.CreateVoucherRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.CreateVouchersResponse createVouchers(com.broadhop.unifiedapi.soap.types.CreateVouchersRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse deleteVoucher(com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse deleteVoucherBatch(com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse generateVoucherBatch(com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.QueryVoucherResponse queryVoucher(com.broadhop.unifiedapi.soap.types.QueryVoucherRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse redeemVoucher(com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.AuditResponse audit(com.broadhop.unifiedapi.soap.types.AuditRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse purgeAuditHistory(com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse queryAuditHistory(com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse getRefDataServices(com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse getRefDataBalance(com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse removeSubscriberSsid(com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse addSubscriberSsids(com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse getSubscriberSsids(com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest parameters) throws java.rmi.RemoteException;
    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse deleteSubscriberSsid(com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest parameters) throws java.rmi.RemoteException;
}
