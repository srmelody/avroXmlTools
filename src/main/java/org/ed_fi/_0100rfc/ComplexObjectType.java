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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This is the base type from which all entity elements are extended.
 * 
 * <p>Java class for ComplexObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexObjectType")
@XmlSeeAlso({
    AcademicWeek.class,
    ReportCard.class,
    StudentObjectiveAssessment.class,
    ClassPeriod.class,
    StudentCompetency.class,
    CompetencyLevel.class,
    Student.class,
    Cohort.class,
    BellSchedule.class,
    GradingPeriod.class,
    Session.class,
    LeaveEvent.class,
    Budget.class,
    Payroll.class,
    PerformanceLevel.class,
    LearningStandard.class,
    CourseOffering.class,
    ObjectiveAssessment.class,
    Parent.class,
    DisciplineIncident.class,
    GraduationPlan.class,
    OpenStaffPosition.class,
    Course.class,
    PostSecondaryEvent.class,
    ContractedStaff.class,
    GradebookEntry.class,
    Assessment.class,
    Staff.class,
    AssessmentItem.class,
    StudentAssessmentItem.class,
    Diploma.class,
    CourseTranscript.class,
    StudentAssessment.class,
    Program.class,
    Actual.class,
    LearningObjective.class,
    AttendanceEvent.class,
    CalendarDate.class,
    RestraintEvent.class,
    Account.class,
    StudentAcademicRecord.class,
    DisciplineAction.class,
    Grade.class,
    AssessmentFamily.class,
    EducationOrganization.class,
    StudentGradebookEntry.class,
    Location.class,
    Section.class
})
public abstract class ComplexObjectType {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
