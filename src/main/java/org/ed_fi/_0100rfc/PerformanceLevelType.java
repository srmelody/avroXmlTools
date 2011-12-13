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
 * <p>Java class for PerformanceLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Advanced"/>
 *     &lt;enumeration value="Proficient"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Below Basic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceLevelType")
@XmlEnum
public enum PerformanceLevelType {

    @XmlEnumValue("Advanced")
    ADVANCED("Advanced"),
    @XmlEnumValue("Proficient")
    PROFICIENT("Proficient"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Below Basic")
    BELOW_BASIC("Below Basic");
    private final String value;

    PerformanceLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceLevelType fromValue(String v) {
        for (PerformanceLevelType c: PerformanceLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}