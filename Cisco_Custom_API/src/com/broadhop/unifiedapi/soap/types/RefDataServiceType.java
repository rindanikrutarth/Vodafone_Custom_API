/**
 * RefDataServiceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;


/**
 * A ref data service is a reference data object defined in Policy
 * Builder that defines the top level values defined for a service.
 */
public class RefDataServiceType  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String code;

    private boolean addToSubAccounts;

    private boolean balanceService;

    private boolean enabled;

    private boolean suppressInPortal;

    public RefDataServiceType() {
    }

    public RefDataServiceType(
           java.lang.String name,
           java.lang.String code,
           boolean addToSubAccounts,
           boolean balanceService,
           boolean enabled,
           boolean suppressInPortal) {
           this.name = name;
           this.code = code;
           this.addToSubAccounts = addToSubAccounts;
           this.balanceService = balanceService;
           this.enabled = enabled;
           this.suppressInPortal = suppressInPortal;
    }


    /**
     * Gets the name value for this RefDataServiceType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RefDataServiceType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the code value for this RefDataServiceType.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this RefDataServiceType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the addToSubAccounts value for this RefDataServiceType.
     * 
     * @return addToSubAccounts
     */
    public boolean isAddToSubAccounts() {
        return addToSubAccounts;
    }


    /**
     * Sets the addToSubAccounts value for this RefDataServiceType.
     * 
     * @param addToSubAccounts
     */
    public void setAddToSubAccounts(boolean addToSubAccounts) {
        this.addToSubAccounts = addToSubAccounts;
    }


    /**
     * Gets the balanceService value for this RefDataServiceType.
     * 
     * @return balanceService
     */
    public boolean isBalanceService() {
        return balanceService;
    }


    /**
     * Sets the balanceService value for this RefDataServiceType.
     * 
     * @param balanceService
     */
    public void setBalanceService(boolean balanceService) {
        this.balanceService = balanceService;
    }


    /**
     * Gets the enabled value for this RefDataServiceType.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this RefDataServiceType.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the suppressInPortal value for this RefDataServiceType.
     * 
     * @return suppressInPortal
     */
    public boolean isSuppressInPortal() {
        return suppressInPortal;
    }


    /**
     * Sets the suppressInPortal value for this RefDataServiceType.
     * 
     * @param suppressInPortal
     */
    public void setSuppressInPortal(boolean suppressInPortal) {
        this.suppressInPortal = suppressInPortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefDataServiceType)) return false;
        RefDataServiceType other = (RefDataServiceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            this.addToSubAccounts == other.isAddToSubAccounts() &&
            this.balanceService == other.isBalanceService() &&
            this.enabled == other.isEnabled() &&
            this.suppressInPortal == other.isSuppressInPortal();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        _hashCode += (isAddToSubAccounts() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBalanceService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSuppressInPortal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefDataServiceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataServiceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addToSubAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "addToSubAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balanceService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressInPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "suppressInPortal"));
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
