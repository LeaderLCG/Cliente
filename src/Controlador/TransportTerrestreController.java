/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    private TableView<?> Carros;
    @FXML
    private TableColumn<?, ?> ID;
    @FXML
    private TableColumn<?, ?> Origen;
    @FXML
    private TableColumn<?, ?> Destino;
    @FXML
    private TableColumn<?, ?> Fecha;
    @FXML
    private TableColumn<?, ?> Hora;
    @FXML
    private TableColumn<?, ?> Asientos;
    @FXML
    private TableColumn<?, ?> Costos;
    
    ObservableList<String> OrigenesList = FXCollections.observableArrayList("Xalapa", "Mexico", "Puebla");
    ObservableList<String> DestinosList = FXCollections.observableArrayList("Xalapa", "Mexico", "Puebla");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Origenes.setItems(OrigenesList);
        Destinos.setItems(DestinosList);
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
    }

    @FXML
    private void Buscar(ActionEvent event) {
        //Este metodo va a tomas los valores de los combo box y llamara al web service buscarCamion para obtener la lista de los camiones y mostrarlos en la tabla
        //Debes validar que el origen y el destino no sean el mismo ya que si lo son saldra error
    }

 
    
}
    
    

    