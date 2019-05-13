/**
 * QuerySessionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class QuerySessionResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SessionType[] session;

    public QuerySessionResponse() {
    }

    public QuerySessionResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.SessionType[] session) {
        super(
            errorCode,
            errorMessage);
        this.session = session;
    }


    /**
     * Gets the session value for this QuerySessionResponse.
     * 
     * @return session
     */
    public com.broadhop.unifiedapi.soap.types.SessionType[] getSession() {
        return session;
    }


    /**
     * Sets the session value for this QuerySessionResponse.
     * 
     * @param session
     */
    public void setSession(com.broadhop.unifiedapi.soap.types.SessionType[] session) {
        this.session = session;
    }

    public com.broadhop.unifiedapi.soap.types.SessionType getSession(int i) {
        return this.session[i];
    }

    public void setSession(int i, com.broadhop.unifiedapi.soap.types.SessionType _value) {
        this.session[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySessionResponse)) return false;
        QuerySessionResponse other = (QuerySessionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              java.util.Arrays.equals(this.session, other.getSession())));
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
        if (getSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSession(), i);
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
        new org.apache.axis.description.TypeDesc(QuerySessionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QuerySessionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionType"));
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
