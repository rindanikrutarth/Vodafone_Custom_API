/**
 * ExtendCreditRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ExtendCreditRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit;

    public ExtendCreditRequest() {
    }

    public ExtendCreditRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit) {
        super(
            audit,
            networkId);
        this.extendCredit = extendCredit;
    }


    /**
     * Gets the extendCredit value for this ExtendCreditRequest.
     * 
     * @return extendCredit
     */
    public com.broadhop.unifiedapi.soap.types.ExtendCreditType[] getExtendCredit() {
        return extendCredit;
    }


    /**
     * Sets the extendCredit value for this ExtendCreditRequest.
     * 
     * @param extendCredit
     */
    public void setExtendCredit(com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit) {
        this.extendCredit = extendCredit;
    }

    public com.broadhop.unifiedapi.soap.types.ExtendCreditType getExtendCredit(int i) {
        return this.extendCredit[i];
    }

    public void setExtendCredit(int i, com.broadhop.unifiedapi.soap.types.ExtendCreditType _value) {
        this.extendCredit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtendCreditRequest)) return false;
        ExtendCreditRequest other = (ExtendCreditRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extendCredit==null && other.getExtendCredit()==null) || 
             (this.extendCredit!=null &&
              java.util.Arrays.equals(this.extendCredit, other.getExtendCredit())));
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
        if (getExtendCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendCredit(), i);
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
        new org.apache.axis.description.TypeDesc(ExtendCreditRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExtendCreditRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "extendCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditType"));
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
