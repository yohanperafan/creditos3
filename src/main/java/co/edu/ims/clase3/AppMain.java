/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.clase3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author 1061757909
 */
public class AppMain {

    public static void main(String[] args){
        
    EntityManagerFactory emf;
    EntityManager em;
    
    emf = Persistence.createEntityManagerFactory("ejemploPU");
    em = emf.createEntityManager();
    
    Genero accion = new Genero ("accion", "Pelicula de accion" );
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(accion);
    tx.commit();
        
        System.out.println("Do someting.....");
        Pelicula insideOut = new Pelicula("Inside Out");
        insideOut.setAnio(2015);
        Persona d1 =new Persona("JJ","Colombia","23-03-1984");
        insideOut.setDirector(d1);
    }
}
