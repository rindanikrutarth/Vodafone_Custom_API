/**
 * QuotaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class QuotaType  implements java.io.Serializable {
    private java.lang.String code;

    private com.broadhop.unifiedapi.soap.types.CreditType[] credit;

    private com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold;

    private java.util.Calendar nextRefreshDate;

    private java.math.BigInteger recurrenceLimit;

    private java.util.Calendar quotaExpirationDate;

    private com.broadhop.unifiedapi.soap.types.TotalsType totals;

    private com.broadhop.unifiedapi.soap.types.AvpType[] avp;

    public QuotaType() {
    }

    public QuotaType(
           java.lang.String code,
           com.broadhop.unifiedapi.soap.types.CreditType[] credit,
           com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold,
           java.util.Calendar nextRefreshDate,
           java.math.BigInteger recurrenceLimit,
           java.util.Calendar quotaExpirationDate,
           com.broadhop.unifiedapi.soap.types.TotalsType totals,
           com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
           this.code = code;
           this.credit = credit;
           this.threshold = threshold;
           this.nextRefreshDate = nextRefreshDate;
           this.recurrenceLimit = recurrenceLimit;
           this.quotaExpirationDate = quotaExpirationDate;
           this.totals = totals;
           this.avp = avp;
    }


    /**
     * Gets the code value for this QuotaType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this QuotaType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the credit value for this QuotaType.
     * 
     * @return credit
     */
    public com.broadhop.unifiedapi.soap.types.CreditType[] getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this QuotaType.
     * 
     * @param credit
     */
    public void setCredit(com.broadhop.unifiedapi.soap.types.CreditType[] credit) {
        this.credit = credit;
    }

    public com.broadhop.unifiedapi.soap.types.CreditType getCredit(int i) {
        return this.credit[i];
    }

    public void setCredit(int i, com.broadhop.unifiedapi.soap.types.CreditType _value) {
        this.credit[i] = _value;
    }


    /**
     * Gets the threshold value for this QuotaType.
     * 
     * @return threshold
     */
    public com.broadhop.unifiedapi.soap.types.ThresholdType[] getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this QuotaType.
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
     * Gets the nextRefreshDate value for this QuotaType.
     * 
     * @return nextRefreshDate
     */
    public java.util.Calendar getNextRefreshDate() {
        return nextRefreshDate;
    }


    /**
     * Sets the nextRefreshDate value for this QuotaType.
     * 
     * @param nextRefreshDate
     */
    public void setNextRefreshDate(java.util.Calendar nextRefreshDate) {
        this.nextRefreshDate = nextRefreshDate;
    }


    /**
     * Gets the recurrenceLimit value for this QuotaType.
     * 
     * @return recurrenceLimit
     */
    public java.math.BigInteger getRecurrenceLimit() {
        return recurrenceLimit;
    }


    /**
     * Sets the recurrenceLimit value for this QuotaType.
     * 
     * @param recurrenceLimit
     */
    public void setRecurrenceLimit(java.math.BigInteger recurrenceLimit) {
        this.recurrenceLimit = recurrenceLimit;
    }


    /**
     * Gets the quotaExpirationDate value for this QuotaType.
     * 
     * @return quotaExpirationDate
     */
    public java.util.Calendar getQuotaExpirationDate() {
        return quotaExpirationDate;
    }


    /**
     * Sets the quotaExpirationDate value for this QuotaType.
     * 
     * @param quotaExpirationDate
     */
    public void setQuotaExpirationDate(java.util.Calendar quotaExpirationDate) {
        this.quotaExpirationDate = quotaExpirationDate;
    }


    /**
     * Gets the totals value for this QuotaType.
     * 
     * @return totals
     */
    public com.broadhop.unifiedapi.soap.types.TotalsType getTotals() {
        return totals;
    }


    /**
     * Sets the totals value for this QuotaType.
     * 
     * @param totals
     */
    public void setTotals(com.broadhop.unifiedapi.soap.types.TotalsType totals) {
        this.totals = totals;
    }


    /**
     * Gets the avp value for this QuotaType.
     * 
     * @return avp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getAvp() {
        return avp;
    }


    /**
     * Sets the avp value for this QuotaType.
     * 
     * @param avp
     */
    public void setAvp(com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
        this.avp = avp;
    }

    public com.broadhop.unifiedapi.soap.types.AvpType getAvp(int i) {
        return this.avp[i];
    }

    public void setAvp(int i, com.broadhop.unifiedapi.soap.types.AvpType _value) {
        this.avp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuotaType)) return false;
        QuotaType other = (QuotaType) obj;
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
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              java.util.Arrays.equals(this.credit, other.getCredit()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              java.util.Arrays.equals(this.threshold, other.getThreshold()))) &&
            ((this.nextRefreshDate==null && other.getNextRefreshDate()==null) || 
             (this.nextRefreshDate!=null &&
              this.nextRefreshDate.equals(other.getNextRefreshDate()))) &&
            ((this.recurrenceLimit==null && other.getRecurrenceLimit()==null) || 
             (this.recurrenceLimit!=null &&
              this.recurrenceLimit.equals(other.getRecurrenceLimit()))) &&
            ((this.quotaExpirationDate==null && other.getQuotaExpirationDate()==null) || 
             (this.quotaExpirationDate!=null &&
              this.quotaExpirationDate.equals(other.getQuotaExpirationDate()))) &&
            ((this.totals==null && other.getTotals()==null) || 
             (this.totals!=null &&
              this.totals.equals(other.getTotals()))) &&
            ((this.avp==null && other.getAvp()==null) || 
             (this.avp!=null &&
              java.util.Arrays.equals(this.avp, other.getAvp())));
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
        if (getCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getNextRefreshDate() != null) {
            _hashCode += getNextRefreshDate().hashCode();
        }
        if (getRecurrenceLimit() != null) {
            _hashCode += getRecurrenceLimit().hashCode();
        }
        if (getQuotaExpirationDate() != null) {
            _hashCode += getQuotaExpirationDate().hashCode();
        }
        if (getTotals() != null) {
            _hashCode += getTotals().hashCode();
        }
        if (getAvp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvp(), i);
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
        new org.apache.axis.description.TypeDesc(QuotaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuotaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ThresholdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRefreshDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "nextRefreshDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "totals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "TotalsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "avp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
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
