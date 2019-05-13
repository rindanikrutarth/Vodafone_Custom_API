/**
 * CreditTypeRolloverPeriodUnits.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class CreditTypeRolloverPeriodUnits implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreditTypeRolloverPeriodUnits(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Minute = "Minute";
    public static final java.lang.String _Hour = "Hour";
    public static final java.lang.String _Day = "Day";
    public static final java.lang.String _Week = "Week";
    public static final java.lang.String _Month = "Month";
    public static final CreditTypeRolloverPeriodUnits Minute = new CreditTypeRolloverPeriodUnits(_Minute);
    public static final CreditTypeRolloverPeriodUnits Hour = new CreditTypeRolloverPeriodUnits(_Hour);
    public static final CreditTypeRolloverPeriodUnits Day = new CreditTypeRolloverPeriodUnits(_Day);
    public static final CreditTypeRolloverPeriodUnits Week = new CreditTypeRolloverPeriodUnits(_Week);
    public static final CreditTypeRolloverPeriodUnits Month = new CreditTypeRolloverPeriodUnits(_Month);
    public java.lang.String getValue() { return _value_;}
    public static CreditTypeRolloverPeriodUnits fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreditTypeRolloverPeriodUnits enumeration = (CreditTypeRolloverPeriodUnits)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreditTypeRolloverPeriodUnits fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreditTypeRolloverPeriodUnits.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", ">CreditType>rolloverPeriodUnits"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
