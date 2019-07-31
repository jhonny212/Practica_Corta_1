/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotecario;

import java.io.Serializable;
//a
/**
 *
 * @author jhonny-G
 */
public class RegistroEstudiantes implements Serializable{
    private int carnet;
    private String nombre;
    private int carrera;
public RegistroEstudiantes (int carnet,String nombre,int carrera){
    this.carnet=carnet;
    this.carrera=carrera;
    this.nombre=nombre;
}

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
}
