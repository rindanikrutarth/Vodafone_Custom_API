/**
 * GetSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class GetSubscriberRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.Boolean returnSessions;

    @Override
	public String toString() {
//		return "GetSubscriberRequest [returnSessions=" + returnSessions + ", returnBalances=" + returnBalances
//				+ ", includeExpiredData=" + includeExpiredData + ", excludeReservationsFromCreditTotal="
//				+ excludeReservationsFromCreditTotal + ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc="
//				+ __hashCodeCalc + ", getReturnSessions()=" + getReturnSessions() + ", getReturnBalances()="
//				+ getReturnBalances() + ", getIncludeExpiredData()=" + getIncludeExpiredData()
//				+ ", getExcludeReservationsFromCreditTotal()=" + getExcludeReservationsFromCreditTotal()
//				+ ", hashCode()=" + hashCode() + ", getNetworkId()=" + getNetworkId() + ", getAudit()=" + getAudit()
//				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
		return "GetSubscriberRequest [getNetworkId()=" + getNetworkId() + "]";
	}

	private java.lang.Boolean returnBalances;

    private java.lang.Boolean includeExpiredData;

    private java.lang.Boolean excludeReservationsFromCreditTotal;

    public GetSubscriberRequest() {
    }

    public GetSubscriberRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.Boolean returnSessions,
           java.lang.Boolean returnBalances,
           java.lang.Boolean includeExpiredData,
           java.lang.Boolean excludeReservationsFromCreditTotal) {
        super(
            audit,
            networkId);
        this.returnSessions = returnSessions;
        this.returnBalances = returnBalances;
        this.includeExpiredData = includeExpiredData;
        this.excludeReservationsFromCreditTotal = excludeReservationsFromCreditTotal;
    }


    /**
     * Gets the returnSessions value for this GetSubscriberRequest.
     * 
     * @return returnSessions
     */
    public java.lang.Boolean getReturnSessions() {
        return returnSessions;
    }


    /**
     * Sets the returnSessions value for this GetSubscriberRequest.
     * 
     * @param returnSessions
     */
    public void setReturnSessions(java.lang.Boolean returnSessions) {
        this.returnSessions = returnSessions;
    }


    /**
     * Gets the returnBalances value for this GetSubscriberRequest.
     * 
     * @return returnBalances
     */
    public java.lang.Boolean getReturnBalances() {
        return returnBalances;
    }


    /**
     * Sets the returnBalances value for this GetSubscriberRequest.
     * 
     * @param returnBalances
     */
    public void setReturnBalances(java.lang.Boolean returnBalances) {
        this.returnBalances = returnBalances;
    }


    /**
     * Gets the includeExpiredData value for this GetSubscriberRequest.
     * 
     * @return includeExpiredData
     */
    public java.lang.Boolean getIncludeExpiredData() {
        return includeExpiredData;
    }


    /**
     * Sets the includeExpiredData value for this GetSubscriberRequest.
     * 
     * @param includeExpiredData
     */
    public void setIncludeExpiredData(java.lang.Boolean includeExpiredData) {
        this.includeExpiredData = includeExpiredData;
    }


    /**
     * Gets the excludeReservationsFromCreditTotal value for this GetSubscriberRequest.
     * 
     * @return excludeReservationsFromCreditTotal
     */
    public java.lang.Boolean getExcludeReservationsFromCreditTotal() {
        return excludeReservationsFromCreditTotal;
    }


    /**
     * Sets the excludeReservationsFromCreditTotal value for this GetSubscriberRequest.
     * 
     * @param excludeReservationsFromCreditTotal
     */
    public void setExcludeReservationsFromCreditTotal(java.lang.Boolean excludeReservationsFromCreditTotal) {
        this.excludeReservationsFromCreditTotal = excludeReservationsFromCreditTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubscriberRequest)) return false;
        GetSubscriberRequest other = (GetSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.returnSessions==null && other.getReturnSessions()==null) || 
             (this.returnSessions!=null &&
              this.returnSessions.equals(other.getReturnSessions()))) &&
            ((this.returnBalances==null && other.getReturnBalances()==null) || 
             (this.returnBalances!=null &&
              this.returnBalances.equals(other.getReturnBalances()))) &&
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
        if (getReturnSessions() != null) {
            _hashCode += getReturnSessions().hashCode();
        }
        if (getReturnBalances() != null) {
            _hashCode += getReturnBalances().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(GetSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">GetSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnSessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnSessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnBalances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "returnBalances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeExpiredData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "includeExpiredData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeReservationsFromCreditTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "excludeReservationsFromCreditTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
