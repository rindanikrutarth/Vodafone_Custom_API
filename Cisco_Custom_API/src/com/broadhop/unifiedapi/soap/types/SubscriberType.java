/**
 * SubscriberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class SubscriberType  extends com.broadhop.unifiedapi.soap.types.UserType  implements java.io.Serializable {
    private java.math.BigInteger version;

    private java.lang.String realm;

    private com.broadhop.unifiedapi.soap.types.UserType[] subAccount;

    private com.broadhop.unifiedapi.soap.types.CreateBalanceType[] createBalance;

    public SubscriberType() {
    }

    public SubscriberType(
           java.lang.String id,
           java.lang.String parentId,
           com.broadhop.unifiedapi.soap.types.NameType name,
           com.broadhop.unifiedapi.soap.types.UserTypeAuthType authType,
           java.lang.String authUsername,
           java.lang.String authPassword,
           com.broadhop.unifiedapi.soap.types.CredentialType[] credential,
           com.broadhop.unifiedapi.soap.types.ServiceType[] service,
           com.broadhop.unifiedapi.soap.types.NotificationType[] notification,
           com.broadhop.unifiedapi.soap.types.SessionType[] session,
           com.broadhop.unifiedapi.soap.types.BalanceType[] balance,
           com.broadhop.unifiedapi.soap.types.StatusType status,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           com.broadhop.unifiedapi.soap.types.UserTypeRole role,
           java.lang.String externalId,
           com.broadhop.unifiedapi.soap.types.BillingInfoType billingInfo,
           com.broadhop.unifiedapi.soap.types.AvpType[] avp,
           java.math.BigInteger version,
           java.lang.String realm,
           com.broadhop.unifiedapi.soap.types.UserType[] subAccount,
           com.broadhop.unifiedapi.soap.types.CreateBalanceType[] createBalance) {
        super(
            id,
            parentId,
            name,
            authType,
            authUsername,
            authPassword,
            credential,
            service,
            notification,
            session,
            balance,
            status,
            startDate,
            endDate,
            role,
            externalId,
            billingInfo,
            avp);
        this.version = version;
        this.realm = realm;
        this.subAccount = subAccount;
        this.createBalance = createBalance;
    }


    /**
     * Gets the version value for this SubscriberType.
     * 
     * @return version
     */
    public java.math.BigInteger getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SubscriberType.
     * 
     * @param version
     */
    public void setVersion(java.math.BigInteger version) {
        this.version = version;
    }


    /**
     * Gets the realm value for this SubscriberType.
     * 
     * @return realm
     */
    public java.lang.String getRealm() {
        return realm;
    }


    /**
     * Sets the realm value for this SubscriberType.
     * 
     * @param realm
     */
    public void setRealm(java.lang.String realm) {
        this.realm = realm;
    }


    /**
     * Gets the subAccount value for this SubscriberType.
     * 
     * @return subAccount
     */
    public com.broadhop.unifiedapi.soap.types.UserType[] getSubAccount() {
        return subAccount;
    }


    /**
     * Sets the subAccount value for this SubscriberType.
     * 
     * @param subAccount
     */
    public void setSubAccount(com.broadhop.unifiedapi.soap.types.UserType[] subAccount) {
        this.subAccount = subAccount;
    }

    public com.broadhop.unifiedapi.soap.types.UserType getSubAccount(int i) {
        return this.subAccount[i];
    }

    public void setSubAccount(int i, com.broadhop.unifiedapi.soap.types.UserType _value) {
        this.subAccount[i] = _value;
    }


    /**
     * Gets the createBalance value for this SubscriberType.
     * 
     * @return createBalance
     */
    public com.broadhop.unifiedapi.soap.types.CreateBalanceType[] getCreateBalance() {
        return createBalance;
    }


    /**
     * Sets the createBalance value for this SubscriberType.
     * 
     * @param createBalance
     */
    public void setCreateBalance(com.broadhop.unifiedapi.soap.types.CreateBalanceType[] createBalance) {
        this.createBalance = createBalance;
    }

    public com.broadhop.unifiedapi.soap.types.CreateBalanceType getCreateBalance(int i) {
        return this.createBalance[i];
    }

    public void setCreateBalance(int i, com.broadhop.unifiedapi.soap.types.CreateBalanceType _value) {
        this.createBalance[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberType)) return false;
        SubscriberType other = (SubscriberType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.realm==null && other.getRealm()==null) || 
             (this.realm!=null &&
              this.realm.equals(other.getRealm()))) &&
            ((this.subAccount==null && other.getSubAccount()==null) || 
             (this.subAccount!=null &&
              java.util.Arrays.equals(this.subAccount, other.getSubAccount()))) &&
            ((this.createBalance==null && other.getCreateBalance()==null) || 
             (this.createBalance!=null &&
              java.util.Arrays.equals(this.createBalance, other.getCreateBalance())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getRealm() != null) {
            _hashCode += getRealm().hashCode();
        }
        if (getSubAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreateBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreateBalance(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriberType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "realm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "createBalance"));
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
