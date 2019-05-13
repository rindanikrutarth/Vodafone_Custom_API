/**
 * VoucherKeyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class VoucherKeyType  implements java.io.Serializable {
    private java.lang.String voucherCode;

    private java.lang.String networkId;

    private com.broadhop.unifiedapi.soap.types.VoucherLocationKeyType voucherLocationKey;

    private com.broadhop.unifiedapi.soap.types.VoucherBatchKeyType voucherBatchKey;

    private java.math.BigInteger skip;

    private java.math.BigInteger limit;

    public VoucherKeyType() {
    }

    public VoucherKeyType(
           java.lang.String voucherCode,
           java.lang.String networkId,
           com.broadhop.unifiedapi.soap.types.VoucherLocationKeyType voucherLocationKey,
           com.broadhop.unifiedapi.soap.types.VoucherBatchKeyType voucherBatchKey,
           java.math.BigInteger skip,
           java.math.BigInteger limit) {
           this.voucherCode = voucherCode;
           this.networkId = networkId;
           this.voucherLocationKey = voucherLocationKey;
           this.voucherBatchKey = voucherBatchKey;
           this.skip = skip;
           this.limit = limit;
    }


    /**
     * Gets the voucherCode value for this VoucherKeyType.
     * 
     * @return voucherCode
     */
    public java.lang.String getVoucherCode() {
        return voucherCode;
    }


    /**
     * Sets the voucherCode value for this VoucherKeyType.
     * 
     * @param voucherCode
     */
    public void setVoucherCode(java.lang.String voucherCode) {
        this.voucherCode = voucherCode;
    }


    /**
     * Gets the networkId value for this VoucherKeyType.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this VoucherKeyType.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the voucherLocationKey value for this VoucherKeyType.
     * 
     * @return voucherLocationKey
     */
    public com.broadhop.unifiedapi.soap.types.VoucherLocationKeyType getVoucherLocationKey() {
        return voucherLocationKey;
    }


    /**
     * Sets the voucherLocationKey value for this VoucherKeyType.
     * 
     * @param voucherLocationKey
     */
    public void setVoucherLocationKey(com.broadhop.unifiedapi.soap.types.VoucherLocationKeyType voucherLocationKey) {
        this.voucherLocationKey = voucherLocationKey;
    }


    /**
     * Gets the voucherBatchKey value for this VoucherKeyType.
     * 
     * @return voucherBatchKey
     */
    public com.broadhop.unifiedapi.soap.types.VoucherBatchKeyType getVoucherBatchKey() {
        return voucherBatchKey;
    }


    /**
     * Sets the voucherBatchKey value for this VoucherKeyType.
     * 
     * @param voucherBatchKey
     */
    public void setVoucherBatchKey(com.broadhop.unifiedapi.soap.types.VoucherBatchKeyType voucherBatchKey) {
        this.voucherBatchKey = voucherBatchKey;
    }


    /**
     * Gets the skip value for this VoucherKeyType.
     * 
     * @return skip
     */
    public java.math.BigInteger getSkip() {
        return skip;
    }


    /**
     * Sets the skip value for this VoucherKeyType.
     * 
     * @param skip
     */
    public void setSkip(java.math.BigInteger skip) {
        this.skip = skip;
    }


    /**
     * Gets the limit value for this VoucherKeyType.
     * 
     * @return limit
     */
    public java.math.BigInteger getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this VoucherKeyType.
     * 
     * @param limit
     */
    public void setLimit(java.math.BigInteger limit) {
        this.limit = limit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherKeyType)) return false;
        VoucherKeyType other = (VoucherKeyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.voucherCode==null && other.getVoucherCode()==null) || 
             (this.voucherCode!=null &&
              this.voucherCode.equals(other.getVoucherCode()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.voucherLocationKey==null && other.getVoucherLocationKey()==null) || 
             (this.voucherLocationKey!=null &&
              this.voucherLocationKey.equals(other.getVoucherLocationKey()))) &&
            ((this.voucherBatchKey==null && other.getVoucherBatchKey()==null) || 
             (this.voucherBatchKey!=null &&
              this.voucherBatchKey.equals(other.getVoucherBatchKey()))) &&
            ((this.skip==null && other.getSkip()==null) || 
             (this.skip!=null &&
              this.skip.equals(other.getSkip()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit())));
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
        if (getVoucherCode() != null) {
            _hashCode += getVoucherCode().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getVoucherLocationKey() != null) {
            _hashCode += getVoucherLocationKey().hashCode();
        }
        if (getVoucherBatchKey() != null) {
            _hashCode += getVoucherBatchKey().hashCode();
        }
        if (getSkip() != null) {
            _hashCode += getSkip().hashCode();
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherKeyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherKeyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "voucherCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherLocationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "voucherLocationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherLocationKeyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherBatchKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "voucherBatchKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherBatchKeyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "skip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
