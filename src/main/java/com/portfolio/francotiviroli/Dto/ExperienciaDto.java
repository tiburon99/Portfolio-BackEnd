
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;


public class ExperienciaDto {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String duracionE;
    @NotBlank
    private String descripcionE;
    
    private String imgExp;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String nombreE, String duracionE, String descripcionE, String imgExp) {
        this.nombreE = nombreE;
        this.duracionE = duracionE;
        this.descripcionE = descripcionE;
        this.imgExp = imgExp;
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

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
}
