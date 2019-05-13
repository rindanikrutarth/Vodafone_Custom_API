/**
 * BalanceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;


/**
 * A balance is the top-level object that represents a subscriber's
 * balance (amount of time, data, or bandwidth) that can be used.
 */
public class BalanceType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.Boolean deprovisioned;

    private java.lang.Boolean depleted;

    private java.math.BigInteger billCycle;

    private com.broadhop.unifiedapi.soap.types.QuotaType[] quota;

    private com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold;

    private com.broadhop.unifiedapi.soap.types.ReservationType[] reservation;

    private java.util.Calendar startDate;

    private java.util.Calendar expirationDate;

    private com.broadhop.unifiedapi.soap.types.TotalsType totals;

    private com.broadhop.unifiedapi.soap.types.AvpType[] avp;

    public BalanceType() {
    }

    public BalanceType(
           java.lang.String code,
           java.lang.Boolean deprovisioned,
           java.lang.Boolean depleted,
           java.math.BigInteger billCycle,
           com.broadhop.unifiedapi.soap.types.QuotaType[] quota,
           com.broadhop.unifiedapi.soap.types.ThresholdType[] threshold,
           com.broadhop.unifiedapi.soap.types.ReservationType[] reservation,
           java.util.Calendar startDate,
           java.util.Calendar expirationDate,
           com.broadhop.unifiedapi.soap.types.TotalsType totals,
           com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
           this.code = code;
           this.deprovisioned = deprovisioned;
           this.depleted = depleted;
           this.billCycle = billCycle;
           this.quota = quota;
           this.threshold = threshold;
           this.reservation = reservation;
           this.startDate = startDate;
           this.expirationDate = expirationDate;
           this.totals = totals;
           this.avp = avp;
    }


    /**
     * Gets the code value for this BalanceType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this BalanceType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the deprovisioned value for this BalanceType.
     * 
     * @return deprovisioned
     */
    public java.lang.Boolean getDeprovisioned() {
        return deprovisioned;
    }


    /**
     * Sets the deprovisioned value for this BalanceType.
     * 
     * @param deprovisioned
     */
    public void setDeprovisioned(java.lang.Boolean deprovisioned) {
        this.deprovisioned = deprovisioned;
    }


    /**
     * Gets the depleted value for this BalanceType.
     * 
     * @return depleted
     */
    public java.lang.Boolean getDepleted() {
        return depleted;
    }


    /**
     * Sets the depleted value for this BalanceType.
     * 
     * @param depleted
     */
    public void setDepleted(java.lang.Boolean depleted) {
        this.depleted = depleted;
    }


    /**
     * Gets the billCycle value for this BalanceType.
     * 
     * @return billCycle
     */
    public java.math.BigInteger getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this BalanceType.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.math.BigInteger billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the quota value for this BalanceType.
     * 
     * @return quota
     */
    public com.broadhop.unifiedapi.soap.types.QuotaType[] getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this BalanceType.
     * 
     * @param quota
     */
    public void setQuota(com.broadhop.unifiedapi.soap.types.QuotaType[] quota) {
        this.quota = quota;
    }

    public com.broadhop.unifiedapi.soap.types.QuotaType getQuota(int i) {
        return this.quota[i];
    }

    public void setQuota(int i, com.broadhop.unifiedapi.soap.types.QuotaType _value) {
        this.quota[i] = _value;
    }


    /**
     * Gets the threshold value for this BalanceType.
     * 
     * @return threshold
     */
    public com.broadhop.unifiedapi.soap.types.ThresholdType[] getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this BalanceType.
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
     * Gets the reservation value for this BalanceType.
     * 
     * @return reservation
     */
    public com.broadhop.unifiedapi.soap.types.ReservationType[] getReservation() {
        return reservation;
    }


    /**
     * Sets the reservation value for this BalanceType.
     * 
     * @param reservation
     */
    public void setReservation(com.broadhop.unifiedapi.soap.types.ReservationType[] reservation) {
        this.reservation = reservation;
    }

    public com.broadhop.unifiedapi.soap.types.ReservationType getReservation(int i) {
        return this.reservation[i];
    }

    public void setReservation(int i, com.broadhop.unifiedapi.soap.types.ReservationType _value) {
        this.reservation[i] = _value;
    }


    /**
     * Gets the startDate value for this BalanceType.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BalanceType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expirationDate value for this BalanceType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this BalanceType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the totals value for this BalanceType.
     * 
     * @return totals
     */
    public com.broadhop.unifiedapi.soap.types.TotalsType getTotals() {
        return totals;
    }


    /**
     * Sets the totals value for this BalanceType.
     * 
     * @param totals
     */
    public void setTotals(com.broadhop.unifiedapi.soap.types.TotalsType totals) {
        this.totals = totals;
    }


    /**
     * Gets the avp value for this BalanceType.
     * 
     * @return avp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getAvp() {
        return avp;
    }


    /**
     * Sets the avp value for this BalanceType.
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
        if (!(obj instanceof BalanceType)) return false;
        BalanceType other = (BalanceType) obj;
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
            ((this.deprovisioned==null && other.getDeprovisioned()==null) || 
             (this.deprovisioned!=null &&
              this.deprovisioned.equals(other.getDeprovisioned()))) &&
            ((this.depleted==null && other.getDepleted()==null) || 
             (this.depleted!=null &&
              this.depleted.equals(other.getDepleted()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.quota==null && other.getQuota()==null) || 
             (this.quota!=null &&
              java.util.Arrays.equals(this.quota, other.getQuota()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              java.util.Arrays.equals(this.threshold, other.getThreshold()))) &&
            ((this.reservation==null && other.getReservation()==null) || 
             (this.reservation!=null &&
              java.util.Arrays.equals(this.reservation, other.getReservation()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
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
        if (getDeprovisioned() != null) {
            _hashCode += getDeprovisioned().hashCode();
        }
        if (getDepleted() != null) {
            _hashCode += getDepleted().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getQuota() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuota());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuota(), i);
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
        if (getReservation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(BalanceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BalanceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deprovisioned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "deprovisioned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "depleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "QuotaType"));
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
        elemField.setFieldName("reservation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "reservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReservationType"));
        elemField.setMinOccurs(0);
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
