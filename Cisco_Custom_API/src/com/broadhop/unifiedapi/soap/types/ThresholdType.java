/**
 * ThresholdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ThresholdType  implements java.io.Serializable {
    private java.lang.String code;

    private long amount;

    private java.lang.String quotaCode;

    private com.broadhop.unifiedapi.soap.types.ThresholdTypeType type;

    private java.lang.String group;

    private java.lang.Boolean breached;

    private boolean subscriberSpecific;

    public ThresholdType() {
    }

    public ThresholdType(
           java.lang.String code,
           long amount,
           java.lang.String quotaCode,
           com.broadhop.unifiedapi.soap.types.ThresholdTypeType type,
           java.lang.String group,
           java.lang.Boolean breached,
           boolean subscriberSpecific) {
           this.code = code;
           this.amount = amount;
           this.quotaCode = quotaCode;
           this.type = type;
           this.group = group;
           this.breached = breached;
           this.subscriberSpecific = subscriberSpecific;
    }


    /**
     * Gets the code value for this ThresholdType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ThresholdType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the amount value for this ThresholdType.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ThresholdType.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the quotaCode value for this ThresholdType.
     * 
     * @return quotaCode
     */
    public java.lang.String getQuotaCode() {
        return quotaCode;
    }


    /**
     * Sets the quotaCode value for this ThresholdType.
     * 
     * @param quotaCode
     */
    public void setQuotaCode(java.lang.String quotaCode) {
        this.quotaCode = quotaCode;
    }


    /**
     * Gets the type value for this ThresholdType.
     * 
     * @return type
     */
    public com.broadhop.unifiedapi.soap.types.ThresholdTypeType getType() {
        return type;
    }


    /**
     * Sets the type value for this ThresholdType.
     * 
     * @param type
     */
    public void setType(com.broadhop.unifiedapi.soap.types.ThresholdTypeType type) {
        this.type = type;
    }


    /**
     * Gets the group value for this ThresholdType.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this ThresholdType.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the breached value for this ThresholdType.
     * 
     * @return breached
     */
    public java.lang.Boolean getBreached() {
        return breached;
    }


    /**
     * Sets the breached value for this ThresholdType.
     * 
     * @param breached
     */
    public void setBreached(java.lang.Boolean breached) {
        this.breached = breached;
    }


    /**
     * Gets the subscriberSpecific value for this ThresholdType.
     * 
     * @return subscriberSpecific
     */
    public boolean isSubscriberSpecific() {
        return subscriberSpecific;
    }


    /**
     * Sets the subscriberSpecific value for this ThresholdType.
     * 
     * @param subscriberSpecific
     */
    public void setSubscriberSpecific(boolean subscriberSpecific) {
        this.subscriberSpecific = subscriberSpecific;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThresholdType)) return false;
        ThresholdType other = (ThresholdType) obj;
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
            this.amount == other.getAmount() &&
            ((this.quotaCode==null && other.getQuotaCode()==null) || 
             (this.quotaCode!=null &&
              this.quotaCode.equals(other.getQuotaCode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.breached==null && other.getBreached()==null) || 
             (this.breached!=null &&
              this.breached.equals(other.getBreached()))) &&
            this.subscriberSpecific == other.isSubscriberSpecific();
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
        _hashCode += new Long(getAmount()).hashCode();
        if (getQuotaCode() != null) {
            _hashCode += getQuotaCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getBreached() != null) {
            _hashCode += getBreached().hashCode();
        }
        _hashCode += (isSubscriberSpecific() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThresholdType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ThresholdType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ThresholdType>type"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breached");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "breached"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberSpecific");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriberSpecific"));
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
