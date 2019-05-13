/**
 * CreditType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreditType  implements java.io.Serializable {
    private java.lang.String id;

    private long initialAmount;

    private long amount;

    private long reservedAmount;

    private java.util.Calendar startDate;

    private java.util.Calendar expirationDate;

    private java.lang.Boolean valid;

    private java.math.BigInteger rolloverPeriodAmount;

    private com.broadhop.unifiedapi.soap.types.CreditTypeRolloverPeriodUnits rolloverPeriodUnits;

    private java.util.Calendar rolloverExpirationDate;

    private java.lang.String rolloverTemplateName;

    private com.broadhop.unifiedapi.soap.types.AvpType[] avp;

    public CreditType() {
    }

    public CreditType(
           java.lang.String id,
           long initialAmount,
           long amount,
           long reservedAmount,
           java.util.Calendar startDate,
           java.util.Calendar expirationDate,
           java.lang.Boolean valid,
           java.math.BigInteger rolloverPeriodAmount,
           com.broadhop.unifiedapi.soap.types.CreditTypeRolloverPeriodUnits rolloverPeriodUnits,
           java.util.Calendar rolloverExpirationDate,
           java.lang.String rolloverTemplateName,
           com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
           this.id = id;
           this.initialAmount = initialAmount;
           this.amount = amount;
           this.reservedAmount = reservedAmount;
           this.startDate = startDate;
           this.expirationDate = expirationDate;
           this.valid = valid;
           this.rolloverPeriodAmount = rolloverPeriodAmount;
           this.rolloverPeriodUnits = rolloverPeriodUnits;
           this.rolloverExpirationDate = rolloverExpirationDate;
           this.rolloverTemplateName = rolloverTemplateName;
           this.avp = avp;
    }


    /**
     * Gets the id value for this CreditType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CreditType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the initialAmount value for this CreditType.
     * 
     * @return initialAmount
     */
    public long getInitialAmount() {
        return initialAmount;
    }


    /**
     * Sets the initialAmount value for this CreditType.
     * 
     * @param initialAmount
     */
    public void setInitialAmount(long initialAmount) {
        this.initialAmount = initialAmount;
    }


    /**
     * Gets the amount value for this CreditType.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CreditType.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the reservedAmount value for this CreditType.
     * 
     * @return reservedAmount
     */
    public long getReservedAmount() {
        return reservedAmount;
    }


    /**
     * Sets the reservedAmount value for this CreditType.
     * 
     * @param reservedAmount
     */
    public void setReservedAmount(long reservedAmount) {
        this.reservedAmount = reservedAmount;
    }


    /**
     * Gets the startDate value for this CreditType.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreditType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the expirationDate value for this CreditType.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this CreditType.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the valid value for this CreditType.
     * 
     * @return valid
     */
    public java.lang.Boolean getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this CreditType.
     * 
     * @param valid
     */
    public void setValid(java.lang.Boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the rolloverPeriodAmount value for this CreditType.
     * 
     * @return rolloverPeriodAmount
     */
    public java.math.BigInteger getRolloverPeriodAmount() {
        return rolloverPeriodAmount;
    }


    /**
     * Sets the rolloverPeriodAmount value for this CreditType.
     * 
     * @param rolloverPeriodAmount
     */
    public void setRolloverPeriodAmount(java.math.BigInteger rolloverPeriodAmount) {
        this.rolloverPeriodAmount = rolloverPeriodAmount;
    }


    /**
     * Gets the rolloverPeriodUnits value for this CreditType.
     * 
     * @return rolloverPeriodUnits
     */
    public com.broadhop.unifiedapi.soap.types.CreditTypeRolloverPeriodUnits getRolloverPeriodUnits() {
        return rolloverPeriodUnits;
    }


    /**
     * Sets the rolloverPeriodUnits value for this CreditType.
     * 
     * @param rolloverPeriodUnits
     */
    public void setRolloverPeriodUnits(com.broadhop.unifiedapi.soap.types.CreditTypeRolloverPeriodUnits rolloverPeriodUnits) {
        this.rolloverPeriodUnits = rolloverPeriodUnits;
    }


    /**
     * Gets the rolloverExpirationDate value for this CreditType.
     * 
     * @return rolloverExpirationDate
     */
    public java.util.Calendar getRolloverExpirationDate() {
        return rolloverExpirationDate;
    }


    /**
     * Sets the rolloverExpirationDate value for this CreditType.
     * 
     * @param rolloverExpirationDate
     */
    public void setRolloverExpirationDate(java.util.Calendar rolloverExpirationDate) {
        this.rolloverExpirationDate = rolloverExpirationDate;
    }


    /**
     * Gets the rolloverTemplateName value for this CreditType.
     * 
     * @return rolloverTemplateName
     */
    public java.lang.String getRolloverTemplateName() {
        return rolloverTemplateName;
    }


    /**
     * Sets the rolloverTemplateName value for this CreditType.
     * 
     * @param rolloverTemplateName
     */
    public void setRolloverTemplateName(java.lang.String rolloverTemplateName) {
        this.rolloverTemplateName = rolloverTemplateName;
    }


    /**
     * Gets the avp value for this CreditType.
     * 
     * @return avp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getAvp() {
        return avp;
    }


    /**
     * Sets the avp value for this CreditType.
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
        if (!(obj instanceof CreditType)) return false;
        CreditType other = (CreditType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.initialAmount == other.getInitialAmount() &&
            this.amount == other.getAmount() &&
            this.reservedAmount == other.getReservedAmount() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid()))) &&
            ((this.rolloverPeriodAmount==null && other.getRolloverPeriodAmount()==null) || 
             (this.rolloverPeriodAmount!=null &&
              this.rolloverPeriodAmount.equals(other.getRolloverPeriodAmount()))) &&
            ((this.rolloverPeriodUnits==null && other.getRolloverPeriodUnits()==null) || 
             (this.rolloverPeriodUnits!=null &&
              this.rolloverPeriodUnits.equals(other.getRolloverPeriodUnits()))) &&
            ((this.rolloverExpirationDate==null && other.getRolloverExpirationDate()==null) || 
             (this.rolloverExpirationDate!=null &&
              this.rolloverExpirationDate.equals(other.getRolloverExpirationDate()))) &&
            ((this.rolloverTemplateName==null && other.getRolloverTemplateName()==null) || 
             (this.rolloverTemplateName!=null &&
              this.rolloverTemplateName.equals(other.getRolloverTemplateName()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Long(getInitialAmount()).hashCode();
        _hashCode += new Long(getAmount()).hashCode();
        _hashCode += new Long(getReservedAmount()).hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        if (getRolloverPeriodAmount() != null) {
            _hashCode += getRolloverPeriodAmount().hashCode();
        }
        if (getRolloverPeriodUnits() != null) {
            _hashCode += getRolloverPeriodUnits().hashCode();
        }
        if (getRolloverExpirationDate() != null) {
            _hashCode += getRolloverExpirationDate().hashCode();
        }
        if (getRolloverTemplateName() != null) {
            _hashCode += getRolloverTemplateName().hashCode();
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
        new org.apache.axis.description.TypeDesc(CreditType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreditType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "initialAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "reservedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverPeriodAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "rolloverPeriodAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverPeriodUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "rolloverPeriodUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditType>rolloverPeriodUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "rolloverExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverTemplateName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "rolloverTemplateName"));
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
