
package com.example.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.service package. 
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

    private final static QName _GetCvResponse_QNAME = new QName("http://service.example.com/", "getCvResponse");
    private final static QName _ShowAllResponse_QNAME = new QName("http://service.example.com/", "showAllResponse");
    private final static QName _NoCvException_QNAME = new QName("http://service.example.com/", "NoCvException");
    private final static QName _GetCv_QNAME = new QName("http://service.example.com/", "getCv");
    private final static QName _DeleteCvResponse_QNAME = new QName("http://service.example.com/", "deleteCvResponse");
    private final static QName _ShowAll_QNAME = new QName("http://service.example.com/", "showAll");
    private final static QName _AddCvResponse_QNAME = new QName("http://service.example.com/", "addCvResponse");
    private final static QName _AddCv_QNAME = new QName("http://service.example.com/", "addCv");
    private final static QName _DeleteCv_QNAME = new QName("http://service.example.com/", "deleteCv");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddCvResponse }
     * 
     */
    public AddCvResponse createAddCvResponse() {
        return new AddCvResponse();
    }

    /**
     * Create an instance of {@link AddCv }
     * 
     */
    public AddCv createAddCv() {
        return new AddCv();
    }

    /**
     * Create an instance of {@link NoCvException }
     * 
     */
    public NoCvException createNoCvException() {
        return new NoCvException();
    }

    /**
     * Create an instance of {@link GetCv }
     * 
     */
    public GetCv createGetCv() {
        return new GetCv();
    }

    /**
     * Create an instance of {@link DeleteCvResponse }
     * 
     */
    public DeleteCvResponse createDeleteCvResponse() {
        return new DeleteCvResponse();
    }

    /**
     * Create an instance of {@link ShowAll }
     * 
     */
    public ShowAll createShowAll() {
        return new ShowAll();
    }

    /**
     * Create an instance of {@link DeleteCv }
     * 
     */
    public DeleteCv createDeleteCv() {
        return new DeleteCv();
    }

    /**
     * Create an instance of {@link GetCvResponse }
     * 
     */
    public GetCvResponse createGetCvResponse() {
        return new GetCvResponse();
    }

    /**
     * Create an instance of {@link ShowAllResponse }
     * 
     */
    public ShowAllResponse createShowAllResponse() {
        return new ShowAllResponse();
    }

    /**
     * Create an instance of {@link Cv }
     * 
     */
    public Cv createCv() {
        return new Cv();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getCvResponse")
    public JAXBElement<GetCvResponse> createGetCvResponse(GetCvResponse value) {
        return new JAXBElement<GetCvResponse>(_GetCvResponse_QNAME, GetCvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "showAllResponse")
    public JAXBElement<ShowAllResponse> createShowAllResponse(ShowAllResponse value) {
        return new JAXBElement<ShowAllResponse>(_ShowAllResponse_QNAME, ShowAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCvException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "NoCvException")
    public JAXBElement<NoCvException> createNoCvException(NoCvException value) {
        return new JAXBElement<NoCvException>(_NoCvException_QNAME, NoCvException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getCv")
    public JAXBElement<GetCv> createGetCv(GetCv value) {
        return new JAXBElement<GetCv>(_GetCv_QNAME, GetCv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "deleteCvResponse")
    public JAXBElement<DeleteCvResponse> createDeleteCvResponse(DeleteCvResponse value) {
        return new JAXBElement<DeleteCvResponse>(_DeleteCvResponse_QNAME, DeleteCvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "showAll")
    public JAXBElement<ShowAll> createShowAll(ShowAll value) {
        return new JAXBElement<ShowAll>(_ShowAll_QNAME, ShowAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "addCvResponse")
    public JAXBElement<AddCvResponse> createAddCvResponse(AddCvResponse value) {
        return new JAXBElement<AddCvResponse>(_AddCvResponse_QNAME, AddCvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "addCv")
    public JAXBElement<AddCv> createAddCv(AddCv value) {
        return new JAXBElement<AddCv>(_AddCv_QNAME, AddCv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "deleteCv")
    public JAXBElement<DeleteCv> createDeleteCv(DeleteCv value) {
        return new JAXBElement<DeleteCv>(_DeleteCv_QNAME, DeleteCv.class, null, value);
    }

}
