/**
 * GenerateVoucherBatchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class GenerateVoucherBatchRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.VoucherType voucher;

    private java.math.BigInteger batchAmount;

    private java.lang.String maskChars;

    public GenerateVoucherBatchRequest() {
    }

    public GenerateVoucherBatchRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.VoucherType voucher,
           java.math.BigInteger batchAmount,
           java.lang.String maskChars) {
        super(
            audit);
        this.voucher = voucher;
        this.batchAmount = batchAmount;
        this.maskChars = maskChars;
    }


    /**
     * Gets the voucher value for this GenerateVoucherBatchRequest.
     * 
     * @return voucher
     */
    public com.broadhop.unifiedapi.soap.types.VoucherType getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this GenerateVoucherBatchRequest.
     * 
     * @param voucher
     */
    public void setVoucher(com.broadhop.unifiedapi.soap.types.VoucherType voucher) {
        this.voucher = voucher;
    }


    /**
     * Gets the batchAmount value for this GenerateVoucherBatchRequest.
     * 
     * @return batchAmount
     */
    public java.math.BigInteger getBatchAmount() {
        return batchAmount;
    }


    /**
     * Sets the batchAmount value for this GenerateVoucherBatchRequest.
     * 
     * @param batchAmount
     */
    public void setBatchAmount(java.math.BigInteger batchAmount) {
        this.batchAmount = batchAmount;
    }


    /**
     * Gets the maskChars value for this GenerateVoucherBatchRequest.
     * 
     * @return maskChars
     */
    public java.lang.String getMaskChars() {
        return maskChars;
    }


    /**
     * Sets the maskChars value for this GenerateVoucherBatchRequest.
     * 
     * @param maskChars
     */
    public void setMaskChars(java.lang.String maskChars) {
        this.maskChars = maskChars;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateVoucherBatchRequest)) return false;
        GenerateVoucherBatchRequest other = (GenerateVoucherBatchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              this.voucher.equals(other.getVoucher()))) &&
            ((this.batchAmount==null && other.getBatchAmount()==null) || 
             (this.batchAmount!=null &&
              this.batchAmount.equals(other.getBatchAmount()))) &&
            ((this.maskChars==null && other.getMaskChars()==null) || 
             (this.maskChars!=null &&
              this.maskChars.equals(other.getMaskChars())));
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
        if (getVoucher() != null) {
            _hashCode += getVoucher().hashCode();
        }
        if (getBatchAmount() != null) {
            _hashCode += getBatchAmount().hashCode();
        }
        if (getMaskChars() != null) {
            _hashCode += getMaskChars().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateVoucherBatchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GenerateVoucherBatchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "batchAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskChars");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "maskChars"));
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
