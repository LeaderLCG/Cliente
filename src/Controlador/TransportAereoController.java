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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class TransportAereoController implements Initializable {

    Ventanas v  = new Ventanas();

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
}
