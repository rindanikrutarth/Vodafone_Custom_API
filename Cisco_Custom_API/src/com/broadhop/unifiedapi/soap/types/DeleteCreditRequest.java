/**
 * DeleteCreditRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DeleteCreditRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String balanceCode;

    private java.lang.String quotaCode;

    private java.lang.String creditId;

    public DeleteCreditRequest() {
    }

    public DeleteCreditRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String balanceCode,
           java.lang.String quotaCode,
           java.lang.String creditId) {
        super(
            audit,
            networkId);
        this.balanceCode = balanceCode;
        this.quotaCode = quotaCode;
        this.creditId = creditId;
    }


    /**
     * Gets the balanceCode value for this DeleteCreditRequest.
     * 
     * @return balanceCode
     */
    public java.lang.String getBalanceCode() {
        return balanceCode;
    }


    /**
     * Sets the balanceCode value for this DeleteCreditRequest.
     * 
     * @param balanceCode
     */
    public void setBalanceCode(java.lang.String balanceCode) {
        this.balanceCode = balanceCode;
    }


    /**
     * Gets the quotaCode value for this DeleteCreditRequest.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this DeleteCreditRequest.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }


    /**
     * Gets the creditId value for this DeleteCreditRequest.
     * 
     * @return creditId
     */
    public java.lang.String getCreditId() {
        return creditId;
    }


    /**
     * Sets the creditId value for this DeleteCreditRequest.
     * 
     * @param creditId
     */
    public void setCreditId(java.lang.String creditId) {
        this.creditId = creditId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCreditRequest)) return false;
        DeleteCreditRequest other = (DeleteCreditRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balanceCode==null && other.getBalanceCode()==null) || 
             (this.balanceCode!=null &&
              this.balanceCode.equals(other.getBalanceCode()))) &&
            ((this.quotaCode==null && other.getQuotaCode()==null) || 
             (this.quotaCode!=null &&
              this.quotaCode.equals(other.getQuotaCode()))) &&
            ((this.creditId==null && other.getCreditId()==null) || 
             (this.creditId!=null &&
              this.creditId.equals(other.getCreditId())));
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
        if (getBalanceCode() != null) {
            _hashCode += getBalanceCode().hashCode();
        }
        if (getQuotaCode() != null) {
            _hashCode += getQuotaCode().hashCode();
        }
        if (getCreditId() != null) {
            _hashCode += getCreditId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCreditRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteCreditRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balanceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "quotaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "creditId"));
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
