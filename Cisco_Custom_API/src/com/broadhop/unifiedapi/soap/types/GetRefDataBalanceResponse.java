/**
 * GetRefDataBalanceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class GetRefDataBalanceResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType[] refDataBalanceTemplate;

    public GetRefDataBalanceResponse() {
    }

    public GetRefDataBalanceResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType[] refDataBalanceTemplate) {
        super(
            errorCode,
            errorMessage);
        this.refDataBalanceTemplate = refDataBalanceTemplate;
    }


    /**
     * Gets the refDataBalanceTemplate value for this GetRefDataBalanceResponse.
     * 
     * @return refDataBalanceTemplate
     */
    public com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType[] getRefDataBalanceTemplate() {
        return refDataBalanceTemplate;
    }


    /**
     * Sets the refDataBalanceTemplate value for this GetRefDataBalanceResponse.
     * 
     * @param refDataBalanceTemplate
     */
    public void setRefDataBalanceTemplate(com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType[] refDataBalanceTemplate) {
        this.refDataBalanceTemplate = refDataBalanceTemplate;
    }

    public com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType getRefDataBalanceTemplate(int i) {
        return this.refDataBalanceTemplate[i];
    }

    public void setRefDataBalanceTemplate(int i, com.broadhop.unifiedapi.soap.types.RefDataBalanceTemplateType _value) {
        this.refDataBalanceTemplate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRefDataBalanceResponse)) return false;
        GetRefDataBalanceResponse other = (GetRefDataBalanceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.refDataBalanceTemplate==null && other.getRefDataBalanceTemplate()==null) || 
             (this.refDataBalanceTemplate!=null &&
              java.util.Arrays.equals(this.refDataBalanceTemplate, other.getRefDataBalanceTemplate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRefDataBalanceTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefDataBalanceTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefDataBalanceTemplate(), i);
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
        new org.apache.axis.description.TypeDesc(GetRefDataBalanceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataBalanceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDataBalanceTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "refDataBalanceTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataBalanceTemplateType"));
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
