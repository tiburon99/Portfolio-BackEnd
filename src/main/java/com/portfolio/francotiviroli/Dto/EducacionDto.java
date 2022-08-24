
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;


public class EducacionDto {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String duracionE;
    @NotBlank
    private String descripcionE;
    
    private String imgEdu;

    public EducacionDto() {
    }

    public EducacionDto(String nombreE, String duracionE, String descripcionE, String imgEdu) {
        this.nombreE = nombreE;
        this.duracionE = duracionE;
        this.descripcionE = descripcionE;
        this.imgEdu = imgEdu;
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
