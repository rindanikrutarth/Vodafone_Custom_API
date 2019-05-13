/**
 * PurgeAuditHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class PurgeAuditHistoryRequest  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.AuditKeyType key;

    public PurgeAuditHistoryRequest() {
    }

    public PurgeAuditHistoryRequest(
           com.broadhop.unifiedapi.soap.types.AuditKeyType key) {
           this.key = key;
    }


    /**
     * Gets the key value for this PurgeAuditHistoryRequest.
     * 
     * @return key
     */
    public com.broadhop.unifiedapi.soap.types.AuditKeyType getKey() {
        return key;
    }


    /**
     * Sets the key value for this PurgeAuditHistoryRequest.
     * 
     * @param key
     */
    public void setKey(com.broadhop.unifiedapi.soap.types.AuditKeyType key) {
        this.key = key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurgeAuditHistoryRequest)) return false;
        PurgeAuditHistoryRequest other = (PurgeAuditHistoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurgeAuditHistoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">PurgeAuditHistoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditKeyType"));
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
