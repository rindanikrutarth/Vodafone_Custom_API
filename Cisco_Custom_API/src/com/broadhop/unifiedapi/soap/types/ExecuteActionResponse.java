/**
 * ExecuteActionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ExecuteActionResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.EntryType[][][] executeActionResponse;

    public ExecuteActionResponse() {
    }

    public ExecuteActionResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.EntryType[][][] executeActionResponse) {
        super(
            errorCode,
            errorMessage);
        this.executeActionResponse = executeActionResponse;
    }


    /**
     * Gets the executeActionResponse value for this ExecuteActionResponse.
     * 
     * @return executeActionResponse
     */
    public com.broadhop.unifiedapi.soap.types.EntryType[][][] getExecuteActionResponse() {
        return executeActionResponse;
    }


    /**
     * Sets the executeActionResponse value for this ExecuteActionResponse.
     * 
     * @param executeActionResponse
     */
    public void setExecuteActionResponse(com.broadhop.unifiedapi.soap.types.EntryType[][][] executeActionResponse) {
        this.executeActionResponse = executeActionResponse;
    }

    public com.broadhop.unifiedapi.soap.types.EntryType[][] getExecuteActionResponse(int i) {
        return this.executeActionResponse[i];
    }

    public void setExecuteActionResponse(int i, com.broadhop.unifiedapi.soap.types.EntryType[][] _value) {
        this.executeActionResponse[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteActionResponse)) return false;
        ExecuteActionResponse other = (ExecuteActionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.executeActionResponse==null && other.getExecuteActionResponse()==null) || 
             (this.executeActionResponse!=null &&
              java.util.Arrays.equals(this.executeActionResponse, other.getExecuteActionResponse())));
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
        if (getExecuteActionResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecuteActionResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecuteActionResponse(), i);
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
        new org.apache.axis.description.TypeDesc(ExecuteActionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ExecuteActionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeActionResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "executeActionResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExecuteActionResponseType"));
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
