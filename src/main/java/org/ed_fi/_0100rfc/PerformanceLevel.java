//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.13 at 07:02:50 AM EST 
//


package org.ed_fi._0100rfc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines various levels or thresholds for performance on the assessment.  Three styles are supported:
 *    1. Specification of performance level by min and max score
 *    2. Specification of performance level by cut score - min only
 *    3. Specification of performance level without any mapping to scores
 * 
 * <p>Java class for PerformanceLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceLevel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="CodeValue" type="{http://ed-fi.org/0100RFC}CodeValue"/>
 *         &lt;element name="Description" type="{http://ed-fi.org/0100RFC}Description" minOccurs="0"/>
 *         &lt;element name="AssessmentReportingMethod" type="{http://ed-fi.org/0100RFC}AssessmentReportingMethodType" minOccurs="0"/>
 *         &lt;element name="MinimumScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaximumScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LevelConversion" type="{http://ed-fi.org/0100RFC}PerformanceLevelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceLevel", propOrder = {
    "codeValue",
    "description",
    "assessmentReportingMethod",
    "minimumScore",
    "maximumScore",
    "levelConversion"
})
public class PerformanceLevel
    extends ComplexObjectType
{

    @XmlElement(name = "CodeValue", required = true)
    protected String codeValue;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AssessmentReportingMethod")
    protected AssessmentReportingMethodType assessmentReportingMethod;
    @XmlElement(name = "MinimumScore")
    protected Integer minimumScore;
    @XmlElement(name = "MaximumScore")
    protected Integer maximumScore;
    @XmlElement(name = "LevelConversion")
    protected PerformanceLevelType levelConversion;

    /**
     * Gets the value of the codeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * Sets the value of the codeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValue(String value) {
        this.codeValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the assessmentReportingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentReportingMethodType }
     *     
     */
    public AssessmentReportingMethodType getAssessmentReportingMethod() {
        return assessmentReportingMethod;
    }

    /**
     * Sets the value of the assessmentReportingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentReportingMethodType }
     *     
     */
    public void setAssessmentReportingMethod(AssessmentReportingMethodType value) {
        this.assessmentReportingMethod = value;
    }

    /**
     * Gets the value of the minimumScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumScore() {
        return minimumScore;
    }

    /**
     * Sets the value of the minimumScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumScore(Integer value) {
        this.minimumScore = value;
    }

    /**
     * Gets the value of the maximumScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumScore() {
        return maximumScore;
    }

    /**
     * Sets the value of the maximumScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumScore(Integer value) {
        this.maximumScore = value;
    }

    /**
     * Gets the value of the levelConversion property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLevelType }
     *     
     */
    public PerformanceLevelType getLevelConversion() {
        return levelConversion;
    }

    /**
     * Sets the value of the levelConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLevelType }
     *     
     */
    public void setLevelConversion(PerformanceLevelType value) {
        this.levelConversion = value;
    }

}
