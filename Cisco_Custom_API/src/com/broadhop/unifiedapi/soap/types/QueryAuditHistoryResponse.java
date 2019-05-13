/**
 * QueryAuditHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class QueryAuditHistoryResponse  extends com.broadhop.unifiedapi.soap.types.ResponseType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.AuditType[] audit;

    public QueryAuditHistoryResponse() {
    }

    public QueryAuditHistoryResponse(
           java.math.BigInteger errorCode,
           java.lang.String errorMessage,
           com.broadhop.unifiedapi.soap.types.AuditType[] audit) {
        super(
            errorCode,
            errorMessage);
        this.audit = audit;
    }


    /**
     * Gets the audit value for this QueryAuditHistoryResponse.
     * 
     * @return audit
     */
    public com.broadhop.unifiedapi.soap.types.AuditType[] getAudit() {
        return audit;
    }


    /**
     * Sets the audit value for this QueryAuditHistoryResponse.
     * 
     * @param audit
     */
    public void setAudit(com.broadhop.unifiedapi.soap.types.AuditType[] audit) {
        this.audit = audit;
    }

    public com.broadhop.unifiedapi.soap.types.AuditType getAudit(int i) {
        return this.audit[i];
    }

    public void setAudit(int i, com.broadhop.unifiedapi.soap.types.AuditType _value) {
        this.audit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAuditHistoryResponse)) return false;
        QueryAuditHistoryResponse other = (QueryAuditHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audit==null && other.getAudit()==null) || 
             (this.audit!=null &&
              java.util.Arrays.equals(this.audit, other.getAudit())));
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
        if (getAudit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudit(), i);
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
        new org.apache.axis.description.TypeDesc(QueryAuditHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryAuditHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "audit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AuditType"));
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
