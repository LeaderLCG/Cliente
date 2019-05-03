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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class TransportAereoController implements Initializable {

    Ventanas v  = new Ventanas();
    @FXML
    private TableView<Transporte> Aviones;
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
    @FXML
    private ComboBox Origenes;
    @FXML
    private ComboBox Destinos;

    ObservableList<String> OrigenesList = FXCollections.observableArrayList("Estados Unidos", "Mexico", "Francia");
    ObservableList<String> DestinosList = FXCollections.observableArrayList("Estados Unidos", "Mexico", "Francia");
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
        ObservableList<Transporte> ListaTransporte = FXCollections.observableArrayList(
                new Transporte ("XP73", "Mexico", "Estados Unidos", "26/05/2019", "7:30 a.m.", "30", "1200"),
                new Transporte ("XP83", "Mexico", "Francia", "26/05/2019", "8:30 a.m.", "30", "750"),
                new Transporte ("XP93", "Francia", "Estados Unidos", "26/05/2019", "9:30 a.m.", "30", "800"),
                new Transporte ("PX73", "Francia", "Mexico", "26/05/2019", "9:30 a.m.", "26", "900"),
                new Transporte ("PX90", "Estados Unidos", "Mexico", "29/06/2019", "12:00 p.m.", "6", "1000"),
                new Transporte ("MX93", "Estados Unidos", "Francia", "28/06/2019", "3:00 p.m.", "14", "700"),
                new Transporte ("MX56", "Mexico", "Francia", "26/05/2019", "1:30 p.m.", "19", "500")
        );
        Aviones.setItems(ListaTransporte);
        
        Aviones.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Transporte>(){
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
       
        agregarAlCarrito(IDProducto, Float.valueOf(Precio), 1, LoginController.neim);
    }

    @FXML
    private void Buscar(ActionEvent event) {
    }

    private static float agregarAlCarrito(java.lang.String nombreArticulo, float precioArticulo, int cantidadArticulo, java.lang.String idCliente) {
        mx.uv.Carrito_Service service = new mx.uv.Carrito_Service();
        mx.uv.Carrito port = service.getCarritoPort();
        return port.agregarAlCarrito(nombreArticulo, precioArticulo, cantidadArticulo, idCliente);
    }
}
