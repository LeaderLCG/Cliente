/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Transporte;
import Vista.Ventanas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class TransportTerrestreController implements Initializable {
    
    Ventanas v  = new Ventanas();
    
    @FXML
    private ComboBox Origenes;
    @FXML
    private ComboBox Destinos;
    
    @FXML
    private TableView<Transporte> Carros;
    @FXML
    private TableColumn<Transporte, String> ID;
    @FXML
    private TableColumn<Transporte, String> Origen;
    @FXML
    private TableColumn<Transporte, String> Destino;
    @FXML
    private TableColumn<Transporte, String> Fecha;
    @FXML
    private TableColumn<Transporte, String> Hora;
    @FXML
    private TableColumn<Transporte, String> Asientos;
    @FXML
    private TableColumn<Transporte, String> Costos;
    
    ObservableList<String> OrigenesList = FXCollections.observableArrayList("Xalapa", "Mexico", "Puebla");
    ObservableList<String> DestinosList = FXCollections.observableArrayList("Xalapa", "Mexico", "Puebla");
    
    String IDProducto;
    String Precio;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Origenes.setItems(OrigenesList);
        Destinos.setItems(DestinosList);
        ID.setCellValueFactory(new PropertyValueFactory<Transporte, String>("ID"));
        Origen.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Origen"));
        Destino.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Destino"));
        Fecha.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Fecha"));
        Hora.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Hora"));
        Costos.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Costo"));
        Asientos.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Asientos"));

        ObservableList<Transporte> ListaTransporte = FXCollections.observableArrayList();
        ListaTransporte.add(new Transporte ("XP73", "Xalapa", "Puebla", "26/05/2019", "7:30 a.m.", "30", "100"));
        ListaTransporte.add(new Transporte ("XP83", "Xalapa", "Puebla", "26/05/2019", "8:30 a.m.", "30", "90"));
        ListaTransporte.add(new Transporte ("XP93", "Xalapa", "Puebla", "26/05/2019", "9:30 a.m.", "30", "130"));
        ListaTransporte.add(new Transporte ("PX73", "Puebla", "Xalapa", "26/05/2019", "9:30 a.m.", "26", "140"));
        ListaTransporte.add(new Transporte ("PX90", "Puebla", "Xalapa", "29/06/2019", "12:00 p.m.", "6", "230"));
        ListaTransporte.add(new Transporte ("MX93", "Mexico", "Xalapa", "28/06/2019", "3:00 p.m.", "14", "280"));
        ListaTransporte.add(new Transporte ("MX56", "Mexico", "Xalapa", "26/05/2019", "1:30 p.m.", "19", "140"));
        
        Carros.getItems().addAll(ListaTransporte);
        
        Carros.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Transporte>(){
            @Override
            public void changed(ObservableValue<? extends Transporte> arg0, Transporte oldValue, Transporte newValue){
                IDProducto=newValue.getID();
                Precio=newValue.getCosto();
                }
                });
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

    @FXML
    private void ReservarBoleto(ActionEvent event) {
        //Lo que hace es con el web service restar un asiento en el transporte con el metodo de comprarBoleto, por lo que entendi lo unico
        //que hace ese metodo es restar un asiento al camion, tambien debemos guardar esta "compra" en el carrito, para despues realizar el pago
        //total, en el parametro cantidad del carrito es 1
        //
        agregarAlCarrito(IDProducto, Float.valueOf(Precio), 1, LoginController.neim);
        
    }

    @FXML
    private void Buscar(ActionEvent event) {
        //Este metodo va a tomas los valores de los combo box y llamara al web service buscarCamion para obtener la lista de los camiones y mostrarlos en la tabla
        //Debes validar que el origen y el destino no sean el mismo ya que si lo son saldra error
    }

    private static float agregarAlCarrito(java.lang.String nombreArticulo, float precioArticulo, int cantidadArticulo, java.lang.String idCliente) {
        mx.uv.Carrito_Service service = new mx.uv.Carrito_Service();
        mx.uv.Carrito port = service.getCarritoPort();
        return port.agregarAlCarrito(nombreArticulo, precioArticulo, cantidadArticulo, idCliente);
    }

 
    
}
    
    

    