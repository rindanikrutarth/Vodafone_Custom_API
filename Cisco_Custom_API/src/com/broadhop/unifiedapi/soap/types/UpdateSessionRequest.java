/**
 * UpdateSessionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class UpdateSessionRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SessionKeyType key;

    private com.broadhop.unifiedapi.soap.types.AvpType[] newAvp;

    private com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp;

    public UpdateSessionRequest() {
    }

    public UpdateSessionRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.SessionKeyType key,
           com.broadhop.unifiedapi.soap.types.AvpType[] newAvp,
           com.broadhop.unifiedapi.soap.types.AvpType[] deletedAvp) {
        super(
            audit);
        this.key = key;
        this.newAvp = newAvp;
        this.deletedAvp = deletedAvp;
    }


    /**
     * Gets the key value for this UpdateSessionRequest.
     * 
     * @return key
     */
    public com.broadhop.unifiedapi.soap.types.SessionKeyType getKey() {
        return key;
    }


    /**
     * Sets the key value for this UpdateSessionRequest.
     * 
     * @param key
     */
    public void setKey(com.broadhop.unifiedapi.soap.types.SessionKeyType key) {
        this.key = key;
    }


    /**
     * Gets the newAvp value for this UpdateSessionRequest.
     * 
     * @return newAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getNewAvp() {
        return newAvp;
    }


    /**
     * Sets the newAvp value for this UpdateSessionRequest.
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
     * Gets the deletedAvp value for this UpdateSessionRequest.
     * 
     * @return deletedAvp
     */
    public com.broadhop.unifiedapi.soap.types.AvpType[] getDeletedAvp() {
        return deletedAvp;
    }


    /**
     * Sets the deletedAvp value for this UpdateSessionRequest.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSessionRequest)) return false;
        UpdateSessionRequest other = (UpdateSessionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.newAvp==null && other.getNewAvp()==null) || 
             (this.newAvp!=null &&
              java.util.Arrays.equals(this.newAvp, other.getNewAvp()))) &&
            ((this.deletedAvp==null && other.getDeletedAvp()==null) || 
             (this.deletedAvp!=null &&
              java.util.Arrays.equals(this.deletedAvp, other.getDeletedAvp())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSessionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">UpdateSessionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SessionKeyType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAvp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "newAvp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "AvpType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedAvp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "deletedAvp"));
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
