/**
 * GetRefDataServicesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class GetRefDataServicesResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.RefDataServiceType[] refDataService;

    public GetRefDataServicesResponse() {
    }

    public GetRefDataServicesResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.RefDataServiceType[] refDataService) {
        super(
            errorCode,
            errorMessage);
        this.refDataService = refDataService;
    }


    /**
     * Gets the refDataService value for this GetRefDataServicesResponse.
     * 
     * @return refDataService
     */
    public com.broadhop.unifiedapi.soap.types.RefDataServiceType[] getRefDataService() {
        return refDataService;
    }


    /**
     * Sets the refDataService value for this GetRefDataServicesResponse.
     * 
     * @param refDataService
     */
    public void setRefDataService(com.broadhop.unifiedapi.soap.types.RefDataServiceType[] refDataService) {
        this.refDataService = refDataService;
    }

    public com.broadhop.unifiedapi.soap.types.RefDataServiceType getRefDataService(int i) {
        return this.refDataService[i];
    }

    public void setRefDataService(int i, com.broadhop.unifiedapi.soap.types.RefDataServiceType _value) {
        this.refDataService[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRefDataServicesResponse)) return false;
        GetRefDataServicesResponse other = (GetRefDataServicesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.refDataService==null && other.getRefDataService()==null) || 
             (this.refDataService!=null &&
              java.util.Arrays.equals(this.refDataService, other.getRefDataService())));
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
        if (getRefDataService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefDataService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefDataService(), i);
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
        new org.apache.axis.description.TypeDesc(GetRefDataServicesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetRefDataServicesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refDataService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "refDataService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "RefDataServiceType"));
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
