/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventanas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PagosController implements Initializable {

    Ventanas v  = new Ventanas();
    
    @FXML
    private TableView<?> TablaPagos;
    @FXML
    private TableColumn<?, ?> IDConcepto;
    @FXML
    private TableColumn<?, ?> PrecioConcepto;
    @FXML
    private TableView<?> Historial;
    @FXML
    private TableColumn<?, ?> CuentaOrigen;
    @FXML
    private TableColumn<?, ?> CuentaDestino;
    @FXML
    private TableColumn<?, ?> Monto;
    @FXML
    private TableColumn<?, ?> Fecha;
    @FXML
    private TextField TextNCuentaHistorial;
    @FXML
    private TextField TextNCuentaPagos;
    @FXML
    private Label PagoTotal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Inicio(MouseEvent event) throws Exception {
        v.startInicio();
    }

    @FXML
    private void Terrestre(ActionEvent event) throws Exception {
        v.startTerrestre();
    }

    @FXML
    private void Aereo(ActionEvent event) throws Exception {
        v.startAereo();
    }

    @FXML
    private void Hoteles(ActionEvent event) throws Exception {
        v.startHoteles();
    }

    @FXML
    private void Pagos(ActionEvent event) throws Exception {
        v.startPagos();
    }
    
    
    
    
  /*
    Al cargar la ventana se deben mostrar todos los conceptos a pagar guardados 
    en el carrito dentro de a tabla de conceptos
    a pagar. Y debe calcular el monto total de los conceptos a pagar y concatenarlo
    con el texto que esta en el label PagoTotal.
    Para refrescar la pantalla despues de una accion en esta pantalla podrias 
    mandar a llamar al metodo startPagos() a fin de
    actualizar la informacion de la tabla de conceptos a pagar
    */

    @FXML
    private void borrarConcepto(ActionEvent event) {
        /*
        Selecciona un elemento de la tabla y con esta accion elimina dicho 
        elemento del carrito para disminuir la cuienta total a pagar
        */
    }

    @FXML
    private void vaciarCarrito(ActionEvent event) {
      /*
        Elimina todos los elementos del carrito
        */
    }

    @FXML
    private void Pagar(ActionEvent event) {
        /*
        Debes leer la caja de texto de PAGOS para saber el numero de cuenta del 
        cliente, luego estableces nuestro numero de cuenta (de la empresa)
        ya que siempre va a ser el mismo, el usuario no lo escribe, y al final 
        envias el monto total, el usuario tampoco escribe eso.
        Cabe mencionar que al regalizar el pago del carrito este se vuelve a 
        vaciar por completo asi que ejecutas e metodo vaciarCarrito al final
        */
        
    }

    @FXML
    private void BuscarHistorial(ActionEvent event) {
        /*
        Lee la caja de texto de HISTORIAL para saber el numero de cuenta que se 
        quiera consultar, luego despliegua los datos en la tabla
        */
        String PruebaHistorialNoSplitted = consultarHistorial(TextNCuentaHistorial.getText());
        String HistorialSplitted[]=PruebaHistorialNoSplitted.split(", ");
        
    }

    private static String consultarHistorial(java.lang.String noCompania) {
        registro.pasarela.Pasarela_Service service = new registro.pasarela.Pasarela_Service();
        registro.pasarela.Pasarela port = service.getPasarelaPort();
        return port.consultarHistorial(noCompania);
    }
    
}
