/**
 * DeleteVoucherBatchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DeleteVoucherBatchRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.VoucherKeyType key;

    public DeleteVoucherBatchRequest() {
    }

    public DeleteVoucherBatchRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.VoucherKeyType key) {
        super(
            audit);
        this.key = key;
    }


    /**
     * Gets the key value for this DeleteVoucherBatchRequest.
     * 
     * @return key
     */
    public com.broadhop.unifiedapi.soap.types.VoucherKeyType getKey() {
        return key;
    }


    /**
     * Sets the key value for this DeleteVoucherBatchRequest.
     * 
     * @param key
     */
    public void setKey(com.broadhop.unifiedapi.soap.types.VoucherKeyType key) {
        this.key = key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteVoucherBatchRequest)) return false;
        DeleteVoucherBatchRequest other = (DeleteVoucherBatchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        int _hashCode = super.hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteVoucherBatchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteVoucherBatchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherKeyType"));
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
