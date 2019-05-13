/**
 * CreateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreateSubscriberRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.SubscriberType subscriber;

    public CreateSubscriberRequest() {
    }

    public CreateSubscriberRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.SubscriberType subscriber) {
        super(
            audit);
        this.subscriber = subscriber;
    }


//    @Override
//	public String toString() {
//		return "CreateSubscriberRequest [subscriber=" + subscriber + ", __equalsCalc=" + __equalsCalc
//				+ ", __hashCodeCalc=" + __hashCodeCalc + ", getSubscriber()=" + getSubscriber() + ", hashCode()="
//				+ hashCode() + ", getAudit()=" + getAudit() + ", getClass()=" + getClass() + ", toString()="
//				+ super.toString() + "]";
//	}
    @Override
	public String toString() {
		return "CreateSubscriberRequest [subscriber=" + subscriber + ", getSubscriber()=" + getSubscriber() + "]";
	}

	/**
     * Gets the subscriber value for this CreateSubscriberRequest.
     * 
     * @return subscriber
     */
    public com.broadhop.unifiedapi.soap.types.SubscriberType getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CreateSubscriberRequest.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.broadhop.unifiedapi.soap.types.SubscriberType subscriber) {
        this.subscriber = subscriber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequest)) return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateSubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "SubscriberType"));
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
