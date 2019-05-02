
package mx.agencia;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClientesServer", targetNamespace = "http://agencia.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClientesServer {


    /**
     * 
     * @param password
     * @param name
     * @param tipoUsuario
     * @param id
     * @param username
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUsuario", targetNamespace = "http://agencia.mx/", className = "mx.agencia.UpdateUsuario")
    @ResponseWrapper(localName = "updateUsuarioResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.UpdateUsuarioResponse")
    @Action(input = "http://agencia.mx/ClientesServer/updateUsuarioRequest", output = "http://agencia.mx/ClientesServer/updateUsuarioResponse")
    public int updateUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "tipoUsuario", targetNamespace = "")
        String tipoUsuario,
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @return
     *     returns java.util.List<mx.agencia.Usuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllUsuarios", targetNamespace = "http://agencia.mx/", className = "mx.agencia.GetAllUsuarios")
    @ResponseWrapper(localName = "getAllUsuariosResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.GetAllUsuariosResponse")
    @Action(input = "http://agencia.mx/ClientesServer/getAllUsuariosRequest", output = "http://agencia.mx/ClientesServer/getAllUsuariosResponse")
    public List<Usuario> getAllUsuarios();

    /**
     * 
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteUsuario", targetNamespace = "http://agencia.mx/", className = "mx.agencia.DeleteUsuario")
    @ResponseWrapper(localName = "deleteUsuarioResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.DeleteUsuarioResponse")
    @Action(input = "http://agencia.mx/ClientesServer/deleteUsuarioRequest", output = "http://agencia.mx/ClientesServer/deleteUsuarioResponse")
    public int deleteUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param id
     * @return
     *     returns mx.agencia.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsuario", targetNamespace = "http://agencia.mx/", className = "mx.agencia.GetUsuario")
    @ResponseWrapper(localName = "getUsuarioResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.GetUsuarioResponse")
    @Action(input = "http://agencia.mx/ClientesServer/getUsuarioRequest", output = "http://agencia.mx/ClientesServer/getUsuarioResponse")
    public Usuario getUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param password
     * @param name
     * @param tipoUsuario
     * @param id
     * @param username
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertUsuario", targetNamespace = "http://agencia.mx/", className = "mx.agencia.InsertUsuario")
    @ResponseWrapper(localName = "insertUsuarioResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.InsertUsuarioResponse")
    @Action(input = "http://agencia.mx/ClientesServer/insertUsuarioRequest", output = "http://agencia.mx/ClientesServer/insertUsuarioResponse")
    public int insertUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "tipoUsuario", targetNamespace = "")
        String tipoUsuario,
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://agencia.mx/", className = "mx.agencia.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.HelloResponse")
    @Action(input = "http://agencia.mx/ClientesServer/helloRequest", output = "http://agencia.mx/ClientesServer/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns mx.agencia.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://agencia.mx/", className = "mx.agencia.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.LoginResponse")
    @Action(input = "http://agencia.mx/ClientesServer/loginRequest", output = "http://agencia.mx/ClientesServer/loginResponse")
    public Usuario login(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param password
     * @param name
     * @param id
     * @param username
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "register", targetNamespace = "http://agencia.mx/", className = "mx.agencia.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://agencia.mx/", className = "mx.agencia.RegisterResponse")
    @Action(input = "http://agencia.mx/ClientesServer/registerRequest", output = "http://agencia.mx/ClientesServer/registerResponse")
    public int register(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "username", targetNamespace = "")
        String username);

}