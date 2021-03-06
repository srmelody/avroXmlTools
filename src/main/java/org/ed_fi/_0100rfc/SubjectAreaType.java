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
 * <p>Java class for SubjectAreaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectAreaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="English Language and Literature"/>
 *     &lt;enumeration value="Mathematics"/>
 *     &lt;enumeration value="Life and Physical Sciences"/>
 *     &lt;enumeration value="Social Sciences and History"/>
 *     &lt;enumeration value="Fine and Performing Arts"/>
 *     &lt;enumeration value="Foreign Language and Literature"/>
 *     &lt;enumeration value="Religious Education and Theology"/>
 *     &lt;enumeration value="Physical, Health, and Safety Education"/>
 *     &lt;enumeration value="Military Science"/>
 *     &lt;enumeration value="Computer and Information Sciences"/>
 *     &lt;enumeration value="Communication and Audio/Visual Technology"/>
 *     &lt;enumeration value="Business and Marketing"/>
 *     &lt;enumeration value="Manufacturing"/>
 *     &lt;enumeration value="Health Care Sciences"/>
 *     &lt;enumeration value="Public, Protective, and Government Service"/>
 *     &lt;enumeration value="Hospitality and Tourism"/>
 *     &lt;enumeration value="Architecture and Construction"/>
 *     &lt;enumeration value="Agriculture, Food, and Natural Resources"/>
 *     &lt;enumeration value="Human Services"/>
 *     &lt;enumeration value="Transportation, Distribution and Logistics"/>
 *     &lt;enumeration value="Engineering and Technology"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubjectAreaType")
@XmlEnum
public enum SubjectAreaType {

    @XmlEnumValue("English Language and Literature")
    ENGLISH_LANGUAGE_AND_LITERATURE("English Language and Literature"),
    @XmlEnumValue("Mathematics")
    MATHEMATICS("Mathematics"),
    @XmlEnumValue("Life and Physical Sciences")
    LIFE_AND_PHYSICAL_SCIENCES("Life and Physical Sciences"),
    @XmlEnumValue("Social Sciences and History")
    SOCIAL_SCIENCES_AND_HISTORY("Social Sciences and History"),
    @XmlEnumValue("Fine and Performing Arts")
    FINE_AND_PERFORMING_ARTS("Fine and Performing Arts"),
    @XmlEnumValue("Foreign Language and Literature")
    FOREIGN_LANGUAGE_AND_LITERATURE("Foreign Language and Literature"),
    @XmlEnumValue("Religious Education and Theology")
    RELIGIOUS_EDUCATION_AND_THEOLOGY("Religious Education and Theology"),
    @XmlEnumValue("Physical, Health, and Safety Education")
    PHYSICAL_HEALTH_AND_SAFETY_EDUCATION("Physical, Health, and Safety Education"),
    @XmlEnumValue("Military Science")
    MILITARY_SCIENCE("Military Science"),
    @XmlEnumValue("Computer and Information Sciences")
    COMPUTER_AND_INFORMATION_SCIENCES("Computer and Information Sciences"),
    @XmlEnumValue("Communication and Audio/Visual Technology")
    COMMUNICATION_AND_AUDIO_VISUAL_TECHNOLOGY("Communication and Audio/Visual Technology"),
    @XmlEnumValue("Business and Marketing")
    BUSINESS_AND_MARKETING("Business and Marketing"),
    @XmlEnumValue("Manufacturing")
    MANUFACTURING("Manufacturing"),
    @XmlEnumValue("Health Care Sciences")
    HEALTH_CARE_SCIENCES("Health Care Sciences"),
    @XmlEnumValue("Public, Protective, and Government Service")
    PUBLIC_PROTECTIVE_AND_GOVERNMENT_SERVICE("Public, Protective, and Government Service"),
    @XmlEnumValue("Hospitality and Tourism")
    HOSPITALITY_AND_TOURISM("Hospitality and Tourism"),
    @XmlEnumValue("Architecture and Construction")
    ARCHITECTURE_AND_CONSTRUCTION("Architecture and Construction"),
    @XmlEnumValue("Agriculture, Food, and Natural Resources")
    AGRICULTURE_FOOD_AND_NATURAL_RESOURCES("Agriculture, Food, and Natural Resources"),
    @XmlEnumValue("Human Services")
    HUMAN_SERVICES("Human Services"),
    @XmlEnumValue("Transportation, Distribution and Logistics")
    TRANSPORTATION_DISTRIBUTION_AND_LOGISTICS("Transportation, Distribution and Logistics"),
    @XmlEnumValue("Engineering and Technology")
    ENGINEERING_AND_TECHNOLOGY("Engineering and Technology"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous");
    private final String value;

    SubjectAreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectAreaType fromValue(String v) {
        for (SubjectAreaType c: SubjectAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
