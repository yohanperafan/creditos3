/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.clase3;

import java.util.Date;

/**
 *
 * @author 1061757909
 */
public class Persona {
    
private String nombre;
private String nacionalidad;
private String fecha_nacimiento;

public Persona(){
    
}
public Persona(String nombre, String nacionalidad, String fecha_nacimiento){
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
    this.fecha_nacimiento = fecha_nacimiento;

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


   
}
