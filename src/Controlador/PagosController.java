/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TransaccionTable;
import Modelo.Transporte;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author laion
 */
public class PagosController implements Initializable {
    
    private static final String NUMERIC_STRING ="0123456789";

    @FXML
    private TableView<?> TablaPagos;
    @FXML
    private TableColumn<?, ?> IDConcepto;
    @FXML
    private TableColumn<?, ?> PrecioConcepto;
    @FXML
    private TextField TextNCuentaPagos;
    @FXML
    private Label PagoTotal;
    @FXML
    private TableView<TransaccionTable> Historial;
    @FXML
    private TableColumn<TransaccionTable, String> CuentaOrigen;
    @FXML
    private TableColumn<TransaccionTable, String> CuentaDestino;
    @FXML
    private TableColumn<TransaccionTable, String> Monto;
    @FXML
    private TableColumn<TransaccionTable, String> Fecha;
    @FXML
    private TextField TextNCuentaHistorial;

    public static String Account(int i) {
        StringBuilder builder = new StringBuilder();
        while (i-- != 0) {
            int character = (int)(Math.random()*NUMERIC_STRING.length());
            builder.append(NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CuentaOrigen.setCellValueFactory(new PropertyValueFactory<TransaccionTable, String>("CuentaOrigen"));
        CuentaDestino.setCellValueFactory(new PropertyValueFactory<TransaccionTable, String>("CuentaDestino"));
        Monto.setCellValueFactory(new PropertyValueFactory<TransaccionTable, String>("Monto"));
        Fecha.setCellValueFactory(new PropertyValueFactory<TransaccionTable, String>("Fecha"));
    }    

    @FXML
    private void Inicio(MouseEvent event) {
    }

    @FXML
    private void Terrestre(ActionEvent event) {
    }

    @FXML
    private void Aereo(ActionEvent event) {
    }

    @FXML
    private void Hoteles(ActionEvent event) {
    }

    @FXML
    private void Pagos(ActionEvent event) {
    }

    @FXML
    private void borrarConcepto(ActionEvent event) {
    }

    @FXML
    private void vaciarCarrito(ActionEvent event) {
    }

    @FXML
    private void Pagar(ActionEvent event) {
    }

    @FXML
    private void BuscarHistorial(ActionEvent event) {
        String HistorialNoSplit = consultarHistorial(TextNCuentaHistorial.getText());
        String[] HistorialSplitted = HistorialNoSplit.split(", ");
        char[]HistorialCounter = HistorialNoSplit.toCharArray();
        int Y=0;
        for(int i=0; i<HistorialCounter.length; i++){
            if(HistorialCounter[i]=='\n'){
                Y++;
            }
        }
        
        String [][] MatrizHistorial = new String[Y][5];
        int r=0;
        for(int i=0; i<Y; i++){
            for(int j=0; j<5; j++){
                MatrizHistorial[i][j]=HistorialSplitted[r];
                r++;
            }
        }
        ObservableList<TransaccionTable> Transacciones = FXCollections.observableArrayList();
        
        for(int i=0; i<Y; i++){
            Transacciones.add(new TransaccionTable (Account(3), MatrizHistorial[i][0], MatrizHistorial[i][1], MatrizHistorial[i][2], MatrizHistorial[i][3]));
        }
        
        Historial.getItems().addAll(Transacciones);
        
    }

    private static String consultarHistorial(java.lang.String noCompania) {
        registro.pasarela.Pasarela_Service service = new registro.pasarela.Pasarela_Service();
        registro.pasarela.Pasarela port = service.getPasarelaPort();
        return port.consultarHistorial(noCompania);
    }
    
}
