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
 * <p>Java class for AttendanceEventDescriptorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendanceEventDescriptorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="In Attendance"/>
 *     &lt;enumeration value="Excused Absence"/>
 *     &lt;enumeration value="Unexecused Absence"/>
 *     &lt;enumeration value="Tardy"/>
 *     &lt;enumeration value="Early departure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttendanceEventDescriptorType")
@XmlEnum
public enum AttendanceEventDescriptorType {

    @XmlEnumValue("In Attendance")
    IN_ATTENDANCE("In Attendance"),
    @XmlEnumValue("Excused Absence")
    EXCUSED_ABSENCE("Excused Absence"),
    @XmlEnumValue("Unexecused Absence")
    UNEXECUSED_ABSENCE("Unexecused Absence"),
    @XmlEnumValue("Tardy")
    TARDY("Tardy"),
    @XmlEnumValue("Early departure")
    EARLY_DEPARTURE("Early departure");
    private final String value;

    AttendanceEventDescriptorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttendanceEventDescriptorType fromValue(String v) {
        for (AttendanceEventDescriptorType c: AttendanceEventDescriptorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
