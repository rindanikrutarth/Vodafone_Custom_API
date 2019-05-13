/**
 * ProvisionServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ProvisionServiceRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.ServiceType[] service;

    private com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance;

    public ProvisionServiceRequest() {
    }

    public ProvisionServiceRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           com.broadhop.unifiedapi.soap.types.ServiceType[] service,
           com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance) {
        super(
            audit,
            networkId);
        this.service = service;
        this.balance = balance;
    }


    /**
     * Gets the service value for this ProvisionServiceRequest.
     * 
     * @return service
     */
    public com.broadhop.unifiedapi.soap.types.ServiceType[] getService() {
        return service;
    }


    /**
     * Sets the service value for this ProvisionServiceRequest.
     * 
     * @param service
     */
    public void setService(com.broadhop.unifiedapi.soap.types.ServiceType[] service) {
        this.service = service;
    }

    public com.broadhop.unifiedapi.soap.types.ServiceType getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.broadhop.unifiedapi.soap.types.ServiceType _value) {
        this.service[i] = _value;
    }


    /**
     * Gets the balance value for this ProvisionServiceRequest.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.CreateBalanceType[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this ProvisionServiceRequest.
     * 
     * @param balance
     */
    public void setBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance) {
        this.balance = balance;
    }

    public com.broadhop.unifiedapi.soap.types.CreateBalanceType getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.broadhop.unifiedapi.soap.types.CreateBalanceType _value) {
        this.balance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisionServiceRequest)) return false;
        ProvisionServiceRequest other = (ProvisionServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvisionServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ProvisionServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
