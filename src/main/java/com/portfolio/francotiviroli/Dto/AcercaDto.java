
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;

public class AcercaDto {
    
    @NotBlank
    private String tituloA;
    @NotBlank
    private String saludoA;
    @NotBlank
    private String descripcionA;
    
    private String imgA;

    public AcercaDto() {
    }

    public AcercaDto(String tituloA, String saludoA, String descripcionA, String imgA) {
        this.tituloA = tituloA;
        this.saludoA = saludoA;
        this.descripcionA = descripcionA;
        this.imgA = imgA;
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
