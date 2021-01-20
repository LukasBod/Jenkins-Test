//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.16 um 07:27:21 PM CET 
//


package at.htlperg.classregister.model;

import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.htlperg.classregister.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EntryText_QNAME = new QName("", "EntryText");
    private final static QName _EntryType_QNAME = new QName("", "EntryType");
    private final static QName _Teacher_QNAME = new QName("", "Teacher");
    private final static QName _Date_QNAME = new QName("", "Date");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.htlperg.classregister.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link School }
     * 
     */
    public School createSchool() {
        return new School();
    }

    /**
     * Create an instance of {@link SchoolClass }
     * 
     */
    public SchoolClass createSchoolClass() {
        return new SchoolClass();
    }

    /**
     * Create an instance of {@link RegisterEntryies }
     * 
     */
    public RegisterEntryies createRegisterEntryies() {
        return new RegisterEntryies();
    }

    /**
     * Create an instance of {@link RegisterEntry }
     * 
     */
    public RegisterEntry createRegisterEntry() {
        return new RegisterEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EntryText")
    public JAXBElement<String> createEntryText(String value) {
        return new JAXBElement<String>(_EntryText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EntryType")
    public JAXBElement<String> createEntryType(String value) {
        return new JAXBElement<String>(_EntryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Teacher")
    public JAXBElement<String> createTeacher(String value) {
        return new JAXBElement<String>(_Teacher_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Date")
    @XmlJavaTypeAdapter(DateAdapter.class)
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

}
