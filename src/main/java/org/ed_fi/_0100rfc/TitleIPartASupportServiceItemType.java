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
 * <p>Java class for TitleIPartASupportServiceItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TitleIPartASupportServiceItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Health Services"/>
 *     &lt;enumeration value="Guidance Counseling Services"/>
 *     &lt;enumeration value="Social Work Services"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TitleIPartASupportServiceItemType")
@XmlEnum
public enum TitleIPartASupportServiceItemType {

    @XmlEnumValue("Health Services")
    HEALTH_SERVICES("Health Services"),
    @XmlEnumValue("Guidance Counseling Services")
    GUIDANCE_COUNSELING_SERVICES("Guidance Counseling Services"),
    @XmlEnumValue("Social Work Services")
    SOCIAL_WORK_SERVICES("Social Work Services");
    private final String value;

    TitleIPartASupportServiceItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TitleIPartASupportServiceItemType fromValue(String v) {
        for (TitleIPartASupportServiceItemType c: TitleIPartASupportServiceItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
