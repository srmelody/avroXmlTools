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
 * This entity represents any program designed to work in conjunction with or to supplement the main academic program.  Programs may provide instruction, training, services or benefits through federal, state, or local agencies.  Programs may also include organized extracurricular activities for students.
 * 
 * 
 * <p>Java class for Program complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Program">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element name="ProgramId" type="{http://ed-fi.org/0100RFC}ProgramId" minOccurs="0"/>
 *         &lt;element name="ProgramType" type="{http://ed-fi.org/0100RFC}ProgramType"/>
 *         &lt;element name="ProgramSponsor" type="{http://ed-fi.org/0100RFC}ProgramSponsorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Program", propOrder = {
    "programId",
    "programType",
    "programSponsor"
})
public class Program
    extends ComplexObjectType
{

    @XmlElement(name = "ProgramId")
    protected String programId;
    @XmlElement(name = "ProgramType", required = true)
    protected ProgramType programType;
    @XmlElement(name = "ProgramSponsor")
    protected ProgramSponsorType programSponsor;

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramId(String value) {
        this.programId = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramType }
     *     
     */
    public ProgramType getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramType }
     *     
     */
    public void setProgramType(ProgramType value) {
        this.programType = value;
    }

    /**
     * Gets the value of the programSponsor property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramSponsorType }
     *     
     */
    public ProgramSponsorType getProgramSponsor() {
        return programSponsor;
    }

    /**
     * Sets the value of the programSponsor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramSponsorType }
     *     
     */
    public void setProgramSponsor(ProgramSponsorType value) {
        this.programSponsor = value;
    }

}