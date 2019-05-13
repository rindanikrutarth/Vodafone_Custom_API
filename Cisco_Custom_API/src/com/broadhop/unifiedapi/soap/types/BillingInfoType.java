/**
 * BillingInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class BillingInfoType  implements java.io.Serializable {
    private java.lang.String chargingId;

    private java.lang.String ratePlanCode;

    private com.broadhop.unifiedapi.soap.types.AvpType[] avp;

    public BillingInfoType() {
    }

    public BillingInfoType(
           java.lang.String chargingId,
           java.lang.String ratePlanCode,
           com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
           this.chargingId = chargingId;
           this.ratePlanCode = ratePlanCode;
           this.avp = avp;
    }


    /**
     * Gets the chargingId value for this BillingInfoType.
     * 
     * @return chargingId
     */
    public java.lang.String getChargingId() {
        return chargingId;
    }


    /**
     * Sets the chargingId value for this BillingInfoType.
     * 
     * @param chargingId
     */
    public void setChargingId(java.lang.String chargingId) {
        this.chargingId = chargingId;
    }


    /**
     * Gets the ratePlanCode value for this BillingInfoType.
     * 
     * @return ratePlanCode
     */
    public java.lang.String getRatePlanCode() {
        return ratePlanCode;
    }


    /**
     * Sets the ratePlanCode value for this BillingInfoType.
     * 
     * @param ratePlanCode
     */
    public void setRatePlanCode(java.lang.String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }


    /**
     * Gets the avp value for this BillingInfoType.
     * 
     * @return avp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getAvp() {
        return avp;
    }


    /**
     * Sets the avp value for this BillingInfoType.
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
        if (!(obj instanceof BillingInfoType)) return false;
        BillingInfoType other = (BillingInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargingId==null && other.getChargingId()==null) || 
             (this.chargingId!=null &&
              this.chargingId.equals(other.getChargingId()))) &&
            ((this.ratePlanCode==null && other.getRatePlanCode()==null) || 
             (this.ratePlanCode!=null &&
              this.ratePlanCode.equals(other.getRatePlanCode()))) &&
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
        if (getChargingId() != null) {
            _hashCode += getChargingId().hashCode();
        }
        if (getRatePlanCode() != null) {
            _hashCode += getRatePlanCode().hashCode();
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
        new org.apache.axis.description.TypeDesc(BillingInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BillingInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "chargingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratePlanCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ratePlanCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
