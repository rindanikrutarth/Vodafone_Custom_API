/**
 * SwitchServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class SwitchServiceRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String oldServiceCode;

    private com.broadhop.unifiedapi.soap.types.ServiceType service;

    private java.lang.String oldBalanceCode;

    private java.lang.String oldQuotaCode;

    private com.broadhop.unifiedapi.soap.types.CreateBalanceType balance;

    public SwitchServiceRequest() {
    }

//    @Override
//	public String toString() {
//		return "SwitchServiceRequest [oldServiceCode=" + oldServiceCode + ", service=" + service + ", oldBalanceCode="
//				+ oldBalanceCode + ", oldQuotaCode=" + oldQuotaCode + ", balance=" + balance + ", __equalsCalc="
//				+ __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + ", getOldServiceCode()=" + getOldServiceCode()
//				+ ", getService()=" + getService() + ", getOldBalanceCode()=" + getOldBalanceCode()
//				+ ", getOldQuotaCode()=" + getOldQuotaCode() + ", getBalance()=" + getBalance() + ", hashCode()="
//				+ hashCode() + ", getNetworkId()=" + getNetworkId() + ", getAudit()=" + getAudit() + ", getClass()="
//				+ getClass() + ", toString()=" + super.toString() + "]";
//	}
    
    @Override
	public String toString() {
		return "SwitchServiceRequest [oldServiceCode=" + oldServiceCode + ", service=" + service + ", getOldServiceCode()=" + getOldServiceCode()
				+ ", getService()=" + getService() + ", getNetworkId()=" + getNetworkId() + "]";
	}

	public SwitchServiceRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String oldServiceCode,
           com.broadhop.unifiedapi.soap.types.ServiceType service,
           java.lang.String oldBalanceCode,
           java.lang.String oldQuotaCode,
           com.broadhop.unifiedapi.soap.types.CreateBalanceType balance) {
        super(
            audit,
            networkId);
        this.oldServiceCode = oldServiceCode;
        this.service = service;
        this.oldBalanceCode = oldBalanceCode;
        this.oldQuotaCode = oldQuotaCode;
        this.balance = balance;
    }


    /**
     * Gets the oldServiceCode value for this SwitchServiceRequest.
     * 
     * @return oldServiceCode
     */
    public java.lang.String getOldServiceCode() {
        return oldServiceCode;
    }


    /**
     * Sets the oldServiceCode value for this SwitchServiceRequest.
     * 
     * @param oldServiceCode
     */
    public void setOldServiceCode(java.lang.String oldServiceCode) {
        this.oldServiceCode = oldServiceCode;
    }


    /**
     * Gets the service value for this SwitchServiceRequest.
     * 
     * @return service
     */
    public com.broadhop.unifiedapi.soap.types.ServiceType getService() {
        return service;
    }


    /**
     * Sets the service value for this SwitchServiceRequest.
     * 
     * @param service
     */
    public void setService(com.broadhop.unifiedapi.soap.types.ServiceType service) {
        this.service = service;
    }


    /**
     * Gets the oldBalanceCode value for this SwitchServiceRequest.
     * 
     * @return oldBalanceCode
     */
    public java.lang.String getOldBalanceCode() {
        return oldBalanceCode;
    }


    /**
     * Sets the oldBalanceCode value for this SwitchServiceRequest.
     * 
     * @param oldBalanceCode
     */
    public void setOldBalanceCode(java.lang.String oldBalanceCode) {
        this.oldBalanceCode = oldBalanceCode;
    }


    /**
     * Gets the oldQuotaCode value for this SwitchServiceRequest.
     * 
     * @return oldQuotaCode
     */
    public java.lang.String getOldQuotaCode() {
        return oldQuotaCode;
    }


    /**
     * Sets the oldQuotaCode value for this SwitchServiceRequest.
     * 
     * @param oldQuotaCode
     */
    public void setOldQuotaCode(java.lang.String oldQuotaCode) {
        this.oldQuotaCode = oldQuotaCode;
    }


    /**
     * Gets the balance value for this SwitchServiceRequest.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.CreateBalanceType getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this SwitchServiceRequest.
     * 
     * @param balance
     */
    public void setBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceType balance) {
        this.balance = balance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SwitchServiceRequest)) return false;
        SwitchServiceRequest other = (SwitchServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldServiceCode==null && other.getOldServiceCode()==null) || 
             (this.oldServiceCode!=null &&
              this.oldServiceCode.equals(other.getOldServiceCode()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.oldBalanceCode==null && other.getOldBalanceCode()==null) || 
             (this.oldBalanceCode!=null &&
              this.oldBalanceCode.equals(other.getOldBalanceCode()))) &&
            ((this.oldQuotaCode==null && other.getOldQuotaCode()==null) || 
             (this.oldQuotaCode!=null &&
              this.oldQuotaCode.equals(other.getOldQuotaCode()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance())));
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
        if (getOldServiceCode() != null) {
            _hashCode += getOldServiceCode().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getOldBalanceCode() != null) {
            _hashCode += getOldBalanceCode().hashCode();
        }
        if (getOldQuotaCode() != null) {
            _hashCode += getOldQuotaCode().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwitchServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">SwitchServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldServiceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "oldServiceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldBalanceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "oldBalanceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldQuotaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "oldQuotaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CreateBalanceType"));
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
