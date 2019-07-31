
package Bibliotecario;

import java.io.Serializable;



public class Estudiante  implements Serializable{
    String carnet;
    String nombre;
    String carrera;
    String fechadenacimiento;
    int cantidadlibros;

    public Estudiante(String carnet, String nombre, String carrera, String fechadenacimiento) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechadenacimiento = fechadenacimiento;
      
    } 
    public Estudiante() {
        
    }

    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getCantidadlibros() {
        return cantidadlibros;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setCantidadlibros(int cantidadlibros) {
        this.cantidadlibros = cantidadlibros;
    }
    
    
    
}
