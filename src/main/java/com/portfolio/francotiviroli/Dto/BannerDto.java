
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;


public class BannerDto {
    
    @NotBlank
    private String nombreBanner;
    @NotBlank
    private String ubicacionBanner;

    public BannerDto() {
    }

    public BannerDto(String nombreBanner, String ubicacionBanner) {
        this.nombreBanner = nombreBanner;
        this.ubicacionBanner = ubicacionBanner;
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
