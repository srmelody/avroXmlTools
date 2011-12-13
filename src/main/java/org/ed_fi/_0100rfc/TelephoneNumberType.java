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
 * <p>Java class for TelephoneNumberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneNumberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Unlisted"/>
 *     &lt;enumeration value="Work"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelephoneNumberType")
@XmlEnum
public enum TelephoneNumberType {

    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unlisted")
    UNLISTED("Unlisted"),
    @XmlEnumValue("Work")
    WORK("Work");
    private final String value;

    TelephoneNumberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelephoneNumberType fromValue(String v) {
        for (TelephoneNumberType c: TelephoneNumberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}