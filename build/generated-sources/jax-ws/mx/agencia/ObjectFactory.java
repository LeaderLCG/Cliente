
package mx.agencia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.agencia package. 
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

    private final static QName _DeleteUsuario_QNAME = new QName("http://agencia.mx/", "deleteUsuario");
    private final static QName _LoginResponse_QNAME = new QName("http://agencia.mx/", "loginResponse");
    private final static QName _InsertUsuario_QNAME = new QName("http://agencia.mx/", "insertUsuario");
    private final static QName _UpdateUsuario_QNAME = new QName("http://agencia.mx/", "updateUsuario");
    private final static QName _GetAllUsuarios_QNAME = new QName("http://agencia.mx/", "getAllUsuarios");
    private final static QName _Login_QNAME = new QName("http://agencia.mx/", "login");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://agencia.mx/", "getUsuarioResponse");
    private final static QName _InsertUsuarioResponse_QNAME = new QName("http://agencia.mx/", "insertUsuarioResponse");
    private final static QName _GetAllUsuariosResponse_QNAME = new QName("http://agencia.mx/", "getAllUsuariosResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://agencia.mx/", "helloResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://agencia.mx/", "registerResponse");
    private final static QName _DeleteUsuarioResponse_QNAME = new QName("http://agencia.mx/", "deleteUsuarioResponse");
    private final static QName _UpdateUsuarioResponse_QNAME = new QName("http://agencia.mx/", "updateUsuarioResponse");
    private final static QName _Register_QNAME = new QName("http://agencia.mx/", "register");
    private final static QName _Hello_QNAME = new QName("http://agencia.mx/", "hello");
    private final static QName _GetUsuario_QNAME = new QName("http://agencia.mx/", "getUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.agencia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertUsuario }
     * 
     */
    public InsertUsuario createInsertUsuario() {
        return new InsertUsuario();
    }

    /**
     * Create an instance of {@link DeleteUsuario }
     * 
     */
    public DeleteUsuario createDeleteUsuario() {
        return new DeleteUsuario();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertUsuarioResponse }
     * 
     */
    public InsertUsuarioResponse createInsertUsuarioResponse() {
        return new InsertUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetAllUsuarios }
     * 
     */
    public GetAllUsuarios createGetAllUsuarios() {
        return new GetAllUsuarios();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link UpdateUsuario }
     * 
     */
    public UpdateUsuario createUpdateUsuario() {
        return new UpdateUsuario();
    }

    /**
     * Create an instance of {@link DeleteUsuarioResponse }
     * 
     */
    public DeleteUsuarioResponse createDeleteUsuarioResponse() {
        return new DeleteUsuarioResponse();
    }

    /**
     * Create an instance of {@link UpdateUsuarioResponse }
     * 
     */
    public UpdateUsuarioResponse createUpdateUsuarioResponse() {
        return new UpdateUsuarioResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link GetAllUsuariosResponse }
     * 
     */
    public GetAllUsuariosResponse createGetAllUsuariosResponse() {
        return new GetAllUsuariosResponse();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "deleteUsuario")
    public JAXBElement<DeleteUsuario> createDeleteUsuario(DeleteUsuario value) {
        return new JAXBElement<DeleteUsuario>(_DeleteUsuario_QNAME, DeleteUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "insertUsuario")
    public JAXBElement<InsertUsuario> createInsertUsuario(InsertUsuario value) {
        return new JAXBElement<InsertUsuario>(_InsertUsuario_QNAME, InsertUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "updateUsuario")
    public JAXBElement<UpdateUsuario> createUpdateUsuario(UpdateUsuario value) {
        return new JAXBElement<UpdateUsuario>(_UpdateUsuario_QNAME, UpdateUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "getAllUsuarios")
    public JAXBElement<GetAllUsuarios> createGetAllUsuarios(GetAllUsuarios value) {
        return new JAXBElement<GetAllUsuarios>(_GetAllUsuarios_QNAME, GetAllUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "insertUsuarioResponse")
    public JAXBElement<InsertUsuarioResponse> createInsertUsuarioResponse(InsertUsuarioResponse value) {
        return new JAXBElement<InsertUsuarioResponse>(_InsertUsuarioResponse_QNAME, InsertUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "getAllUsuariosResponse")
    public JAXBElement<GetAllUsuariosResponse> createGetAllUsuariosResponse(GetAllUsuariosResponse value) {
        return new JAXBElement<GetAllUsuariosResponse>(_GetAllUsuariosResponse_QNAME, GetAllUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "deleteUsuarioResponse")
    public JAXBElement<DeleteUsuarioResponse> createDeleteUsuarioResponse(DeleteUsuarioResponse value) {
        return new JAXBElement<DeleteUsuarioResponse>(_DeleteUsuarioResponse_QNAME, DeleteUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "updateUsuarioResponse")
    public JAXBElement<UpdateUsuarioResponse> createUpdateUsuarioResponse(UpdateUsuarioResponse value) {
        return new JAXBElement<UpdateUsuarioResponse>(_UpdateUsuarioResponse_QNAME, UpdateUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agencia.mx/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

}
