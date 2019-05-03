
package mx.uv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.uv package. 
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

    private final static QName _GetAllCarrito_QNAME = new QName("http://uv.mx/", "getAllCarrito");
    private final static QName _GetAllCarritoResponse_QNAME = new QName("http://uv.mx/", "getAllCarritoResponse");
    private final static QName _BorrarCarrito_QNAME = new QName("http://uv.mx/", "borrarCarrito");
    private final static QName _BorrarArticulo_QNAME = new QName("http://uv.mx/", "borrarArticulo");
    private final static QName _BorrarArticuloResponse_QNAME = new QName("http://uv.mx/", "borrarArticuloResponse");
    private final static QName _AgregarAlCarritoResponse_QNAME = new QName("http://uv.mx/", "AgregarAlCarritoResponse");
    private final static QName _BorrarCarritoResponse_QNAME = new QName("http://uv.mx/", "borrarCarritoResponse");
    private final static QName _AgregarAlCarrito_QNAME = new QName("http://uv.mx/", "AgregarAlCarrito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.uv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarAlCarrito }
     * 
     */
    public AgregarAlCarrito createAgregarAlCarrito() {
        return new AgregarAlCarrito();
    }

    /**
     * Create an instance of {@link BorrarArticuloResponse }
     * 
     */
    public BorrarArticuloResponse createBorrarArticuloResponse() {
        return new BorrarArticuloResponse();
    }

    /**
     * Create an instance of {@link AgregarAlCarritoResponse }
     * 
     */
    public AgregarAlCarritoResponse createAgregarAlCarritoResponse() {
        return new AgregarAlCarritoResponse();
    }

    /**
     * Create an instance of {@link BorrarCarritoResponse }
     * 
     */
    public BorrarCarritoResponse createBorrarCarritoResponse() {
        return new BorrarCarritoResponse();
    }

    /**
     * Create an instance of {@link BorrarCarrito }
     * 
     */
    public BorrarCarrito createBorrarCarrito() {
        return new BorrarCarrito();
    }

    /**
     * Create an instance of {@link BorrarArticulo }
     * 
     */
    public BorrarArticulo createBorrarArticulo() {
        return new BorrarArticulo();
    }

    /**
     * Create an instance of {@link GetAllCarrito }
     * 
     */
    public GetAllCarrito createGetAllCarrito() {
        return new GetAllCarrito();
    }

    /**
     * Create an instance of {@link GetAllCarritoResponse }
     * 
     */
    public GetAllCarritoResponse createGetAllCarritoResponse() {
        return new GetAllCarritoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "getAllCarrito")
    public JAXBElement<GetAllCarrito> createGetAllCarrito(GetAllCarrito value) {
        return new JAXBElement<GetAllCarrito>(_GetAllCarrito_QNAME, GetAllCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "getAllCarritoResponse")
    public JAXBElement<GetAllCarritoResponse> createGetAllCarritoResponse(GetAllCarritoResponse value) {
        return new JAXBElement<GetAllCarritoResponse>(_GetAllCarritoResponse_QNAME, GetAllCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "borrarCarrito")
    public JAXBElement<BorrarCarrito> createBorrarCarrito(BorrarCarrito value) {
        return new JAXBElement<BorrarCarrito>(_BorrarCarrito_QNAME, BorrarCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarArticulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "borrarArticulo")
    public JAXBElement<BorrarArticulo> createBorrarArticulo(BorrarArticulo value) {
        return new JAXBElement<BorrarArticulo>(_BorrarArticulo_QNAME, BorrarArticulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarArticuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "borrarArticuloResponse")
    public JAXBElement<BorrarArticuloResponse> createBorrarArticuloResponse(BorrarArticuloResponse value) {
        return new JAXBElement<BorrarArticuloResponse>(_BorrarArticuloResponse_QNAME, BorrarArticuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "AgregarAlCarritoResponse")
    public JAXBElement<AgregarAlCarritoResponse> createAgregarAlCarritoResponse(AgregarAlCarritoResponse value) {
        return new JAXBElement<AgregarAlCarritoResponse>(_AgregarAlCarritoResponse_QNAME, AgregarAlCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "borrarCarritoResponse")
    public JAXBElement<BorrarCarritoResponse> createBorrarCarritoResponse(BorrarCarritoResponse value) {
        return new JAXBElement<BorrarCarritoResponse>(_BorrarCarritoResponse_QNAME, BorrarCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uv.mx/", name = "AgregarAlCarrito")
    public JAXBElement<AgregarAlCarrito> createAgregarAlCarrito(AgregarAlCarrito value) {
        return new JAXBElement<AgregarAlCarrito>(_AgregarAlCarrito_QNAME, AgregarAlCarrito.class, null, value);
    }

}
