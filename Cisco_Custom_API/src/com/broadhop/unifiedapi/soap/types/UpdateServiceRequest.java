/**
 * UpdateServiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class UpdateServiceRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.String code;

    private java.lang.Boolean enabled;

    private com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp;

    private com.broadhop.unifiedapi.soap.types.AvpType[] modifiedAvp;

    private com.broadhop.unifiedapi.soap.types.AvpType[] newAvp;

    private com.broadhop.unifiedapi.soap.types.ScheduleType[] schedule;

    private com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance;

    private com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit;

    public UpdateServiceRequest() {
    }

    public UpdateServiceRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.String code,
           java.lang.Boolean enabled,
           com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp,
           com.broadhop.unifiedapi.soap.types.AvpType[] modifiedAvp,
           com.broadhop.unifiedapi.soap.types.AvpType[] newAvp,
           com.broadhop.unifiedapi.soap.types.ScheduleType[] schedule,
           com.broadhop.unifiedapi.soap.types.CreateBalanceType[] balance,
           com.broadhop.unifiedapi.soap.types.ExtendCreditType[] extendCredit) {
        super(
            audit,
            networkId);
        this.code = code;
        this.enabled = enabled;
        this.deletedAvp = deletedAvp;
        this.modifiedAvp = modifiedAvp;
        this.newAvp = newAvp;
        this.schedule = schedule;
        this.balance = balance;
        this.extendCredit = extendCredit;
    }


    /**
     * Gets the code value for this UpdateServiceRequest.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this UpdateServiceRequest.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the enabled value for this UpdateServiceRequest.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this UpdateServiceRequest.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the deletedAvp value for this UpdateServiceRequest.
     * 
     * @return deletedAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getDeletedAvp() {
        return deletedAvp;
    }


    /**
     * Sets the deletedAvp value for this UpdateServiceRequest.
     * 
     * @param deletedAvp
     */
    public void setDeletedAvp(com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp) {
        this.deletedAvp = deletedAvp;
    }

    public com.broadhop.unifiedapi.soap.types.AvpType getDeletedAvp(int i) {
        return this.deletedAvp[i];
    }

    public void setDeletedAvp(int i, com.broadhop.unifiedapi.soap.types.AvpType _value) {
        this.deletedAvp[i] = _value;
    }


    /**
     * Gets the modifiedAvp value for this UpdateServiceRequest.
     * 
     * @return modifiedAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getModifiedAvp() {
        return modifiedAvp;
    }


    /**
     * Sets the modifiedAvp value for this UpdateServiceRequest.
     * 
     * @param modifiedAvp
     */
    public void setModifiedAvp(com.broadhop.unifiedapi.soap.types.AvpType[] modifiedAvp) {
        this.modifiedAvp = modifiedAvp;
    }

    public com.broadhop.unifiedapi.soap.types.AvpType getModifiedAvp(int i) {
        return this.modifiedAvp[i];
    }

    public void setModifiedAvp(int i, com.broadhop.unifiedapi.soap.types.AvpType _value) {
        this.modifiedAvp[i] = _value;
    }


    /**
     * Gets the newAvp value for this UpdateServiceRequest.
     * 
     * @return newAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getNewAvp() {
        return newAvp;
    }


    /**
     * Sets the newAvp value for this UpdateServiceRequest.
     * 
     * @param newAvp
     */
    public void setNewAvp(com.broadhop.unifiedapi.soap.types.AvpType[] newAvp) {
        this.newAvp = newAvp;
    }

    public com.broadhop.unifiedapi.soap.types.AvpType getNewAvp(int i) {
        return this.newAvp[i];
    }

    public void setNewAvp(int i, com.broadhop.unifiedapi.soap.types.AvpType _value) {
        this.newAvp[i] = _value;
    }


    /**
     * Gets the schedule value for this UpdateServiceRequest.
     * 
     * @return schedule
     */
    public com.broadhop.unifiedapi.soap.types.ScheduleType[] getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this UpdateServiceRequest.
     * 
     * @param schedule
     */
    public void setSchedule(com.broadhop.unifiedapi.soap.types.ScheduleType[] schedule) {
        this.schedule = schedule;
    }

    public com.broadhop.unifiedapi.soap.types.ScheduleType getSchedule(int i) {
        return this.schedule[i];
    }

    public void setSchedule(int i, com.broadhop.unifiedapi.soap.types.ScheduleType _value) {
        this.schedule[i] = _value;
    }


    /**
     * Gets the balance value for this UpdateServiceRequest.
     * 
     * @return balance
     */
    public com.broadhop.unifiedapi.soap.types.CreateBalanceType[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this UpdateServiceRequest.
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
     * Gets the extendCredit value for this UpdateServiceRequest.
     * 
     * @return extendCredit
     */
    public com.broadhop.unifiedapi.soap.types.ExtendCreditType[] getExtendCredit() {
        return extendCredit;
    }


    /**
     * Sets the extendCredit value for this UpdateServiceRequest.
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
        if (!(obj instanceof UpdateServiceRequest)) return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.deletedAvp==null && other.getDeletedAvp()==null) || 
             (this.deletedAvp!=null &&
              java.util.Arrays.equals(this.deletedAvp, other.getDeletedAvp()))) &&
            ((this.modifiedAvp==null && other.getModifiedAvp()==null) || 
             (this.modifiedAvp!=null &&
              java.util.Arrays.equals(this.modifiedAvp, other.getModifiedAvp()))) &&
            ((this.newAvp==null && other.getNewAvp()==null) || 
             (this.newAvp!=null &&
              java.util.Arrays.equals(this.newAvp, other.getNewAvp()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              java.util.Arrays.equals(this.schedule, other.getSchedule()))) &&
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getDeletedAvp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedAvp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedAvp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModifiedAvp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModifiedAvp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModifiedAvp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewAvp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewAvp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewAvp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedule(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateServiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateServiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedAvp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "deletedAvp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedAvp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "modifiedAvp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAvp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "newAvp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ScheduleType"));
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
