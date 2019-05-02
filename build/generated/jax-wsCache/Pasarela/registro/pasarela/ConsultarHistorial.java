
package registro.pasarela;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ConsultarHistorial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultarHistorial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoCompania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarHistorial", propOrder = {
    "noCompania"
})
public class ConsultarHistorial {

    @XmlElement(name = "NoCompania")
    protected String noCompania;

    /**
     * Obtiene el valor de la propiedad noCompania.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCompania() {
        return noCompania;
    }

    /**
     * Define el valor de la propiedad noCompania.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCompania(String value) {
        this.noCompania = value;
    }

}
