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
public class Transporte {
    private StringProperty ID;
    private StringProperty Origen;
    private StringProperty Destino;
    private StringProperty Fecha;
    private StringProperty Hora;
    private StringProperty Asientos;
    private StringProperty Costo;
    
    public Transporte(String ID, String Origen, String Destino, String Fecha, String Hora, String Asientos, String Costo) {
        this.ID= new SimpleStringProperty(ID);
        this.Origen=new SimpleStringProperty(Origen);
        this.Destino=new SimpleStringProperty(Destino);
        this.Fecha= new SimpleStringProperty(Fecha);
        this.Hora= new SimpleStringProperty(Hora);
        this.Asientos= new SimpleStringProperty(Asientos);
        this.Costo=new SimpleStringProperty(Costo);
    }
    
    public Transporte(String ID, String Destino, String Hora, String Asientos, String Costo) {
        this.ID= new SimpleStringProperty(ID);
        this.Destino=new SimpleStringProperty(Destino);
        this.Origen= new SimpleStringProperty(Hora);
        this.Asientos= new SimpleStringProperty(Asientos);
        this.Costo=new SimpleStringProperty(Costo);
    }
    
    public String getID(){
        return ID.get();
    }
    
    public String getOrigen(){
        return Origen.get();
    }
    
    public String getDestino(){
        return Destino.get();
    }
    
    public String getFecha(){
        return Fecha.get();
    }
    
    public String getHora(){
        return Hora.get();
    }
    
    public String getAsientos(){
        return Asientos.get();
    }
    
    public String getCosto(){
        return Costo.get();
    }
    
}
