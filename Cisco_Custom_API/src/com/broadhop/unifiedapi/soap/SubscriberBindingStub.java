/**
 * SubscriberBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap;

public class SubscriberBindingStub extends org.apache.axis.client.Stub implements com.broadhop.unifiedapi.soap.SubscriberPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[55];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialRequest"), com.broadhop.unifiedapi.soap.types.AddCredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AddCredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCredentials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsRequest"), com.broadhop.unifiedapi.soap.types.AddCredentialsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AddCredentialsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceRequest"), com.broadhop.unifiedapi.soap.types.AddServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AddServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuthenticateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuthenticateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCredentialPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialPasswordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordRequest"), com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCredentialUsername");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialUsernameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameRequest"), com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialUsernameResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubscriberAvps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberAvpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsRequest"), com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberAvpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSubscriberStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusRequest"), com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersRequest"), com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCredential");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialRequest"), com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCredentials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsRequest"), com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceRequest"), com.broadhop.unifiedapi.soap.types.DeleteServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberRequest"), com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriberCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GetSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("KeepAlive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "KeepAliveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveRequest"), com.broadhop.unifiedapi.soap.types.KeepAliveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.KeepAliveResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "KeepAliveResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProvisionService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ProvisionServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceRequest"), com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ProvisionServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersRequest"), com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SwitchService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SwitchServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceRequest"), com.broadhop.unifiedapi.soap.types.SwitchServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.SwitchServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SwitchServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceRequest"), com.broadhop.unifiedapi.soap.types.UpdateServiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.UpdateServiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateServiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionRequest"), com.broadhop.unifiedapi.soap.types.ExecuteActionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ExecuteActionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuerySession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuerySessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionRequest"), com.broadhop.unifiedapi.soap.types.QuerySessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.QuerySessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuerySessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StopSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StopSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionRequest"), com.broadhop.unifiedapi.soap.types.StopSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.StopSessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StopSessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionRequest"), com.broadhop.unifiedapi.soap.types.UpdateSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.UpdateSessionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSessionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeBalanceSubscriberId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBalanceSubscriberIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdRequest"), com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBalanceSubscriberIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeRecurringRefreshDay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeRecurringRefreshDayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayRequest"), com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeRecurringRefreshDayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeBillCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBillCycleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleRequest"), com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBillCycleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceRequest"), com.broadhop.unifiedapi.soap.types.CreateBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreateBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Credit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditRequest"), com.broadhop.unifiedapi.soap.types.CreditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Debit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DebitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitRequest"), com.broadhop.unifiedapi.soap.types.DebitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DebitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DebitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceRequest"), com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCredit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditRequest"), com.broadhop.unifiedapi.soap.types.DeleteCreditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteCreditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCreditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteQuota");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteQuotaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaRequest"), com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteQuotaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExtendCredit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditRequest"), com.broadhop.unifiedapi.soap.types.ExtendCreditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.ExtendCreditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceRequest"), com.broadhop.unifiedapi.soap.types.QueryBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.QueryBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RolloverCredit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RolloverCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditRequest"), com.broadhop.unifiedapi.soap.types.RolloverCreditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.RolloverCreditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RolloverCreditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceRequest"), com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherRequest"), com.broadhop.unifiedapi.soap.types.CreateVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreateVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateVouchers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVouchersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersRequest"), com.broadhop.unifiedapi.soap.types.CreateVouchersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.CreateVouchersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVouchersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherRequest"), com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteVoucherBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchRequest"), com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherBatchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GenerateVoucherBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GenerateVoucherBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchRequest"), com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GenerateVoucherBatchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherRequest"), com.broadhop.unifiedapi.soap.types.QueryVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.QueryVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RedeemVoucher");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RedeemVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherRequest"), com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RedeemVoucherResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Audit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditRequest"), com.broadhop.unifiedapi.soap.types.AuditRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AuditResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PurgeAuditHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "PurgeAuditHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryRequest"), com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "PurgeAuditHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryAuditHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryAuditHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryRequest"), com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryAuditHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRefDataServices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesRequest"), com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataServicesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRefDataBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceRequest"), com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataBalanceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveSubscriberSsid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RemoveSubscriberSsidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidRequest"), com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RemoveSubscriberSsidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSubscriberSsids");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddSubscriberSsidsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsRequest"), com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddSubscriberSsidsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubscriberSsids");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberSsidsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberSsidsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriberSsid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberSsidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidRequest"), com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidResponse"));
        oper.setReturnClass(com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberSsidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

    }

    public SubscriberBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">>ChangeBillCycleRequest>newBillCycleDay");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">>ChangeRecurringRefreshDayRequest>newDayOfTheMonth");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">>GenerateVoucherBatchRequest>batchAmount");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddCredentialRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddCredentialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddCredentialsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddCredentialsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">BalanceType>billCycle");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceType>billCycle");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceType>recurrenceLimit");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateVouchersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateVouchersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditType>rolloverPeriodUnits");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreditTypeRolloverPeriodUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DebitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DebitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCreditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteCreditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ExecuteActionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ExecuteActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ExtendCreditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ExtendCreditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditType>amount");
            cachedSerQNames.add(qName);
            cls = long.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditType>minutes");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenericErrorResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GenericErrorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.KeepAliveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.KeepAliveResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">NameType>fullName");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">NotificationType>transport");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.NotificationTypeTransport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QuerySessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QuerySessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QueryVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RepeatType>dayOfMonth");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RepeatType>dayOfWeek");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RepeatType>month");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RepeatType>year");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ResponseType>errorCode");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RolloverCreditRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RolloverCreditResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ScheduleType>endTime");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ScheduleType>startTime");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ScheduleType>state");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ScheduleTypeState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.StopSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.StopSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SwitchServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SwitchServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ThresholdType>type");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ThresholdTypeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UserType>authType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UserTypeAuthType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UserType>externalId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UserType>role");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UserTypeRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">VoucherKeyType>limit");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">VoucherKeyType>skip");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">VoucherType>durationMeasure");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.VoucherTypeDurationMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditKeyType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuditKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AuditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.AvpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BalanceType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.BalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BaseRequestAuditType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.BaseRequestAuditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BaseRequestNetworkIdType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BillingInfoType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.BillingInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreateBalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CredentialType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CredentialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.CreditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.DeleteBalanceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "EntryType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.EntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionResponseType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.EntryType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "MapType");
            qName2 = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "responseObject");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ExtendCreditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "KeyFieldType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.KeyFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ListType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "MapType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.EntryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "EntryType");
            qName2 = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "NameType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.NameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuotaType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.QuotaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataBalanceTemplateType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataQuotaTemplateType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataServiceType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RefDataServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataThresholdType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RefDataThresholdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RepeatType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.RepeatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReservationType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ReservationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ResponseType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnCreditType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ReturnCreditType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnDebitType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ReturnDebitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ScheduleType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ScheduleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SearchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionKeyType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SessionKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SessionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SsidType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SsidType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberSSIDType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SubscriberSSIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.SubscriberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ThresholdType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.ThresholdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "TotalsType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.TotalsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UserType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherBatchKeyType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.VoucherBatchKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherKeyType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.VoucherKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherLocationKeyType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.VoucherLocationKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherType");
            cachedSerQNames.add(qName);
            cls = com.broadhop.unifiedapi.soap.types.VoucherType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.broadhop.unifiedapi.soap.types.AddCredentialResponse addCredential(com.broadhop.unifiedapi.soap.types.AddCredentialRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/AddCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AddCredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AddCredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AddCredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.AddCredentialsResponse addCredentials(com.broadhop.unifiedapi.soap.types.AddCredentialsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/AddCredentials");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddCredentials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AddCredentialsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AddCredentialsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AddCredentialsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.AddServiceResponse addService(com.broadhop.unifiedapi.soap.types.AddServiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/AddService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AddServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AddServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AddServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse authenticateSubscriber(com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/AuthenticateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AuthenticateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse changeCredentialPassword(com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeCredentialPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCredentialPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse changeCredentialUsername(com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeCredentialUsername");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCredentialUsername"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse changeSubscriberAvps(com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeSubscriberAvps");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubscriberAvps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse changeSubscriberStatus(com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeSubscriberStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeSubscriberStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse createSubscriber(com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/CreateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse createSubscribers(com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/CreateSubscribers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse deleteCredential(com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteCredential");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCredential"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse deleteCredentials(com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteCredentials");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCredentials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteServiceResponse deleteService(com.broadhop.unifiedapi.soap.types.DeleteServiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse deleteSubscriber(com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse getSubscriberCount(com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GetSubscriberCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSubscriberCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberResponse getSubscriber(com.broadhop.unifiedapi.soap.types.GetSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GetSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GetSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.KeepAliveResponse keepAlive(com.broadhop.unifiedapi.soap.types.KeepAliveRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/KeepAlive");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "KeepAlive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.KeepAliveResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.KeepAliveResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.KeepAliveResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse provisionService(com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ProvisionService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProvisionService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse searchSubscribers(com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/SearchSubscribers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.SwitchServiceResponse switchService(com.broadhop.unifiedapi.soap.types.SwitchServiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/SwitchService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SwitchService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.SwitchServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.SwitchServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.SwitchServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.UpdateServiceResponse updateService(com.broadhop.unifiedapi.soap.types.UpdateServiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/UpdateService");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.UpdateServiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.UpdateServiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.UpdateServiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse updateSubscriber(com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/UpdateSubscriber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ExecuteActionResponse executeAction(com.broadhop.unifiedapi.soap.types.ExecuteActionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ExecuteAction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExecuteAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ExecuteActionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ExecuteActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ExecuteActionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.QuerySessionResponse querySession(com.broadhop.unifiedapi.soap.types.QuerySessionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/QuerySession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QuerySession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.QuerySessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.QuerySessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.QuerySessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.StopSessionResponse stopSession(com.broadhop.unifiedapi.soap.types.StopSessionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/StopSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "StopSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.StopSessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.StopSessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.StopSessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.UpdateSessionResponse updateSession(com.broadhop.unifiedapi.soap.types.UpdateSessionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/UpdateSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.UpdateSessionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.UpdateSessionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.UpdateSessionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse changeBalanceSubscriberId(com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeBalanceSubscriberId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeBalanceSubscriberId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse changeRecurringRefreshDay(com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeRecurringRefreshDay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeRecurringRefreshDay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse changeBillCycle(com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ChangeBillCycle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeBillCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreateBalanceResponse createBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/CreateBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreateBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreateBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreateBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreditResponse credit(com.broadhop.unifiedapi.soap.types.CreditRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/Credit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Credit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DebitResponse debit(com.broadhop.unifiedapi.soap.types.DebitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/Debit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Debit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DebitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DebitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DebitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse deleteBalance(com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCreditResponse deleteCredit(com.broadhop.unifiedapi.soap.types.DeleteCreditRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteCredit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteCredit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteCreditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteCreditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteCreditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse deleteQuota(com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteQuota");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteQuota"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.ExtendCreditResponse extendCredit(com.broadhop.unifiedapi.soap.types.ExtendCreditRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/ExtendCredit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ExtendCredit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.ExtendCreditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.ExtendCreditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.ExtendCreditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.QueryBalanceResponse queryBalance(com.broadhop.unifiedapi.soap.types.QueryBalanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/QueryBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.QueryBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.QueryBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.QueryBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.RolloverCreditResponse rolloverCredit(com.broadhop.unifiedapi.soap.types.RolloverCreditRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/RolloverCredit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RolloverCredit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.RolloverCreditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.RolloverCreditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.RolloverCreditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse updateBalance(com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/UpdateBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreateVoucherResponse createVoucher(com.broadhop.unifiedapi.soap.types.CreateVoucherRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/CreateVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreateVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreateVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreateVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.CreateVouchersResponse createVouchers(com.broadhop.unifiedapi.soap.types.CreateVouchersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/CreateVouchers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateVouchers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.CreateVouchersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.CreateVouchersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.CreateVouchersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse deleteVoucher(com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse deleteVoucherBatch(com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteVoucherBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteVoucherBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse generateVoucherBatch(com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GenerateVoucherBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GenerateVoucherBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.QueryVoucherResponse queryVoucher(com.broadhop.unifiedapi.soap.types.QueryVoucherRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/QueryVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.QueryVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.QueryVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.QueryVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse redeemVoucher(com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/RedeemVoucher");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RedeemVoucher"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.AuditResponse audit(com.broadhop.unifiedapi.soap.types.AuditRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/Audit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Audit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AuditResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AuditResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AuditResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse purgeAuditHistory(com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/PurgeAuditHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PurgeAuditHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse queryAuditHistory(com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/QueryAuditHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryAuditHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse getRefDataServices(com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GetRefDataServices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRefDataServices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse getRefDataBalance(com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GetRefDataBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetRefDataBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse removeSubscriberSsid(com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/RemoveSubscriberSsid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveSubscriberSsid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse addSubscriberSsids(com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/AddSubscriberSsids");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AddSubscriberSsids"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse getSubscriberSsids(com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/GetSubscriberSsids");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSubscriberSsids"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse deleteSubscriberSsid(com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://broadhop.com/ua/DeleteSubscriberSsid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscriberSsid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
