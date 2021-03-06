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
 * <p>Java class for AssessmentReportingMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssessmentReportingMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Achievement/proficiency level"/>
 *     &lt;enumeration value="ACT score"/>
 *     &lt;enumeration value="Age score"/>
 *     &lt;enumeration value="C-scaled scores"/>
 *     &lt;enumeration value="College Board examination scores"/>
 *     &lt;enumeration value="Grade equivalent or grade-level indicator"/>
 *     &lt;enumeration value="Graduation score"/>
 *     &lt;enumeration value="Growth/value-added/indexing"/>
 *     &lt;enumeration value="International Baccalaureate score"/>
 *     &lt;enumeration value="Letter grade/mark"/>
 *     &lt;enumeration value="Mastery level"/>
 *     &lt;enumeration value="Normal curve equivalent"/>
 *     &lt;enumeration value="Normalized standard score"/>
 *     &lt;enumeration value="Number score"/>
 *     &lt;enumeration value="Pass-fail"/>
 *     &lt;enumeration value="Percentile"/>
 *     &lt;enumeration value="Percentile rank"/>
 *     &lt;enumeration value="Proficiency level"/>
 *     &lt;enumeration value="Promotion score"/>
 *     &lt;enumeration value="Ranking"/>
 *     &lt;enumeration value="Ratio IQ's"/>
 *     &lt;enumeration value="Raw score"/>
 *     &lt;enumeration value="Scale score"/>
 *     &lt;enumeration value="Standard age score"/>
 *     &lt;enumeration value="Stanine score"/>
 *     &lt;enumeration value="Sten score"/>
 *     &lt;enumeration value="T-score"/>
 *     &lt;enumeration value="Vertical score"/>
 *     &lt;enumeration value="Workplace readiness score"/>
 *     &lt;enumeration value="Z-score"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssessmentReportingMethodType")
@XmlEnum
public enum AssessmentReportingMethodType {

    @XmlEnumValue("Achievement/proficiency level")
    ACHIEVEMENT_PROFICIENCY_LEVEL("Achievement/proficiency level"),
    @XmlEnumValue("ACT score")
    ACT_SCORE("ACT score"),
    @XmlEnumValue("Age score")
    AGE_SCORE("Age score"),
    @XmlEnumValue("C-scaled scores")
    C_SCALED_SCORES("C-scaled scores"),
    @XmlEnumValue("College Board examination scores")
    COLLEGE_BOARD_EXAMINATION_SCORES("College Board examination scores"),
    @XmlEnumValue("Grade equivalent or grade-level indicator")
    GRADE_EQUIVALENT_OR_GRADE_LEVEL_INDICATOR("Grade equivalent or grade-level indicator"),
    @XmlEnumValue("Graduation score")
    GRADUATION_SCORE("Graduation score"),
    @XmlEnumValue("Growth/value-added/indexing")
    GROWTH_VALUE_ADDED_INDEXING("Growth/value-added/indexing"),
    @XmlEnumValue("International Baccalaureate score")
    INTERNATIONAL_BACCALAUREATE_SCORE("International Baccalaureate score"),
    @XmlEnumValue("Letter grade/mark")
    LETTER_GRADE_MARK("Letter grade/mark"),
    @XmlEnumValue("Mastery level")
    MASTERY_LEVEL("Mastery level"),
    @XmlEnumValue("Normal curve equivalent")
    NORMAL_CURVE_EQUIVALENT("Normal curve equivalent"),
    @XmlEnumValue("Normalized standard score")
    NORMALIZED_STANDARD_SCORE("Normalized standard score"),
    @XmlEnumValue("Number score")
    NUMBER_SCORE("Number score"),
    @XmlEnumValue("Pass-fail")
    PASS_FAIL("Pass-fail"),
    @XmlEnumValue("Percentile")
    PERCENTILE("Percentile"),
    @XmlEnumValue("Percentile rank")
    PERCENTILE_RANK("Percentile rank"),
    @XmlEnumValue("Proficiency level")
    PROFICIENCY_LEVEL("Proficiency level"),
    @XmlEnumValue("Promotion score")
    PROMOTION_SCORE("Promotion score"),
    @XmlEnumValue("Ranking")
    RANKING("Ranking"),
    @XmlEnumValue("Ratio IQ's")
    RATIO_IQ_S("Ratio IQ's"),
    @XmlEnumValue("Raw score")
    RAW_SCORE("Raw score"),
    @XmlEnumValue("Scale score")
    SCALE_SCORE("Scale score"),
    @XmlEnumValue("Standard age score")
    STANDARD_AGE_SCORE("Standard age score"),
    @XmlEnumValue("Stanine score")
    STANINE_SCORE("Stanine score"),
    @XmlEnumValue("Sten score")
    STEN_SCORE("Sten score"),
    @XmlEnumValue("T-score")
    T_SCORE("T-score"),
    @XmlEnumValue("Vertical score")
    VERTICAL_SCORE("Vertical score"),
    @XmlEnumValue("Workplace readiness score")
    WORKPLACE_READINESS_SCORE("Workplace readiness score"),
    @XmlEnumValue("Z-score")
    Z_SCORE("Z-score"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AssessmentReportingMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssessmentReportingMethodType fromValue(String v) {
        for (AssessmentReportingMethodType c: AssessmentReportingMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
