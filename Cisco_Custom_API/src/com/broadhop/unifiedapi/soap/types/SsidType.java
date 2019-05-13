/**
 * SsidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class SsidType  implements java.io.Serializable {
    private java.lang.String ssidKey;

    private java.lang.String ssid;

    private java.lang.String accessType;

    private java.lang.String authType;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String loginUrl;

    private java.lang.String configUrl;

    private java.lang.String verficationCertUrl;

    private java.lang.String configMessage;

    private java.lang.String portalFailMessage;

    private java.lang.String unmanagedVpnConnectPrompt;

    private java.lang.String unmanagedVpnDisconnectPrompt;

    public SsidType() {
    }

    public SsidType(
           java.lang.String ssidKey,
           java.lang.String ssid,
           java.lang.String accessType,
           java.lang.String authType,
           java.lang.String username,
           java.lang.String password,
           java.lang.String loginUrl,
           java.lang.String configUrl,
           java.lang.String verficationCertUrl,
           java.lang.String configMessage,
           java.lang.String portalFailMessage,
           java.lang.String unmanagedVpnConnectPrompt,
           java.lang.String unmanagedVpnDisconnectPrompt) {
           this.ssidKey = ssidKey;
           this.ssid = ssid;
           this.accessType = accessType;
           this.authType = authType;
           this.username = username;
           this.password = password;
           this.loginUrl = loginUrl;
           this.configUrl = configUrl;
           this.verficationCertUrl = verficationCertUrl;
           this.configMessage = configMessage;
           this.portalFailMessage = portalFailMessage;
           this.unmanagedVpnConnectPrompt = unmanagedVpnConnectPrompt;
           this.unmanagedVpnDisconnectPrompt = unmanagedVpnDisconnectPrompt;
    }


    /**
     * Gets the ssidKey value for this SsidType.
     * 
     * @return ssidKey
     */
    public java.lang.String getSsidKey() {
        return ssidKey;
    }


    /**
     * Sets the ssidKey value for this SsidType.
     * 
     * @param ssidKey
     */
    public void setSsidKey(java.lang.String ssidKey) {
        this.ssidKey = ssidKey;
    }


    /**
     * Gets the ssid value for this SsidType.
     * 
     * @return ssid
     */
    public java.lang.String getSsid() {
        return ssid;
    }


    /**
     * Sets the ssid value for this SsidType.
     * 
     * @param ssid
     */
    public void setSsid(java.lang.String ssid) {
        this.ssid = ssid;
    }


    /**
     * Gets the accessType value for this SsidType.
     * 
     * @return accessType
     */
    public java.lang.String getAccessType() {
        return accessType;
    }


    /**
     * Sets the accessType value for this SsidType.
     * 
     * @param accessType
     */
    public void setAccessType(java.lang.String accessType) {
        this.accessType = accessType;
    }


    /**
     * Gets the authType value for this SsidType.
     * 
     * @return authType
     */
    public java.lang.String getAuthType() {
        return authType;
    }


    /**
     * Sets the authType value for this SsidType.
     * 
     * @param authType
     */
    public void setAuthType(java.lang.String authType) {
        this.authType = authType;
    }


    /**
     * Gets the username value for this SsidType.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SsidType.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this SsidType.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this SsidType.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the loginUrl value for this SsidType.
     * 
     * @return loginUrl
     */
    public java.lang.String getLoginUrl() {
        return loginUrl;
    }


    /**
     * Sets the loginUrl value for this SsidType.
     * 
     * @param loginUrl
     */
    public void setLoginUrl(java.lang.String loginUrl) {
        this.loginUrl = loginUrl;
    }


    /**
     * Gets the configUrl value for this SsidType.
     * 
     * @return configUrl
     */
    public java.lang.String getConfigUrl() {
        return configUrl;
    }


    /**
     * Sets the configUrl value for this SsidType.
     * 
     * @param configUrl
     */
    public void setConfigUrl(java.lang.String configUrl) {
        this.configUrl = configUrl;
    }


    /**
     * Gets the verficationCertUrl value for this SsidType.
     * 
     * @return verficationCertUrl
     */
    public java.lang.String getVerficationCertUrl() {
        return verficationCertUrl;
    }


    /**
     * Sets the verficationCertUrl value for this SsidType.
     * 
     * @param verficationCertUrl
     */
    public void setVerficationCertUrl(java.lang.String verficationCertUrl) {
        this.verficationCertUrl = verficationCertUrl;
    }


    /**
     * Gets the configMessage value for this SsidType.
     * 
     * @return configMessage
     */
    public java.lang.String getConfigMessage() {
        return configMessage;
    }


    /**
     * Sets the configMessage value for this SsidType.
     * 
     * @param configMessage
     */
    public void setConfigMessage(java.lang.String configMessage) {
        this.configMessage = configMessage;
    }


    /**
     * Gets the portalFailMessage value for this SsidType.
     * 
     * @return portalFailMessage
     */
    public java.lang.String getPortalFailMessage() {
        return portalFailMessage;
    }


    /**
     * Sets the portalFailMessage value for this SsidType.
     * 
     * @param portalFailMessage
     */
    public void setPortalFailMessage(java.lang.String portalFailMessage) {
        this.portalFailMessage = portalFailMessage;
    }


    /**
     * Gets the unmanagedVpnConnectPrompt value for this SsidType.
     * 
     * @return unmanagedVpnConnectPrompt
     */
    public java.lang.String getUnmanagedVpnConnectPrompt() {
        return unmanagedVpnConnectPrompt;
    }


    /**
     * Sets the unmanagedVpnConnectPrompt value for this SsidType.
     * 
     * @param unmanagedVpnConnectPrompt
     */
    public void setUnmanagedVpnConnectPrompt(java.lang.String unmanagedVpnConnectPrompt) {
        this.unmanagedVpnConnectPrompt = unmanagedVpnConnectPrompt;
    }


    /**
     * Gets the unmanagedVpnDisconnectPrompt value for this SsidType.
     * 
     * @return unmanagedVpnDisconnectPrompt
     */
    public java.lang.String getUnmanagedVpnDisconnectPrompt() {
        return unmanagedVpnDisconnectPrompt;
    }


    /**
     * Sets the unmanagedVpnDisconnectPrompt value for this SsidType.
     * 
     * @param unmanagedVpnDisconnectPrompt
     */
    public void setUnmanagedVpnDisconnectPrompt(java.lang.String unmanagedVpnDisconnectPrompt) {
        this.unmanagedVpnDisconnectPrompt = unmanagedVpnDisconnectPrompt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SsidType)) return false;
        SsidType other = (SsidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssidKey==null && other.getSsidKey()==null) || 
             (this.ssidKey!=null &&
              this.ssidKey.equals(other.getSsidKey()))) &&
            ((this.ssid==null && other.getSsid()==null) || 
             (this.ssid!=null &&
              this.ssid.equals(other.getSsid()))) &&
            ((this.accessType==null && other.getAccessType()==null) || 
             (this.accessType!=null &&
              this.accessType.equals(other.getAccessType()))) &&
            ((this.authType==null && other.getAuthType()==null) || 
             (this.authType!=null &&
              this.authType.equals(other.getAuthType()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.loginUrl==null && other.getLoginUrl()==null) || 
             (this.loginUrl!=null &&
              this.loginUrl.equals(other.getLoginUrl()))) &&
            ((this.configUrl==null && other.getConfigUrl()==null) || 
             (this.configUrl!=null &&
              this.configUrl.equals(other.getConfigUrl()))) &&
            ((this.verficationCertUrl==null && other.getVerficationCertUrl()==null) || 
             (this.verficationCertUrl!=null &&
              this.verficationCertUrl.equals(other.getVerficationCertUrl()))) &&
            ((this.configMessage==null && other.getConfigMessage()==null) || 
             (this.configMessage!=null &&
              this.configMessage.equals(other.getConfigMessage()))) &&
            ((this.portalFailMessage==null && other.getPortalFailMessage()==null) || 
             (this.portalFailMessage!=null &&
              this.portalFailMessage.equals(other.getPortalFailMessage()))) &&
            ((this.unmanagedVpnConnectPrompt==null && other.getUnmanagedVpnConnectPrompt()==null) || 
             (this.unmanagedVpnConnectPrompt!=null &&
              this.unmanagedVpnConnectPrompt.equals(other.getUnmanagedVpnConnectPrompt()))) &&
            ((this.unmanagedVpnDisconnectPrompt==null && other.getUnmanagedVpnDisconnectPrompt()==null) || 
             (this.unmanagedVpnDisconnectPrompt!=null &&
              this.unmanagedVpnDisconnectPrompt.equals(other.getUnmanagedVpnDisconnectPrompt())));
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
        if (getSsidKey() != null) {
            _hashCode += getSsidKey().hashCode();
        }
        if (getSsid() != null) {
            _hashCode += getSsid().hashCode();
        }
        if (getAccessType() != null) {
            _hashCode += getAccessType().hashCode();
        }
        if (getAuthType() != null) {
            _hashCode += getAuthType().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getLoginUrl() != null) {
            _hashCode += getLoginUrl().hashCode();
        }
        if (getConfigUrl() != null) {
            _hashCode += getConfigUrl().hashCode();
        }
        if (getVerficationCertUrl() != null) {
            _hashCode += getVerficationCertUrl().hashCode();
        }
        if (getConfigMessage() != null) {
            _hashCode += getConfigMessage().hashCode();
        }
        if (getPortalFailMessage() != null) {
            _hashCode += getPortalFailMessage().hashCode();
        }
        if (getUnmanagedVpnConnectPrompt() != null) {
            _hashCode += getUnmanagedVpnConnectPrompt().hashCode();
        }
        if (getUnmanagedVpnDisconnectPrompt() != null) {
            _hashCode += getUnmanagedVpnDisconnectPrompt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SsidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SsidType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ssidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ssid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "accessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "authType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "loginUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "configUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verficationCertUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "verficationCertUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "configMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalFailMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "portalFailMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmanagedVpnConnectPrompt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "unmanagedVpnConnectPrompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmanagedVpnDisconnectPrompt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "unmanagedVpnDisconnectPrompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
