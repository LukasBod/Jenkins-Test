//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.16 um 07:27:21 PM CET 
//


package at.htlperg.classregister.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}RegisterEntryies"/>
 *       &lt;/sequence>
 *       &lt;attribute name="classID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="className" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerEntryies"
})
@XmlRootElement(name = "SchoolClass")
public class SchoolClass {

    @XmlElement(name = "RegisterEntryies", required = true)
    protected RegisterEntryies registerEntryies;
    @XmlAttribute(name = "classID")
    protected String classID;
    @XmlAttribute(name = "className")
    protected String className;
    @XmlAttribute(name = "schoolYear")
    protected String schoolYear;

    /**
     * Ruft den Wert der registerEntryies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegisterEntryies }
     *     
     */
    public RegisterEntryies getRegisterEntryies() {
        return registerEntryies;
    }

    /**
     * Legt den Wert der registerEntryies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterEntryies }
     *     
     */
    public void setRegisterEntryies(RegisterEntryies value) {
        this.registerEntryies = value;
    }

    /**
     * Ruft den Wert der classID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassID() {
        return classID;
    }

    /**
     * Legt den Wert der classID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassID(String value) {
        this.classID = value;
    }

    /**
     * Ruft den Wert der className-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Legt den Wert der className-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Ruft den Wert der schoolYear-Eigenschaft ab.
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
     * Legt den Wert der schoolYear-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolYear(String value) {
        this.schoolYear = value;
    }

}
