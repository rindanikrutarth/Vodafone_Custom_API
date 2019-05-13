/**
 * ExtendCreditType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ExtendCreditType  implements java.io.Serializable {
    private java.lang.String balanceCode;

    private java.lang.String quotaCode;

    private java.lang.String creditId;

    private java.lang.Boolean add;

    private java.util.Calendar endDate;

    private java.math.BigInteger minutes;

    private java.lang.Long amount;

    public ExtendCreditType() {
    }

    public ExtendCreditType(
           java.lang.String balanceCode,
           java.lang.String quotaCode,
           java.lang.String creditId,
           java.lang.Boolean add,
           java.util.Calendar endDate,
           java.math.BigInteger minutes,
           java.lang.Long amount) {
           this.balanceCode = balanceCode;
           this.quotaCode = quotaCode;
           this.creditId = creditId;
           this.add = add;
           this.endDate = endDate;
           this.minutes = minutes;
           this.amount = amount;
    }


    /**
     * Gets the balanceCode value for this ExtendCreditType.
     * 
     * @return balanceCode
     */
    public java.lang.String getBalanceCode() {
        return balanceCode;
    }


    /**
     * Sets the balanceCode value for this ExtendCreditType.
     * 
     * @param balanceCode
     */
    public void setBalanceCode(java.lang.String balanceCode) {
        this.balanceCode = balanceCode;
    }


    /**
     * Gets the quotaCode value for this ExtendCreditType.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this ExtendCreditType.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }


    /**
     * Gets the creditId value for this ExtendCreditType.
     * 
     * @return creditId
     */
    public java.lang.String getCreditId() {
        return creditId;
    }


    /**
     * Sets the creditId value for this ExtendCreditType.
     * 
     * @param creditId
     */
    public void setCreditId(java.lang.String creditId) {
        this.creditId = creditId;
    }


    /**
     * Gets the add value for this ExtendCreditType.
     * 
     * @return add
     */
    public java.lang.Boolean getAdd() {
        return add;
    }


    /**
     * Sets the add value for this ExtendCreditType.
     * 
     * @param add
     */
    public void setAdd(java.lang.Boolean add) {
        this.add = add;
    }


    /**
     * Gets the endDate value for this ExtendCreditType.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ExtendCreditType.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the minutes value for this ExtendCreditType.
     * 
     * @return minutes
     */
    public java.math.BigInteger getMinutes() {
        return minutes;
    }


    /**
     * Sets the minutes value for this ExtendCreditType.
     * 
     * @param minutes
     */
    public void setMinutes(java.math.BigInteger minutes) {
        this.minutes = minutes;
    }


    /**
     * Gets the amount value for this ExtendCreditType.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ExtendCreditType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendCreditType)) return false;
        ExtendCreditType other = (ExtendCreditType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceCode==null && other.getBalanceCode()==null) || 
             (this.balanceCode!=null &&
              this.balanceCode.equals(other.getBalanceCode()))) &&
            ((this.quotaCode==null && other.getQuotaCode()==null) || 
             (this.quotaCode!=null &&
              this.quotaCode.equals(other.getQuotaCode()))) &&
            ((this.creditId==null && other.getCreditId()==null) || 
             (this.creditId!=null &&
              this.creditId.equals(other.getCreditId()))) &&
            ((this.add==null && other.getAdd()==null) || 
             (this.add!=null &&
              this.add.equals(other.getAdd()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.minutes==null && other.getMinutes()==null) || 
             (this.minutes!=null &&
              this.minutes.equals(other.getMinutes()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getBalanceCode() != null) {
            _hashCode += getBalanceCode().hashCode();
        }
        if (getQuotaCode() != null) {
            _hashCode += getQuotaCode().hashCode();
        }
        if (getCreditId() != null) {
            _hashCode += getCreditId().hashCode();
        }
        if (getAdd() != null) {
            _hashCode += getAdd().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMinutes() != null) {
            _hashCode += getMinutes().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtendCreditType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditType"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "creditId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "minutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
