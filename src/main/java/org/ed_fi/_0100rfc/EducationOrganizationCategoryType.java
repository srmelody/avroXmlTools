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
 * <p>Java class for EducationOrganizationCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationOrganizationCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="State Education Agency"/>
 *     &lt;enumeration value="Education Service Center"/>
 *     &lt;enumeration value="Local Education Agency"/>
 *     &lt;enumeration value="School"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationOrganizationCategoryType")
@XmlEnum
public enum EducationOrganizationCategoryType {

    @XmlEnumValue("State Education Agency")
    STATE_EDUCATION_AGENCY("State Education Agency"),
    @XmlEnumValue("Education Service Center")
    EDUCATION_SERVICE_CENTER("Education Service Center"),
    @XmlEnumValue("Local Education Agency")
    LOCAL_EDUCATION_AGENCY("Local Education Agency"),
    @XmlEnumValue("School")
    SCHOOL("School");
    private final String value;

    EducationOrganizationCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationOrganizationCategoryType fromValue(String v) {
        for (EducationOrganizationCategoryType c: EducationOrganizationCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}