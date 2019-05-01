/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import Vista.Ventanas;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Historial2Controller implements Initializable {
    @FXML
    private TableView<?> Historial;
    @FXML
    private TableColumn<?, ?> Codigo;
    @FXML
    private TableColumn<?, ?> Destino;
    @FXML
    private TableColumn<?, ?> Beneficiario;
    @FXML
    private TableColumn<?, ?> Monto;
    @FXML
    private TableColumn<?, ?> Fecha;
    
    Ventanas v = new Ventanas();

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
    private void Historial(ActionEvent event) throws Exception {
        v.startOpciones();
        
    }

    @FXML
    private void Transaccion(ActionEvent event) throws Exception {
        v.startTransacciones();
    }

    @FXML
    private void Cuenta(ActionEvent event) {
    }
    
}
