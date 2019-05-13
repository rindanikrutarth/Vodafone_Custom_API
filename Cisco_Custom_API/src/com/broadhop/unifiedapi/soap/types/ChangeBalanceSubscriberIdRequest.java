/**
 * ChangeBalanceSubscriberIdRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ChangeBalanceSubscriberIdRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String newBalanceSubscriberId;

    private java.lang.Boolean shared;

    private java.lang.Boolean removeOriginalAccount;

    private com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance;

    private com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit;

    public ChangeBalanceSubscriberIdRequest() {
    }

    public ChangeBalanceSubscriberIdRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String newBalanceSubscriberId,
           java.lang.Boolean shared,
           java.lang.Boolean removeOriginalAccount,
           com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance,
           com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit) {
        super(
            audit,
            networkId);
        this.newBalanceSubscriberId = newBalanceSubscriberId;
        this.shared = shared;
        this.removeOriginalAccount = removeOriginalAccount;
        this.balance = balance;
        this.extendCredit = extendCredit;
    }


    /**
     * Gets the newBalanceSubscriberId value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @return newBalanceSubscriberId
     */
    public java.lang.String getNewBalanceSubscriberId() {
        return newBalanceSubscriberId;
    }


    /**
     * Sets the newBalanceSubscriberId value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @param newBalanceSubscriberId
     */
    public void setNewBalanceSubscriberId(java.lang.String newBalanceSubscriberId) {
        this.newBalanceSubscriberId = newBalanceSubscriberId;
    }


    /**
     * Gets the shared value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @return shared
     */
    public java.lang.Boolean getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @param shared
     */
    public void setShared(java.lang.Boolean shared) {
        this.shared = shared;
    }


    /**
     * Gets the removeOriginalAccount value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @return removeOriginalAccount
     */
    public java.lang.Boolean getRemoveOriginalAccount() {
        return removeOriginalAccount;
    }


    /**
     * Sets the removeOriginalAccount value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @param removeOriginalAccount
     */
    public void setRemoveOriginalAccount(java.lang.Boolean removeOriginalAccount) {
        this.removeOriginalAccount = removeOriginalAccount;
    }


    /**
     * Gets the balance value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.CreateBalanceType[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @param balance
     */
    public void setBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance) {
        this.balance = balance;
    }

    public com.broadhop.unifiedapi.soap.types.CreateBalanceType getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.broadhop.unifiedapi.soap.types.CreateBalanceType _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the extendCredit value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @return extendCredit
     */
    public com.broadhop.unifiedapi.soap.types.ExtendCreditType[] getExtendCredit() {
        return extendCredit;
    }


    /**
     * Sets the extendCredit value for this ChangeBalanceSubscriberIdRequest.
     * 
     * @param extendCredit
     */
    public void setExtendCredit(com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit) {
        this.extendCredit = extendCredit;
    }

    public com.broadhop.unifiedapi.soap.types.ExtendCreditType getExtendCredit(int i) {
        return this.extendCredit[i];
    }

    public void setExtendCredit(int i, com.broadhop.unifiedapi.soap.types.ExtendCreditType _value) {
        this.extendCredit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeBalanceSubscriberIdRequest)) return false;
        ChangeBalanceSubscriberIdRequest other = (ChangeBalanceSubscriberIdRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newBalanceSubscriberId==null && other.getNewBalanceSubscriberId()==null) || 
             (this.newBalanceSubscriberId!=null &&
              this.newBalanceSubscriberId.equals(other.getNewBalanceSubscriberId()))) &&
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared()))) &&
            ((this.removeOriginalAccount==null && other.getRemoveOriginalAccount()==null) || 
             (this.removeOriginalAccount!=null &&
              this.removeOriginalAccount.equals(other.getRemoveOriginalAccount()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.extendCredit==null && other.getExtendCredit()==null) || 
             (this.extendCredit!=null &&
              java.util.Arrays.equals(this.extendCredit, other.getExtendCredit())));
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
        if (getNewBalanceSubscriberId() != null) {
            _hashCode += getNewBalanceSubscriberId().hashCode();
        }
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        if (getRemoveOriginalAccount() != null) {
            _hashCode += getRemoveOriginalAccount().hashCode();
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
        if (getExtendCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendCredit(), i);
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
        new org.apache.axis.description.TypeDesc(ChangeBalanceSubscriberIdRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeBalanceSubscriberIdRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalanceSubscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "newBalanceSubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeOriginalAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "removeOriginalAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendCredit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "extendCredit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ExtendCreditType"));
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
