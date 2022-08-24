
package com.portfolio.francotiviroli.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombreBanner;
    private String ubicacionBanner;

    public Banner() {
    }

    public Banner(String nombreBanner, String ubicacionBanner) {
        this.nombreBanner = nombreBanner;
        this.ubicacionBanner = ubicacionBanner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreBanner() {
        return nombreBanner;
    }

    public void setNombreBanner(String nombreBanner) {
        this.nombreBanner = nombreBanner;
    }

    public String getUbicacionBanner() {
        return ubicacionBanner;
    }

    public void setUbicacionBanner(String ubicacionBanner) {
        this.ubicacionBanner = ubicacionBanner;
    }
    
    


    
    
}
