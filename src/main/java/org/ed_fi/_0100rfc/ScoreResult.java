//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.13 at 07:02:50 AM EST 
//


package org.ed_fi._0100rfc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A meaningful raw score or statistical expression of the performance of an individual. The results can be expressed as a number, percentile, range, level, etc.
 * 
 * <p>Java class for ScoreResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://ed-fi.org/0100RFC}Result"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AssessmentReportingMethod" use="required" type="{http://ed-fi.org/0100RFC}AssessmentReportingMethodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreResult", propOrder = {
    "result"
})
public class ScoreResult {

    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlAttribute(name = "AssessmentReportingMethod", required = true)
    protected AssessmentReportingMethodType assessmentReportingMethod;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
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

}
