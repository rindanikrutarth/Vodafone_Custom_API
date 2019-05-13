/**
 * QuantumUALocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap;

public class QuantumUALocator extends org.apache.axis.client.Service implements com.broadhop.unifiedapi.soap.QuantumUA {

    public QuantumUALocator() {
    }


    public QuantumUALocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuantumUALocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberPort
    private java.lang.String SubscriberPort_address = "https://lbvip01:8443/ua/soap";

    public java.lang.String getSubscriberPortAddress() {
        return SubscriberPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberPortWSDDServiceName = "SubscriberPort";

    public java.lang.String getSubscriberPortWSDDServiceName() {
        return SubscriberPortWSDDServiceName;
    }

    public void setSubscriberPortWSDDServiceName(java.lang.String name) {
        SubscriberPortWSDDServiceName = name;
    }

    public com.broadhop.unifiedapi.soap.SubscriberPortType getSubscriberPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberPort(endpoint);
    }

    public com.broadhop.unifiedapi.soap.SubscriberPortType getSubscriberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.broadhop.unifiedapi.soap.SubscriberBindingStub _stub = new com.broadhop.unifiedapi.soap.SubscriberBindingStub(portAddress, this);
            _stub.setPortName(getSubscriberPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberPortEndpointAddress(java.lang.String address) {
        SubscriberPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.broadhop.unifiedapi.soap.SubscriberPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.broadhop.unifiedapi.soap.SubscriberBindingStub _stub = new com.broadhop.unifiedapi.soap.SubscriberBindingStub(new java.net.URL(SubscriberPort_address), this);
                _stub.setPortName(getSubscriberPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SubscriberPort".equals(inputPortName)) {
            return getSubscriberPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap", "QuantumUA");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap", "SubscriberPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberPort".equals(portName)) {
            setSubscriberPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
