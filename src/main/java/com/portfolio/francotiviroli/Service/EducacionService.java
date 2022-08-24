
package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Educacion;
import com.portfolio.francotiviroli.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EducacionService {
    
    @Autowired
    REducacion repositorio;
    
    public List<Educacion> list(){
        return repositorio.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return repositorio.findById(id);
    }
    
    public Optional<Educacion> getByNombreE(String nombreE){
        return repositorio.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
        repositorio.save(educacion);
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
