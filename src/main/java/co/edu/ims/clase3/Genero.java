/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.clase3;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 1061757909
 */
@Entity
public class Genero {
    
    @Id private String codigo;
    private String descripcion;

    public Genero() {
    }

    public Genero(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
