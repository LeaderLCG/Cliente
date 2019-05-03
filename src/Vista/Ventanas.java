/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Component;
import java.util.Optional;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Ventanas {
    
    public static Stage stg = new Stage();
    
    public void startLogin() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Iniciar Sesión...");
        stg.setScene(scene); 
        stg.setHeight(268);
        stg.setWidth(405);
        stg.show();
        stg.setResizable(false);
    }
    
    public void startInicio() throws Exception {
        stg.close();
        Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("InicioIO...");
        stg.setScene(scene); 
        stg.setHeight(420);
        stg.setWidth(614);
        stg.show();
        stg.setResizable(false);
    }
    
    public void startRegistrar() throws Exception {
        stg.close();
        Parent root = FXMLLoader.load(getClass().getResource("Registro.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Registrar...");
        stg.setScene(scene); 
        stg.setHeight(330);
        stg.setWidth(310);
        stg.show();
        stg.setResizable(false);
    }
    
    public void startTerrestre() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TransportTerrestre.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Terrestre...");
        stg.setScene(scene);  
        stg.setHeight(420);
        stg.setWidth(614);
        stg.show();
        stg.setResizable(false);
    }
    
    public void startAereo() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TransportAereo.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Aereo...");
        stg.setScene(scene);  
        stg.setHeight(420);
        stg.setWidth(614);
        stg.show();
        stg.setResizable(false);
    }
    
     public void startHoteles() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Hoteles.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Hoteles...");
        stg.setScene(scene);  
        stg.setHeight(420);
        stg.setWidth(614);
        stg.show();
        stg.setResizable(false);
    }
     
     public void startPagos() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Pagos.fxml"));
        Scene scene = new Scene(root);
        stg.setTitle("Pagos...");
        stg.setScene(scene);  
        stg.setHeight(420);
        stg.setWidth(614);
        stg.show();
        stg.setResizable(false);
    }
   
}
