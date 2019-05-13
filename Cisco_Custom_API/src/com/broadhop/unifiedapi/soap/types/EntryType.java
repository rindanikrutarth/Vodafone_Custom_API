/**
 * EntryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.broadhop.unifiedapi.soap.types;

public class EntryType  implements java.io.Serializable {
    private java.lang.String string;

    private java.lang.String key;

    private com.broadhop.unifiedapi.soap.types.ListType list;

    private com.broadhop.unifiedapi.soap.types.ListType linkedList;

    private com.broadhop.unifiedapi.soap.types.EntryType[] map;

    private java.lang.String string2;

    private java.lang.Boolean _boolean;

    private java.math.BigInteger _int;

    private java.lang.Long _long;

    private java.util.Calendar date;

    private byte[] byteArray;

    private java.lang.Object value;

    public EntryType() {
    }

    public EntryType(
           java.lang.String string,
           java.lang.String key,
           com.broadhop.unifiedapi.soap.types.ListType list,
           com.broadhop.unifiedapi.soap.types.ListType linkedList,
           com.broadhop.unifiedapi.soap.types.EntryType[] map,
           java.lang.String string2,
           java.lang.Boolean _boolean,
           java.math.BigInteger _int,
           java.lang.Long _long,
           java.util.Calendar date,
           byte[] byteArray,
           java.lang.Object value) {
           this.string = string;
           this.key = key;
           this.list = list;
           this.linkedList = linkedList;
           this.map = map;
           this.string2 = string2;
           this._boolean = _boolean;
           this._int = _int;
           this._long = _long;
           this.date = date;
           this.byteArray = byteArray;
           this.value = value;
    }


    /**
     * Gets the string value for this EntryType.
     * 
     * @return string
     */
    public java.lang.String getString() {
        return string;
    }


    /**
     * Sets the string value for this EntryType.
     * 
     * @param string
     */
    public void setString(java.lang.String string) {
        this.string = string;
    }


    /**
     * Gets the key value for this EntryType.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this EntryType.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the list value for this EntryType.
     * 
     * @return list
     */
    public com.broadhop.unifiedapi.soap.types.ListType getList() {
        return list;
    }


    /**
     * Sets the list value for this EntryType.
     * 
     * @param list
     */
    public void setList(com.broadhop.unifiedapi.soap.types.ListType list) {
        this.list = list;
    }


    /**
     * Gets the linkedList value for this EntryType.
     * 
     * @return linkedList
     */
    public com.broadhop.unifiedapi.soap.types.ListType getLinkedList() {
        return linkedList;
    }


    /**
     * Sets the linkedList value for this EntryType.
     * 
     * @param linkedList
     */
    public void setLinkedList(com.broadhop.unifiedapi.soap.types.ListType linkedList) {
        this.linkedList = linkedList;
    }


    /**
     * Gets the map value for this EntryType.
     * 
     * @return map
     */
    public com.broadhop.unifiedapi.soap.types.EntryType[] getMap() {
        return map;
    }


    /**
     * Sets the map value for this EntryType.
     * 
     * @param map
     */
    public void setMap(com.broadhop.unifiedapi.soap.types.EntryType[] map) {
        this.map = map;
    }


    /**
     * Gets the string2 value for this EntryType.
     * 
     * @return string2
     */
    public java.lang.String getString2() {
        return string2;
    }


    /**
     * Sets the string2 value for this EntryType.
     * 
     * @param string2
     */
    public void setString2(java.lang.String string2) {
        this.string2 = string2;
    }


    /**
     * Gets the _boolean value for this EntryType.
     * 
     * @return _boolean
     */
    public java.lang.Boolean get_boolean() {
        return _boolean;
    }


    /**
     * Sets the _boolean value for this EntryType.
     * 
     * @param _boolean
     */
    public void set_boolean(java.lang.Boolean _boolean) {
        this._boolean = _boolean;
    }


    /**
     * Gets the _int value for this EntryType.
     * 
     * @return _int
     */
    public java.math.BigInteger get_int() {
        return _int;
    }


    /**
     * Sets the _int value for this EntryType.
     * 
     * @param _int
     */
    public void set_int(java.math.BigInteger _int) {
        this._int = _int;
    }


    /**
     * Gets the _long value for this EntryType.
     * 
     * @return _long
     */
    public java.lang.Long get_long() {
        return _long;
    }


    /**
     * Sets the _long value for this EntryType.
     * 
     * @param _long
     */
    public void set_long(java.lang.Long _long) {
        this._long = _long;
    }


    /**
     * Gets the date value for this EntryType.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this EntryType.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the byteArray value for this EntryType.
     * 
     * @return byteArray
     */
    public byte[] getByteArray() {
        return byteArray;
    }


    /**
     * Sets the byteArray value for this EntryType.
     * 
     * @param byteArray
     */
    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }


    /**
     * Gets the value value for this EntryType.
     * 
     * @return value
     */
    public java.lang.Object getValue() {
        return value;
    }


    /**
     * Sets the value value for this EntryType.
     * 
     * @param value
     */
    public void setValue(java.lang.Object value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntryType)) return false;
        EntryType other = (EntryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.string==null && other.getString()==null) || 
             (this.string!=null &&
              this.string.equals(other.getString()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              this.list.equals(other.getList()))) &&
            ((this.linkedList==null && other.getLinkedList()==null) || 
             (this.linkedList!=null &&
              this.linkedList.equals(other.getLinkedList()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              java.util.Arrays.equals(this.map, other.getMap()))) &&
            ((this.string2==null && other.getString2()==null) || 
             (this.string2!=null &&
              this.string2.equals(other.getString2()))) &&
            ((this._boolean==null && other.get_boolean()==null) || 
             (this._boolean!=null &&
              this._boolean.equals(other.get_boolean()))) &&
            ((this._int==null && other.get_int()==null) || 
             (this._int!=null &&
              this._int.equals(other.get_int()))) &&
            ((this._long==null && other.get_long()==null) || 
             (this._long!=null &&
              this._long.equals(other.get_long()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.byteArray==null && other.getByteArray()==null) || 
             (this.byteArray!=null &&
              java.util.Arrays.equals(this.byteArray, other.getByteArray()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getString() != null) {
            _hashCode += getString().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getList() != null) {
            _hashCode += getList().hashCode();
        }
        if (getLinkedList() != null) {
            _hashCode += getLinkedList().hashCode();
        }
        if (getMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getString2() != null) {
            _hashCode += getString2().hashCode();
        }
        if (get_boolean() != null) {
            _hashCode += get_boolean().hashCode();
        }
        if (get_int() != null) {
            _hashCode += get_int().hashCode();
        }
        if (get_long() != null) {
            _hashCode += get_long().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "EntryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "linked-list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "ListType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "EntryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_boolean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "boolean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_long");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "long"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "byte-array"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://broadhop.com/unifiedapi/soap/types", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
