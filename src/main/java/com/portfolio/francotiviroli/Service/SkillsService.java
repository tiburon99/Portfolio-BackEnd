/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Skills;
import com.portfolio.francotiviroli.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SkillsService {
    
    @Autowired
    RSkills rSkills;
    
    public List<Skills> list(){
        return rSkills.findAll();        
    }
    
    public Optional<Skills> getOne(int id){
        return rSkills.findById(id);
    }
    
    public Optional<Skills> getByNombreSkill(String nombreSkill){
        return rSkills.findByNombreSkill(nombreSkill);
    }
    
    public void save(Skills skill){
        rSkills.save(skill);
    }
    
    public void delete(int id){
        rSkills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rSkills.existsById(id);
    }    
    
    public boolean existsByNombreSkill(String nombreSkill){
        return rSkills.existsByNombreSkill(nombreSkill);
    }
    
}
    
