/**
 * RefDataBalanceTemplateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;


/**
 * A ref data balance template is a reference data object defined
 * in Policy Builder that defines an Account Balance for MsBM and also
 * contains any associated Quota and Threshold definitions.
 */
public class RefDataBalanceTemplateType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.String description;

    private java.lang.String quotaUnits;

    private com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType[] refDataQuotaTemplate;

    private com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] refDataThreshold;

    public RefDataBalanceTemplateType() {
    }

    public RefDataBalanceTemplateType(
           java.lang.String code,
           java.lang.String description,
           java.lang.String quotaUnits,
           com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType[] refDataQuotaTemplate,
           com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] refDataThreshold) {
           this.code = code;
           this.description = description;
           this.quotaUnits = quotaUnits;
           this.refDataQuotaTemplate = refDataQuotaTemplate;
           this.refDataThreshold = refDataThreshold;
    }


    /**
     * Gets the code value for this RefDataBalanceTemplateType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this RefDataBalanceTemplateType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the description value for this RefDataBalanceTemplateType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RefDataBalanceTemplateType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the quotaUnits value for this RefDataBalanceTemplateType.
     * 
     * @return quotaUnits
     */
    public java.lang.String getQuotaUnits() {
        return quotaUnits;
    }


    /**
     * Sets the quotaUnits value for this RefDataBalanceTemplateType.
     * 
     * @param quotaUnits
     */
    public void setQuotaUnits(java.lang.String quotaUnits) {
        this.quotaUnits = quotaUnits;
    }


    /**
     * Gets the refDataQuotaTemplate value for this RefDataBalanceTemplateType.
     * 
     * @return refDataQuotaTemplate
     */
    public com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType[] getRefDataQuotaTemplate() {
        return refDataQuotaTemplate;
    }


    /**
     * Sets the refDataQuotaTemplate value for this RefDataBalanceTemplateType.
     * 
     * @param refDataQuotaTemplate
     */
    public void setRefDataQuotaTemplate(com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType[] refDataQuotaTemplate) {
        this.refDataQuotaTemplate = refDataQuotaTemplate;
    }

    public com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType getRefDataQuotaTemplate(int i) {
        return this.refDataQuotaTemplate[i];
    }

    public void setRefDataQuotaTemplate(int i, com.broadhop.unifiedapi.soap.types.RefDataQuotaTemplateType _value) {
        this.refDataQuotaTemplate[i] = _value;
    }


    /**
     * Gets the refDataThreshold value for this RefDataBalanceTemplateType.
     * 
     * @return refDataThreshold
     */
    public com.broadhop.unifiedapi.soap.types.RefDataThresholdType[] getRefDataThreshold() {
        return refDataThreshold;
    }


    /**
     * Sets the refDataThreshold value for this RefDataBalanceTemplateType.
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
        if (!(obj instanceof RefDataBalanceTemplateType)) return false;
        RefDataBalanceTemplateType other = (RefDataBalanceTemplateType) obj;
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
            ((this.quotaUnits==null && other.getQuotaUnits()==null) || 
             (this.quotaUnits!=null &&
              this.quotaUnits.equals(other.getQuotaUnits()))) &&
            ((this.refDataQuotaTemplate==null && other.getRefDataQuotaTemplate()==null) || 
             (this.refDataQuotaTemplate!=null &&
              java.util.Arrays.equals(this.refDataQuotaTemplate, other.getRefDataQuotaTemplate()))) &&
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
        if (getQuotaUnits() != null) {
            _hashCode += getQuotaUnits().hashCode();
        }
        if (getRefDataQuotaTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefDataQuotaTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefDataQuotaTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(RefDataBalanceTemplateType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataBalanceTemplateType"));
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
        elemField.setFieldName("quotaUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "quotaUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDataQuotaTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "refDataQuotaTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataQuotaTemplateType"));
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
