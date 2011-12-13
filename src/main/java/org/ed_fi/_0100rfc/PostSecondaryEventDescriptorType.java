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
 * <p>Java class for PostSecondaryEventDescriptorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PostSecondaryEventDescriptorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="College Application"/>
 *     &lt;enumeration value="College Acceptance"/>
 *     &lt;enumeration value="College Enrollment"/>
 *     &lt;enumeration value="FAFSA Application"/>
 *     &lt;enumeration value="Vocation Certification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PostSecondaryEventDescriptorType")
@XmlEnum
public enum PostSecondaryEventDescriptorType {

    @XmlEnumValue("College Application")
    COLLEGE_APPLICATION("College Application"),
    @XmlEnumValue("College Acceptance")
    COLLEGE_ACCEPTANCE("College Acceptance"),
    @XmlEnumValue("College Enrollment")
    COLLEGE_ENROLLMENT("College Enrollment"),
    @XmlEnumValue("FAFSA Application")
    FAFSA_APPLICATION("FAFSA Application"),
    @XmlEnumValue("Vocation Certification")
    VOCATION_CERTIFICATION("Vocation Certification");
    private final String value;

    PostSecondaryEventDescriptorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostSecondaryEventDescriptorType fromValue(String v) {
        for (PostSecondaryEventDescriptorType c: PostSecondaryEventDescriptorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}