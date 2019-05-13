/**
 * ChangeRecurringRefreshDayRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ChangeRecurringRefreshDayRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String balanceCode;

    private java.lang.String quotaCode;

    private java.math.BigInteger newDayOfTheMonth;

    private java.lang.Boolean resetCreditEndDates;

    public ChangeRecurringRefreshDayRequest() {
    }

    public ChangeRecurringRefreshDayRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String balanceCode,
           java.lang.String quotaCode,
           java.math.BigInteger newDayOfTheMonth,
           java.lang.Boolean resetCreditEndDates) {
        super(
            audit,
            networkId);
        this.balanceCode = balanceCode;
        this.quotaCode = quotaCode;
        this.newDayOfTheMonth = newDayOfTheMonth;
        this.resetCreditEndDates = resetCreditEndDates;
    }


    /**
     * Gets the balanceCode value for this ChangeRecurringRefreshDayRequest.
     * 
     * @return balanceCode
     */
    public java.lang.String getBalanceCode() {
        return balanceCode;
    }


    /**
     * Sets the balanceCode value for this ChangeRecurringRefreshDayRequest.
     * 
     * @param balanceCode
     */
    public void setBalanceCode(java.lang.String balanceCode) {
        this.balanceCode = balanceCode;
    }


    /**
     * Gets the quotaCode value for this ChangeRecurringRefreshDayRequest.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this ChangeRecurringRefreshDayRequest.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }


    /**
     * Gets the newDayOfTheMonth value for this ChangeRecurringRefreshDayRequest.
     * 
     * @return newDayOfTheMonth
     */
    public java.math.BigInteger getNewDayOfTheMonth() {
        return newDayOfTheMonth;
    }


    /**
     * Sets the newDayOfTheMonth value for this ChangeRecurringRefreshDayRequest.
     * 
     * @param newDayOfTheMonth
     */
    public void setNewDayOfTheMonth(java.math.BigInteger newDayOfTheMonth) {
        this.newDayOfTheMonth = newDayOfTheMonth;
    }


    /**
     * Gets the resetCreditEndDates value for this ChangeRecurringRefreshDayRequest.
     * 
     * @return resetCreditEndDates
     */
    public java.lang.Boolean getResetCreditEndDates() {
        return resetCreditEndDates;
    }


    /**
     * Sets the resetCreditEndDates value for this ChangeRecurringRefreshDayRequest.
     * 
     * @param resetCreditEndDates
     */
    public void setResetCreditEndDates(java.lang.Boolean resetCreditEndDates) {
        this.resetCreditEndDates = resetCreditEndDates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeRecurringRefreshDayRequest)) return false;
        ChangeRecurringRefreshDayRequest other = (ChangeRecurringRefreshDayRequest) obj;
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
            ((this.newDayOfTheMonth==null && other.getNewDayOfTheMonth()==null) || 
             (this.newDayOfTheMonth!=null &&
              this.newDayOfTheMonth.equals(other.getNewDayOfTheMonth()))) &&
            ((this.resetCreditEndDates==null && other.getResetCreditEndDates()==null) || 
             (this.resetCreditEndDates!=null &&
              this.resetCreditEndDates.equals(other.getResetCreditEndDates())));
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
        if (getNewDayOfTheMonth() != null) {
            _hashCode += getNewDayOfTheMonth().hashCode();
        }
        if (getResetCreditEndDates() != null) {
            _hashCode += getResetCreditEndDates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeRecurringRefreshDayRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeRecurringRefreshDayRequest"));
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
        elemField.setFieldName("newDayOfTheMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "newDayOfTheMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetCreditEndDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "resetCreditEndDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
