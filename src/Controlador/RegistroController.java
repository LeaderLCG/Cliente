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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

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
    
    private static final String NUMERIC_STRING ="0123456789";
    
    Ventanas v = new Ventanas();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public static String RandomID(int i) {
        StringBuilder builder = new StringBuilder();
        while (i-- != 0) {
            int character = (int)(Math.random()*NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    @FXML
    private void Registrar(ActionEvent event) throws Exception {
        if(register(Integer.valueOf(RandomID(3)), TextNombre.getText(), TextPass.getText(), TextUsername.getText())==1){
            Alert fallo = new Alert(Alert.AlertType.INFORMATION);
            fallo.setTitle("ÉXITO");
            fallo.setContentText("Tu cuenta se ha creado exitosamente.");
            fallo.initStyle(StageStyle.UTILITY);
            fallo.showAndWait();
            v.startLogin();
        }else{
            
        }
    
    }

    @FXML
    private void Regresar(ActionEvent event) throws Exception {
        v.startLogin();
    }

    private static int register(int id, java.lang.String name, java.lang.String password, java.lang.String username) {
        mx.agencia.ClientesServer_Service service = new mx.agencia.ClientesServer_Service();
        mx.agencia.ClientesServer port = service.getClientesServerPort();
        return port.register(id, name, password, username);
    }

    
}
