/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author laion
 */
public class TransaccionTable {
    private StringProperty ID;
    private StringProperty CuentaOrigen;
    private StringProperty CuentaDestino;
    private StringProperty Monto;
    private StringProperty Fecha;
    
    public TransaccionTable(String ID, String CuentaOrigen, String CuentaDestino, String Monto, String Fecha) {
        this.ID= new SimpleStringProperty(ID);
        this.CuentaOrigen=new SimpleStringProperty(CuentaOrigen);
        this.CuentaDestino=new SimpleStringProperty(CuentaDestino);
        this.Monto=new SimpleStringProperty(Monto);
        this.Fecha= new SimpleStringProperty(Fecha);
    }
    
    public TransaccionTable(String Concepto, String Costo){
        this.ID=new SimpleStringProperty(Concepto);
        this.Monto=new SimpleStringProperty(Costo);
    }
    
    public String getID(){
        return ID.get();
    }
    
    public String getCuentaOrigen(){
        return CuentaOrigen.get();
    }
    
    public String getCuentaDestino(){
        return CuentaDestino.get();
    }
    
    public String getMonto(){
        return Monto.get();
    }
    
    public String getFecha(){
        return Fecha.get();
    }
    
}
