/**
 * SubscriberSSIDType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class SubscriberSSIDType  implements java.io.Serializable {
    private java.lang.String subscriberId;

    private com.broadhop.unifiedapi.soap.types.SsidType[] ssidList;

    public SubscriberSSIDType() {
    }

    public SubscriberSSIDType(
           java.lang.String subscriberId,
           com.broadhop.unifiedapi.soap.types.SsidType[] ssidList) {
           this.subscriberId = subscriberId;
           this.ssidList = ssidList;
    }


    /**
     * Gets the subscriberId value for this SubscriberSSIDType.
     * 
     * @return subscriberId
     */
    public java.lang.String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this SubscriberSSIDType.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the ssidList value for this SubscriberSSIDType.
     * 
     * @return ssidList
     */
    public com.broadhop.unifiedapi.soap.types.SsidType[] getSsidList() {
        return ssidList;
    }


    /**
     * Sets the ssidList value for this SubscriberSSIDType.
     * 
     * @param ssidList
     */
    public void setSsidList(com.broadhop.unifiedapi.soap.types.SsidType[] ssidList) {
        this.ssidList = ssidList;
    }

    public com.broadhop.unifiedapi.soap.types.SsidType getSsidList(int i) {
        return this.ssidList[i];
    }

    public void setSsidList(int i, com.broadhop.unifiedapi.soap.types.SsidType _value) {
        this.ssidList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberSSIDType)) return false;
        SubscriberSSIDType other = (SubscriberSSIDType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.ssidList==null && other.getSsidList()==null) || 
             (this.ssidList!=null &&
              java.util.Arrays.equals(this.ssidList, other.getSsidList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getSsidList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSsidList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSsidList(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriberSSIDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberSSIDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssidList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ssidList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SsidType"));
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
