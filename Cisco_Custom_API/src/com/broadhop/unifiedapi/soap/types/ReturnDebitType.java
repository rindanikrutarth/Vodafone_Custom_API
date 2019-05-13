/**
 * ReturnDebitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ReturnDebitType  implements java.io.Serializable {
    private java.util.Calendar nextRefreshDate;

    private long balanceRemaining;

    private long amountDebited;

    private java.util.Calendar callbackValidityTime;

    private boolean exhausted;

    public ReturnDebitType() {
    }

    public ReturnDebitType(
           java.util.Calendar nextRefreshDate,
           long balanceRemaining,
           long amountDebited,
           java.util.Calendar callbackValidityTime,
           boolean exhausted) {
           this.nextRefreshDate = nextRefreshDate;
           this.balanceRemaining = balanceRemaining;
           this.amountDebited = amountDebited;
           this.callbackValidityTime = callbackValidityTime;
           this.exhausted = exhausted;
    }


    /**
     * Gets the nextRefreshDate value for this ReturnDebitType.
     * 
     * @return nextRefreshDate
     */
    public java.util.Calendar getNextRefreshDate() {
        return nextRefreshDate;
    }


    /**
     * Sets the nextRefreshDate value for this ReturnDebitType.
     * 
     * @param nextRefreshDate
     */
    public void setNextRefreshDate(java.util.Calendar nextRefreshDate) {
        this.nextRefreshDate = nextRefreshDate;
    }


    /**
     * Gets the balanceRemaining value for this ReturnDebitType.
     * 
     * @return balanceRemaining
     */
    public long getBalanceRemaining() {
        return balanceRemaining;
    }


    /**
     * Sets the balanceRemaining value for this ReturnDebitType.
     * 
     * @param balanceRemaining
     */
    public void setBalanceRemaining(long balanceRemaining) {
        this.balanceRemaining = balanceRemaining;
    }


    /**
     * Gets the amountDebited value for this ReturnDebitType.
     * 
     * @return amountDebited
     */
    public long getAmountDebited() {
        return amountDebited;
    }


    /**
     * Sets the amountDebited value for this ReturnDebitType.
     * 
     * @param amountDebited
     */
    public void setAmountDebited(long amountDebited) {
        this.amountDebited = amountDebited;
    }


    /**
     * Gets the callbackValidityTime value for this ReturnDebitType.
     * 
     * @return callbackValidityTime
     */
    public java.util.Calendar getCallbackValidityTime() {
        return callbackValidityTime;
    }


    /**
     * Sets the callbackValidityTime value for this ReturnDebitType.
     * 
     * @param callbackValidityTime
     */
    public void setCallbackValidityTime(java.util.Calendar callbackValidityTime) {
        this.callbackValidityTime = callbackValidityTime;
    }


    /**
     * Gets the exhausted value for this ReturnDebitType.
     * 
     * @return exhausted
     */
    public boolean isExhausted() {
        return exhausted;
    }


    /**
     * Sets the exhausted value for this ReturnDebitType.
     * 
     * @param exhausted
     */
    public void setExhausted(boolean exhausted) {
        this.exhausted = exhausted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnDebitType)) return false;
        ReturnDebitType other = (ReturnDebitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nextRefreshDate==null && other.getNextRefreshDate()==null) || 
             (this.nextRefreshDate!=null &&
              this.nextRefreshDate.equals(other.getNextRefreshDate()))) &&
            this.balanceRemaining == other.getBalanceRemaining() &&
            this.amountDebited == other.getAmountDebited() &&
            ((this.callbackValidityTime==null && other.getCallbackValidityTime()==null) || 
             (this.callbackValidityTime!=null &&
              this.callbackValidityTime.equals(other.getCallbackValidityTime()))) &&
            this.exhausted == other.isExhausted();
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
        if (getNextRefreshDate() != null) {
            _hashCode += getNextRefreshDate().hashCode();
        }
        _hashCode += new Long(getBalanceRemaining()).hashCode();
        _hashCode += new Long(getAmountDebited()).hashCode();
        if (getCallbackValidityTime() != null) {
            _hashCode += getCallbackValidityTime().hashCode();
        }
        _hashCode += (isExhausted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnDebitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnDebitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRefreshDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "nextRefreshDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balanceRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountDebited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amountDebited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackValidityTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "callbackValidityTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exhausted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "exhausted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
