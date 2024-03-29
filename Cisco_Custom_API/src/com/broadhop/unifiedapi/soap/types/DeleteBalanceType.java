/**
 * DeleteBalanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DeleteBalanceType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String quotaCode;

    public DeleteBalanceType() {
    }

    public DeleteBalanceType(
           java.lang.String code,
           java.lang.String quotaCode) {
           this.code = code;
           this.quotaCode = quotaCode;
    }


    /**
     * Gets the code value for this DeleteBalanceType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this DeleteBalanceType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the quotaCode value for this DeleteBalanceType.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this DeleteBalanceType.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBalanceType)) return false;
        DeleteBalanceType other = (DeleteBalanceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.quotaCode==null && other.getQuotaCode()==null) || 
             (this.quotaCode!=null &&
              this.quotaCode.equals(other.getQuotaCode())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getQuotaCode() != null) {
            _hashCode += getQuotaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBalanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "quotaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
