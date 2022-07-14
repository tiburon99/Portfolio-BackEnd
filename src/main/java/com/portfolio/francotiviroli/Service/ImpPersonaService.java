
package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Persona;
import com.portfolio.francotiviroli.Interface.IPersonaService;
import com.portfolio.francotiviroli.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpPersonaService implements IPersonaService{

    @Autowired
    IPersonaRepository repository;
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas= repository.findAll();
        return listaPersonas;
    }

    @Override
    public Persona getPersona(Long id) {
        Persona findPersona = repository.findById(id).orElse(null);
        return findPersona;
    }

    @Override
    public void savePersona(Persona per) {
        repository.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        
        repository.deleteById(id);
    }
    
}
