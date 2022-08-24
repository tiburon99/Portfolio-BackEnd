/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.francotiviroli.Dto;

import javax.validation.constraints.NotBlank;


public class SkillsDto {
    
    @NotBlank
    private String nombreSkill;
    
    private int porcentajeSkill;

    public SkillsDto(String nombreSkill, int porcentajeSkill) {
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public SkillsDto() {
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }
    
    
    
}
