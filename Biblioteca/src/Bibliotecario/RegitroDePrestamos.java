/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotecario;

import java.io.Serializable;

/**
 *
 * @author jhonny-G
 */
public class RegitroDePrestamos implements Serializable{
    private String codigoLibro;
    private int carnet;
    private String fecha;
    public RegitroDePrestamos(String cod,int carnet,String date){
    this.carnet=carnet;
    this.codigoLibro=cod;
    this.fecha=date;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
