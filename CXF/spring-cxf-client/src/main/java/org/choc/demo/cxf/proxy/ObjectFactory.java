
package org.choc.demo.cxf.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.choc.demo.cxf.proxy package. 
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

    private final static QName _SayResponse_QNAME = new QName("http://demo.choc.org/", "SayResponse");
    private final static QName _SayYes_QNAME = new QName("http://demo.choc.org/", "SayYes");
    private final static QName _SayYesResponse_QNAME = new QName("http://demo.choc.org/", "SayYesResponse");
    private final static QName _Say_QNAME = new QName("http://demo.choc.org/", "Say");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.choc.demo.cxf.proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Say }
     * 
     */
    public Say createSay() {
        return new Say();
    }

    /**
     * Create an instance of {@link SayYes }
     * 
     */
    public SayYes createSayYes() {
        return new SayYes();
    }

    /**
     * Create an instance of {@link SayYesResponse }
     * 
     */
    public SayYesResponse createSayYesResponse() {
        return new SayYesResponse();
    }

    /**
     * Create an instance of {@link SayResponse }
     * 
     */
    public SayResponse createSayResponse() {
        return new SayResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.choc.org/", name = "SayResponse")
    public JAXBElement<SayResponse> createSayResponse(SayResponse value) {
        return new JAXBElement<SayResponse>(_SayResponse_QNAME, SayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayYes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.choc.org/", name = "SayYes")
    public JAXBElement<SayYes> createSayYes(SayYes value) {
        return new JAXBElement<SayYes>(_SayYes_QNAME, SayYes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayYesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.choc.org/", name = "SayYesResponse")
    public JAXBElement<SayYesResponse> createSayYesResponse(SayYesResponse value) {
        return new JAXBElement<SayYesResponse>(_SayYesResponse_QNAME, SayYesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Say }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.choc.org/", name = "Say")
    public JAXBElement<Say> createSay(Say value) {
        return new JAXBElement<Say>(_Say_QNAME, Say.class, null, value);
    }

}
