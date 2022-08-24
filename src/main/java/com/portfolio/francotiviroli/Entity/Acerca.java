
package com.portfolio.francotiviroli.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Acerca {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String tituloA;
    private String saludoA;
    private String descripcionA;
    private String imgA;

    public Acerca() {
    }

    public Acerca(String tituloA, String saludoA, String descripcionA, String imgA) {
        this.tituloA = tituloA;
        this.saludoA = saludoA;
        this.descripcionA = descripcionA;
        this.imgA = imgA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloA() {
        return tituloA;
    }

    public void setTituloA(String tituloA) {
        this.tituloA = tituloA;
    }

    public String getSaludoA() {
        return saludoA;
    }

    public void setSaludoA(String saludoA) {
        this.saludoA = saludoA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getImgA() {
        return imgA;
    }

    public void setImgA(String imgA) {
        this.imgA = imgA;
    }
    
    

    
    
    
}
