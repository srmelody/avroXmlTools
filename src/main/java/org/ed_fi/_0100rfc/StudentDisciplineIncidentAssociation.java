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
 * This association indicates those students related to a discipline incident who were victims, perpetrators, witnesses, and/or reporters.
 * 
 * <p>Java class for StudentDisciplineIncidentAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentDisciplineIncidentAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentReference" type="{http://ed-fi.org/0100RFC}StudentReferenceType"/>
 *         &lt;element name="DisciplineIncidentReference" type="{http://ed-fi.org/0100RFC}ReferenceType"/>
 *         &lt;element name="StudentParticipationCode" type="{http://ed-fi.org/0100RFC}StudentParticipationCodeType"/>
 *         &lt;element name="StudentBehaviors" type="{http://ed-fi.org/0100RFC}IncidentBehavior" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SecondaryStudentBehaviors" type="{http://ed-fi.org/0100RFC}SecondaryIncidentBehavior" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentDisciplineIncidentAssociation", propOrder = {
    "studentReference",
    "disciplineIncidentReference",
    "studentParticipationCode",
    "studentBehaviors",
    "secondaryStudentBehaviors"
})
public class StudentDisciplineIncidentAssociation {

    @XmlElement(name = "StudentReference", required = true)
    protected StudentReferenceType studentReference;
    @XmlElement(name = "DisciplineIncidentReference", required = true)
    protected ReferenceType disciplineIncidentReference;
    @XmlElement(name = "StudentParticipationCode", required = true)
    protected StudentParticipationCodeType studentParticipationCode;
    @XmlElement(name = "StudentBehaviors")
    protected List<IncidentBehavior> studentBehaviors;
    @XmlElement(name = "SecondaryStudentBehaviors")
    protected List<SecondaryIncidentBehavior> secondaryStudentBehaviors;

    /**
     * Gets the value of the studentReference property.
     * 
     * @return
     *     possible object is
     *     {@link StudentReferenceType }
     *     
     */
    public StudentReferenceType getStudentReference() {
        return studentReference;
    }

    /**
     * Sets the value of the studentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentReferenceType }
     *     
     */
    public void setStudentReference(StudentReferenceType value) {
        this.studentReference = value;
    }

    /**
     * Gets the value of the disciplineIncidentReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDisciplineIncidentReference() {
        return disciplineIncidentReference;
    }

    /**
     * Sets the value of the disciplineIncidentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDisciplineIncidentReference(ReferenceType value) {
        this.disciplineIncidentReference = value;
    }

    /**
     * Gets the value of the studentParticipationCode property.
     * 
     * @return
     *     possible object is
     *     {@link StudentParticipationCodeType }
     *     
     */
    public StudentParticipationCodeType getStudentParticipationCode() {
        return studentParticipationCode;
    }

    /**
     * Sets the value of the studentParticipationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentParticipationCodeType }
     *     
     */
    public void setStudentParticipationCode(StudentParticipationCodeType value) {
        this.studentParticipationCode = value;
    }

    /**
     * Gets the value of the studentBehaviors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentBehaviors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentBehaviors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentBehavior }
     * 
     * 
     */
    public List<IncidentBehavior> getStudentBehaviors() {
        if (studentBehaviors == null) {
            studentBehaviors = new ArrayList<IncidentBehavior>();
        }
        return this.studentBehaviors;
    }

    /**
     * Gets the value of the secondaryStudentBehaviors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryStudentBehaviors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryStudentBehaviors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryIncidentBehavior }
     * 
     * 
     */
    public List<SecondaryIncidentBehavior> getSecondaryStudentBehaviors() {
        if (secondaryStudentBehaviors == null) {
            secondaryStudentBehaviors = new ArrayList<SecondaryIncidentBehavior>();
        }
        return this.secondaryStudentBehaviors;
    }

}
