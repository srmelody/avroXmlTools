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
 * This entity represents a person that is employed by an LEA or other educational unit engaged in student instruction. These persons are instructional-type staff members. In the data model, a teacher entity is a staff member with additional properties.
 * 
 * <p>Java class for Teacher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Teacher">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}Staff">
 *       &lt;sequence>
 *         &lt;element name="TeacherUniqueStateId" type="{http://ed-fi.org/0100RFC}UniqueStateIdentifier" minOccurs="0"/>
 *         &lt;element name="HighlyQualifiedTeacher" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Teacher", propOrder = {
    "teacherUniqueStateId",
    "highlyQualifiedTeacher"
})
public class Teacher
    extends Staff
{

    @XmlElement(name = "TeacherUniqueStateId")
    protected Integer teacherUniqueStateId;
    @XmlElement(name = "HighlyQualifiedTeacher")
    protected Boolean highlyQualifiedTeacher;

    /**
     * Gets the value of the teacherUniqueStateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTeacherUniqueStateId() {
        return teacherUniqueStateId;
    }

    /**
     * Sets the value of the teacherUniqueStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTeacherUniqueStateId(Integer value) {
        this.teacherUniqueStateId = value;
    }

    /**
     * Gets the value of the highlyQualifiedTeacher property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighlyQualifiedTeacher() {
        return highlyQualifiedTeacher;
    }

    /**
     * Sets the value of the highlyQualifiedTeacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighlyQualifiedTeacher(Boolean value) {
        this.highlyQualifiedTeacher = value;
    }

}
