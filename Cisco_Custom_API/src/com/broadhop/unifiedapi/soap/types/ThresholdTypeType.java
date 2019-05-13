/**
 * ThresholdTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class ThresholdTypeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ThresholdTypeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Percentage = "Percentage";
    public static final java.lang.String _Bytes = "Bytes";
    public static final java.lang.String _Kilobytes = "Kilobytes";
    public static final java.lang.String _Megabytes = "Megabytes";
    public static final java.lang.String _Gigabytes = "Gigabytes";
    public static final java.lang.String _Other = "Other";
    public static final ThresholdTypeType Percentage = new ThresholdTypeType(_Percentage);
    public static final ThresholdTypeType Bytes = new ThresholdTypeType(_Bytes);
    public static final ThresholdTypeType Kilobytes = new ThresholdTypeType(_Kilobytes);
    public static final ThresholdTypeType Megabytes = new ThresholdTypeType(_Megabytes);
    public static final ThresholdTypeType Gigabytes = new ThresholdTypeType(_Gigabytes);
    public static final ThresholdTypeType Other = new ThresholdTypeType(_Other);
    public java.lang.String getValue() { return _value_;}
    public static ThresholdTypeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ThresholdTypeType enumeration = (ThresholdTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ThresholdTypeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThresholdTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">ThresholdType>type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
