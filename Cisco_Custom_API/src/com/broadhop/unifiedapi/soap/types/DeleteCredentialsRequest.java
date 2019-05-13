/**
 * DeleteCredentialsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DeleteCredentialsRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private java.lang.String[] networkId;

    public DeleteCredentialsRequest() {
    }

    public DeleteCredentialsRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String[] networkId) {
        super(
            audit);
        this.networkId = networkId;
    }


    /**
     * Gets the networkId value for this DeleteCredentialsRequest.
     * 
     * @return networkId
     */
    public java.lang.String[] getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this DeleteCredentialsRequest.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String[] networkId) {
        this.networkId = networkId;
    }

    public java.lang.String getNetworkId(int i) {
        return this.networkId[i];
    }

    public void setNetworkId(int i, java.lang.String _value) {
        this.networkId[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCredentialsRequest)) return false;
        DeleteCredentialsRequest other = (DeleteCredentialsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              java.util.Arrays.equals(this.networkId, other.getNetworkId())));
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
        if (getNetworkId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkId(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteCredentialsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCredentialsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
