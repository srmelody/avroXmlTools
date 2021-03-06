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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The set of elements that describes an address, including the street address, city, state, and ZIP code.
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetNumberName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://ed-fi.org/0100RFC}StreetNumberName">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApartmentRoomSuiteNumber" type="{http://ed-fi.org/0100RFC}ApartmentRoomSuiteNumber" minOccurs="0"/>
 *         &lt;element name="BuildingSiteNumber" type="{http://ed-fi.org/0100RFC}BuildingSiteNumber" minOccurs="0"/>
 *         &lt;element name="City" type="{http://ed-fi.org/0100RFC}City"/>
 *         &lt;element name="StateAbbreviation" type="{http://ed-fi.org/0100RFC}StateAbbreviationType"/>
 *         &lt;element name="PostalCode" type="{http://ed-fi.org/0100RFC}PostalCode"/>
 *         &lt;element name="NameOfCounty" type="{http://ed-fi.org/0100RFC}NameOfCounty" minOccurs="0"/>
 *         &lt;element name="CountyFIPSCode" type="{http://ed-fi.org/0100RFC}CountyFIPSCode" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://ed-fi.org/0100RFC}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://ed-fi.org/0100RFC}Coordinate" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://ed-fi.org/0100RFC}Coordinate" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AddressType" type="{http://ed-fi.org/0100RFC}AddressType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "streetNumberName",
    "apartmentRoomSuiteNumber",
    "buildingSiteNumber",
    "city",
    "stateAbbreviation",
    "postalCode",
    "nameOfCounty",
    "countyFIPSCode",
    "countryCode",
    "latitude",
    "longitude",
    "beginDate",
    "endDate"
})
public class Address {

    @XmlElement(name = "StreetNumberName", required = true)
    protected String streetNumberName;
    @XmlElement(name = "ApartmentRoomSuiteNumber")
    protected String apartmentRoomSuiteNumber;
    @XmlElement(name = "BuildingSiteNumber")
    protected String buildingSiteNumber;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "StateAbbreviation", required = true)
    protected StateAbbreviationType stateAbbreviation;
    @XmlElement(name = "PostalCode", required = true)
    protected String postalCode;
    @XmlElement(name = "NameOfCounty")
    protected String nameOfCounty;
    @XmlElement(name = "CountyFIPSCode")
    protected String countyFIPSCode;
    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "AddressType")
    protected AddressType addressType;

    /**
     * Gets the value of the streetNumberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberName() {
        return streetNumberName;
    }

    /**
     * Sets the value of the streetNumberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberName(String value) {
        this.streetNumberName = value;
    }

    /**
     * Gets the value of the apartmentRoomSuiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentRoomSuiteNumber() {
        return apartmentRoomSuiteNumber;
    }

    /**
     * Sets the value of the apartmentRoomSuiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentRoomSuiteNumber(String value) {
        this.apartmentRoomSuiteNumber = value;
    }

    /**
     * Gets the value of the buildingSiteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingSiteNumber() {
        return buildingSiteNumber;
    }

    /**
     * Sets the value of the buildingSiteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingSiteNumber(String value) {
        this.buildingSiteNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link StateAbbreviationType }
     *     
     */
    public StateAbbreviationType getStateAbbreviation() {
        return stateAbbreviation;
    }

    /**
     * Sets the value of the stateAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateAbbreviationType }
     *     
     */
    public void setStateAbbreviation(StateAbbreviationType value) {
        this.stateAbbreviation = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the nameOfCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfCounty() {
        return nameOfCounty;
    }

    /**
     * Sets the value of the nameOfCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfCounty(String value) {
        this.nameOfCounty = value;
    }

    /**
     * Gets the value of the countyFIPSCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPSCode() {
        return countyFIPSCode;
    }

    /**
     * Sets the value of the countyFIPSCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPSCode(String value) {
        this.countyFIPSCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
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
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddressType(AddressType value) {
        this.addressType = value;
    }

}
