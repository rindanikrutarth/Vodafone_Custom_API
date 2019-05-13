/**
 * CreateSubscribersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreateSubscribersRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SubscriberType[] subscriber;

    public CreateSubscribersRequest() {
    }

    public CreateSubscribersRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.SubscriberType[] subscriber) {
        super(
            audit);
        this.subscriber = subscriber;
    }


    /**
     * Gets the subscriber value for this CreateSubscribersRequest.
     * 
     * @return subscriber
     */
    public com.broadhop.unifiedapi.soap.types.SubscriberType[] getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CreateSubscribersRequest.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.broadhop.unifiedapi.soap.types.SubscriberType[] subscriber) {
        this.subscriber = subscriber;
    }

    public com.broadhop.unifiedapi.soap.types.SubscriberType getSubscriber(int i) {
        return this.subscriber[i];
    }

    public void setSubscriber(int i, com.broadhop.unifiedapi.soap.types.SubscriberType _value) {
        this.subscriber[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscribersRequest)) return false;
        CreateSubscribersRequest other = (CreateSubscribersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              java.util.Arrays.equals(this.subscriber, other.getSubscriber())));
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
        if (getSubscriber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriber(), i);
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
        new org.apache.axis.description.TypeDesc(CreateSubscribersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscribersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberType"));
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
