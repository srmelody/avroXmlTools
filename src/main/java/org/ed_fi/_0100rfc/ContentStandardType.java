//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.13 at 07:02:50 AM EST 
//


package org.ed_fi._0100rfc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentStandardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentStandardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="National Standard"/>
 *     &lt;enumeration value="State Standard"/>
 *     &lt;enumeration value="College Entrance Standard"/>
 *     &lt;enumeration value="LEA Standard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentStandardType")
@XmlEnum
public enum ContentStandardType {

    @XmlEnumValue("National Standard")
    NATIONAL_STANDARD("National Standard"),
    @XmlEnumValue("State Standard")
    STATE_STANDARD("State Standard"),
    @XmlEnumValue("College Entrance Standard")
    COLLEGE_ENTRANCE_STANDARD("College Entrance Standard"),
    @XmlEnumValue("LEA Standard")
    LEA_STANDARD("LEA Standard");
    private final String value;

    ContentStandardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentStandardType fromValue(String v) {
        for (ContentStandardType c: ContentStandardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}