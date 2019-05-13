/**
 * ChangeSubscriberAvpsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ChangeSubscriberAvpsRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp;

    private com.broadhop.unifiedapi.soap.types.AvpType[] modifiedAvp;

    private com.broadhop.unifiedapi.soap.types.AvpType[] newAvp;

    public ChangeSubscriberAvpsRequest() {
    }

    public ChangeSubscriberAvpsRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp,
           com.broadhop.unifiedapi.soap.types.AvpType[] modifiedAvp,
           com.broadhop.unifiedapi.soap.types.AvpType[] newAvp) {
        super(
            audit,
            networkId);
        this.deletedAvp = deletedAvp;
        this.modifiedAvp = modifiedAvp;
        this.newAvp = newAvp;
    }


    /**
     * Gets the deletedAvp value for this ChangeSubscriberAvpsRequest.
     * 
     * @return deletedAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getDeletedAvp() {
        return deletedAvp;
    }


    /**
     * Sets the deletedAvp value for this ChangeSubscriberAvpsRequest.
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
     * Gets the modifiedAvp value for this ChangeSubscriberAvpsRequest.
     * 
     * @return modifiedAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getModifiedAvp() {
        return modifiedAvp;
    }


    /**
     * Sets the modifiedAvp value for this ChangeSubscriberAvpsRequest.
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
     * Gets the newAvp value for this ChangeSubscriberAvpsRequest.
     * 
     * @return newAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getNewAvp() {
        return newAvp;
    }


    /**
     * Sets the newAvp value for this ChangeSubscriberAvpsRequest.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeSubscriberAvpsRequest)) return false;
        ChangeSubscriberAvpsRequest other = (ChangeSubscriberAvpsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deletedAvp==null && other.getDeletedAvp()==null) || 
             (this.deletedAvp!=null &&
              java.util.Arrays.equals(this.deletedAvp, other.getDeletedAvp()))) &&
            ((this.modifiedAvp==null && other.getModifiedAvp()==null) || 
             (this.modifiedAvp!=null &&
              java.util.Arrays.equals(this.modifiedAvp, other.getModifiedAvp()))) &&
            ((this.newAvp==null && other.getNewAvp()==null) || 
             (this.newAvp!=null &&
              java.util.Arrays.equals(this.newAvp, other.getNewAvp())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSubscriberAvpsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ChangeSubscriberAvpsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
