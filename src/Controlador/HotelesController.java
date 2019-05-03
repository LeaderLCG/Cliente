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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class HotelesController implements Initializable {

   Ventanas v  = new Ventanas();
    @FXML
    private TableView<Transporte> Aviones;
    @FXML
    private TableColumn<Transporte, String> ID;
    @FXML
    private TableColumn<Transporte, String> Destino;
    @FXML
    private TableColumn<Transporte, String> Costos;
    @FXML
    private TableColumn<Transporte, String> Hotel;
    @FXML
    private TableColumn<Transporte, String> Habitaciones;
    String IDProducto;
    String Precio;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        ID.setCellValueFactory(new PropertyValueFactory<Transporte, String>("ID"));
        Hotel.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Origen"));
        Destino.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Destino"));
        Habitaciones.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Asientos"));
        Costos.setCellValueFactory(new PropertyValueFactory<Transporte, String>("Costo"));
        ObservableList<Transporte> ListaTransporte = FXCollections.observableArrayList(
                new Transporte ("HR1", "Trivago", "Estados Unidos", "30", "1200"),
                new Transporte ("HR2", "TivagoPremium", "Francia", "30", "750"),
                new Transporte ("HR3", "DelawarePunch", "Estados Unidos", "30", "800"),
                new Transporte ("HR4", "SaborUva", "Mexico", "26", "900"),
                new Transporte ("PX90", "Iron Man", "Mexico", "6", "1000"),
                new Transporte ("MX93", "Se", "Francia", "14", "700"),
                new Transporte ("MX56", "Muere :´v", "Francia", "19", "500")
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
    private void ReservarHabitacion(ActionEvent event) {
        agregarAlCarrito(IDProducto, Float.valueOf(Precio), 1, LoginController.neim);
    }

    private static float agregarAlCarrito(java.lang.String nombreArticulo, float precioArticulo, int cantidadArticulo, java.lang.String idCliente) {
        mx.uv.Carrito_Service service = new mx.uv.Carrito_Service();
        mx.uv.Carrito port = service.getCarritoPort();
        return port.agregarAlCarrito(nombreArticulo, precioArticulo, cantidadArticulo, idCliente);
    }
    
}
