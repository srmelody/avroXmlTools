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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This association indicates the staff associated with a cohort of students.
 * 
 * <p>Java class for StaffCohortAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffCohortAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffReference" type="{http://ed-fi.org/0100RFC}StaffReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CohortReference" type="{http://ed-fi.org/0100RFC}CohortReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CohortStudentRecordAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffCohortAssociation", propOrder = {
    "staffReference",
    "cohortReference",
    "beginDate",
    "endDate",
    "cohortStudentRecordAccess"
})
public class StaffCohortAssociation {

    @XmlElement(name = "StaffReference")
    protected List<StaffReferenceType> staffReference;
    @XmlElement(name = "CohortReference")
    protected List<CohortReferenceType> cohortReference;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "CohortStudentRecordAccess")
    protected boolean cohortStudentRecordAccess;

    /**
     * Gets the value of the staffReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffReferenceType }
     * 
     * 
     */
    public List<StaffReferenceType> getStaffReference() {
        if (staffReference == null) {
            staffReference = new ArrayList<StaffReferenceType>();
        }
        return this.staffReference;
    }

    /**
     * Gets the value of the cohortReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cohortReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCohortReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CohortReferenceType }
     * 
     * 
     */
    public List<CohortReferenceType> getCohortReference() {
        if (cohortReference == null) {
            cohortReference = new ArrayList<CohortReferenceType>();
        }
        return this.cohortReference;
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
     * Gets the value of the cohortStudentRecordAccess property.
     * 
     */
    public boolean isCohortStudentRecordAccess() {
        return cohortStudentRecordAccess;
    }

    /**
     * Sets the value of the cohortStudentRecordAccess property.
     * 
     */
    public void setCohortStudentRecordAccess(boolean value) {
        this.cohortStudentRecordAccess = value;
    }

}
