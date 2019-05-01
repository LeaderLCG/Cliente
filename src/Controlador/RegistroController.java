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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class RegistroController implements Initializable {
    @FXML
    private TextField TextUsername;
    @FXML
    private TextField TextNombre;
    @FXML
    private TextField TextPass;
    
    Ventanas v = new Ventanas();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Registrar(ActionEvent event) {
    }

    @FXML
    private void Regresar(ActionEvent event) throws Exception {
        v.startLogin();
    }
    
}
