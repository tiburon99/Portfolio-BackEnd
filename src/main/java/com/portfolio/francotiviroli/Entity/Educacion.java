
package com.portfolio.francotiviroli.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String duracionE;
    private String descripcionE;
    
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(String nombreE, String duracionE, String descripcionE, String imgEdu) {
        this.nombreE = nombreE;
        this.duracionE = duracionE;
        this.descripcionE = descripcionE;
        this.imgEdu = imgEdu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDuracionE() {
        return duracionE;
    }

    public void setDuracionE(String duracionE) {
        this.duracionE = duracionE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    
    
}
