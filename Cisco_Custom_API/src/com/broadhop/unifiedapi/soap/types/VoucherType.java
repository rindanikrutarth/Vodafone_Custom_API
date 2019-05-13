/**
 * VoucherType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class VoucherType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String pin;

    private java.lang.String subscriberId;

    private java.math.BigInteger maxConcurrentSessions;

    private long duration;

    private com.broadhop.unifiedapi.soap.types.VoucherTypeDurationMeasure durationMeasure;

    private java.lang.String serviceCode;

    private java.util.Calendar expirationDate;

    private java.lang.String locationCode;

    private java.lang.Long timeQuota;

    private java.lang.String timeMeasure;

    private java.lang.String volumeQuota;

    private java.lang.String volumeMeasure;

    private java.lang.String balanceCode;

    private java.lang.String quotaCode;

    public VoucherType() {
    }

    public VoucherType(
           java.lang.String code,
           java.lang.String pin,
           java.lang.String subscriberId,
           java.math.BigInteger maxConcurrentSessions,
           long duration,
           com.broadhop.unifiedapi.soap.types.VoucherTypeDurationMeasure durationMeasure,
           java.lang.String serviceCode,
           java.util.Calendar expirationDate,
           java.lang.String locationCode,
           java.lang.Long timeQuota,
           java.lang.String timeMeasure,
           java.lang.String volumeQuota,
           java.lang.String volumeMeasure,
           java.lang.String balanceCode,
           java.lang.String quotaCode) {
           this.code = code;
           this.pin = pin;
           this.subscriberId = subscriberId;
           this.maxConcurrentSessions = maxConcurrentSessions;
           this.duration = duration;
           this.durationMeasure = durationMeasure;
           this.serviceCode = serviceCode;
           this.expirationDate = expirationDate;
           this.locationCode = locationCode;
           this.timeQuota = timeQuota;
           this.timeMeasure = timeMeasure;
           this.volumeQuota = volumeQuota;
           this.volumeMeasure = volumeMeasure;
           this.balanceCode = balanceCode;
           this.quotaCode = quotaCode;
    }


    /**
     * Gets the code value for this VoucherType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this VoucherType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the pin value for this VoucherType.
     * 
     * @return pin
     */
    public java.lang.String getPin() {
        return pin;
    }


    /**
     * Sets the pin value for this VoucherType.
     * 
     * @param pin
     */
    public void setPin(java.lang.String pin) {
        this.pin = pin;
    }


    /**
     * Gets the subscriberId value for this VoucherType.
     * 
     * @return subscriberId
     */
    public java.lang.String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this VoucherType.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the maxConcurrentSessions value for this VoucherType.
     * 
     * @return maxConcurrentSessions
     */
    public java.math.BigInteger getMaxConcurrentSessions() {
        return maxConcurrentSessions;
    }


    /**
     * Sets the maxConcurrentSessions value for this VoucherType.
     * 
     * @param maxConcurrentSessions
     */
    public void setMaxConcurrentSessions(java.math.BigInteger maxConcurrentSessions) {
        this.maxConcurrentSessions = maxConcurrentSessions;
    }


    /**
     * Gets the duration value for this VoucherType.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VoucherType.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the durationMeasure value for this VoucherType.
     * 
     * @return durationMeasure
     */
    public com.broadhop.unifiedapi.soap.types.VoucherTypeDurationMeasure getDurationMeasure() {
        return durationMeasure;
    }


    /**
     * Sets the durationMeasure value for this VoucherType.
     * 
     * @param durationMeasure
     */
    public void setDurationMeasure(com.broadhop.unifiedapi.soap.types.VoucherTypeDurationMeasure durationMeasure) {
        this.durationMeasure = durationMeasure;
    }


    /**
     * Gets the serviceCode value for this VoucherType.
     * 
     * @return serviceCode
     */
    public java.lang.String getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this VoucherType.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * Gets the expirationDate value for this VoucherType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this VoucherType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the locationCode value for this VoucherType.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this VoucherType.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the timeQuota value for this VoucherType.
     * 
     * @return timeQuota
     */
    public java.lang.Long getTimeQuota() {
        return timeQuota;
    }


    /**
     * Sets the timeQuota value for this VoucherType.
     * 
     * @param timeQuota
     */
    public void setTimeQuota(java.lang.Long timeQuota) {
        this.timeQuota = timeQuota;
    }


    /**
     * Gets the timeMeasure value for this VoucherType.
     * 
     * @return timeMeasure
     */
    public java.lang.String getTimeMeasure() {
        return timeMeasure;
    }


    /**
     * Sets the timeMeasure value for this VoucherType.
     * 
     * @param timeMeasure
     */
    public void setTimeMeasure(java.lang.String timeMeasure) {
        this.timeMeasure = timeMeasure;
    }


    /**
     * Gets the volumeQuota value for this VoucherType.
     * 
     * @return volumeQuota
     */
    public java.lang.String getVolumeQuota() {
        return volumeQuota;
    }


    /**
     * Sets the volumeQuota value for this VoucherType.
     * 
     * @param volumeQuota
     */
    public void setVolumeQuota(java.lang.String volumeQuota) {
        this.volumeQuota = volumeQuota;
    }


    /**
     * Gets the volumeMeasure value for this VoucherType.
     * 
     * @return volumeMeasure
     */
    public java.lang.String getVolumeMeasure() {
        return volumeMeasure;
    }


    /**
     * Sets the volumeMeasure value for this VoucherType.
     * 
     * @param volumeMeasure
     */
    public void setVolumeMeasure(java.lang.String volumeMeasure) {
        this.volumeMeasure = volumeMeasure;
    }


    /**
     * Gets the balanceCode value for this VoucherType.
     * 
     * @return balanceCode
     */
    public java.lang.String getBalanceCode() {
        return balanceCode;
    }


    /**
     * Sets the balanceCode value for this VoucherType.
     * 
     * @param balanceCode
     */
    public void setBalanceCode(java.lang.String balanceCode) {
        this.balanceCode = balanceCode;
    }


    /**
     * Gets the quotaCode value for this VoucherType.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this VoucherType.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoucherType)) return false;
        VoucherType other = (VoucherType) obj;
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
            ((this.pin==null && other.getPin()==null) || 
             (this.pin!=null &&
              this.pin.equals(other.getPin()))) &&
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.maxConcurrentSessions==null && other.getMaxConcurrentSessions()==null) || 
             (this.maxConcurrentSessions!=null &&
              this.maxConcurrentSessions.equals(other.getMaxConcurrentSessions()))) &&
            this.duration == other.getDuration() &&
            ((this.durationMeasure==null && other.getDurationMeasure()==null) || 
             (this.durationMeasure!=null &&
              this.durationMeasure.equals(other.getDurationMeasure()))) &&
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              this.serviceCode.equals(other.getServiceCode()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.timeQuota==null && other.getTimeQuota()==null) || 
             (this.timeQuota!=null &&
              this.timeQuota.equals(other.getTimeQuota()))) &&
            ((this.timeMeasure==null && other.getTimeMeasure()==null) || 
             (this.timeMeasure!=null &&
              this.timeMeasure.equals(other.getTimeMeasure()))) &&
            ((this.volumeQuota==null && other.getVolumeQuota()==null) || 
             (this.volumeQuota!=null &&
              this.volumeQuota.equals(other.getVolumeQuota()))) &&
            ((this.volumeMeasure==null && other.getVolumeMeasure()==null) || 
             (this.volumeMeasure!=null &&
              this.volumeMeasure.equals(other.getVolumeMeasure()))) &&
            ((this.balanceCode==null && other.getBalanceCode()==null) || 
             (this.balanceCode!=null &&
              this.balanceCode.equals(other.getBalanceCode()))) &&
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
        if (getPin() != null) {
            _hashCode += getPin().hashCode();
        }
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getMaxConcurrentSessions() != null) {
            _hashCode += getMaxConcurrentSessions().hashCode();
        }
        _hashCode += new Long(getDuration()).hashCode();
        if (getDurationMeasure() != null) {
            _hashCode += getDurationMeasure().hashCode();
        }
        if (getServiceCode() != null) {
            _hashCode += getServiceCode().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getTimeQuota() != null) {
            _hashCode += getTimeQuota().hashCode();
        }
        if (getTimeMeasure() != null) {
            _hashCode += getTimeMeasure().hashCode();
        }
        if (getVolumeQuota() != null) {
            _hashCode += getVolumeQuota().hashCode();
        }
        if (getVolumeMeasure() != null) {
            _hashCode += getVolumeMeasure().hashCode();
        }
        if (getBalanceCode() != null) {
            _hashCode += getBalanceCode().hashCode();
        }
        if (getQuotaCode() != null) {
            _hashCode += getQuotaCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VoucherType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "pin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConcurrentSessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "maxConcurrentSessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "durationMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">VoucherType>durationMeasure"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "locationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "timeQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "timeMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "volumeQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "volumeMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balanceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
