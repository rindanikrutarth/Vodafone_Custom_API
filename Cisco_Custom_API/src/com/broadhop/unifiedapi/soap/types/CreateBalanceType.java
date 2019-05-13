/**
 * CreateBalanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreateBalanceType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String quotaCode;

    private java.util.Calendar startDate;

    private java.util.Calendar expirationDate;

    private java.lang.Long initialAmount;

    private com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold;

    private java.util.Calendar lastRecurringRefresh;

    private java.math.BigInteger billCycle;

    private java.math.BigInteger recurrenceLimit;

    private java.util.Calendar quotaExpirationDate;

    public CreateBalanceType() {
    }

    public CreateBalanceType(
           java.lang.String code,
           java.lang.String quotaCode,
           java.util.Calendar startDate,
           java.util.Calendar expirationDate,
           java.lang.Long initialAmount,
           com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold,
           java.util.Calendar lastRecurringRefresh,
           java.math.BigInteger billCycle,
           java.math.BigInteger recurrenceLimit,
           java.util.Calendar quotaExpirationDate) {
           this.code = code;
           this.quotaCode = quotaCode;
           this.startDate = startDate;
           this.expirationDate = expirationDate;
           this.initialAmount = initialAmount;
           this.threshold = threshold;
           this.lastRecurringRefresh = lastRecurringRefresh;
           this.billCycle = billCycle;
           this.recurrenceLimit = recurrenceLimit;
           this.quotaExpirationDate = quotaExpirationDate;
    }


    /**
     * Gets the code value for this CreateBalanceType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this CreateBalanceType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the quotaCode value for this CreateBalanceType.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this CreateBalanceType.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }


    /**
     * Gets the startDate value for this CreateBalanceType.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreateBalanceType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expirationDate value for this CreateBalanceType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CreateBalanceType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the initialAmount value for this CreateBalanceType.
     * 
     * @return initialAmount
     */
    public java.lang.Long getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this CreateBalanceType.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(java.lang.Long initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the threshold value for this CreateBalanceType.
     * 
     * @return threshold
     */
    public com.broadhop.unifiedapi.soap.types.ThresholdType[] getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this CreateBalanceType.
     * 
     * @param threshold
     */
    public void setThreshold(com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold) {
        this.threshold = threshold;
    }

    public com.broadhop.unifiedapi.soap.types.ThresholdType getThreshold(int i) {
        return this.threshold[i];
    }

    public void setThreshold(int i, com.broadhop.unifiedapi.soap.types.ThresholdType _value) {
        this.threshold[i] = _value;
    }


    /**
     * Gets the lastRecurringRefresh value for this CreateBalanceType.
     * 
     * @return lastRecurringRefresh
     */
    public java.util.Calendar getLastRecurringRefresh() {
        return lastRecurringRefresh;
    }


    /**
     * Sets the lastRecurringRefresh value for this CreateBalanceType.
     * 
     * @param lastRecurringRefresh
     */
    public void setLastRecurringRefresh(java.util.Calendar lastRecurringRefresh) {
        this.lastRecurringRefresh = lastRecurringRefresh;
    }


    /**
     * Gets the billCycle value for this CreateBalanceType.
     * 
     * @return billCycle
     */
    public java.math.BigInteger getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this CreateBalanceType.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.math.BigInteger billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the recurrenceLimit value for this CreateBalanceType.
     * 
     * @return recurrenceLimit
     */
    public java.math.BigInteger getRecurrenceLimit() {
        return recurrenceLimit;
    }


    /**
     * Sets the recurrenceLimit value for this CreateBalanceType.
     * 
     * @param recurrenceLimit
     */
    public void setRecurrenceLimit(java.math.BigInteger recurrenceLimit) {
        this.recurrenceLimit = recurrenceLimit;
    }


    /**
     * Gets the quotaExpirationDate value for this CreateBalanceType.
     * 
     * @return quotaExpirationDate
     */
    public java.util.Calendar getQuotaExpirationDate() {
        return quotaExpirationDate;
    }


    /**
     * Sets the quotaExpirationDate value for this CreateBalanceType.
     * 
     * @param quotaExpirationDate
     */
    public void setQuotaExpirationDate(java.util.Calendar quotaExpirationDate) {
        this.quotaExpirationDate = quotaExpirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBalanceType)) return false;
        CreateBalanceType other = (CreateBalanceType) obj;
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
              this.quotaCode.equals(other.getQuotaCode()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.initialAmount==null && other.getInitialAmount()==null) || 
             (this.initialAmount!=null &&
              this.initialAmount.equals(other.getInitialAmount()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              java.util.Arrays.equals(this.threshold, other.getThreshold()))) &&
            ((this.lastRecurringRefresh==null && other.getLastRecurringRefresh()==null) || 
             (this.lastRecurringRefresh!=null &&
              this.lastRecurringRefresh.equals(other.getLastRecurringRefresh()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.recurrenceLimit==null && other.getRecurrenceLimit()==null) || 
             (this.recurrenceLimit!=null &&
              this.recurrenceLimit.equals(other.getRecurrenceLimit()))) &&
            ((this.quotaExpirationDate==null && other.getQuotaExpirationDate()==null) || 
             (this.quotaExpirationDate!=null &&
              this.quotaExpirationDate.equals(other.getQuotaExpirationDate())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getInitialAmount() != null) {
            _hashCode += getInitialAmount().hashCode();
        }
        if (getThreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThreshold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThreshold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastRecurringRefresh() != null) {
            _hashCode += getLastRecurringRefresh().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getRecurrenceLimit() != null) {
            _hashCode += getRecurrenceLimit().hashCode();
        }
        if (getQuotaExpirationDate() != null) {
            _hashCode += getQuotaExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateBalanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceType"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ThresholdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRecurringRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "lastRecurringRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "recurrenceLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "quotaExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
