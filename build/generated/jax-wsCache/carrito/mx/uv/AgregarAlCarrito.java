
package mx.uv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AgregarAlCarrito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AgregarAlCarrito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreArticulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioArticulo" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="cantidadArticulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgregarAlCarrito", propOrder = {
    "nombreArticulo",
    "precioArticulo",
    "cantidadArticulo",
    "idCliente"
})
public class AgregarAlCarrito {

    protected String nombreArticulo;
    protected float precioArticulo;
    protected int cantidadArticulo;
    protected String idCliente;

    /**
     * Obtiene el valor de la propiedad nombreArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    /**
     * Define el valor de la propiedad nombreArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArticulo(String value) {
        this.nombreArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioArticulo.
     * 
     */
    public float getPrecioArticulo() {
        return precioArticulo;
    }

    /**
     * Define el valor de la propiedad precioArticulo.
     * 
     */
    public void setPrecioArticulo(float value) {
        this.precioArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadArticulo.
     * 
     */
    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    /**
     * Define el valor de la propiedad cantidadArticulo.
     * 
     */
    public void setCantidadArticulo(int value) {
        this.cantidadArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

}
