/**
 * UserType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class UserType  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String parentId;

    private com.broadhop.unifiedapi.soap.types.NameType name;

    private com.broadhop.unifiedapi.soap.types.UserTypeAuthType authType;

    private java.lang.String authUsername;

    private java.lang.String authPassword;

    private com.broadhop.unifiedapi.soap.types.CredentialType[] credential;

    private com.broadhop.unifiedapi.soap.types.ServiceType[] service;

    private com.broadhop.unifiedapi.soap.types.NotificationType[] notification;

    private com.broadhop.unifiedapi.soap.types.SessionType[] session;

    private com.broadhop.unifiedapi.soap.types.BalanceType[] balance;

    private com.broadhop.unifiedapi.soap.types.StatusType status;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private com.broadhop.unifiedapi.soap.types.UserTypeRole role;

    private java.lang.String externalId;

    private com.broadhop.unifiedapi.soap.types.BillingInfoType billingInfo;

    private com.broadhop.unifiedapi.soap.types.AvpType[] avp;

    public UserType() {
    }

    public UserType(
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
           com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
           this.id = id;
           this.parentId = parentId;
           this.name = name;
           this.authType = authType;
           this.authUsername = authUsername;
           this.authPassword = authPassword;
           this.credential = credential;
           this.service = service;
           this.notification = notification;
           this.session = session;
           this.balance = balance;
           this.status = status;
           this.startDate = startDate;
           this.endDate = endDate;
           this.role = role;
           this.externalId = externalId;
           this.billingInfo = billingInfo;
           this.avp = avp;
    }


    /**
     * Gets the id value for this UserType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this UserType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the parentId value for this UserType.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this UserType.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the name value for this UserType.
     * 
     * @return name
     */
    public com.broadhop.unifiedapi.soap.types.NameType getName() {
        return name;
    }


    /**
     * Sets the name value for this UserType.
     * 
     * @param name
     */
    public void setName(com.broadhop.unifiedapi.soap.types.NameType name) {
        this.name = name;
    }


    /**
     * Gets the authType value for this UserType.
     * 
     * @return authType
     */
    public com.broadhop.unifiedapi.soap.types.UserTypeAuthType getAuthType() {
        return authType;
    }


    /**
     * Sets the authType value for this UserType.
     * 
     * @param authType
     */
    public void setAuthType(com.broadhop.unifiedapi.soap.types.UserTypeAuthType authType) {
        this.authType = authType;
    }


    /**
     * Gets the authUsername value for this UserType.
     * 
     * @return authUsername
     */
    public java.lang.String getAuthUsername() {
        return authUsername;
    }


    /**
     * Sets the authUsername value for this UserType.
     * 
     * @param authUsername
     */
    public void setAuthUsername(java.lang.String authUsername) {
        this.authUsername = authUsername;
    }


    /**
     * Gets the authPassword value for this UserType.
     * 
     * @return authPassword
     */
    public java.lang.String getAuthPassword() {
        return authPassword;
    }


    /**
     * Sets the authPassword value for this UserType.
     * 
     * @param authPassword
     */
    public void setAuthPassword(java.lang.String authPassword) {
        this.authPassword = authPassword;
    }


    /**
     * Gets the credential value for this UserType.
     * 
     * @return credential
     */
    public com.broadhop.unifiedapi.soap.types.CredentialType[] getCredential() {
        return credential;
    }


    /**
     * Sets the credential value for this UserType.
     * 
     * @param credential
     */
    public void setCredential(com.broadhop.unifiedapi.soap.types.CredentialType[] credential) {
        this.credential = credential;
    }

    public com.broadhop.unifiedapi.soap.types.CredentialType getCredential(int i) {
        return this.credential[i];
    }

    public void setCredential(int i, com.broadhop.unifiedapi.soap.types.CredentialType _value) {
        this.credential[i] = _value;
    }


    /**
     * Gets the service value for this UserType.
     * 
     * @return service
     */
    public com.broadhop.unifiedapi.soap.types.ServiceType[] getService() {
        return service;
    }


    /**
     * Sets the service value for this UserType.
     * 
     * @param service
     */
    public void setService(com.broadhop.unifiedapi.soap.types.ServiceType[] service) {
        this.service = service;
    }

    public com.broadhop.unifiedapi.soap.types.ServiceType getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.broadhop.unifiedapi.soap.types.ServiceType _value) {
        this.service[i] = _value;
    }


    /**
     * Gets the notification value for this UserType.
     * 
     * @return notification
     */
    public com.broadhop.unifiedapi.soap.types.NotificationType[] getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this UserType.
     * 
     * @param notification
     */
    public void setNotification(com.broadhop.unifiedapi.soap.types.NotificationType[] notification) {
        this.notification = notification;
    }

    public com.broadhop.unifiedapi.soap.types.NotificationType getNotification(int i) {
        return this.notification[i];
    }

    public void setNotification(int i, com.broadhop.unifiedapi.soap.types.NotificationType _value) {
        this.notification[i] = _value;
    }


    /**
     * Gets the session value for this UserType.
     * 
     * @return session
     */
    public com.broadhop.unifiedapi.soap.types.SessionType[] getSession() {
        return session;
    }


    /**
     * Sets the session value for this UserType.
     * 
     * @param session
     */
    public void setSession(com.broadhop.unifiedapi.soap.types.SessionType[] session) {
        this.session = session;
    }

    public com.broadhop.unifiedapi.soap.types.SessionType getSession(int i) {
        return this.session[i];
    }

    public void setSession(int i, com.broadhop.unifiedapi.soap.types.SessionType _value) {
        this.session[i] = _value;
    }


    /**
     * Gets the balance value for this UserType.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.BalanceType[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this UserType.
     * 
     * @param balance
     */
    public void setBalance(com.broadhop.unifiedapi.soap.types.BalanceType[] balance) {
        this.balance = balance;
    }

    public com.broadhop.unifiedapi.soap.types.BalanceType getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, com.broadhop.unifiedapi.soap.types.BalanceType _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the status value for this UserType.
     * 
     * @return status
     */
    public com.broadhop.unifiedapi.soap.types.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserType.
     * 
     * @param status
     */
    public void setStatus(com.broadhop.unifiedapi.soap.types.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the startDate value for this UserType.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this UserType.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this UserType.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this UserType.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the role value for this UserType.
     * 
     * @return role
     */
    public com.broadhop.unifiedapi.soap.types.UserTypeRole getRole() {
        return role;
    }


    /**
     * Sets the role value for this UserType.
     * 
     * @param role
     */
    public void setRole(com.broadhop.unifiedapi.soap.types.UserTypeRole role) {
        this.role = role;
    }


    /**
     * Gets the externalId value for this UserType.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this UserType.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the billingInfo value for this UserType.
     * 
     * @return billingInfo
     */
    public com.broadhop.unifiedapi.soap.types.BillingInfoType getBillingInfo() {
        return billingInfo;
    }


    /**
     * Sets the billingInfo value for this UserType.
     * 
     * @param billingInfo
     */
    public void setBillingInfo(com.broadhop.unifiedapi.soap.types.BillingInfoType billingInfo) {
        this.billingInfo = billingInfo;
    }


    /**
     * Gets the avp value for this UserType.
     * 
     * @return avp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getAvp() {
        return avp;
    }


    /**
     * Sets the avp value for this UserType.
     * 
     * @param avp
     */
    public void setAvp(com.broadhop.unifiedapi.soap.types.AvpType[] avp) {
        this.avp = avp;
    }

    public com.broadhop.unifiedapi.soap.types.AvpType getAvp(int i) {
        return this.avp[i];
    }

    public void setAvp(int i, com.broadhop.unifiedapi.soap.types.AvpType _value) {
        this.avp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserType)) return false;
        UserType other = (UserType) obj;
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
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.authType==null && other.getAuthType()==null) || 
             (this.authType!=null &&
              this.authType.equals(other.getAuthType()))) &&
            ((this.authUsername==null && other.getAuthUsername()==null) || 
             (this.authUsername!=null &&
              this.authUsername.equals(other.getAuthUsername()))) &&
            ((this.authPassword==null && other.getAuthPassword()==null) || 
             (this.authPassword!=null &&
              this.authPassword.equals(other.getAuthPassword()))) &&
            ((this.credential==null && other.getCredential()==null) || 
             (this.credential!=null &&
              java.util.Arrays.equals(this.credential, other.getCredential()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              java.util.Arrays.equals(this.notification, other.getNotification()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              java.util.Arrays.equals(this.session, other.getSession()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.billingInfo==null && other.getBillingInfo()==null) || 
             (this.billingInfo!=null &&
              this.billingInfo.equals(other.getBillingInfo()))) &&
            ((this.avp==null && other.getAvp()==null) || 
             (this.avp!=null &&
              java.util.Arrays.equals(this.avp, other.getAvp())));
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
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAuthType() != null) {
            _hashCode += getAuthType().hashCode();
        }
        if (getAuthUsername() != null) {
            _hashCode += getAuthUsername().hashCode();
        }
        if (getAuthPassword() != null) {
            _hashCode += getAuthPassword().hashCode();
        }
        if (getCredential() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredential());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredential(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSession(), i);
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getBillingInfo() != null) {
            _hashCode += getBillingInfo().hashCode();
        }
        if (getAvp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvp(), i);
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
        new org.apache.axis.description.TypeDesc(UserType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "UserType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "NameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "authType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UserType>authType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "authUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "authPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "credential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "CredentialType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "NotificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "session"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BalanceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "StatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UserType>role"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "billingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "BillingInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "avp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
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
