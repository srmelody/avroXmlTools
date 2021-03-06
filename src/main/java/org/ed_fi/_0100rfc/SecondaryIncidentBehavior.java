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
 * Definition of the behavior coded for use in describing an incident.
 * 
 * <p>Java class for SecondaryIncidentBehavior complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryIncidentBehavior">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecondaryBehavior" type="{http://ed-fi.org/0100RFC}SecondaryIncidentBehaviorsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IncidentCategory" use="required" type="{http://ed-fi.org/0100RFC}IncidentCategoryType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryIncidentBehavior", propOrder = {
    "secondaryBehavior"
})
public class SecondaryIncidentBehavior {

    @XmlElement(name = "SecondaryBehavior", required = true)
    protected String secondaryBehavior;
    @XmlAttribute(name = "IncidentCategory", required = true)
    protected IncidentCategoryType incidentCategory;

    /**
     * Gets the value of the secondaryBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryBehavior() {
        return secondaryBehavior;
    }

    /**
     * Sets the value of the secondaryBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryBehavior(String value) {
        this.secondaryBehavior = value;
    }

    /**
     * Gets the value of the incidentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentCategoryType }
     *     
     */
    public IncidentCategoryType getIncidentCategory() {
        return incidentCategory;
    }

    /**
     * Sets the value of the incidentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentCategoryType }
     *     
     */
    public void setIncidentCategory(IncidentCategoryType value) {
        this.incidentCategory = value;
    }

}
