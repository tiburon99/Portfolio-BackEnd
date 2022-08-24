
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;


public class ProyectoDto {
    
    @NotBlank
    private String tituloP;
    @NotBlank
    private String descripcionP;
    
    private String imgProyecto;

    public ProyectoDto() {
    }

    public ProyectoDto(String tituloP, String descripcionP, String imgProyecto) {
        this.tituloP = tituloP;
        this.descripcionP = descripcionP;
        this.imgProyecto = imgProyecto;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImgProyecto() {
        return imgProyecto;
    }

    public void setImgProyecto(String imgProyecto) {
        this.imgProyecto = imgProyecto;
    }

  
    
}
