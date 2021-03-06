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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This entity represents the schedule of class period meeting times.
 * 
 * <p>Java class for BellSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BellSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="GradeLevels" type="{http://ed-fi.org/0100RFC}GradeLevelsType"/>
 *         &lt;element name="SchoolYear" type="{http://ed-fi.org/0100RFC}SchoolYearType"/>
 *         &lt;element name="WeeksInCycle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="52"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchoolReference" type="{http://ed-fi.org/0100RFC}EducationalOrgReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BellSchedule", propOrder = {
    "gradeLevels",
    "schoolYear",
    "weeksInCycle",
    "schoolReference"
})
public class BellSchedule
    extends ComplexObjectType
{

    @XmlElement(name = "GradeLevels", required = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "SchoolYear", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolYear;
    @XmlElement(name = "WeeksInCycle")
    protected int weeksInCycle;
    @XmlElement(name = "SchoolReference", required = true)
    protected List<EducationalOrgReferenceType> schoolReference;

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolYear(String value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the weeksInCycle property.
     * 
     */
    public int getWeeksInCycle() {
        return weeksInCycle;
    }

    /**
     * Sets the value of the weeksInCycle property.
     * 
     */
    public void setWeeksInCycle(int value) {
        this.weeksInCycle = value;
    }

    /**
     * Gets the value of the schoolReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationalOrgReferenceType }
     * 
     * 
     */
    public List<EducationalOrgReferenceType> getSchoolReference() {
        if (schoolReference == null) {
            schoolReference = new ArrayList<EducationalOrgReferenceType>();
        }
        return this.schoolReference;
    }

}
