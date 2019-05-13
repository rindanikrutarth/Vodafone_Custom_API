/**
 * ChangeBalanceSubscriberIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ChangeBalanceSubscriberIdResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.ReturnCreditType[] returnCredit;

    public ChangeBalanceSubscriberIdResponse() {
    }

    public ChangeBalanceSubscriberIdResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.ReturnCreditType[] returnCredit) {
        super(
            errorCode,
            errorMessage);
        this.returnCredit = returnCredit;
    }


    /**
     * Gets the returnCredit value for this ChangeBalanceSubscriberIdResponse.
     * 
     * @return returnCredit
     */
    public com.broadhop.unifiedapi.soap.types.ReturnCreditType[] getReturnCredit() {
        return returnCredit;
    }


    /**
     * Sets the returnCredit value for this ChangeBalanceSubscriberIdResponse.
     * 
     * @param returnCredit
     */
    public void setReturnCredit(com.broadhop.unifiedapi.soap.types.ReturnCreditType[] returnCredit) {
        this.returnCredit = returnCredit;
    }

    public com.broadhop.unifiedapi.soap.types.ReturnCreditType getReturnCredit(int i) {
        return this.returnCredit[i];
    }

    public void setReturnCredit(int i, com.broadhop.unifiedapi.soap.types.ReturnCreditType _value) {
        this.returnCredit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeBalanceSubscriberIdResponse)) return false;
        ChangeBalanceSubscriberIdResponse other = (ChangeBalanceSubscriberIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.returnCredit==null && other.getReturnCredit()==null) || 
             (this.returnCredit!=null &&
              java.util.Arrays.equals(this.returnCredit, other.getReturnCredit())));
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
        if (getReturnCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnCredit(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeBalanceSubscriberIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnCreditType"));
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
