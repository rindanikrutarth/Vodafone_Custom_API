/**
 * ReturnCreditType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ReturnCreditType  implements java.io.Serializable {
    private java.lang.String id;

    private java.util.Calendar nextRefreshDate;

    private long balanceRemaining;

    private long amountCredited;

    private java.util.Calendar callbackValidityTime;

    public ReturnCreditType() {
    }

    public ReturnCreditType(
           java.lang.String id,
           java.util.Calendar nextRefreshDate,
           long balanceRemaining,
           long amountCredited,
           java.util.Calendar callbackValidityTime) {
           this.id = id;
           this.nextRefreshDate = nextRefreshDate;
           this.balanceRemaining = balanceRemaining;
           this.amountCredited = amountCredited;
           this.callbackValidityTime = callbackValidityTime;
    }


    /**
     * Gets the id value for this ReturnCreditType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ReturnCreditType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the nextRefreshDate value for this ReturnCreditType.
     * 
     * @return nextRefreshDate
     */
    public java.util.Calendar getNextRefreshDate() {
        return nextRefreshDate;
    }


    /**
     * Sets the nextRefreshDate value for this ReturnCreditType.
     * 
     * @param nextRefreshDate
     */
    public void setNextRefreshDate(java.util.Calendar nextRefreshDate) {
        this.nextRefreshDate = nextRefreshDate;
    }


    /**
     * Gets the balanceRemaining value for this ReturnCreditType.
     * 
     * @return balanceRemaining
     */
    public long getBalanceRemaining() {
        return balanceRemaining;
    }


    /**
     * Sets the balanceRemaining value for this ReturnCreditType.
     * 
     * @param balanceRemaining
     */
    public void setBalanceRemaining(long balanceRemaining) {
        this.balanceRemaining = balanceRemaining;
    }


    /**
     * Gets the amountCredited value for this ReturnCreditType.
     * 
     * @return amountCredited
     */
    public long getAmountCredited() {
        return amountCredited;
    }


    /**
     * Sets the amountCredited value for this ReturnCreditType.
     * 
     * @param amountCredited
     */
    public void setAmountCredited(long amountCredited) {
        this.amountCredited = amountCredited;
    }


    /**
     * Gets the callbackValidityTime value for this ReturnCreditType.
     * 
     * @return callbackValidityTime
     */
    public java.util.Calendar getCallbackValidityTime() {
        return callbackValidityTime;
    }


    /**
     * Sets the callbackValidityTime value for this ReturnCreditType.
     * 
     * @param callbackValidityTime
     */
    public void setCallbackValidityTime(java.util.Calendar callbackValidityTime) {
        this.callbackValidityTime = callbackValidityTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnCreditType)) return false;
        ReturnCreditType other = (ReturnCreditType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nextRefreshDate==null && other.getNextRefreshDate()==null) || 
             (this.nextRefreshDate!=null &&
              this.nextRefreshDate.equals(other.getNextRefreshDate()))) &&
            this.balanceRemaining == other.getBalanceRemaining() &&
            this.amountCredited == other.getAmountCredited() &&
            ((this.callbackValidityTime==null && other.getCallbackValidityTime()==null) || 
             (this.callbackValidityTime!=null &&
              this.callbackValidityTime.equals(other.getCallbackValidityTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNextRefreshDate() != null) {
            _hashCode += getNextRefreshDate().hashCode();
        }
        _hashCode += new Long(getBalanceRemaining()).hashCode();
        _hashCode += new Long(getAmountCredited()).hashCode();
        if (getCallbackValidityTime() != null) {
            _hashCode += getCallbackValidityTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnCreditType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ReturnCreditType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRefreshDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "nextRefreshDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balanceRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "amountCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackValidityTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "callbackValidityTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
