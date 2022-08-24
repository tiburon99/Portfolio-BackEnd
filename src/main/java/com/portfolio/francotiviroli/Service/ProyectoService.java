
package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Proyecto;
import com.portfolio.francotiviroli.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    RProyecto repositorio;
    
    public List<Proyecto> list(){
        return repositorio.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return repositorio.findById(id);
    }
    
    public Optional<Proyecto> getByTituloP(String tituloP){
        return repositorio.findByTituloP(tituloP);
    }
    
    public void save(Proyecto proyecto){
        repositorio.save(proyecto);
    }
    
    public void delete(int id){
        repositorio.deleteById(id);
    }
    
    public boolean existsById(int id){
        return repositorio.existsById(id);
    }
    
    public boolean existsByTituloP(String tituloP){
        return repositorio.existsByTituloP(tituloP);
    }
}

