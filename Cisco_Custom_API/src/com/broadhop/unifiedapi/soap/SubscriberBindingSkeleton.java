/**
 * SubscriberBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap;

public class SubscriberBindingSkeleton implements com.broadhop.unifiedapi.soap.SubscriberPortType, org.apache.axis.wsdl.Skeleton {
    private com.broadhop.unifiedapi.soap.SubscriberPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialRequest"), com.broadhop.unifiedapi.soap.types.AddCredentialRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addCredential", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AddCredential"));
        _oper.setSoapAction("http://broadhop.com/ua/AddCredential");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addCredential") == null) {
            _myOperations.put("addCredential", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addCredential")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsRequest"), com.broadhop.unifiedapi.soap.types.AddCredentialsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addCredentials", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddCredentialsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddCredentialsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AddCredentials"));
        _oper.setSoapAction("http://broadhop.com/ua/AddCredentials");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addCredentials") == null) {
            _myOperations.put("addCredentials", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addCredentials")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceRequest"), com.broadhop.unifiedapi.soap.types.AddServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addService", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AddService"));
        _oper.setSoapAction("http://broadhop.com/ua/AddService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addService") == null) {
            _myOperations.put("addService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuthenticateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("authenticateSubscriber", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuthenticateSubscriberResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuthenticateSubscriberResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AuthenticateSubscriber"));
        _oper.setSoapAction("http://broadhop.com/ua/AuthenticateSubscriber");
        _myOperationsList.add(_oper);
        if (_myOperations.get("authenticateSubscriber") == null) {
            _myOperations.put("authenticateSubscriber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("authenticateSubscriber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialPasswordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordRequest"), com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeCredentialPassword", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialPasswordResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialPasswordResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeCredentialPassword"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeCredentialPassword");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeCredentialPassword") == null) {
            _myOperations.put("changeCredentialPassword", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeCredentialPassword")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialUsernameRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameRequest"), com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeCredentialUsername", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeCredentialUsernameResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeCredentialUsernameResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeCredentialUsername"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeCredentialUsername");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeCredentialUsername") == null) {
            _myOperations.put("changeCredentialUsername", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeCredentialUsername")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberAvpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsRequest"), com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeSubscriberAvps", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberAvpsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeSubscriberAvps"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeSubscriberAvps");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeSubscriberAvps") == null) {
            _myOperations.put("changeSubscriberAvps", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeSubscriberAvps")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusRequest"), com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeSubscriberStatus", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeSubscriberStatusResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberStatusResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeSubscriberStatus"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeSubscriberStatus");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeSubscriberStatus") == null) {
            _myOperations.put("changeSubscriberStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeSubscriberStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createSubscriber", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscriberResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreateSubscriber"));
        _oper.setSoapAction("http://broadhop.com/ua/CreateSubscriber");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createSubscriber") == null) {
            _myOperations.put("createSubscriber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createSubscriber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersRequest"), com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createSubscribers", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateSubscribersResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreateSubscribers"));
        _oper.setSoapAction("http://broadhop.com/ua/CreateSubscribers");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createSubscribers") == null) {
            _myOperations.put("createSubscribers", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createSubscribers")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialRequest"), com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteCredential", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteCredential"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteCredential");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteCredential") == null) {
            _myOperations.put("deleteCredential", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteCredential")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsRequest"), com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteCredentials", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCredentialsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteCredentials"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteCredentials");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteCredentials") == null) {
            _myOperations.put("deleteCredentials", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteCredentials")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceRequest"), com.broadhop.unifiedapi.soap.types.DeleteServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteService", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteService"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteService") == null) {
            _myOperations.put("deleteService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberRequest"), com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteSubscriber", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteSubscriber"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteSubscriber");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteSubscriber") == null) {
            _myOperations.put("deleteSubscriber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteSubscriber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSubscriberCount", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberCountResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberCountResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetSubscriberCount"));
        _oper.setSoapAction("http://broadhop.com/ua/GetSubscriberCount");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSubscriberCount") == null) {
            _myOperations.put("getSubscriberCount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSubscriberCount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSubscriber", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetSubscriber"));
        _oper.setSoapAction("http://broadhop.com/ua/GetSubscriber");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSubscriber") == null) {
            _myOperations.put("getSubscriber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSubscriber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "KeepAliveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveRequest"), com.broadhop.unifiedapi.soap.types.KeepAliveRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("keepAlive", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "KeepAliveResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">KeepAliveResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "KeepAlive"));
        _oper.setSoapAction("http://broadhop.com/ua/KeepAlive");
        _myOperationsList.add(_oper);
        if (_myOperations.get("keepAlive") == null) {
            _myOperations.put("keepAlive", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("keepAlive")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ProvisionServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceRequest"), com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("provisionService", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ProvisionServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ProvisionService"));
        _oper.setSoapAction("http://broadhop.com/ua/ProvisionService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("provisionService") == null) {
            _myOperations.put("provisionService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("provisionService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersRequest"), com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("searchSubscribers", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchSubscribersResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SearchSubscribers"));
        _oper.setSoapAction("http://broadhop.com/ua/SearchSubscribers");
        _myOperationsList.add(_oper);
        if (_myOperations.get("searchSubscribers") == null) {
            _myOperations.put("searchSubscribers", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("searchSubscribers")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SwitchServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceRequest"), com.broadhop.unifiedapi.soap.types.SwitchServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("switchService", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SwitchServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SwitchService"));
        _oper.setSoapAction("http://broadhop.com/ua/SwitchService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("switchService") == null) {
            _myOperations.put("switchService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("switchService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceRequest"), com.broadhop.unifiedapi.soap.types.UpdateServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateService", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateService"));
        _oper.setSoapAction("http://broadhop.com/ua/UpdateService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateService") == null) {
            _myOperations.put("updateService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateService")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberRequest"), com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateSubscriber", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSubscriberResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSubscriberResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateSubscriber"));
        _oper.setSoapAction("http://broadhop.com/ua/UpdateSubscriber");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateSubscriber") == null) {
            _myOperations.put("updateSubscriber", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateSubscriber")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionRequest"), com.broadhop.unifiedapi.soap.types.ExecuteActionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("executeAction", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ExecuteAction"));
        _oper.setSoapAction("http://broadhop.com/ua/ExecuteAction");
        _myOperationsList.add(_oper);
        if (_myOperations.get("executeAction") == null) {
            _myOperations.put("executeAction", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("executeAction")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuerySessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionRequest"), com.broadhop.unifiedapi.soap.types.QuerySessionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("querySession", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuerySessionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "QuerySession"));
        _oper.setSoapAction("http://broadhop.com/ua/QuerySession");
        _myOperationsList.add(_oper);
        if (_myOperations.get("querySession") == null) {
            _myOperations.put("querySession", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("querySession")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StopSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionRequest"), com.broadhop.unifiedapi.soap.types.StopSessionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("stopSession", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StopSessionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">StopSessionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "StopSession"));
        _oper.setSoapAction("http://broadhop.com/ua/StopSession");
        _myOperationsList.add(_oper);
        if (_myOperations.get("stopSession") == null) {
            _myOperations.put("stopSession", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("stopSession")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionRequest"), com.broadhop.unifiedapi.soap.types.UpdateSessionRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateSession", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateSessionResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateSession"));
        _oper.setSoapAction("http://broadhop.com/ua/UpdateSession");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateSession") == null) {
            _myOperations.put("updateSession", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateSession")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBalanceSubscriberIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdRequest"), com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeBalanceSubscriberId", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBalanceSubscriberIdResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeBalanceSubscriberId"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeBalanceSubscriberId");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeBalanceSubscriberId") == null) {
            _myOperations.put("changeBalanceSubscriberId", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeBalanceSubscriberId")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeRecurringRefreshDayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayRequest"), com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeRecurringRefreshDay", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeRecurringRefreshDayResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeRecurringRefreshDay"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeRecurringRefreshDay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeRecurringRefreshDay") == null) {
            _myOperations.put("changeRecurringRefreshDay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeRecurringRefreshDay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBillCycleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleRequest"), com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("changeBillCycle", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ChangeBillCycleResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBillCycleResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ChangeBillCycle"));
        _oper.setSoapAction("http://broadhop.com/ua/ChangeBillCycle");
        _myOperationsList.add(_oper);
        if (_myOperations.get("changeBillCycle") == null) {
            _myOperations.put("changeBillCycle", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("changeBillCycle")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceRequest"), com.broadhop.unifiedapi.soap.types.CreateBalanceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createBalance", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateBalanceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreateBalance"));
        _oper.setSoapAction("http://broadhop.com/ua/CreateBalance");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createBalance") == null) {
            _myOperations.put("createBalance", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createBalance")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditRequest"), com.broadhop.unifiedapi.soap.types.CreditRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("credit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Credit"));
        _oper.setSoapAction("http://broadhop.com/ua/Credit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("credit") == null) {
            _myOperations.put("credit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("credit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DebitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitRequest"), com.broadhop.unifiedapi.soap.types.DebitRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("debit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DebitResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Debit"));
        _oper.setSoapAction("http://broadhop.com/ua/Debit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("debit") == null) {
            _myOperations.put("debit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("debit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceRequest"), com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteBalance", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteBalanceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteBalance"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteBalance");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteBalance") == null) {
            _myOperations.put("deleteBalance", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteBalance")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditRequest"), com.broadhop.unifiedapi.soap.types.DeleteCreditRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteCredit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteCreditResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteCredit"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteCredit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteCredit") == null) {
            _myOperations.put("deleteCredit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteCredit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteQuotaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaRequest"), com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteQuota", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteQuotaResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteQuotaResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteQuota"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteQuota");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteQuota") == null) {
            _myOperations.put("deleteQuota", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteQuota")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditRequest"), com.broadhop.unifiedapi.soap.types.ExtendCreditRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("extendCredit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "ExtendCredit"));
        _oper.setSoapAction("http://broadhop.com/ua/ExtendCredit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("extendCredit") == null) {
            _myOperations.put("extendCredit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("extendCredit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceRequest"), com.broadhop.unifiedapi.soap.types.QueryBalanceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("queryBalance", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryBalanceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "QueryBalance"));
        _oper.setSoapAction("http://broadhop.com/ua/QueryBalance");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryBalance") == null) {
            _myOperations.put("queryBalance", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryBalance")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RolloverCreditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditRequest"), com.broadhop.unifiedapi.soap.types.RolloverCreditRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rolloverCredit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RolloverCreditResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RolloverCreditResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "RolloverCredit"));
        _oper.setSoapAction("http://broadhop.com/ua/RolloverCredit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rolloverCredit") == null) {
            _myOperations.put("rolloverCredit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rolloverCredit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceRequest"), com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("updateBalance", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UpdateBalanceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateBalanceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "UpdateBalance"));
        _oper.setSoapAction("http://broadhop.com/ua/UpdateBalance");
        _myOperationsList.add(_oper);
        if (_myOperations.get("updateBalance") == null) {
            _myOperations.put("updateBalance", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("updateBalance")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherRequest"), com.broadhop.unifiedapi.soap.types.CreateVoucherRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createVoucher", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVoucherResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVoucherResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreateVoucher"));
        _oper.setSoapAction("http://broadhop.com/ua/CreateVoucher");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createVoucher") == null) {
            _myOperations.put("createVoucher", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createVoucher")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVouchersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersRequest"), com.broadhop.unifiedapi.soap.types.CreateVouchersRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("createVouchers", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateVouchersResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "CreateVouchers"));
        _oper.setSoapAction("http://broadhop.com/ua/CreateVouchers");
        _myOperationsList.add(_oper);
        if (_myOperations.get("createVouchers") == null) {
            _myOperations.put("createVouchers", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("createVouchers")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherRequest"), com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteVoucher", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteVoucher"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteVoucher");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteVoucher") == null) {
            _myOperations.put("deleteVoucher", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteVoucher")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchRequest"), com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteVoucherBatch", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteVoucherBatchResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteVoucherBatch"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteVoucherBatch");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteVoucherBatch") == null) {
            _myOperations.put("deleteVoucherBatch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteVoucherBatch")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GenerateVoucherBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchRequest"), com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("generateVoucherBatch", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GenerateVoucherBatchResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GenerateVoucherBatch"));
        _oper.setSoapAction("http://broadhop.com/ua/GenerateVoucherBatch");
        _myOperationsList.add(_oper);
        if (_myOperations.get("generateVoucherBatch") == null) {
            _myOperations.put("generateVoucherBatch", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("generateVoucherBatch")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherRequest"), com.broadhop.unifiedapi.soap.types.QueryVoucherRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("queryVoucher", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryVoucherResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryVoucherResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "QueryVoucher"));
        _oper.setSoapAction("http://broadhop.com/ua/QueryVoucher");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryVoucher") == null) {
            _myOperations.put("queryVoucher", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryVoucher")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RedeemVoucherRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherRequest"), com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("redeemVoucher", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RedeemVoucherResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RedeemVoucherResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "RedeemVoucher"));
        _oper.setSoapAction("http://broadhop.com/ua/RedeemVoucher");
        _myOperationsList.add(_oper);
        if (_myOperations.get("redeemVoucher") == null) {
            _myOperations.put("redeemVoucher", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("redeemVoucher")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditRequest"), com.broadhop.unifiedapi.soap.types.AuditRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("audit", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AuditResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "Audit"));
        _oper.setSoapAction("http://broadhop.com/ua/Audit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("audit") == null) {
            _myOperations.put("audit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("audit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "PurgeAuditHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryRequest"), com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("purgeAuditHistory", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "PurgeAuditHistoryResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "PurgeAuditHistory"));
        _oper.setSoapAction("http://broadhop.com/ua/PurgeAuditHistory");
        _myOperationsList.add(_oper);
        if (_myOperations.get("purgeAuditHistory") == null) {
            _myOperations.put("purgeAuditHistory", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("purgeAuditHistory")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryAuditHistoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryRequest"), com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("queryAuditHistory", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QueryAuditHistoryResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "QueryAuditHistory"));
        _oper.setSoapAction("http://broadhop.com/ua/QueryAuditHistory");
        _myOperationsList.add(_oper);
        if (_myOperations.get("queryAuditHistory") == null) {
            _myOperations.put("queryAuditHistory", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("queryAuditHistory")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataServicesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesRequest"), com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRefDataServices", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataServicesResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetRefDataServices"));
        _oper.setSoapAction("http://broadhop.com/ua/GetRefDataServices");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRefDataServices") == null) {
            _myOperations.put("getRefDataServices", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRefDataServices")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataBalanceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceRequest"), com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRefDataBalance", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetRefDataBalanceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetRefDataBalance"));
        _oper.setSoapAction("http://broadhop.com/ua/GetRefDataBalance");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRefDataBalance") == null) {
            _myOperations.put("getRefDataBalance", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRefDataBalance")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RemoveSubscriberSsidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidRequest"), com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("removeSubscriberSsid", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RemoveSubscriberSsidResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">RemoveSubscriberSsidResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "RemoveSubscriberSsid"));
        _oper.setSoapAction("http://broadhop.com/ua/RemoveSubscriberSsid");
        _myOperationsList.add(_oper);
        if (_myOperations.get("removeSubscriberSsid") == null) {
            _myOperations.put("removeSubscriberSsid", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("removeSubscriberSsid")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddSubscriberSsidsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsRequest"), com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addSubscriberSsids", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AddSubscriberSsidsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "AddSubscriberSsids"));
        _oper.setSoapAction("http://broadhop.com/ua/AddSubscriberSsids");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addSubscriberSsids") == null) {
            _myOperations.put("addSubscriberSsids", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addSubscriberSsids")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberSsidsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsRequest"), com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSubscriberSsids", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "GetSubscriberSsidsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberSsidsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetSubscriberSsids"));
        _oper.setSoapAction("http://broadhop.com/ua/GetSubscriberSsids");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSubscriberSsids") == null) {
            _myOperations.put("getSubscriberSsids", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSubscriberSsids")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberSsidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidRequest"), com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteSubscriberSsid", _params, new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteSubscriberSsidResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberSsidResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "DeleteSubscriberSsid"));
        _oper.setSoapAction("http://broadhop.com/ua/DeleteSubscriberSsid");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteSubscriberSsid") == null) {
            _myOperations.put("deleteSubscriberSsid", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteSubscriberSsid")).add(_oper);
    }

    public SubscriberBindingSkeleton() {
        this.impl = new com.broadhop.unifiedapi.soap.SubscriberBindingImpl();
    }

    public SubscriberBindingSkeleton(com.broadhop.unifiedapi.soap.SubscriberPortType impl) {
        this.impl = impl;
    }
    public com.broadhop.unifiedapi.soap.types.AddCredentialResponse addCredential(com.broadhop.unifiedapi.soap.types.AddCredentialRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AddCredentialResponse ret = impl.addCredential(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.AddCredentialsResponse addCredentials(com.broadhop.unifiedapi.soap.types.AddCredentialsRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AddCredentialsResponse ret = impl.addCredentials(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.AddServiceResponse addService(com.broadhop.unifiedapi.soap.types.AddServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AddServiceResponse ret = impl.addService(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse authenticateSubscriber(com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AuthenticateSubscriberResponse ret = impl.authenticateSubscriber(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse changeCredentialPassword(com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeCredentialPasswordResponse ret = impl.changeCredentialPassword(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse changeCredentialUsername(com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeCredentialUsernameResponse ret = impl.changeCredentialUsername(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse changeSubscriberAvps(com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeSubscriberAvpsResponse ret = impl.changeSubscriberAvps(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse changeSubscriberStatus(com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeSubscriberStatusResponse ret = impl.changeSubscriberStatus(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse createSubscriber(com.broadhop.unifiedapi.soap.types.CreateSubscriberRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreateSubscriberResponse ret = impl.createSubscriber(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse createSubscribers(com.broadhop.unifiedapi.soap.types.CreateSubscribersRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreateSubscribersResponse ret = impl.createSubscribers(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse deleteCredential(com.broadhop.unifiedapi.soap.types.DeleteCredentialRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteCredentialResponse ret = impl.deleteCredential(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse deleteCredentials(com.broadhop.unifiedapi.soap.types.DeleteCredentialsRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteCredentialsResponse ret = impl.deleteCredentials(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteServiceResponse deleteService(com.broadhop.unifiedapi.soap.types.DeleteServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteServiceResponse ret = impl.deleteService(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse deleteSubscriber(com.broadhop.unifiedapi.soap.types.DeleteSubscriberRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteSubscriberResponse ret = impl.deleteSubscriber(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse getSubscriberCount(com.broadhop.unifiedapi.soap.types.GetSubscriberCountRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GetSubscriberCountResponse ret = impl.getSubscriberCount(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberResponse getSubscriber(com.broadhop.unifiedapi.soap.types.GetSubscriberRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GetSubscriberResponse ret = impl.getSubscriber(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.KeepAliveResponse keepAlive(com.broadhop.unifiedapi.soap.types.KeepAliveRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.KeepAliveResponse ret = impl.keepAlive(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse provisionService(com.broadhop.unifiedapi.soap.types.ProvisionServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ProvisionServiceResponse ret = impl.provisionService(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse searchSubscribers(com.broadhop.unifiedapi.soap.types.SearchSubscribersRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.SearchSubscribersResponse ret = impl.searchSubscribers(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.SwitchServiceResponse switchService(com.broadhop.unifiedapi.soap.types.SwitchServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.SwitchServiceResponse ret = impl.switchService(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.UpdateServiceResponse updateService(com.broadhop.unifiedapi.soap.types.UpdateServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.UpdateServiceResponse ret = impl.updateService(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse updateSubscriber(com.broadhop.unifiedapi.soap.types.UpdateSubscriberRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.UpdateSubscriberResponse ret = impl.updateSubscriber(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ExecuteActionResponse executeAction(com.broadhop.unifiedapi.soap.types.ExecuteActionRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ExecuteActionResponse ret = impl.executeAction(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.QuerySessionResponse querySession(com.broadhop.unifiedapi.soap.types.QuerySessionRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.QuerySessionResponse ret = impl.querySession(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.StopSessionResponse stopSession(com.broadhop.unifiedapi.soap.types.StopSessionRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.StopSessionResponse ret = impl.stopSession(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.UpdateSessionResponse updateSession(com.broadhop.unifiedapi.soap.types.UpdateSessionRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.UpdateSessionResponse ret = impl.updateSession(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse changeBalanceSubscriberId(com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeBalanceSubscriberIdResponse ret = impl.changeBalanceSubscriberId(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse changeRecurringRefreshDay(com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeRecurringRefreshDayResponse ret = impl.changeRecurringRefreshDay(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse changeBillCycle(com.broadhop.unifiedapi.soap.types.ChangeBillCycleRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ChangeBillCycleResponse ret = impl.changeBillCycle(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreateBalanceResponse createBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreateBalanceResponse ret = impl.createBalance(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreditResponse credit(com.broadhop.unifiedapi.soap.types.CreditRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreditResponse ret = impl.credit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DebitResponse debit(com.broadhop.unifiedapi.soap.types.DebitRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DebitResponse ret = impl.debit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse deleteBalance(com.broadhop.unifiedapi.soap.types.DeleteBalanceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteBalanceResponse ret = impl.deleteBalance(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteCreditResponse deleteCredit(com.broadhop.unifiedapi.soap.types.DeleteCreditRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteCreditResponse ret = impl.deleteCredit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse deleteQuota(com.broadhop.unifiedapi.soap.types.DeleteQuotaRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteQuotaResponse ret = impl.deleteQuota(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.ExtendCreditResponse extendCredit(com.broadhop.unifiedapi.soap.types.ExtendCreditRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.ExtendCreditResponse ret = impl.extendCredit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.QueryBalanceResponse queryBalance(com.broadhop.unifiedapi.soap.types.QueryBalanceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.QueryBalanceResponse ret = impl.queryBalance(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.RolloverCreditResponse rolloverCredit(com.broadhop.unifiedapi.soap.types.RolloverCreditRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.RolloverCreditResponse ret = impl.rolloverCredit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse updateBalance(com.broadhop.unifiedapi.soap.types.UpdateBalanceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.UpdateBalanceResponse ret = impl.updateBalance(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreateVoucherResponse createVoucher(com.broadhop.unifiedapi.soap.types.CreateVoucherRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreateVoucherResponse ret = impl.createVoucher(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.CreateVouchersResponse createVouchers(com.broadhop.unifiedapi.soap.types.CreateVouchersRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.CreateVouchersResponse ret = impl.createVouchers(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse deleteVoucher(com.broadhop.unifiedapi.soap.types.DeleteVoucherRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteVoucherResponse ret = impl.deleteVoucher(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse deleteVoucherBatch(com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteVoucherBatchResponse ret = impl.deleteVoucherBatch(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse generateVoucherBatch(com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GenerateVoucherBatchResponse ret = impl.generateVoucherBatch(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.QueryVoucherResponse queryVoucher(com.broadhop.unifiedapi.soap.types.QueryVoucherRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.QueryVoucherResponse ret = impl.queryVoucher(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse redeemVoucher(com.broadhop.unifiedapi.soap.types.RedeemVoucherRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.RedeemVoucherResponse ret = impl.redeemVoucher(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.AuditResponse audit(com.broadhop.unifiedapi.soap.types.AuditRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AuditResponse ret = impl.audit(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse purgeAuditHistory(com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.PurgeAuditHistoryResponse ret = impl.purgeAuditHistory(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse queryAuditHistory(com.broadhop.unifiedapi.soap.types.QueryAuditHistoryRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.QueryAuditHistoryResponse ret = impl.queryAuditHistory(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse getRefDataServices(com.broadhop.unifiedapi.soap.types.GetRefDataServicesRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GetRefDataServicesResponse ret = impl.getRefDataServices(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse getRefDataBalance(com.broadhop.unifiedapi.soap.types.GetRefDataBalanceRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GetRefDataBalanceResponse ret = impl.getRefDataBalance(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse removeSubscriberSsid(com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.RemoveSubscriberSsidResponse ret = impl.removeSubscriberSsid(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse addSubscriberSsids(com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.AddSubscriberSsidsResponse ret = impl.addSubscriberSsids(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse getSubscriberSsids(com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.GetSubscriberSsidsResponse ret = impl.getSubscriberSsids(parameters);
        return ret;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse deleteSubscriberSsid(com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidRequest parameters) throws java.rmi.RemoteException
    {
        com.broadhop.unifiedapi.soap.types.DeleteSubscriberSsidResponse ret = impl.deleteSubscriberSsid(parameters);
        return ret;
    }

}
