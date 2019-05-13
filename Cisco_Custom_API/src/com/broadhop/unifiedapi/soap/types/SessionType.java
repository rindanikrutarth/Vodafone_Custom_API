/**
 * SessionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;


/**
 * Similar to the  a SessionType is a map of key:value pairs.
 *         CPS is very flexible and allows for many session configurations.
 * Therefore, all data is
 *         structured as a map of key:value pairs. Therefore, from deployment
 * to deployment, a session
 *         can look different.
 */
public class SessionType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SessionKeyType sessionKey;

    private com.broadhop.unifiedapi.soap.types.EntryType[][] sessionObject;

    public SessionType() {
    }

    public SessionType(
           com.broadhop.unifiedapi.soap.types.SessionKeyType sessionKey,
           com.broadhop.unifiedapi.soap.types.EntryType[][] sessionObject) {
           this.sessionKey = sessionKey;
           this.sessionObject = sessionObject;
    }


    /**
     * Gets the sessionKey value for this SessionType.
     * 
     * @return sessionKey
     */
    public com.broadhop.unifiedapi.soap.types.SessionKeyType getSessionKey() {
        return sessionKey;
    }


    /**
     * Sets the sessionKey value for this SessionType.
     * 
     * @param sessionKey
     */
    public void setSessionKey(com.broadhop.unifiedapi.soap.types.SessionKeyType sessionKey) {
        this.sessionKey = sessionKey;
    }


    /**
     * Gets the sessionObject value for this SessionType.
     * 
     * @return sessionObject
     */
    public com.broadhop.unifiedapi.soap.types.EntryType[][] getSessionObject() {
        return sessionObject;
    }


    /**
     * Sets the sessionObject value for this SessionType.
     * 
     * @param sessionObject
     */
    public void setSessionObject(com.broadhop.unifiedapi.soap.types.EntryType[][] sessionObject) {
        this.sessionObject = sessionObject;
    }

    public com.broadhop.unifiedapi.soap.types.EntryType[] getSessionObject(int i) {
        return this.sessionObject[i];
    }

    public void setSessionObject(int i, com.broadhop.unifiedapi.soap.types.EntryType[] _value) {
        this.sessionObject[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionType)) return false;
        SessionType other = (SessionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionKey==null && other.getSessionKey()==null) || 
             (this.sessionKey!=null &&
              this.sessionKey.equals(other.getSessionKey()))) &&
            ((this.sessionObject==null && other.getSessionObject()==null) || 
             (this.sessionObject!=null &&
              java.util.Arrays.equals(this.sessionObject, other.getSessionObject())));
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
        if (getSessionKey() != null) {
            _hashCode += getSessionKey().hashCode();
        }
        if (getSessionObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionObject(), i);
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
        new org.apache.axis.description.TypeDesc(SessionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "sessionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionKeyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "sessionObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "MapType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
