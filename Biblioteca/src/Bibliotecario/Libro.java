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
public class Libro implements Serializable{
    private String titulo;
    private String autor;
    private String codigo;
    private String editorial;
    private String fecha;
    private int cantidad;
    public Libro(String codigo,String autor,String titulo, int cantidad,String fecha,String editorial){
        this.autor=autor;
        this.cantidad=cantidad;
      this.codigo=codigo;
        this.titulo=titulo;
        this.editorial=editorial;
        this.fecha=fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

