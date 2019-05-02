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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;
import mx.agencia.Usuario;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginController implements Initializable {
    
    Ventanas v = new Ventanas ();
    @FXML
    private TextField TextUsername;
    @FXML
    private TextField TextPassword;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Inicio(ActionEvent event) throws Exception {
        if(login(TextUsername.getText(), TextPassword.getText())==null){
            Alert fallo = new Alert(AlertType.WARNING);
            fallo.setTitle("FALLO");
            fallo.setHeaderText("Hubo un fallo al inicar Sesión");
            fallo.setContentText("Tu usuario o contraseña tienen un error como todo lo demás en tu vida");
            fallo.initStyle(StageStyle.UTILITY);
            fallo.show();
            TextUsername.setText("");
            TextPassword.setText("");
        }else{
            v.startInicio();
        }
    }

    @FXML
    private void Registrar(ActionEvent event) throws Exception {
        v.startRegistrar();
    }

    private static Usuario login(java.lang.String username, java.lang.String password) {
        mx.agencia.ClientesServer_Service service = new mx.agencia.ClientesServer_Service();
        mx.agencia.ClientesServer port = service.getClientesServerPort();
        return port.login(username, password);
    }
    
}
