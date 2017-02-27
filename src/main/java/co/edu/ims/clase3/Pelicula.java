/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.clase3;

/**
 *
 * @author 1061757909
 */
public class Pelicula {
    
    private String titulo;
    private int anio;
    private Persona director;

    // Constructores
    public Pelicula(String titulo, int anio, Persona director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        
      }
     public Pelicula(){
        
    }
     
     public Pelicula(String titulo){
         
         this.titulo = titulo;
        
    }
    
    //Metodo
    
   
    
    // Getters y Stters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }
 
}


