/**
 * SearchSubscribersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class SearchSubscribersRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SearchType filter;

    private java.lang.Boolean returnSessions;

    private java.lang.Boolean returnBalances;

    public SearchSubscribersRequest() {
    }

    public SearchSubscribersRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.SearchType filter,
           java.lang.Boolean returnSessions,
           java.lang.Boolean returnBalances) {
        super(
            audit);
        this.filter = filter;
        this.returnSessions = returnSessions;
        this.returnBalances = returnBalances;
    }


    /**
     * Gets the filter value for this SearchSubscribersRequest.
     * 
     * @return filter
     */
    public com.broadhop.unifiedapi.soap.types.SearchType getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this SearchSubscribersRequest.
     * 
     * @param filter
     */
    public void setFilter(com.broadhop.unifiedapi.soap.types.SearchType filter) {
        this.filter = filter;
    }


    /**
     * Gets the returnSessions value for this SearchSubscribersRequest.
     * 
     * @return returnSessions
     */
    public java.lang.Boolean getReturnSessions() {
        return returnSessions;
    }


    /**
     * Sets the returnSessions value for this SearchSubscribersRequest.
     * 
     * @param returnSessions
     */
    public void setReturnSessions(java.lang.Boolean returnSessions) {
        this.returnSessions = returnSessions;
    }


    /**
     * Gets the returnBalances value for this SearchSubscribersRequest.
     * 
     * @return returnBalances
     */
    public java.lang.Boolean getReturnBalances() {
        return returnBalances;
    }


    /**
     * Sets the returnBalances value for this SearchSubscribersRequest.
     * 
     * @param returnBalances
     */
    public void setReturnBalances(java.lang.Boolean returnBalances) {
        this.returnBalances = returnBalances;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchSubscribersRequest)) return false;
        SearchSubscribersRequest other = (SearchSubscribersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.returnSessions==null && other.getReturnSessions()==null) || 
             (this.returnSessions!=null &&
              this.returnSessions.equals(other.getReturnSessions()))) &&
            ((this.returnBalances==null && other.getReturnBalances()==null) || 
             (this.returnBalances!=null &&
              this.returnBalances.equals(other.getReturnBalances())));
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
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getReturnSessions() != null) {
            _hashCode += getReturnSessions().hashCode();
        }
        if (getReturnBalances() != null) {
            _hashCode += getReturnBalances().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchSubscribersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SearchSubscribersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SearchType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnSessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnSessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnBalances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnBalances"));
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
