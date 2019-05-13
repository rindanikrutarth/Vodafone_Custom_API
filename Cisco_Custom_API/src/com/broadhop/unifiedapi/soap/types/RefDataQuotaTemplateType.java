/**
 * RefDataQuotaTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;


/**
 * A ref data quota template is a reference data object defined in
 * Policy Builder that defines an Quota for MsBM and also contains any
 * associated Threshold definitions.
 */
public class RefDataQuotaTemplateType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String description;

    private java.lang.String amount;

    private java.math.BigInteger priority;

    private com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] refDataThreshold;

    public RefDataQuotaTemplateType() {
    }

    public RefDataQuotaTemplateType(
           java.lang.String code,
           java.lang.String description,
           java.lang.String amount,
           java.math.BigInteger priority,
           com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] refDataThreshold) {
           this.code = code;
           this.description = description;
           this.amount = amount;
           this.priority = priority;
           this.refDataThreshold = refDataThreshold;
    }


    /**
     * Gets the code value for this RefDataQuotaTemplateType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this RefDataQuotaTemplateType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this RefDataQuotaTemplateType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RefDataQuotaTemplateType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this RefDataQuotaTemplateType.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RefDataQuotaTemplateType.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the priority value for this RefDataQuotaTemplateType.
     * 
     * @return priority
     */
    public java.math.BigInteger getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this RefDataQuotaTemplateType.
     * 
     * @param priority
     */
    public void setPriority(java.math.BigInteger priority) {
        this.priority = priority;
    }


    /**
     * Gets the refDataThreshold value for this RefDataQuotaTemplateType.
     * 
     * @return refDataThreshold
     */
    public com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] getRefDataThreshold() {
        return refDataThreshold;
    }


    /**
     * Sets the refDataThreshold value for this RefDataQuotaTemplateType.
     * 
     * @param refDataThreshold
     */
    public void setRefDataThreshold(com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] refDataThreshold) {
        this.refDataThreshold = refDataThreshold;
    }

    public com.broadhop.unifiedapi.soap.types.RefDataThresholdType getRefDataThreshold(int i) {
        return this.refDataThreshold[i];
    }

    public void setRefDataThreshold(int i, com.broadhop.unifiedapi.soap.types.RefDataThresholdType _value) {
        this.refDataThreshold[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefDataQuotaTemplateType)) return false;
        RefDataQuotaTemplateType other = (RefDataQuotaTemplateType) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.refDataThreshold==null && other.getRefDataThreshold()==null) || 
             (this.refDataThreshold!=null &&
              java.util.Arrays.equals(this.refDataThreshold, other.getRefDataThreshold())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRefDataThreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefDataThreshold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefDataThreshold(), i);
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
        new org.apache.axis.description.TypeDesc(RefDataQuotaTemplateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataQuotaTemplateType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDataThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "refDataThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataThresholdType"));
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
