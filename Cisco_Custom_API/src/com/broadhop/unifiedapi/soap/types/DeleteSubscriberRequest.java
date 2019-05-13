/**
 * DeleteSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class DeleteSubscriberRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestNetworkIdType  implements java.io.Serializable {
    private java.lang.Boolean hardDelete;

    public DeleteSubscriberRequest() {
    }

    public DeleteSubscriberRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           java.lang.String networkId,
           java.lang.Boolean hardDelete) {
        super(
            audit,
            networkId);
        this.hardDelete = hardDelete;
    }


//    @Override
//	public String toString() {
//		return "DeleteSubscriberRequest [hardDelete=" + hardDelete + ", __equalsCalc=" + __equalsCalc
//				+ ", __hashCodeCalc=" + __hashCodeCalc + ", getHardDelete()=" + getHardDelete() + ", hashCode()="
//				+ hashCode() + ", getNetworkId()=" + getNetworkId() + ", getAudit()=" + getAudit() + ", getClass()="
//				+ getClass() + ", toString()=" + super.toString() + "]";
//	}
    
    @Override
  	public String toString() {
  		return "DeleteSubscriberRequest [hardDelete=" + hardDelete + ", getHardDelete()=" + getHardDelete() + ", getNetworkId()=" + getNetworkId() + "]";
  	}

	/**
     * Gets the hardDelete value for this DeleteSubscriberRequest.
     * 
     * @return hardDelete
     */
    public java.lang.Boolean getHardDelete() {
        return hardDelete;
    }


    /**
     * Sets the hardDelete value for this DeleteSubscriberRequest.
     * 
     * @param hardDelete
     */
    public void setHardDelete(java.lang.Boolean hardDelete) {
        this.hardDelete = hardDelete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteSubscriberRequest)) return false;
        DeleteSubscriberRequest other = (DeleteSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hardDelete==null && other.getHardDelete()==null) || 
             (this.hardDelete!=null &&
              this.hardDelete.equals(other.getHardDelete())));
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
        if (getHardDelete() != null) {
            _hashCode += getHardDelete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">DeleteSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "hardDelete"));
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
