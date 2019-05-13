/**
 * DeleteServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

import java.util.Arrays;

public class DeleteServiceRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String[] serviceCode;

    private com.broadhop.unifiedapi.soap.types.DeleteBalanceType[] balance;

    private java.lang.Boolean hardDelete;

    private java.lang.Boolean deleteOldBalance;

    public DeleteServiceRequest() {
    }

//    @Override
//	public String toString() {
//		return "DeleteServiceRequest [serviceCode=" + Arrays.toString(serviceCode) + ", balance="
//				+ Arrays.toString(balance) + ", hardDelete=" + hardDelete + ", deleteOldBalance=" + deleteOldBalance
//				+ ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + ", getServiceCode()="
//				+ Arrays.toString(getServiceCode()) + ", getBalance()=" + Arrays.toString(getBalance())
//				+ ", getHardDelete()=" + getHardDelete() + ", getDeleteOldBalance()=" + getDeleteOldBalance()
//				+ ", hashCode()=" + hashCode() + ", getNetworkId()=" + getNetworkId() + ", getAudit()=" + getAudit()
//				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
//	}

    @Override
 	public String toString() {
 		return "DeleteServiceRequest [serviceCode=" + Arrays.toString(serviceCode) + ", getServiceCode()="
 				+ Arrays.toString(getServiceCode()) + ", getNetworkId()=" + getNetworkId() + "]";
 	}
    
	public DeleteServiceRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String[] serviceCode,
           com.broadhop.unifiedapi.soap.types.DeleteBalanceType[] balance,
           java.lang.Boolean hardDelete,
           java.lang.Boolean deleteOldBalance) {
        super(
            audit,
            networkId);
        this.serviceCode = serviceCode;
        this.balance = balance;
        this.hardDelete = hardDelete;
        this.deleteOldBalance = deleteOldBalance;
    }


    /**
     * Gets the serviceCode value for this DeleteServiceRequest.
     * 
     * @return serviceCode
     */
    public java.lang.String[] getServiceCode() {
        return serviceCode;
    }


    /**
     * Sets the serviceCode value for this DeleteServiceRequest.
     * 
     * @param serviceCode
     */
    public void setServiceCode(java.lang.String[] serviceCode) {
        this.serviceCode = serviceCode;
    }

    public java.lang.String getServiceCode(int i) {
        return this.serviceCode[i];
    }

    public void setServiceCode(int i, java.lang.String _value) {
        this.serviceCode[i] = _value;
    }


    /**
     * Gets the balance value for this DeleteServiceRequest.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.DeleteBalanceType[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DeleteServiceRequest.
     * 
     * @param balance
     */
    public void setBalance(com.broadhop.unifiedapi.soap.types.DeleteBalanceType[] balance) {
        this.balance = balance;
    }

    public com.broadhop.unifiedapi.soap.types.DeleteBalanceType getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.broadhop.unifiedapi.soap.types.DeleteBalanceType _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the hardDelete value for this DeleteServiceRequest.
     * 
     * @return hardDelete
     */
    public java.lang.Boolean getHardDelete() {
        return hardDelete;
    }


    /**
     * Sets the hardDelete value for this DeleteServiceRequest.
     * 
     * @param hardDelete
     */
    public void setHardDelete(java.lang.Boolean hardDelete) {
        this.hardDelete = hardDelete;
    }


    /**
     * Gets the deleteOldBalance value for this DeleteServiceRequest.
     * 
     * @return deleteOldBalance
     */
    public java.lang.Boolean getDeleteOldBalance() {
        return deleteOldBalance;
    }


    /**
     * Sets the deleteOldBalance value for this DeleteServiceRequest.
     * 
     * @param deleteOldBalance
     */
    public void setDeleteOldBalance(java.lang.Boolean deleteOldBalance) {
        this.deleteOldBalance = deleteOldBalance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteServiceRequest)) return false;
        DeleteServiceRequest other = (DeleteServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceCode==null && other.getServiceCode()==null) || 
             (this.serviceCode!=null &&
              java.util.Arrays.equals(this.serviceCode, other.getServiceCode()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.hardDelete==null && other.getHardDelete()==null) || 
             (this.hardDelete!=null &&
              this.hardDelete.equals(other.getHardDelete()))) &&
            ((this.deleteOldBalance==null && other.getDeleteOldBalance()==null) || 
             (this.deleteOldBalance!=null &&
              this.deleteOldBalance.equals(other.getDeleteOldBalance())));
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
        if (getServiceCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHardDelete() != null) {
            _hashCode += getHardDelete().hashCode();
        }
        if (getDeleteOldBalance() != null) {
            _hashCode += getDeleteOldBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "serviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "DeleteBalanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "hardDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteOldBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "deleteOldBalance"));
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
