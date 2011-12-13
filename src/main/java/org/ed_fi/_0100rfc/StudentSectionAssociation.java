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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This association indicates the course sections a student is assigned to.
 * 
 * 
 * <p>Java class for StudentSectionAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSectionAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentReference" type="{http://ed-fi.org/0100RFC}StudentReferenceType"/>
 *         &lt;element name="SectionReference" type="{http://ed-fi.org/0100RFC}SectionReferenceType"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HomeroomIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RepeatIdentifier" type="{http://ed-fi.org/0100RFC}RepeatIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSectionAssociation", propOrder = {
    "studentReference",
    "sectionReference",
    "beginDate",
    "endDate",
    "homeroomIndicator",
    "repeatIdentifier"
})
public class StudentSectionAssociation {

    @XmlElement(name = "StudentReference", required = true)
    protected StudentReferenceType studentReference;
    @XmlElement(name = "SectionReference", required = true)
    protected SectionReferenceType sectionReference;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "HomeroomIndicator")
    protected Boolean homeroomIndicator;
    @XmlElement(name = "RepeatIdentifier")
    protected RepeatIdentifierType repeatIdentifier;

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
     * Gets the value of the sectionReference property.
     * 
     * @return
     *     possible object is
     *     {@link SectionReferenceType }
     *     
     */
    public SectionReferenceType getSectionReference() {
        return sectionReference;
    }

    /**
     * Sets the value of the sectionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionReferenceType }
     *     
     */
    public void setSectionReference(SectionReferenceType value) {
        this.sectionReference = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the homeroomIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomeroomIndicator() {
        return homeroomIndicator;
    }

    /**
     * Sets the value of the homeroomIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomeroomIndicator(Boolean value) {
        this.homeroomIndicator = value;
    }

    /**
     * Gets the value of the repeatIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatIdentifierType }
     *     
     */
    public RepeatIdentifierType getRepeatIdentifier() {
        return repeatIdentifier;
    }

    /**
     * Sets the value of the repeatIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatIdentifierType }
     *     
     */
    public void setRepeatIdentifier(RepeatIdentifierType value) {
        this.repeatIdentifier = value;
    }

}
