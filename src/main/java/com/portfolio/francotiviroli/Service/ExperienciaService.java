
package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Experiencia;
import com.portfolio.francotiviroli.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    RExperiencia repositorio;
    
    public List<Experiencia> list(){
        return repositorio.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return repositorio.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return repositorio.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp){
        repositorio.save(exp);
    }
    
    public void delete(int id){
        repositorio.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repositorio.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return repositorio.existsByNombreE(nombreE);
    }
    
}
