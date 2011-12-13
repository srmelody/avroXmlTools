//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.13 at 07:02:50 AM EST 
//


package org.ed_fi._0100rfc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This entity represents subtests that assess specific learning objectves.
 * 
 * 
 * <p>Java class for ObjectiveAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectiveAssessment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="IdentificationCode" type="{http://ed-fi.org/0100RFC}IdentificationCode"/>
 *         &lt;element name="MaxRawScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nomenclature" type="{http://ed-fi.org/0100RFC}Nomenclature" minOccurs="0"/>
 *         &lt;element name="AssessmentItemReference" type="{http://ed-fi.org/0100RFC}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LearningObjectiveReference" type="{http://ed-fi.org/0100RFC}LearningObjectiveReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LearningStandardReference" type="{http://ed-fi.org/0100RFC}LearningStandardReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ObjectAssessmentReference" type="{http://ed-fi.org/0100RFC}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PerformanceLevelReference" type="{http://ed-fi.org/0100RFC}PerformanceLevelReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectiveAssessment", propOrder = {
    "identificationCode",
    "maxRawScore",
    "nomenclature",
    "assessmentItemReference",
    "learningObjectiveReference",
    "learningStandardReference",
    "objectAssessmentReference",
    "performanceLevelReference"
})
public class ObjectiveAssessment
    extends ComplexObjectType
{

    @XmlElement(name = "IdentificationCode", required = true)
    protected String identificationCode;
    @XmlElement(name = "MaxRawScore")
    protected Integer maxRawScore;
    @XmlElement(name = "Nomenclature")
    protected String nomenclature;
    @XmlElement(name = "AssessmentItemReference")
    protected List<ReferenceType> assessmentItemReference;
    @XmlElement(name = "LearningObjectiveReference")
    protected List<LearningObjectiveReferenceType> learningObjectiveReference;
    @XmlElement(name = "LearningStandardReference")
    protected List<LearningStandardReferenceType> learningStandardReference;
    @XmlElement(name = "ObjectAssessmentReference")
    protected List<ReferenceType> objectAssessmentReference;
    @XmlElement(name = "PerformanceLevelReference")
    protected List<PerformanceLevelReferenceType> performanceLevelReference;

    /**
     * Gets the value of the identificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Sets the value of the identificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationCode(String value) {
        this.identificationCode = value;
    }

    /**
     * Gets the value of the maxRawScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRawScore() {
        return maxRawScore;
    }

    /**
     * Sets the value of the maxRawScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRawScore(Integer value) {
        this.maxRawScore = value;
    }

    /**
     * Gets the value of the nomenclature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclature() {
        return nomenclature;
    }

    /**
     * Sets the value of the nomenclature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclature(String value) {
        this.nomenclature = value;
    }

    /**
     * Gets the value of the assessmentItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getAssessmentItemReference() {
        if (assessmentItemReference == null) {
            assessmentItemReference = new ArrayList<ReferenceType>();
        }
        return this.assessmentItemReference;
    }

    /**
     * Gets the value of the learningObjectiveReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningObjectiveReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningObjectiveReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningObjectiveReferenceType }
     * 
     * 
     */
    public List<LearningObjectiveReferenceType> getLearningObjectiveReference() {
        if (learningObjectiveReference == null) {
            learningObjectiveReference = new ArrayList<LearningObjectiveReferenceType>();
        }
        return this.learningObjectiveReference;
    }

    /**
     * Gets the value of the learningStandardReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandardReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandardReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningStandardReferenceType }
     * 
     * 
     */
    public List<LearningStandardReferenceType> getLearningStandardReference() {
        if (learningStandardReference == null) {
            learningStandardReference = new ArrayList<LearningStandardReferenceType>();
        }
        return this.learningStandardReference;
    }

    /**
     * Gets the value of the objectAssessmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectAssessmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectAssessmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getObjectAssessmentReference() {
        if (objectAssessmentReference == null) {
            objectAssessmentReference = new ArrayList<ReferenceType>();
        }
        return this.objectAssessmentReference;
    }

    /**
     * Gets the value of the performanceLevelReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceLevelReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceLevelReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceLevelReferenceType }
     * 
     * 
     */
    public List<PerformanceLevelReferenceType> getPerformanceLevelReference() {
        if (performanceLevelReference == null) {
            performanceLevelReference = new ArrayList<PerformanceLevelReferenceType>();
        }
        return this.performanceLevelReference;
    }

}