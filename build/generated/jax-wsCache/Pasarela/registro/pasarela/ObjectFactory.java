
package registro.pasarela;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the registro.pasarela package. 
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

    private final static QName _Transaccion_QNAME = new QName("http://pasarela.registro/", "Transaccion");
    private final static QName _ConsultarHistorial_QNAME = new QName("http://pasarela.registro/", "ConsultarHistorial");
    private final static QName _ConsultarHistorialResponse_QNAME = new QName("http://pasarela.registro/", "ConsultarHistorialResponse");
    private final static QName _ConsultarTransaccion_QNAME = new QName("http://pasarela.registro/", "ConsultarTransaccion");
    private final static QName _Registro_QNAME = new QName("http://pasarela.registro/", "Registro");
    private final static QName _RegistroResponse_QNAME = new QName("http://pasarela.registro/", "RegistroResponse");
    private final static QName _TransaccionResponse_QNAME = new QName("http://pasarela.registro/", "TransaccionResponse");
    private final static QName _ConsultarTransaccionResponse_QNAME = new QName("http://pasarela.registro/", "ConsultarTransaccionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: registro.pasarela
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroResponse }
     * 
     */
    public RegistroResponse createRegistroResponse() {
        return new RegistroResponse();
    }

    /**
     * Create an instance of {@link TransaccionResponse }
     * 
     */
    public TransaccionResponse createTransaccionResponse() {
        return new TransaccionResponse();
    }

    /**
     * Create an instance of {@link ConsultarTransaccionResponse }
     * 
     */
    public ConsultarTransaccionResponse createConsultarTransaccionResponse() {
        return new ConsultarTransaccionResponse();
    }

    /**
     * Create an instance of {@link ConsultarTransaccion }
     * 
     */
    public ConsultarTransaccion createConsultarTransaccion() {
        return new ConsultarTransaccion();
    }

    /**
     * Create an instance of {@link Registro }
     * 
     */
    public Registro createRegistro() {
        return new Registro();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link ConsultarHistorialResponse }
     * 
     */
    public ConsultarHistorialResponse createConsultarHistorialResponse() {
        return new ConsultarHistorialResponse();
    }

    /**
     * Create an instance of {@link ConsultarHistorial }
     * 
     */
    public ConsultarHistorial createConsultarHistorial() {
        return new ConsultarHistorial();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "Transaccion")
    public JAXBElement<Transaccion> createTransaccion(Transaccion value) {
        return new JAXBElement<Transaccion>(_Transaccion_QNAME, Transaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarHistorial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "ConsultarHistorial")
    public JAXBElement<ConsultarHistorial> createConsultarHistorial(ConsultarHistorial value) {
        return new JAXBElement<ConsultarHistorial>(_ConsultarHistorial_QNAME, ConsultarHistorial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarHistorialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "ConsultarHistorialResponse")
    public JAXBElement<ConsultarHistorialResponse> createConsultarHistorialResponse(ConsultarHistorialResponse value) {
        return new JAXBElement<ConsultarHistorialResponse>(_ConsultarHistorialResponse_QNAME, ConsultarHistorialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "ConsultarTransaccion")
    public JAXBElement<ConsultarTransaccion> createConsultarTransaccion(ConsultarTransaccion value) {
        return new JAXBElement<ConsultarTransaccion>(_ConsultarTransaccion_QNAME, ConsultarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "Registro")
    public JAXBElement<Registro> createRegistro(Registro value) {
        return new JAXBElement<Registro>(_Registro_QNAME, Registro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "RegistroResponse")
    public JAXBElement<RegistroResponse> createRegistroResponse(RegistroResponse value) {
        return new JAXBElement<RegistroResponse>(_RegistroResponse_QNAME, RegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "TransaccionResponse")
    public JAXBElement<TransaccionResponse> createTransaccionResponse(TransaccionResponse value) {
        return new JAXBElement<TransaccionResponse>(_TransaccionResponse_QNAME, TransaccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pasarela.registro/", name = "ConsultarTransaccionResponse")
    public JAXBElement<ConsultarTransaccionResponse> createConsultarTransaccionResponse(ConsultarTransaccionResponse value) {
        return new JAXBElement<ConsultarTransaccionResponse>(_ConsultarTransaccionResponse_QNAME, ConsultarTransaccionResponse.class, null, value);
    }

}
