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
 * Provides alternative references for section. Use XML IDREF to reference a section record that is included in the interchange
 * 
 * <p>Java class for SectionReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ed-fi.org/0100RFC}ReferenceType">
 *       &lt;sequence>
 *         &lt;element name="SectionIdentity" type="{http://ed-fi.org/0100RFC}SectionIdentityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionReferenceType", propOrder = {
    "sectionIdentity"
})
public class SectionReferenceType
    extends ReferenceType
{

    @XmlElement(name = "SectionIdentity")
    protected SectionIdentityType sectionIdentity;

    /**
     * Gets the value of the sectionIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link SectionIdentityType }
     *     
     */
    public SectionIdentityType getSectionIdentity() {
        return sectionIdentity;
    }

    /**
     * Sets the value of the sectionIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionIdentityType }
     *     
     */
    public void setSectionIdentity(SectionIdentityType value) {
        this.sectionIdentity = value;
    }

}