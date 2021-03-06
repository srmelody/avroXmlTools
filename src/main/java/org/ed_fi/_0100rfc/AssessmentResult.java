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
 * Additional analytic scores, percentiles, or measures
 * 
 * <p>Java class for AssessmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AssessmentReportingMethod" type="{http://ed-fi.org/0100RFC}AssessmentReportingMethodType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentResult", propOrder = {
    "result"
})
public class AssessmentResult {

    @XmlElement(name = "Result")
    protected float result;
    @XmlAttribute(name = "AssessmentReportingMethod")
    protected AssessmentReportingMethodType assessmentReportingMethod;

    /**
     * Gets the value of the result property.
     * 
     */
    public float getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(float value) {
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
