/**
 * QueryBalanceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class QueryBalanceRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.Boolean includeExpiredData;

    private java.lang.Boolean excludeReservationsFromCreditTotal;

    public QueryBalanceRequest() {
    }

    public QueryBalanceRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.Boolean includeExpiredData,
           java.lang.Boolean excludeReservationsFromCreditTotal) {
        super(
            audit,
            networkId);
        this.includeExpiredData = includeExpiredData;
        this.excludeReservationsFromCreditTotal = excludeReservationsFromCreditTotal;
    }


    /**
     * Gets the includeExpiredData value for this QueryBalanceRequest.
     * 
     * @return includeExpiredData
     */
    public java.lang.Boolean getIncludeExpiredData() {
        return includeExpiredData;
    }


    /**
     * Sets the includeExpiredData value for this QueryBalanceRequest.
     * 
     * @param includeExpiredData
     */
    public void setIncludeExpiredData(java.lang.Boolean includeExpiredData) {
        this.includeExpiredData = includeExpiredData;
    }


    /**
     * Gets the excludeReservationsFromCreditTotal value for this QueryBalanceRequest.
     * 
     * @return excludeReservationsFromCreditTotal
     */
    public java.lang.Boolean getExcludeReservationsFromCreditTotal() {
        return excludeReservationsFromCreditTotal;
    }


    /**
     * Sets the excludeReservationsFromCreditTotal value for this QueryBalanceRequest.
     * 
     * @param excludeReservationsFromCreditTotal
     */
    public void setExcludeReservationsFromCreditTotal(java.lang.Boolean excludeReservationsFromCreditTotal) {
        this.excludeReservationsFromCreditTotal = excludeReservationsFromCreditTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryBalanceRequest)) return false;
        QueryBalanceRequest other = (QueryBalanceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.includeExpiredData==null && other.getIncludeExpiredData()==null) || 
             (this.includeExpiredData!=null &&
              this.includeExpiredData.equals(other.getIncludeExpiredData()))) &&
            ((this.excludeReservationsFromCreditTotal==null && other.getExcludeReservationsFromCreditTotal()==null) || 
             (this.excludeReservationsFromCreditTotal!=null &&
              this.excludeReservationsFromCreditTotal.equals(other.getExcludeReservationsFromCreditTotal())));
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
        if (getIncludeExpiredData() != null) {
            _hashCode += getIncludeExpiredData().hashCode();
        }
        if (getExcludeReservationsFromCreditTotal() != null) {
            _hashCode += getExcludeReservationsFromCreditTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryBalanceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">QueryBalanceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeExpiredData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "includeExpiredData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeReservationsFromCreditTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "excludeReservationsFromCreditTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
