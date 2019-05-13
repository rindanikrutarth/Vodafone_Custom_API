/**
 * CreateVouchersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreateVouchersRequest  extends com.broadhop.unifiedapi.soap.types.BaseRequestAuditType  implements java.io.Serializable {
    private com.broadhop.unifiedapi.soap.types.VoucherType[] voucher;

    public CreateVouchersRequest() {
    }

    public CreateVouchersRequest(
           com.broadhop.unifiedapi.soap.types.AuditType audit,
           com.broadhop.unifiedapi.soap.types.VoucherType[] voucher) {
        super(
            audit);
        this.voucher = voucher;
    }


    /**
     * Gets the voucher value for this CreateVouchersRequest.
     * 
     * @return voucher
     */
    public com.broadhop.unifiedapi.soap.types.VoucherType[] getVoucher() {
        return voucher;
    }


    /**
     * Sets the voucher value for this CreateVouchersRequest.
     * 
     * @param voucher
     */
    public void setVoucher(com.broadhop.unifiedapi.soap.types.VoucherType[] voucher) {
        this.voucher = voucher;
    }

    public com.broadhop.unifiedapi.soap.types.VoucherType getVoucher(int i) {
        return this.voucher[i];
    }

    public void setVoucher(int i, com.broadhop.unifiedapi.soap.types.VoucherType _value) {
        this.voucher[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateVouchersRequest)) return false;
        CreateVouchersRequest other = (CreateVouchersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.voucher==null && other.getVoucher()==null) || 
             (this.voucher!=null &&
              java.util.Arrays.equals(this.voucher, other.getVoucher())));
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
        if (getVoucher() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoucher());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoucher(), i);
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
        new org.apache.axis.description.TypeDesc(CreateVouchersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreateVouchersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "voucher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "VoucherType"));
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
