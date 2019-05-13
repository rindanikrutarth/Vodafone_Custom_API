/**
 * AddSubscriberSsidsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class AddSubscriberSsidsRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SsidType[] subscriberSsid;

    public AddSubscriberSsidsRequest() {
    }

    public AddSubscriberSsidsRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           com.broadhop.unifiedapi.soap.types.SsidType[] subscriberSsid) {
        super(
            audit,
            networkId);
        this.subscriberSsid = subscriberSsid;
    }


    /**
     * Gets the subscriberSsid value for this AddSubscriberSsidsRequest.
     * 
     * @return subscriberSsid
     */
    public com.broadhop.unifiedapi.soap.types.SsidType[] getSubscriberSsid() {
        return subscriberSsid;
    }


    /**
     * Sets the subscriberSsid value for this AddSubscriberSsidsRequest.
     * 
     * @param subscriberSsid
     */
    public void setSubscriberSsid(com.broadhop.unifiedapi.soap.types.SsidType[] subscriberSsid) {
        this.subscriberSsid = subscriberSsid;
    }

    public com.broadhop.unifiedapi.soap.types.SsidType getSubscriberSsid(int i) {
        return this.subscriberSsid[i];
    }

    public void setSubscriberSsid(int i, com.broadhop.unifiedapi.soap.types.SsidType _value) {
        this.subscriberSsid[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddSubscriberSsidsRequest)) return false;
        AddSubscriberSsidsRequest other = (AddSubscriberSsidsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberSsid==null && other.getSubscriberSsid()==null) || 
             (this.subscriberSsid!=null &&
              java.util.Arrays.equals(this.subscriberSsid, other.getSubscriberSsid())));
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
        if (getSubscriberSsid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberSsid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberSsid(), i);
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
        new org.apache.axis.description.TypeDesc(AddSubscriberSsidsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">AddSubscriberSsidsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberSsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriberSsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SsidType"));
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
