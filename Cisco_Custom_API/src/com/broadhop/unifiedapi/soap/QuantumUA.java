/**
 * QuantumUA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap;

public interface QuantumUA extends javax.xml.rpc.Service {
    public java.lang.String getSubscriberPortAddress();

    public com.broadhop.unifiedapi.soap.SubscriberPortType getSubscriberPort() throws javax.xml.rpc.ServiceException;

    public com.broadhop.unifiedapi.soap.SubscriberPortType getSubscriberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
