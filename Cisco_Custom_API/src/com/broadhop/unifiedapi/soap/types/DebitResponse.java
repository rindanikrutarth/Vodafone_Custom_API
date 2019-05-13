/**
 * DebitResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DebitResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.ReturnDebitType returnDebit;

    public DebitResponse() {
    }

    public DebitResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.ReturnDebitType returnDebit) {
        super(
            errorCode,
            errorMessage);
        this.returnDebit = returnDebit;
    }


    /**
     * Gets the returnDebit value for this DebitResponse.
     * 
     * @return returnDebit
     */
    public com.broadhop.unifiedapi.soap.types.ReturnDebitType getReturnDebit() {
        return returnDebit;
    }


    /**
     * Sets the returnDebit value for this DebitResponse.
     * 
     * @param returnDebit
     */
    public void setReturnDebit(com.broadhop.unifiedapi.soap.types.ReturnDebitType returnDebit) {
        this.returnDebit = returnDebit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebitResponse)) return false;
        DebitResponse other = (DebitResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.returnDebit==null && other.getReturnDebit()==null) || 
             (this.returnDebit!=null &&
              this.returnDebit.equals(other.getReturnDebit())));
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
        if (getReturnDebit() != null) {
            _hashCode += getReturnDebit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebitResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DebitResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDebit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnDebit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnDebitType"));
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
